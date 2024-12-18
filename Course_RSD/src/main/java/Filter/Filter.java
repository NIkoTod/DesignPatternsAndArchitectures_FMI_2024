package Filter;
import Filter.lowLevelFilters.filter;
import Product.Product;

import java.util.List;

public abstract class Filter {

    List<filter<Integer>> filters;
    public abstract boolean filter(String query, Product product);
}
