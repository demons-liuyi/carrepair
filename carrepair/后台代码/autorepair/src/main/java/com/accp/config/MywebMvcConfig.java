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
	
	
	//娣诲姞鎷︽埅鍣�
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
	
	//閲嶅啓姝ゆ柟娉曞悗浼氳鐩栧師鏈夌殑榛樿娑堟伅杞崲鍣紝鎵�浠ラ渶瑕佺殑鍏跺畠杞崲鍣�
		//閮介渶瑕侀噸鍐欐瀯寤�
		@Override
		protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
			//鏅�氬瓧绗︿覆杞爜
			StringHttpMessageConverter shc = 
					new StringHttpMessageConverter(StandardCharsets.UTF_8);
			converters.add(shc);
			//json鏍煎紡杞崲鍣�
			MappingJackson2HttpMessageConverter jackson =
					new MappingJackson2HttpMessageConverter();
			converters.add(jackson);
			//org.springframework.http.converter.ByteArrayHttpMessageConverter	
			super.configureMessageConverters(converters);
		}

	
	
	//瑕嗙洊鍘熸湁鐨勯潤鎬佽祫婧愰厤缃紝蹇呴』閲嶆柊閰嶇疆
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/").addResourceLocations("file://d://images/");
		super.addResourceHandlers(registry);
	}
	
}
