package com.email.api.dto;

public class MailResponse {
	private String message;
	private boolean status;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public MailResponse(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}

	@Override
	public String toString() {
		return "MailResponse [message=" + message + ", status=" + status + "]";
	}

	public MailResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

}
