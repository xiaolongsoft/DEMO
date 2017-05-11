package com.crosstek.sms114.service;

import com.crosstek.sms114.common.PageModel;
import com.crosstek.sms114.domain.Receive;

public interface ReceiveService {

	Receive searchById(Long mo_id);
	
	PageModel<Receive> search(PageModel<Receive> page);
	
	int insert(Receive smsReceive);

	int update(Receive smsReceive);
	
	int delete(Long mo_id);
	
}