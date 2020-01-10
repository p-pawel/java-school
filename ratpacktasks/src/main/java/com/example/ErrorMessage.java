package com.example;

class ErrorMessage {
	private String code;
	private String message;

	public ErrorMessage(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public ErrorMessage setCode(String code) {
		this.code = code;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public ErrorMessage setMessage(String message) {
		this.message = message;
		return this;
	}
}
