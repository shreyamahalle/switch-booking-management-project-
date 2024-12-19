package com.using.switchcase;
import com.using.switchcase.model.Customer;
import com.using.switchcase.model.DeliveryAgent;
import com.using.switchcase.model.Order;
import com.using.switchcase.model.Restaurant;

import java.util.Scanner;
public class BookingOrderManagement {

        private static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            BookingOrderManagement bd = new BookingOrderManagement();
            int option = 0;
            do {
                System.out.println("-----------Booking Management-----------");
                System.out.println("Please choose the option");
                System.out.println("1. Create customer");
                System.out.println("2. Create delivery agent");
                System.out.println("3. Create restaurant ");
                System.out.println("4. Create order");
                System.out.println("0. Exit project");
                System.out.println("Select the option..");
                option = Integer.parseInt(sc.nextLine());

                switch (option ) {
                    case 1 :
                    Customer customer = bd.createCustomer();
                    System.out.println("Customer created : " + customer);
                    break;
                }
                switch (option ) {
                    case 2:
                    DeliveryAgent deliveryAgent = bd.createDeliveryAgent();
                    System.out.println("DeliveryAgent created : " + deliveryAgent);
                    break;
                }
                switch (option ) {
                    case 3:
                    Order order = bd.createOrder();
                    System.out.println("Order created : " + order);
                }
                switch (option ) {
                    case 4:
                    Restaurant restaurant = bd.createRestaurant();
                    System.out.println("Restaurant created : " + restaurant);
                }

            } while (option != 0);

            System.out.println("THANK YOU!");
        }

        private Customer createCustomer() {
            System.out.println("Please enter id:");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Please enter name:");
            String name = sc.nextLine();
            System.out.println("Please enter city:");
            String city = sc.nextLine();
            System.out.println("Please enter mobile number:");
            int mobileNo = Integer.parseInt(sc.nextLine());
            System.out.println("Please enter age:");
            int age = Integer.parseInt(sc.nextLine());
            Customer c = new Customer();
            c.setId(id);
            c.setAge(age);
            c.setCity(city);
            c.setName(name);
            c.setMobileNo(mobileNo);
            return c;
        }

        private DeliveryAgent createDeliveryAgent() {
            System.out.println("Please enter id");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Please enter name");
            String name = sc.nextLine();
            System.out.println("Please enter city");
            String city = sc.nextLine();
            System.out.println("Please enter mobileNo");
            int mobileNo = Integer.parseInt(sc.nextLine());
            DeliveryAgent da = new DeliveryAgent();
            da.setId(id);
            da.setName(name);
            da.setCity(city);
            da.setMobileNo(mobileNo);
            return da;
        }

        private Order createOrder() {
            System.out.println("Please enter id");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Please enter type");
            String type = sc.nextLine();
            System.out.println("Please enter note");
            String note = sc.nextLine();
            System.out.println("Please enter paymentMethod");
            String paymentMethod = sc.nextLine();
            Order o = new Order();
            o.setId(id);
            o.setPaymentMethod(paymentMethod);
            o.setNote(note);
            o.setType(type);
            return o;
        }

        private Restaurant createRestaurant() {
            System.out.println("Please enter registerNo");
            int registerNo = Integer.parseInt(sc.nextLine());
            System.out.println("Please enter name");
            String name = sc.nextLine();
            System.out.println("Please enter city");
            String city = sc.nextLine();
            System.out.println("Please enter area");
            String area = sc.nextLine();
            Restaurant r = new Restaurant();
            r.setRegisterNo(registerNo);
            r.setName(name);
            r.setCity(city);
            r.setArea(area);
            return r;
        }
    }