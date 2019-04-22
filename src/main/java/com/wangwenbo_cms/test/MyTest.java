package com.wangwenbo_cms.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.junit.Test;

import com.wangwenbo_cms.utils.CollectionUtil;
import com.wangwenbo_cms.utils.StringUtil;
import com.wangwenbo_cms.utils.WebUtil;

public class MyTest {

	//String的测试
	@Test
	public void test1() {
		StringUtil stringUtil = new StringUtil();
		//1
		//boolean b = stringUtil.hasLength("abc");
		
		//2
		//boolean c = stringUtil.hasText("abc");
		
		//3
		//boolean email = stringUtil.isEmail("123@qq.com");
		
		//4 有问题
		//boolean mobile = stringUtil.isMobile("1234");
		
		String reverse = stringUtil.reverse("abc");
		System.out.println(reverse);
		
	}
	
	//关于Collection的测试
	@Test
	public void test2() {
		CollectionUtil collectionUtil = new CollectionUtil();
		List<String> list=new ArrayList<>();
		list.add("abc");
		boolean notEmpty1 = collectionUtil.notEmpty(list);
		
		Map<String, Integer> map=new HashMap<>();
		map.put("123", 1);
		boolean notEmpty2 = collectionUtil.notEmpty(map);
		System.out.println(notEmpty2);
		
	}
	
	//Web的测试
	//关于Collection的测试
		@Test
		public void test3() {
			WebUtil webUtil = new WebUtil();
			//webUtil.getString(request, "张三", defaultValue);
			boolean boolean1 = webUtil.getBoolean("");
			
			//int int1 = webUtil.getInt(""); 有问题
			//webUtil.getUrl();
			Cookie cookie=new Cookie("name","张三");
			String cookieValue = webUtil.getCookieValue(cookie, "张三");
			System.out.println(boolean1);
			
		}
	
}
