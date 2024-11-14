package com.tnsc.ifet.daythree.encapsulation;

public class OopsConceptDemo {
	private int SerialNum;
	private String name;
	private int age;
	public int getSerialNum() {
		return SerialNum;
	}
	public void setSerialNum(int serialNum) {
		SerialNum = serialNum;
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
	public String toString()
	{
		return "OopsConceptDemo [Serial Number="+ SerialNum +", name=" + name +",age=" + age + "]";
	}
}

