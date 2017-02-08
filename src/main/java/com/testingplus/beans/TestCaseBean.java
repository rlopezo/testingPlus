package com.testingplus.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.testingplus.dao.TestCaseDAO;
import com.testingplus.dto.TestCaseDTO;
import com.testingplus.model.TestCase;

@ManagedBean
@ViewScoped
public class TestCaseBean implements Serializable {

	private static final long serialVersionUID = -8179079816495882821L;
	
	private TestCase testCase;
	private boolean isAddingTestCase;
	
	private List<TestCase> testCasesList;

	@PostConstruct
	public void init() {
		testCase = new TestCase();
		loadTestCases();
	}
	
	public void prepareCreateTestCase() {
		testCase = new TestCase();
		isAddingTestCase = true;
	}
	
	public void cancelAddingTestCase() {
		isAddingTestCase = false;
	}
	
	public void createTestCase() {
		testCase.setTestCaseCreationDate(new Date());
		TestCaseDTO dto = new TestCaseDTO();
		dto.setTestCase(testCase);
		TestCaseDAO dao = new TestCaseDAO();
		testCasesList.add(dao.createTestCase(dto).getTestCase());
		isAddingTestCase = false;
	}
	
	public void loadTestCases() {
		TestCaseDAO dao = new TestCaseDAO();
		testCasesList = dao.listTestCases().getTestCasesList();		
	}
	
	public TestCase getTestCase() {
		return testCase;
	}

	public void setTestCase(TestCase testCase) {
		this.testCase = testCase;
	}

	public boolean getIsAddingTestCase() {
		return isAddingTestCase;
	}

	public void setAddingTestCase(boolean isAddingTestCase) {
		this.isAddingTestCase = isAddingTestCase;
	}

	public List<TestCase> getTestCasesList() {
		return testCasesList;
	}

	public void setTestCasesList(List<TestCase> testCasesList) {
		this.testCasesList = testCasesList;
	}
	
	

}
