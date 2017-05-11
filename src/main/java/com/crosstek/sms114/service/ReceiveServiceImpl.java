package com.crosstek.sms114.service;


import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crosstek.sms114.common.PageModel;
import com.crosstek.sms114.dao.ReceiveDao;
import com.crosstek.sms114.domain.Receive;


@Service("receiveService")
public class ReceiveServiceImpl implements ReceiveService {

	@Resource
	private ReceiveDao receiveDao;
	
	public Receive searchById(Long mo_id){
		return receiveDao.selectByPrimaryKey(mo_id);
	}
	
	@Transactional
	public int insert(Receive smsReceive) {
		return receiveDao.insert(smsReceive);
	}
	
	@Transactional
	public int update(Receive smsReceive) {
		return receiveDao.updateByPrimaryKey(smsReceive);
	}
	
	@Transactional
	public int delete(Long mo_id){
		return receiveDao.deleteByPrimaryKey(mo_id);
	}
	
	public PageModel<Receive> search(PageModel<Receive> page) {
		
			List<Receive> items = receiveDao.search(page);
			page.setData(items);
			page.setCount(receiveDao.getRecordCount(page));
			
		return page;
	}

}