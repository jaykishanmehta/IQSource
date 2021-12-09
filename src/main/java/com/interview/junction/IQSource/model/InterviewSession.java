package com.interview.junction.IQSource.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IQ_INTERVIEW_SESSIONS")
public class InterviewSession {

	private int id;
	private int createdBy;
	private String candidate;	//Mail address/EmpId
	private String employer;
	private String role;		//Role applied for this interview
	private String sessionToken;
	private String status;		//Active -> Submitted[Closed]/Cancelled
	private String reason;
	private String data;
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;
}
