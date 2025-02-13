package Filter;

import Filter.lowLevelFilters.filter;
import Product.Product;
import Product.Utils.QParser;
import Product.Utils.expression;

import java.util.ArrayList;
import java.util.List;


public  class CarFilter extends Filter {

    public CarFilter(String query){
        this.query = query;
    }

    @Override
    public boolean filter(Product product) {
        //brand = "BMW" & year > 2015
        QParser qParser = new QParser();
        List<expression> exl = qParser.parse(query);
        List<filter> flist = new ArrayList<filter>();
        for(expression e:exl){
            if(e.type() == 'a'){
                flist.add(e.getFilter().setValue(product.getIntValueByStr(e.getLhs())));
            }
            else if(e.type() == 'b'){
                String res = product.getStrValueByStr(e.getLhs());
                filter filter1 = e.getFilter().setValue(res);
                flist.add(filter1);
            }
            else return false;
        }

        return flist.stream().map(filter::executeFilter).allMatch(e -> e == true);

    }

    public CarFilter build(){return this;}

}
