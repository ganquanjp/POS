package jp.co.nl.pos.interceptor.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import jp.co.nl.pos.interceptor.LogHandlerInterceptor;

@Configuration
public class LogInterceptor extends WebMvcConfigurerAdapter {

	/**
	 * 添加拦截器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LogHandlerInterceptor())
				.addPathPatterns("/user-selectOne");
	}
}