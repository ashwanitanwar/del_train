package com.del;

public class Emp implements Cloneable{

	private int id;
	private String name;
	private long mobile;
	private Dept dept;
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Emp(int id, String name, long mobile, Dept dept) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", mobile=" + mobile + ", dept=" + dept + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		this.dept=(Dept) dept.clone();
		return super.clone();		
	}
}
