package com.cg.entities;

public class ProgramOffered {
	private String programName;
	private String description;
	private String eligibility;
	private int duration;
	private String degreeCertificateOffered;
	
	public ProgramOffered() {
	}

	public ProgramOffered(String programName, String description,
			String eligibility, int duration, String degreeCertificateOffered) {
		this.programName = programName;
		this.description = description;
		this.eligibility = eligibility;
		this.duration = duration;
		this.degreeCertificateOffered = degreeCertificateOffered;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEligibility() {
		return eligibility;
	}

	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getDegreeCertificateOffered() {
		return degreeCertificateOffered;
	}

	public void setDegreeCertificateOffered(String degreeCertificateOffered) {
		this.degreeCertificateOffered = degreeCertificateOffered;
	}

	@Override
	public String toString() {
		return "Participant [programName=" + programName + ", description="
				+ description + ", eligibility=" + eligibility + ", duration="
				+ duration + ", degreeCertificateOffered="
				+ degreeCertificateOffered + "]";
	}

}
