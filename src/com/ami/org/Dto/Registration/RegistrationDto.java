package com.ami.org.Dto.Registration;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="user_table")
public class RegistrationDto implements Serializable{
	public RegistrationDto() {
		System.out.println(this.getClass().getSimpleName()+ "created");
	}
	@Id
	@GenericGenerator(name="myid",strategy="increment")
	@GeneratedValue(generator="myid")
	@Column(name="r_id")
	private int id;
	@Column(name="r_firstname")
	private String firstname;
	@Column(name="r_lastname")
	private String lastname;
	@Column(name="r_gender")
	private String gender; 
	@Column(name="r_email")
	private String email;
	@Column(name="r_password")
	private String password;
	@Column(name="r_changepawd")
	private String changepawd;
	@Column(name="r_degree")
	private String degree;
	@Column(name="r_cname")
	private String cname;
	@Column(name="r_cyop")
	private int cyop;
	@Column(name="r_pname")
	private String pname;
	@Column(name="r_pyop")
	private  int pyop;
	@Column(name="r_sname")
	private  String sname;
	@Column(name="r_syop")
	private  int syop;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getChangepawd() {
		return changepawd;
	}
	public void setChangepawd(String changepawd) {
		this.changepawd = changepawd;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCyop() {
		return cyop;
	}
	public void setCyop(int cyop) {
		this.cyop = cyop;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPyop() {
		return pyop;
	}
	public void setPyop(int pyop) {
		this.pyop = pyop;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSyop() {
		return syop;
	}
	public void setSyop(int syop) {
		this.syop = syop;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "RegistrationDto [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", gender="
				+ gender + ", email=" + email + ", password=" + password + ", changepawd=" + changepawd + ", degree="
				+ degree + ", cname=" + cname + ", cyop=" + cyop + ", pname=" + pname + ", pyop=" + pyop + ", sname="
				+ sname + ", syop=" + syop + "]";
	}
	

	
	
	}
	
	


