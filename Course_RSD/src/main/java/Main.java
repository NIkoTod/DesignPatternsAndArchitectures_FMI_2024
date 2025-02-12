import Product.Car;
import Product.Product;
import Product.ProductType;
import Product.Utils.FloatingDot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        FloatingDot fd = new FloatingDot();
        FloatingDot fd1 = new FloatingDot();
        fd.setX(3);
        fd1.setX(12000);
        Car car = new Car("BMW",fd,5,2005,fd1,ProductType.car);

        System.out.println(car.getIntValueByStr("year"));

        //Runner.run();

    }
}