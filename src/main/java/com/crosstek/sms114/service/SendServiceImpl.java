package com.crosstek.sms114.service;


import java.sql.Timestamp;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.crosstek.sms114.domain.Send;
import com.crosstek.sms114.common.PageModel;
import com.crosstek.sms114.dao.SendDao;
import com.crosstek.sms114.service.SendService;

import utils.UserUtils;

@Service("sendService")
public class SendServiceImpl implements SendService {

	@Resource
	private SendDao SendDao;
	
	public Send searchById(Long mt_id){
		return SendDao.selectByPrimaryKey(mt_id);
	}
	
	@Transactional
	public int insert(Send Send) {
		
		Send.setCtime(new Timestamp(System.currentTimeMillis()));
		Send.setMtime(new Timestamp(System.currentTimeMillis()));
		Send.setUserId(UserUtils.getUserFromSession().getUserId());
		Send.setSysuid(0L);
		Send.setMcount(1L);
		return SendDao.insert(Send);
	}
	
	@Transactional
	public int update(Send Send) {
		
			Long count=Send.getMcount();
			if(count==null){
				Send.setMcount(1L);
			}else{
				Send.setMcount(count+1);
			}
			
			Send.setMtime(new Timestamp(System.currentTimeMillis()));
			Send.setSysuid(UserUtils.getUserFromSession().getUserId());
		
		return SendDao.updateByPrimaryKey(Send);
	}
	
	@Transactional
	public int delete(Long mt_id){
		return SendDao.deleteByPrimaryKey(mt_id);
	}
	
	public PageModel<Send> search(PageModel<Send> page) {
		List<Send> items = SendDao.search(page);
		page.setData(items);
		page.setCount(SendDao.getRecordCount(page));
		return page;
	}
	
	public void saveSend(Send send){
		if(send.getMtId()==null){
			this.insert(send);
		}else{
		send=SendDao.selectByPrimaryKey(send.getMtId());
			this.update(send);
		}
		
	}

}