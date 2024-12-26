package com.using.switchcase.service;
import com.using.switchcase.model.DeliveryAgent;
import java.util.Scanner;

public class DeliveryAgentService {
    private DeliveryAgent createDeliveryAgent(){

        Scanner sc = new Scanner(System.in);

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

    }

