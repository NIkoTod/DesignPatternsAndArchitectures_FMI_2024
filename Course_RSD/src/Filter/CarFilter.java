package Filter;

import Product.Product;

import java.util.ArrayList;
import java.util.List;

public  class CarFilter extends Filter {
    @Override
    public boolean filter(String query, Product product) {
        List<String> parameters = List.of(query.split(" "));

        //Parameters are with expectations so we can include and exclude them
        // Query: price = 2000 true
        //        gear_box = auto false (we don't want auto)
        // Use map instead of String
        //So we use: for(int i = 0 ; i < cars.size();i++){
        //  cars[i].isMatchingFilter(query)?res.add(cars[i]):somethingElse();
        // }
        // Add cash? (in future)

        return true;

    }
}
