package com.designpattern.filter;

/**
 * {@code @Description:}
 */
public class Client {
    public static void main(String[] args) {
        Request req = null;
        Response res = null;

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new FirstFilter()).addFilter(new SecondFilter());
        filterChain.doFilter(req, res);
        // 过滤器1 前置处理
        // 过滤器2 前置处理
        // 过滤器2 后置处理
        // 过滤器1 后置处理
    }
}