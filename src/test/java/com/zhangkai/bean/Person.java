package com.zhangkai.bean;

import java.util.Date;

/**
 * 
 * @ClassName: Person
 * @Description: 测试工具的实体类
 * @author: ZK
 * @date: 2019年6月17日 上午8:55:30
 */
public class Person {
	private int id;//ID
	private String name;//姓名
	private int age;//年龄
	private String about;//介绍
	private Date datea;//注册日期

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Date getDatea() {
		return datea;
	}

	public void setDatea(Date datea) {
		this.datea = datea;
	}

	public Person(int id, String name, String about, int age, Date datea) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.about = about;
		this.datea = datea;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", about=" + about + ", datea=" + datea + "]";
	}

}
