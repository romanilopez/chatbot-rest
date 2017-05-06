package pe.com.bbva.harec.model;

public class Value {
	private String field;
	private String question;
	
	public Value(String field, String question) {
		this.field = field;
		this.question = question;
	}
	
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
}
