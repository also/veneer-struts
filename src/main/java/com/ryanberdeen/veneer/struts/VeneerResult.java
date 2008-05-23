package com.ryanberdeen.veneer.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.StrutsResultSupport;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import com.ryanberdeen.veneer.RenderContext;
import com.ryanberdeen.veneer.VeneerSupport;

public class VeneerResult extends StrutsResultSupport implements Result {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doExecute(String name, ActionInvocation invocation) throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();

		RenderContext renderContext = VeneerSupport.getContext(ServletActionContext.getServletContext(), request);
		renderContext.setTemplateName(renderContext.getMainTemplateName());
		String value = renderContext.render(request, response, renderContext.resolveViewPath(name));

		if (value != null) {
			response.getWriter().write(value);
		}
	}
}
