package com.bear.watchonline.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="UserInfo")
public class UserInfo {
	@NotEmpty(message="用户名不能为空")
	private String loginName;
	//@Pattern(regexp="[0-9a-zA-Z] {6,20}",message="密码是6-20个字符，必须是字母或数字组合")
	private String password;
	@Length(min=2,max=100,message="非法真实姓名")
	private String realName;
	private String sex;
	private String age;
	private UserLogin userLogin;//一对一的时候是直接声明
	
	
	
	
	//public UserInfo() {
//		super();
	//}
	//public UserInfo(String loginName,String password, String realName, String sex, String age,UserLogin userLogin) {
//		super();
		/*this.loginName = loginName;
		this.password = password;
		this.realName = realName;
		this.sex = sex;
		this.age = age;
		this.userLogin = userLogin;
	}*/
	@Id
	@GenericGenerator(name="foreign", strategy="foreign", parameters={@Parameter(name="property", value="userLogin")})
	@GeneratedValue(generator="foreign")
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@OneToOne(mappedBy="userInfo")
	public UserLogin getUserLogin() {
		return userLogin;
	}
	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}
}
