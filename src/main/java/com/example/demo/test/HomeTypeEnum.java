package com.example.demo.test;

import java.util.HashMap;
import java.util.Map;

public enum HomeTypeEnum {

	VILLA(0) , FLAT(1) , BUNGLOW(2);
	
	private static Map<Integer, Object> map = new HashMap<>();
	private Integer category;
	static {
		for (HomeTypeEnum PropertyType  : HomeTypeEnum.values()) {
			map.put(PropertyType.category,PropertyType );
		}
	}

	HomeTypeEnum valueOf(int status) {
		return (HomeTypeEnum) map.get(category);
	}

	private HomeTypeEnum(Integer k) {
		this.category = k;
	}

	public Integer getStatus() {
		return category;
	}

}
