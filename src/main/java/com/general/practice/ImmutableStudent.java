package com.general.practice;

import java.util.HashMap;
import java.util.Map;

final class ImmutableStudent {
	private final String name;
	private final int regNo;
	private final Map<String, String> address;
	
	
	
	
	public ImmutableStudent(String name, int regNo, Map<String, String> address) {
		this.name = name;
		this.regNo = regNo;
		Map<String, String> mapping=new HashMap<String, String>();
		address.entrySet().forEach(entry->mapping.put(entry.getKey(), entry.getValue()));
		this.address=mapping;		
	}
	public String getName() {
		return name;
	}
	public int getRegNo() {
		return regNo;
	}
	public Map<String, String> getAddress() {
		Map<String, String> mapping=new HashMap<String, String>();
		address.entrySet().forEach(entry->mapping.put(entry.getKey(), entry.getValue()));
		return mapping;
	}
	@Override
	public String toString() {
		return "ImmutableStudent [name=" + name + ", regNo=" + regNo + ", address=" + address + "]";
	}
	
	
}
