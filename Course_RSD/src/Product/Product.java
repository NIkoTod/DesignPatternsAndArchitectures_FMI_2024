package Product;

import Filter.Filter;
import Product.Utils.FloatingDot;

public abstract class Product {

    protected FloatingDot price;
    protected ProductType productType;

    public FloatingDot getPrice() {
        return price;
    }

    public void setPrice(FloatingDot price) {
        this.price = price;
    }

    public String getType() {
        return productType.toString();
    }

    public void setType(String type) {
        this.productType = ProductType.valueOf(type);
    }


    public abstract boolean isMatchingFilter(String filter);
    public abstract String toString();
}
