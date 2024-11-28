package Filter;
import Product.Product;

import java.util.List;

public abstract class Filter {
    public abstract boolean filter(String query, Product product);
}
