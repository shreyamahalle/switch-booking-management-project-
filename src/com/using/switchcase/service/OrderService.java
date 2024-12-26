package com.using.switchcase.service;
import com.using.switchcase.model.Order;

import java.util.Scanner;

public class OrderService {

    private Order createOrder(){
        Scanner sc = new Scanner(System.in);

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
    }
