package com.entity;

import com.util.VeDate;

public class Complains {
	private String complainsid = "C" + VeDate.getStringId();
	private String usersid;
	private String contents;
	private String addtime;
	private String status;
	private String reps;
	private String username;

	public String getComplainsid() {
		return complainsid;
	}

	public void setComplainsid(String complainsid) {
		this.complainsid = complainsid;
	}

	public String getUsersid() {
		return this.usersid;
	}

	public void setUsersid(String usersid) {
		this.usersid = usersid;
	}

	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getAddtime() {
		return this.addtime;
	}

	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReps() {
		return this.reps;
	}

	public void setReps(String reps) {
		this.reps = reps;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
