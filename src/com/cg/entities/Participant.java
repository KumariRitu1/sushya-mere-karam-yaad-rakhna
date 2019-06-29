package com.cg.entities;

public class Participant {
	private int rollNo;
	private String emailId;
	private int applicationId;
	private int scheduledProgramId;
	
	public Participant() {
	}

	public Participant(int rollNo, String emailId, int applicationId,
			int scheduledProgramId) {
		this.rollNo = rollNo;
		this.emailId = emailId;
		this.applicationId = applicationId;
		this.scheduledProgramId = scheduledProgramId;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public int getScheduledProgramId() {
		return scheduledProgramId;
	}

	public void setScheduledProgramId(int scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}

	@Override
	public String toString() {
		return "Participant [rollNo=" + rollNo + ", emailId=" + emailId
				+ ", applicationId=" + applicationId + ", scheduledProgramId="
				+ scheduledProgramId + "]";
	}
	
}
