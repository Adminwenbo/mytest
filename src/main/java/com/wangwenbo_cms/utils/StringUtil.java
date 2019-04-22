package com.wangwenbo_cms.utils;

import org.apache.commons.lang3.StringUtils;

public class StringUtil {
	/*
	 * 方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 
	 * 
	 * */
	public boolean hasLength(String src){
		
		if (src==null||src.trim().length()==0) {
			return false;
		}
		
		if(StringUtils.isNotBlank(src)) {
			return true;
		}
		return false;
		
	    //实现代码
	}
	
	
	/*
	 * 方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	 * 
	 * */
	public boolean hasText(String src){
		if (src==null||src.trim().length()==0) {
			return false;
		}
		
		if(StringUtils.isNotEmpty(src)) {
			return true;
		}
		return false;
	    //实现代码
	}
	
	
	/*
	 * 方法3：判断是否为手机号码 (5分)
	 * */
	public boolean isMobile(String src){
		
		String string="/^[12356789] /w{10}&/";
		if (src.matches(string)) {
			return true;
		}
		return false;
	    //实现代码
	}
	
	/**
	*方法4：判断是否为邮箱 (5分)
	*/
	public boolean isEmail(String src){
		String reg="123@qq.com";
		if (src.matches(reg)) {
			return true;
		}	
		return false;
	    //实现代码
	}
	/**
	*方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
	*/
	public String reverse(String src){
		String string = StringUtils.reverse(src);
		return string;
	    //实现代码
	}
}
