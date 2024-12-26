package com.using.switchcase.service;
import com.using.switchcase.model.Customer;
import java.util.Scanner;
public class CustomerService {
    private Customer createCustomer () {
        Scanner sc = new Scanner(System.in);

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
    }
