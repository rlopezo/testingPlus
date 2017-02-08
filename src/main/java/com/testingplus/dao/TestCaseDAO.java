package com.testingplus.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.testingplus.dto.TestCaseDTO;
import com.testingplus.model.TestCase;
import com.testingplus.utils.HibernateUtil;

public class TestCaseDAO {
	
	public TestCaseDTO createTestCase(TestCaseDTO testCaseDTO) {
		Session session = HibernateUtil.getSesionFactory().getCurrentSession();
		session.beginTransaction();
		
		Integer id = (Integer) session.save(testCaseDTO.getTestCase());
		testCaseDTO.getTestCase().setId(id);
		session.getTransaction().commit();
		return testCaseDTO;
	}
	
	public TestCaseDTO listTestCases() {
		TestCaseDTO dto = new TestCaseDTO();
		Session session = HibernateUtil.getSesionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(TestCase.class);
		List<TestCase> result = criteria.list();
		dto.setTestCasesList(result);
		return dto;
	}

}
