package com.using.switchcase.service;

import com.using.switchcase.model.Restaurant;

import java.util.Scanner;

public class RestaurantService {
    private Restaurant createRestaurant(){

        Scanner sc = new Scanner(System.in);

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
