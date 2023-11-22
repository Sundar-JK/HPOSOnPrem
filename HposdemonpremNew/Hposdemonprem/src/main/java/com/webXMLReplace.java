package com;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class webXMLReplace extends AbstractAnnotationConfigDispatcherServletInitializer{


	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	protected Class<?>[] getServletConfigClasses() {
		Class[] configClass= {ServletReplacemnt.class};
		return configClass;
	}

	@Override
	protected String[] getServletMappings() {
		String[] urlMappings= {"/apnt/*"};
		return urlMappings;
		
		
	}
	
}
