package com.accp.config;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.accp.interceptor.myInterceptor;



@Configuration
public class MywebMvcConfig extends WebMvcConfigurationSupport{
	
	
	//添加拦截器
	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(new myInterceptor()).addPathPatterns("/**");
		super.addInterceptors(registry);
	}
	
	
	@Override
	protected void addCorsMappings(CorsRegistry registry) {
		// TODO Auto-generated method stub
		registry.addMapping("/**").allowedMethods("*").allowedOrigins("*").allowedHeaders("*").allowCredentials(true);
		super.addCorsMappings(registry);
	}
	
	//重写此方法后会覆盖原有的默认消息转换器，所以需要的其它转换器
		//都需要重写构建
		@Override
		protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
			//普通字符串转码
			StringHttpMessageConverter shc = 
					new StringHttpMessageConverter(StandardCharsets.UTF_8);
			converters.add(shc);
			//json格式转换器
			MappingJackson2HttpMessageConverter jackson =
					new MappingJackson2HttpMessageConverter();
			converters.add(jackson);
			//org.springframework.http.converter.ByteArrayHttpMessageConverter	
			super.configureMessageConverters(converters);
		}

	
	
	//覆盖原有的静态资源配置，必须重新配置
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/").addResourceLocations("file:/d");
		super.addResourceHandlers(registry);
	}
	
}
