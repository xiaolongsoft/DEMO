package com.crosstek.sms114.service;
import com.crosstek.sms114.common.PageModel;
import com.crosstek.sms114.domain.Send;

public interface SendService {

	Send searchById(Long mt_id);
	
	PageModel<Send> search(PageModel<Send> page);
	
	int insert(Send Send);

	int update(Send Send);
	
	int delete(Long mt_id);

	void saveSend(Send send);
	
}