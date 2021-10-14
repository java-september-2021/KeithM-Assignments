package com.keith.dojooverflow.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="answers")
public class Answer {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String answer;
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="question_id")
	private Question answeredQuestion;
    
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

	public Answer() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String subject) {
		this.answer = subject;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Question getAnsweredQuestion() {
		return answeredQuestion;
	}

	public void setAnsweredQuestion(Question answeredQuestion) {
		this.answeredQuestion = answeredQuestion;
	}
	
	
}
