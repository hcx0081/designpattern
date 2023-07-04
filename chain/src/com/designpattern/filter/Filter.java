package com.designpattern.filter;

/**
 * {@code @Description:}
 */
public interface Filter {
    void doFilter(Request req, Response res, FilterChain chain);
}