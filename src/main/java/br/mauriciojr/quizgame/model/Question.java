package br.mauriciojr.quizgame.model;

import java.util.ArrayList;
import java.util.List;

public class Question {

	private long id;
	private String questiontext;
	private List<Answer> answers;
	private String feedback;
	private float grade;

	public Question() {
		this.answers = new ArrayList<>();
	}

	public Question(String questiontext, String feedback, float grade) {
		super();
		this.questiontext = questiontext;
		this.answers = new ArrayList<>();
		this.feedback = feedback;
		this.grade = grade;
	}

	public Question(String questiontext, List<Answer> answers, String feedback, float grade) {
		super();
		this.questiontext = questiontext;
		this.answers = answers;
		this.feedback = feedback;
		this.grade = grade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQuestiontext() {
		return questiontext;
	}

	public void setQuestiontext(String questiontext) {
		this.questiontext = questiontext;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public void setAnswer(Answer answer) {
		this.answers.add(answer);
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

}
