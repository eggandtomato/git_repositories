package com.hzit.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_exam")
public class Exam {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Timestamp examDate;
	@Column(nullable = false)
	private Integer moreScore;
	@Column(nullable = false)
	private Integer score;
	@Column(nullable = false)
	private Integer singleScore;
	@ManyToOne(targetEntity = Paper.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "paperId", nullable = false)
	private Paper paper;
	@Column(length = 40)
	private String studentId;

	public Exam() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getExamDate() {
		return examDate;
	}

	public void setExamDate(Timestamp examDate) {
		this.examDate = examDate;
	}

	public Integer getMoreScore() {
		return moreScore;
	}

	public void setMoreScore(Integer moreScore) {
		this.moreScore = moreScore;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getSingleScore() {
		return singleScore;
	}

	public void setSingleScore(Integer singleScore) {
		this.singleScore = singleScore;
	}

	public Paper getPaper() {
		return paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", examDate=" + examDate + ", moreScore=" + moreScore + ", score=" + score
				+ ", singleScore=" + singleScore + ", paper=" + paper + ", studentId=" + studentId + "]";
	}

}
