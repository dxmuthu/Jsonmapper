package com.test;

public class Support {

	public Support(String url, String text) {
		super();
		this.url = url;
		this.text = text;
	}

	private String url;
	private String text;

	public void setUrl(String url) {
		this.url = url;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public String getText() {
		return text;
	}

}
