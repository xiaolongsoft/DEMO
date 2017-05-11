package com.crosstek.sms114.common;

public interface BaseDao {
		<T> Long  getRecordCount(PageModel<T> page);
}
