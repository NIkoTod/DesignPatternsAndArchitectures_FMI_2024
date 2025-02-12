package Filter;

import Product.Product;


public  class CarFilter extends Filter {
    @Override
    public boolean filter(String query, Product product) {

        //brand = "BMW" & year > 2015


        return true;

    }

    public CarFilter build(){return this;};

}
