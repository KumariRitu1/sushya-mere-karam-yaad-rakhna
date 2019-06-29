package com.cg.entities;

import java.time.LocalDate;

public class ApplicationForm {
	
	private int applicationId;
	private String name;
	private LocalDate dob;
	private String qualification;
	private int marks;
	private String goals;
	private String email;
	private int scheduledProgramId;
	private String status;
	private LocalDate dateOfInterview;
	
	public ApplicationForm() {
	}

	public ApplicationForm(int applicationId, String name, LocalDate dob,
			String qualification, int marks, String goals, String email,
			int scheduledProgramId, String status, LocalDate dateOfInterview) {
		this.applicationId = applicationId;
		this.name = name;
		this.dob = dob;
		this.qualification = qualification;
		this.marks = marks;
		this.goals = goals;
		this.email = email;
		this.scheduledProgramId = scheduledProgramId;
		this.status = status;
		this.dateOfInterview = dateOfInterview;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getGoals() {
		return goals;
	}

	public void setGoals(String goals) {
		this.goals = goals;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getScheduledProgramId() {
		return scheduledProgramId;
	}

	public void setScheduledProgramId(int scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getDateOfInterview() {
		return dateOfInterview;
	}

	public void setDateOfInterview(LocalDate dateOfInterview) {
		this.dateOfInterview = dateOfInterview;
	}

	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", name=" + name
				+ ", dob=" + dob + ", qualification=" + qualification
				+ ", marks=" + marks + ", goals=" + goals + ", email=" + email
				+ ", scheduledProgramId=" + scheduledProgramId + ", status="
				+ status + ", dateOfInterview=" + dateOfInterview + "]";
	}
	
}
