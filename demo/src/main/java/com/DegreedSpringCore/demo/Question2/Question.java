package com.DegreedSpringCore.demo.Question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class Question {
 private int questionId;
 private String question;

 private List<String> answersList = new ArrayList<>(); 
 private Map<Integer, String> answersMap = new HashMap<>();
 private Set<String> answersSet = new HashSet<>();
 public List<String> getAnswersList() {
		return answersList;
	}
	public void setAnswersList(List<String> answersList) {
		this.answersList = answersList;
	}
	public Map<Integer, String> getAnswersMap() {
		return answersMap;
	}
	public void setAnswersMap(Map<Integer, String> answersMap) {
		this.answersMap = answersMap;
	}
	public Set<String> getAnswersSet() {
		return answersSet;
	}
	public void setAnswersSet(Set<String> answersSet) {
		this.answersSet = answersSet;
	}

public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}


  
 
 
 
}
