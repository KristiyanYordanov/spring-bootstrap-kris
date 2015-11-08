package com.krissoft.sbs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.krissoft.sbs")
public class WebConfig extends WebMvcConfigurerAdapter {

	/*
	 * Configure a JSP view resolver
	 */
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("");
		resolver.setSuffix("");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}

	/*
	 * 
	 * Configure static content handling
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureDefaultServletHandling(org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer)
	 */
	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
