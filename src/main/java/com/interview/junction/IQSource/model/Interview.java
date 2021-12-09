package com.interview.junction.IQSource.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * This object will contian interview impression and session detail.
 * 
 * @author mehtad
 *
 */
@Entity
@Table(name = "IQ_INTERVIEWS")
public class Interview {

	private long id;
	private String sessionToken;	//Key passed to candidate for form filling
	private String candidate;
	private String employer;
	private String round; //l1,l2,l3,final,other
	private String interviewer;
	private LocalDate date;
	private String mode; //Telephonic/In-person/Third-Party apps
}
