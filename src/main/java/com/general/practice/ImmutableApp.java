package com.general.practice;

import java.util.HashMap;
import java.util.Map;

public class ImmutableApp {
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("1", "Ajay");
		map.put("2", "Gupta");
		ImmutableStudent stu=new ImmutableStudent("Harman", 200, map);
		System.out.println("Before applyting changes to map");
		System.out.println(stu);
		System.out.println("Applyting changes to map");
		map.put("3", "Ghuman");
		System.out.println(stu);
		Map<String, String> mapp=stu.getAddress();
		mapp.put("4", "Bathinda");
		System.out.println("changes after calling getter on Student map");
		System.out.println(stu);
		
		
				
	}

}
