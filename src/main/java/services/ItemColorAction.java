package services;
//package com.strutstutorial.colors;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * TilesService http://www.j2eebrain.com/java-J2ee-tiles-tutorial.html Struts
 * related
 */
public class ItemColorAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ItemColorForm itemColorForm = (ItemColorForm) form;
		String selectedColor = itemColorForm.getColor();
		ArrayList itemsList = new ArrayList();
		ActionErrors errors = new ActionErrors();
		if (selectedColor != null && !selectedColor.equalsIgnoreCase("")) {
			if (selectedColor.equalsIgnoreCase("red")) {
				itemsList.add("Suitcase");
				itemsList.add("Cup");
			} else if (selectedColor.equalsIgnoreCase("blue")) {
				itemsList.add("Pen");
				itemsList.add("Door");
			} else if (selectedColor.equalsIgnoreCase("green")) {
				itemsList.add("Carpet");
				itemsList.add("Table");
			} else {
				itemsList.add("item1");
				itemsList.add("item2");
			}
		}
		if (selectedColor != null && !selectedColor.equalsIgnoreCase("")) {
			request.setAttribute("selectedColor", selectedColor);
		} else {
			request.setAttribute("selectedColor", "empty");
		}
		if (itemsList != null) {
			request.setAttribute("itemsList", itemsList);
		}
		ActionForward forward = mapping.findForward("success");
		return forward;
	}
}
