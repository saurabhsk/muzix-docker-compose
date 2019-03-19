package com.stackroute.springbootzulugatewayproxy;

import com.stackroute.springbootzulugatewayproxy.filters.ErrorFilter;
import com.stackroute.springbootzulugatewayproxy.filters.PostFilter;
import com.stackroute.springbootzulugatewayproxy.filters.PreFilter;
import com.stackroute.springbootzulugatewayproxy.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class SpringBootZulugatewayproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZulugatewayproxyApplication.class, args);
	}


//	@Bean
//	public PreFilter preFilter() {
//		return new PreFilter();
//	}
//	@Bean
//	public PostFilter postFilter() {
//		return new PostFilter();
//	}
//	@Bean
//	public ErrorFilter errorFilter() {
//		return new ErrorFilter();
//	}
//	@Bean
//	public RouteFilter routeFilter() {
//		return new RouteFilter();
//	}


}



