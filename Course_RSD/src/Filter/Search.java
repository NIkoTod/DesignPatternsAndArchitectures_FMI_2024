package Filter;

import Product.Product;

import java.util.List;

public class Search extends Filter {
    @Override
    public boolean filter(String query, Product product) {
        return false;
    }
}
