package com.company;

import java.util.Scanner;

public class Invoice {
    private String Name;
    private String address;
    private String contact;

    private double Session;
    private double Questions;
    private double price;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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

    public void inputUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name: ");
        setName(input.nextLine());
        System.out.println("Enter address: ");
        setAddress(input.nextLine());
        System.out.println("Contact information: ");
        setContact(input.nextLine());

    }
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
        System.out.println("Quantity  Description  Price  Total");
        System.out.println("1 Session: " + getSession() );
        System.out.println(getPrice()+" Question " + getQuestions()+"\t" + total );
        System.out.println("Total Due: " + totalCost);
        System.out.println("Thank you for doing business");
    }



}
