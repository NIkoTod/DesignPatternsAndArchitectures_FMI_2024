import Product.Product;
import Product.Car;
import Product.ProductType;
import Product.Utils.FloatingDot;
import User.StandartUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum STATUS{
    guest,
    standart,
    dealer
}

public class Runner {

    private static List<String> takeNLines(int n){
        List<String> lines = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        while(n-- > 0){
            lines.add(sc.nextLine());
        }
        return lines;
    }

    public static void run(){


        StandartUser user =
                new StandartUser("1","Mobile","qwerty","email@emal.com");
        List<Product> cars = new ArrayList<Product>();
        STATUS status = STATUS.guest;
        while(true){

            Scanner sc = new Scanner(System.in);
            String command = sc.nextLine();
            if(command.equals("exit")){
                break;
            }
            if(command.equals("guest")){
                status = STATUS.guest;
            }
            if(command.equals("login")) {
                System.out.println("Enter login and password");
                List<String> lines = takeNLines(2);
                if (lines.get(0).trim().equals(user.getUserName()) &&
                        lines.get(1).trim().equals(user.getUserPassword())) {
                    status = STATUS.standart;
                }
                System.out.println("Welcome " + user.getUserName() + "\n");
            }
            if(command.equals("add car")){
                if(status != STATUS.standart) System.out.println("Login first");
                else {
                    System.out.println("Enter \n " +
                            "1 Brand \n " +
                            "2 Engine Volume \n" +
                            "3 Door Amount \n " +
                            "4 Year \n" +
                            "5 Price");

                    List<String> lines = takeNLines(5);

                    FloatingDot en = new FloatingDot();
                    FloatingDot p = new FloatingDot();
                    en.setX(Integer.valueOf(lines.get(1)));
                    p.setX(Integer.valueOf(lines.get(4)));
                    Car newcar = new Car(lines.get(0), en,
                            Integer.valueOf(lines.get(2)),
                            Integer.valueOf(lines.get(3)),
                            p,
                            ProductType.car);

                    cars.add(newcar);

                    System.out.println("Car added");
                }

            }

            if(command.equals("show cars")){
                System.out.println(cars);
            }

            if (command.equals("logout")){
                status = STATUS.guest;
            }

        }

    }

}
