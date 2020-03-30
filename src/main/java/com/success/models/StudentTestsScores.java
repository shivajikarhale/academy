package com.success.models;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class StudentTestsScores implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private StudTestScoreIdentity studTestScoreIdentity;
	@NotNull
	private float testScore;
	
	/*
	 * @OneToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "course_id", insertable = false, updatable = false)
	 * 
	 * @Fetch(FetchMode.JOIN) private Set<TestDetails> testDetails;
	 */
	
	public StudTestScoreIdentity getStudTestScoreIdentity() {
		return studTestScoreIdentity;
	}
	public void setStudTestScoreIdentity(StudTestScoreIdentity studTestScoreIdentity) {
		this.studTestScoreIdentity = studTestScoreIdentity;
	}
	public float getTestScore() {
		return testScore;
	}
	public void setTestScore(float testScore) {
		this.testScore = testScore;
	}
	
	@Override
	public String toString() {
		return "StudentTestsScores [studTestScoreIdentity=" + studTestScoreIdentity + ", testScore=" + testScore + "]";
	}

}
