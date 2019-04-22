package com.wangwenbo_cms.utils;

import java.util.Collection;
import java.util.Map;

public class CollectionUtil {
	/**
	*方法1：判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	*/
	public boolean notEmpty(Collection<?> coll){
		if (coll!=null && coll.size()!=0) {
			return true;
		}
		
		return false;
		
	    //实现代码
	}
	/**
	*方法2：判断Map集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	 * 
	 * @return
	 */
	public boolean notEmpty(Map<?, ?> map){
		if (map!=null && map.size()!=0) {
			return true;
		}
		return false;
	    //实现代码
	}
}
