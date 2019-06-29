package com.cg.entities;

import java.time.LocalDate;

public class ProgramsScheduled {
	private int scheduledProgramId;
	private String programName;
	private String location;
	private LocalDate startDate;
	private LocalDate endDate;
	private int sessionPerWeek;
	
	public ProgramsScheduled() {
	}

	public ProgramsScheduled(int scheduledProgramId, String programName,
			String location, LocalDate startDate, LocalDate endDate,
			int sessionPerWeek) {
		this.scheduledProgramId = scheduledProgramId;
		this.programName = programName;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
		this.sessionPerWeek = sessionPerWeek;
	}

	public int getScheduledProgramId() {
		return scheduledProgramId;
	}

	public void setScheduledProgramId(int scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getSessionPerWeek() {
		return sessionPerWeek;
	}

	public void setSessionPerWeek(int sessionPerWeek) {
		this.sessionPerWeek = sessionPerWeek;
	}

	@Override
	public String toString() {
		return "ProgramsScheduled [scheduledProgramId=" + scheduledProgramId
				+ ", programName=" + programName + ", location=" + location
				+ ", startDate=" + startDate + ", endDate=" + endDate
				+ ", sessionPerWeek=" + sessionPerWeek + "]";
	}

}
