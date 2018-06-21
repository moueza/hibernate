package services;

//package com.strutstutorial.colors;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * http://www.j2eebrain.com/java-J2ee-tiles-tutorial.html Struts related
 */
public class ItemColorForm extends ActionForm {
	private String color = null;

	public void reset() {
		color = null;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}