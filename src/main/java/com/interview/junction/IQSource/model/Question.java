package com.interview.junction.IQSource.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IQ_QUESTIONS")
public class Question {
	
	private long id;
	private String title;
	private String desc;
	private int session;	//foreign key for interview
	
}
