package com.hzit.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hzit.util.HBUtil;

@Entity
@Table(name = "t_student")
public class Student {
	@Id
	private String id;
	private String cardNo;
	private String name;
	private String password;
	private String prefession;
	private String sex;
	@OneToMany(targetEntity = Exam.class, cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name = "studentId", referencedColumnName = "id")
	private Set<Exam> exam = new HashSet<>();

	public Student() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPrefession() {
		return prefession;
	}

	public void setPrefession(String prefession) {
		this.prefession = prefession;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	
	public Set<Exam> getExam() {
		return exam;
	}

	public void setExam(Set<Exam> exam) {
		this.exam = exam;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", cardNo=" + cardNo + ", name=" + name + ", password=" + password
				+ ", prefession=" + prefession + ", sex=" + sex + "]";
	}

}
