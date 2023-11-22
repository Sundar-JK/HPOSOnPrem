package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer; 



@Configuration
@ComponentScan(basePackages="com")
@EnableWebMvc
public class ServletReplacemnt implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setPrefix("/WEB-INF/views/" );
		irvr.setSuffix(".jsp");
		return irvr;
		
	}
	 
	
	 @Bean
	 public LocalSessionFactoryBean sessionFactory() {
	        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	        sessionFactory.setConfigLocation(new ClassPathResource("hibernate.cfg.xml"));
	        return sessionFactory;
	    }
	

	 
	  @Override
	  public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/apnt/**")
	                .allowedOrigins("http://d365hposvmv1.uaenorth.cloudapp.azure.com:3002")
	                .allowCredentials(true);
	    }
	  
	  
}
