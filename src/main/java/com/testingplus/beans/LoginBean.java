package com.testingplus.beans;

import java.io.IOException;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.testingplus.dao.UserDAO;
import com.testingplus.dto.UserDTO;
import com.testingplus.model.User;

@ManagedBean
@ViewScoped
public class LoginBean implements Serializable {

	private static final long serialVersionUID = -60364547906028850L;
	
	private User user;

	@PostConstruct
	public void init() {
		user = new User();
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public void login() {
		try {
			UserDAO dao = new UserDAO();
			UserDTO dto = new UserDTO();
			dto.setUser(user);
			UserDTO result = dao.findUser(dto);
			if(result.getUsersList().size() == 0) {
				System.out.println("Not exists!");
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,  "Error", "El nombre de usuario no es correcto."));
			} else {
				User userFromDB = result.getUsersList().get(0);
				if(user.getUserPassword().equals(userFromDB.getUserPassword())) {
					FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", user);
					FacesContext.getCurrentInstance().getExternalContext().redirect("../index.xhtml");
				} else {
					FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,  "Error", "La contraseña no es correcta."));
					System.out.println("INVALID PASSWORD!");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void logout() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("user");
			FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
