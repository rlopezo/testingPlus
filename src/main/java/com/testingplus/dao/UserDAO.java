package com.testingplus.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.testingplus.dto.UserDTO;
import com.testingplus.model.User;
import com.testingplus.utils.HibernateUtil;

public class UserDAO {

	public UserDTO findUser(UserDTO userDTO) {
		Session session = HibernateUtil.getSesionFactory().getCurrentSession();
		session.beginTransaction();
		
		Criteria criteria = session.createCriteria(User.class).add(Restrictions.eqOrIsNull("userName", userDTO.getUser().getUserName()));
		List<User> result = criteria.list();
		userDTO.setUsersList(result);
		return userDTO;
	}
}
