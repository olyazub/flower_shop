import discounts.Minus20;
import discounts.NewYearDiscount;
import flower.*;
import login.*;
import lombok.SneakyThrows;
import payment.CardPayment;
import payment.Payment;

import java.util.Scanner;

public class Test {
    public static Scanner sc = new Scanner((System.in));
    @SneakyThrows
    public static void main(String[] args) {
        FlowerSpec spec = new FlowerSpec(Color.WHITE, 20,13);
        Flower my_flower = new Flower(spec, FlowerType.CHAMOMILE);
        System.out.println(my_flower);


//        example create a default buckets
        Bouquet default1 = new Bouquet(BouquetType.CHAMOMILEBIG);
        System.out.println(default1);
        Bouquet default2 = new Bouquet(BouquetType.RED101);

        //get price of default buckets
        System.out.println(default2.getPrice());
        System.out.println(default1.getPrice());

        //example create my own bucket
        Bouquet my_own = new Bouquet(BouquetType.NONE);
        my_own.addFlower(my_flower, 31);
        System.out.println(my_own);
        System.out.println(my_own.getPrice());


        // Lets create new Order and try payment
        Order my_order = new Order();
        my_order.addBucket(my_own);
        my_order.addBucket(default1);
        my_order.addBucket(default2);
        System.out.println(my_order.getPrice());

        //set payment method to pay by card
        Payment payment = new CardPayment();
        my_order.payment = payment;
        my_order.process();
        System.out.println();

        // Here we have two types of Discount NewYear Discount makes the price 50% smaller and 20% discount
        //In this example we decorate order with both of this discounts and then get a new price
        Order order_with_discounts = new NewYearDiscount(new Minus20(my_order));
        System.out.println(order_with_discounts.getPrice());
        System.out.println("Here try to process decorated order");
        order_with_discounts.process();

        System.out.println();

        System.out.println("login through");
        String network = sc.next();
        User user;
        System.out.println("please enter your username");
        if (network.equals("facebook")) {
            String login = sc.next();
            FacebookUser fuser = new FacebookUser();
            fuser.setUsername(login);
            user = new MyFacebookUser(fuser);
        } else if (network.equals("twitter")) {
            String login = sc.next();
            TwitterUser tuser = new TwitterUser();
            tuser.setName(login);

            user = new MyTwitterUser(tuser);
        } else if (network.equals("google")){
            String login = sc.next();
            GoogleUser guser = new GoogleUser();
            guser.setUsername(login);
            user = new MyGoogleUser(guser);
        }





    }
}
