package com.testingplus.beans;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class HomeBean implements Serializable {
	
	private static final long serialVersionUID = -8236271993232692029L;

	private int menuSelection = 0;
	
	public void onload() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		if(!facesContext.getExternalContext().getSessionMap().containsKey("user")) {
			ExternalContext externalContext = facesContext.getExternalContext();
			try {
				externalContext.redirect("views/login.xhtml");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void handleTestCasesSelection() {
		menuSelection = 0;
	}

	public int getMenuSelection() {
		return menuSelection;
	}

	public void setMenuSelection(int menuSelection) {
		this.menuSelection = menuSelection;
	}

	
	

}