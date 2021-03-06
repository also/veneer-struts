/*
 * Copyright 2008 Ryan Berdeen.
 *
 * This file is part of Veneer.
 *
 * Veneer is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Veneer is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Veneer.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.ryanberdeen.veneer.struts;

import org.apache.struts2.ServletActionContext;

import com.ryanberdeen.veneer.RenderContext;
import com.ryanberdeen.veneer.VeneerSupport;

/** Utility methods for using Veneer inside of Struts.
 * @author Ryan Berdeen
 *
 */
public class StrutsVeneerSupport {
	
	/** Sets the template for the main view in the current request.
	 */
	public static void setTemplateName(String templateName) {
		getContext().setMainTemplateName(templateName);
	}
	
	/** Returns the {@link RenderContext} for the current request.
	 */
	public static RenderContext getContext() {
		return VeneerSupport.getContext(ServletActionContext.getServletContext(), ServletActionContext.getRequest());
	}
}
