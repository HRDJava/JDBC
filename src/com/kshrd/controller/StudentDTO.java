package com.kshrd.controller;

public class StudentDTO {
	Integer stuid;
	String stuname;
	String sex;
	String email;
	String phone;
	Integer score;
	public StudentDTO(Integer stuid, String stuname, String sex, String email, String phone, Integer score) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.sex = sex;
		this.email = email;
		this.phone = phone;
		this.score = score;
	}
	public Integer getStuid() {
		return stuid;
	}
	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	
}
