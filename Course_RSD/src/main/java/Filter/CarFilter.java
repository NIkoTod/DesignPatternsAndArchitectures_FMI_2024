package Filter;

import Product.Product;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;

public  class CarFilter extends Filter {
    @Override
    public boolean filter(String query, Product product) {


        try {
            Map<String, Object> mapping = new ObjectMapper().readValue(query, HashMap.class);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

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
