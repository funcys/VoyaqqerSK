package com.funcys.voyaqqer;

import lombok.Data;

@Data
public class Voyaqqerer {
	private String voyaqqererId;
	private String voyaqqererName;
	private String voyaqqererProfile;
	private int voyaqqererAge;

	public String getVoyaqqererId() {
		return voyaqqererId;
	}

	public String getVoyaqqererName() {
		return voyaqqererName;
	}

	public String getVoyaqqererProfile() {
		return voyaqqererProfile;
	}

	public int getVoyaqqererAge() {
		return voyaqqererAge;
	}

	public void setVoyaqqererId(String id) {
		this.voyaqqererId = id;

	}
}
