package com.stackroute.springbootzulugatewayproxy.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class PostFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
