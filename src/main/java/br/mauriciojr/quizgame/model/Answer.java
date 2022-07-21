package br.mauriciojr.quizgame.model;

public class Answer {

	private long id;
	private String answerText;
	private boolean iscorrect;

	public Answer() {
	}

	public Answer(String answerText, boolean iscorrect) {
		super();
		this.answerText = answerText;
		this.iscorrect = iscorrect;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	public boolean isIscorrect() {
		return iscorrect;
	}

	public void setIscorrect(boolean iscorrect) {
		this.iscorrect = iscorrect;
	}

}
