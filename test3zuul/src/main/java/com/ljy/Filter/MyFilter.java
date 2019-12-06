package com.ljy.Filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

import javax.servlet.http.HttpServletRequest;

/**
 * @类名: com.ljy.filter
 * @作者: lhr
 * @创建时间: 2019-12-04 15:22
 * @描述:
 **/
@EnableZuulServer
public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        //"pre" "post" "error"
        return "pre";
    }

    @Override
    public int filterOrder() {//设置执行filter的顺序 值越小被执行的优先级越高
        return 0;
    }

    @Override
    public boolean shouldFilter() {//配置是否使用giant过滤器  true 可以 false 不可以
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext currentContext = RequestContext.getCurrentContext();

        HttpServletRequest request = currentContext.getRequest();

        String requestURI = request.getRequestURI();

        //做鉴权

        return null;
    }
}
