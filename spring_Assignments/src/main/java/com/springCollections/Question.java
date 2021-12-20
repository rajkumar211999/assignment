package com.springCollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {

	private String questionId;
	private String question;
	private List<String> answers1;
	private Set<String> answers2;
	private Map<Integer,String> answers3;
	
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public void setAnswers1(List<String> answers1) {
		this.answers1 = answers1;
	}
	public void setAnswers2(Set<String> answers2) {
		this.answers2 = answers2;
	}
	public void setAnswers3(Map<Integer, String> answers3) {
		this.answers3 = answers3;
	}
	
	public String getQuestionId() {
		return questionId;
	}
	public String getQuestion() {
		return question;
	}
	public List<String> getAnswers1() {
		return answers1;
	}
	public Set<String> getAnswers2() {
		return answers2;
	}
	public Map<Integer, String> getAnswers3() {
		return answers3;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answersList=" + answers1
				+ ", answersSet=" + answers2 + ", answersMap=" + answers3 + "]";
	}
	public void displayQsn()
	{
		System.out.println("questionId="+getQuestionId());
		System.out.println("question="+getQuestion());
		System.out.println("answersList="+getAnswers1());
		System.out.println("answersSet="+getAnswers2());
		System.out.println("answersMap="+getAnswers3());
	}
	
	
}
