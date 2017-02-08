package com.testingplus.dto;

import java.util.List;

import com.testingplus.model.TestCase;

public class TestCaseDTO {
	
	private TestCase testCase;
	private List<TestCase> testCasesList;

	public TestCase getTestCase() {
		return testCase;
	}

	public void setTestCase(TestCase testCase) {
		this.testCase = testCase;
	}

	public List<TestCase> getTestCasesList() {
		return testCasesList;
	}

	public void setTestCasesList(List<TestCase> testCasesList) {
		this.testCasesList = testCasesList;
	}
	
	
	
	

}
