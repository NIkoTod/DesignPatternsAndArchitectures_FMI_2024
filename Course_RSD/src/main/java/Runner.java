import Archive.Archive;
import Notify.NotificationService;
import Post.Post;
import Product.Product;
import Product.Car;
import Product.ProductType;
import Product.Utils.FloatingDot;
import User.StandardUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum STATUS{
    guest,
    standard,
    dealer
}

enum LANGUAGE{
    en,
    bg
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
    static NotificationService notificationService = new NotificationService();
    static Archive archive = new Archive();

    public static void run(){


        StandardUser user =
                new StandardUser("1","Mobile","qwerty","email@emal.com","000000000","Джеймс Баучер 5");
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

                    status = STATUS.standard;
                    System.out.println("Welcome " + user.getUserName() + "\n");
                }
            }
            if(command.equals("add car")){
                if(status != STATUS.standard) System.out.println("Login first");
                else {
                    System.out.println("Enter \n " +
                            "1 Brand \n " +
                            "2 Model \n" +
                            "3 Engine Volume \n" +
                            "4 Door Amount \n " +
                            "5 Year \n" +
                            "6 Price");

                    List<String> lines = takeNLines(6);

                    FloatingDot en = new FloatingDot();
                    FloatingDot p = new FloatingDot();

                    en.setX(Double.valueOf(lines.get(2)));
                    p.setX(Double.valueOf(lines.get(5)));

                    Car newcar = new Car(lines.get(0),lines.get(1),en,
                            Integer.valueOf(lines.get(3)),
                            Integer.valueOf(lines.get(4)),
                            p,
                            ProductType.car);

                    cars.add(newcar);
                    Post post = new Post(newcar,notificationService,archive);
                    System.out.println("Car added");
                }

            }

            if(command.equals("show cars")){
                System.out.println(cars);
            }

            if(command.equals("subscribe")){
                if(status != STATUS.standard) System.out.println("Login first");
                else {
                    System.out.println("Enter query:");
                    List<String> lines = takeNLines(1);
                    user.setNotification(lines.get(0).trim(), notificationService, "sms");
                }
            }

            if(command.equals("archive")){
                System.out.println("Enter brand and model:");
                List<String> lines = takeNLines(2);
                System.out.println(archive.getAveragePrice(lines.get(0) + lines.get(1)));

            }


            if (command.equals("logout")){
                status = STATUS.guest;
            }

        }

    }

}
