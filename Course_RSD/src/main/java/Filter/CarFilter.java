package Filter;

import Product.Product;
import Product.Utils.QParser;
import Product.Utils.expression;

import java.util.List;


public  class CarFilter extends Filter {
    @Override
    public boolean filter(String query, Product product) {

        //brand = "BMW" & year > 2015
        QParser qParser = new QParser();
        List<expression> exl = qParser.parse(query);
        for(expression e:exl){
            e.setLhs(product.getStrValueByStr(e.getLhs()));
            if(!e.exec())return false;
        }
        return true;
    }

    public CarFilter build(){return this;};

}
