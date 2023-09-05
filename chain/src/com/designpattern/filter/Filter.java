package com.designpattern.filter;

/**
 * {@code @description:}
 */
public interface Filter {
    void doFilter(Request req, Response res, FilterChain chain);
}