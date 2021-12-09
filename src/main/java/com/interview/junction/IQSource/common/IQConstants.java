package com.interview.junction.IQSource.common;

public class IQConstants {

	public enum InterviewRound {
		R1("R1/L1/First Round"), 
		R2("R2/L2/Second Round"), 
		R3("R3/L3/Second Round");

		private String title;
		
		InterviewRound(String title) {
			this.title = title;
		}

		public String getTitle() {
			return title;
		}
	}
	
	public enum InterviewMode {
		TELEPHONIC, IN_PERSON, VIDEO, ONLINE_EXAM
	}
	
	public enum InterviewSessionStatus {
		ACTIVE("Sheet created for the candidate"), 
		SUBMITTED("Candidate has filled sheet and submitted"),
		CANCELLED("Interview is cancelled");

		private String title;
		
		InterviewSessionStatus(String title) {
			this.title = title;
		}

		public String getTitle() {
			return title;
		}
	}
}
