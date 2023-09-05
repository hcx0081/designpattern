package com.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * {@code @description:}
 */
public class FilterChain {
    private List<Filter> filterList = new ArrayList<>();
    private int index = 0;

    // 链式调用
    public FilterChain addFilter(Filter filter) {
        this.filterList.add(filter);
        return this;

    }

    public void doFilter(Request request, Response response) {
        if (index == filterList.size()) {
            return;
        }
        Filter filter = filterList.get(index);
        index++;
        filter.doFilter(request, response, this);
    }
}