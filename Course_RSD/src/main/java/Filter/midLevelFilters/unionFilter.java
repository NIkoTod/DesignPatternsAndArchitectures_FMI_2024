package Filter.midLevelFilters;

import Filter.lowLevelFilters.filter;

public class unionFilter {

    boolean union(filter a, filter b) {
        return a.executeFilter() && b.executeFilter();
    }//for example only
}
