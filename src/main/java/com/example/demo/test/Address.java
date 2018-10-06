package com.example.demo.test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.FetchType;
import javax.persistence.MapKeyEnumerated;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Address {
	
	private String city;
	private String country;
	
	@ElementCollection(fetch = FetchType.EAGER)
//	@MapKeyEnumerated(EnumType.STRING)
	private Set<HomeTypeEnum> hometype = new HashSet<>();
	
}
