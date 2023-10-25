package com;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class webXMLReplace extends AbstractAnnotationConfigDispatcherServletInitializer{


	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	protected Class<?>[] getServletConfigClasses() {
		Class[] configClass= {ServletReplacemnt.class};
		return configClass;
	}

	protected String[] getServletMappings() {
		String[] urlMappings= {"/apnt/*"};
		return urlMappings;
	}
}
