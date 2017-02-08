package com.testingplus.model;

import java.io.Serializable;
import java.util.Date;

public class TestCase implements Serializable {

	private static final long serialVersionUID = 4833618259675122346L;
	
	private Integer id;
	private String testCaseName;
	private Date testCaseCreationDate;
	private Boolean isRegressive;
	private Integer assignedTask;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTestCaseName() {
		return testCaseName;
	}
	public void setTestCaseName(String testCaseName) {
		this.testCaseName = testCaseName;
	}
	public Date getTestCaseCreationDate() {
		return testCaseCreationDate;
	}
	public void setTestCaseCreationDate(Date testCaseCreationDate) {
		this.testCaseCreationDate = testCaseCreationDate;
	}
	public Boolean getIsRegressive() {
		return isRegressive;
	}
	public void setIsRegressive(Boolean isRegressive) {
		this.isRegressive = isRegressive;
	}
	public Integer getAssignedTask() {
		return assignedTask;
	}
	public void setAssignedTask(Integer assignedTask) {
		this.assignedTask = assignedTask;
	}
	
	

}
