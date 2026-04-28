package com.codesnippet.weather_service;

import com.codesnippet.weather_service.entity.Role;
import com.codesnippet.weather_service.entity.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.util.*;
import java.util.stream.Collectors;

//@SpringBootApplication
public class WeatherServiceApplication{

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(1);
		list.sort(Comparator.comparing(a->a));
		System.out.println(list);

		list.set(2,20);

		list.remove(1);
//		SpringApplication.run(WeatherServiceApplication.class, args);
	}
}

interface Test1{
	void m2();
	default void m1(){
		System.out.println("test1");
	}
}

interface Test2{
	default void m1(){
		System.out.println("test2");
	}
}


class Test implements Test1{

	@Override
	public void m2() {

	}
}


