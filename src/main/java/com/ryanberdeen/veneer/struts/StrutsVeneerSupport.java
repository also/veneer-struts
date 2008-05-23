package com.ryanberdeen.veneer.struts;

import org.apache.struts2.ServletActionContext;

import com.ryanberdeen.veneer.VeneerSupport;

public class StrutsVeneerSupport {
	public static void setTemplateName(String templateName) {
		VeneerSupport.getContext(ServletActionContext.getServletContext(), ServletActionContext.getRequest()).setMainTemplateName(templateName);
	}
}
