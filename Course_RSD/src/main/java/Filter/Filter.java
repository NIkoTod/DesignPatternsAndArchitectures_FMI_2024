package Filter;
import Filter.lowLevelFilters.filter;
import Product.Product;

import java.util.List;

public abstract class Filter {

    public String query;
    public boolean filter(Product product){
        return true;
    }

}
