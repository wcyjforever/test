package com.cys.dormitoryManagerment.domain;

import org.omg.CORBA.PRIVATE_MEMBER;

public class guanLiYuan {
	
	private String manager_name;//用户名
	private String manager_password;//密码
	private String manager_sex;//性别
	private String manager_id_num;//身份证号码
	private String manager_phone;//电话
	private String manager_email;
	
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	public String getManager_password() {
		return manager_password;
	}
	public void setManager_password(String manager_password) {
		this.manager_password = manager_password;
	}
	public String getManager_sex() {
		return manager_sex;
	}
	public void setManager_sex(String manager_sex) {
		this.manager_sex = manager_sex;
	}
	public String getManager_id_num() {
		return manager_id_num;
	}
	public void setManager_id_num(String manager_id_num) {
		this.manager_id_num = manager_id_num;
	}
	public String getManager_phone() {
		return manager_phone;
	}
	public void setManager_phone(String manager_phone) {
		this.manager_phone = manager_phone;
	}
	
	@Override
	public String toString() {
		return "guanLiYuan [manager_name=" + manager_name
				+ ", manager_password=" + manager_password + ", manager_sex="
				+ manager_sex + ", manager_id_num=" + manager_id_num
				+ ", manager_phone=" + manager_phone + "]";
	}
	
	

}
