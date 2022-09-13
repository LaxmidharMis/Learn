package com.email.api.dto;

public class MailRequest {

	private String name;
	private String to;
	private String from;
	private String subject;
	private String pnr;

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "MailRequest [name=" + name + ", to=" + to + ", from=" + from + ", subject=" + subject + ", pnr=" + pnr
				+ "]";
	}

	public MailRequest(String name, String to, String from, String subject, String pnr) {
		super();
		this.name = name;
		this.to = to;
		this.from = from;
		this.subject = subject;
		this.pnr = pnr;
	}

	public MailRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

}
