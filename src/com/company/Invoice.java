package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Invoice {
    private String Name;
    private String address;
    private String contact;

    private double Session;
    private double Questions;
    private int price;

    DecimalFormat df = new DecimalFormat(".00");


    public double getSession() {
        return Session;
    }

    public void setSession(double session) {
        Session = session;
    }

    public double getQuestions() {
        return Questions;
    }

    public void setQuestions(double questions) {
        Questions = questions;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Invoice( ){
        this.Name = Name;
        this.address= address;
        this.contact=contact;
}

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    //call input user information
    public void inputUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name: ");
        setName(input.nextLine());
        System.out.println("Enter address: ");
        setAddress(input.nextLine());
        System.out.println("Contact information: ");
        setContact(input.nextLine());

    }

    //call invoice
    public void displayInvoice(int d){
        setPrice(d);
        setSession(100.00);
        setQuestions(0.35);

        double total = getPrice()*getQuestions();
        double totalCost = total + getSession();

        System.out.println("Raven's Invoice");
        System.out.println("To: ");
        System.out.println(getName());
        System.out.println(getAddress());
        System.out.println(getContact());
        System.out.println("Items:");
        System.out.println("Quantity \t Description\tPrice\tTotal");
        System.out.println("1 Session:\t\t " + getSession() );
        System.out.println(getPrice()+" Question:\t\t " + getQuestions()+"\t\t" + df.format(total) );
        System.out.println("Total Due: " + totalCost);
        System.out.println("Thank you for doing business");
    }



}
