package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String yes="";
        String say;

        //Prepare to accept user input
        Scanner keyboard = new Scanner(System.in);

       //Add people object to array list named thePersonList
        ArrayList<Person> thePersonList = new ArrayList<Person>();


        //Run for loop 5 times for each new person object
            for (int i = 0; i < 5; i++) {//Start For Loop

                //Creating newPerson object variable
                Person newPerson = new Person();
                //Prompts user to enter first name stores name in set firstName
                System.out.println("Enter persons first name");
                newPerson.setFirstName(keyboard.nextLine());
                //Adding person to array list
                thePersonList.add(newPerson);


         //Prompts user to enter last name stores name in setlastName
        System.out.println("Enter persons last name");
        newPerson.setLastName(keyboard.nextLine());


        //Prompts user to enter address stores address in setAddress
        System.out.println("Enter your Address");
        newPerson.setAddress(keyboard.nextLine());

        //Prompts user to enter address stores address in setphoneNumber
        System.out.println("Enter your phone number");
        newPerson.setPhoneNumber(keyboard.nextLine());

        //Prompts user to enter address stores address in setEmail
        System.out.println("Enter your email");
        newPerson.setEmail(keyboard.nextLine());


            }//End For Loop

        System.out.println("Do you want to continue? Yes or No ");
        yes=keyboard.nextLine();
        do {

            for (Person eachperson : thePersonList) {//Start For Each Loop


                System.out.println("----------------------------------");
                
        //Print list from enhanced for loop (getting variables from eachperson) within the the ArrayList thePersonList.
        System.out.println("First name: " + eachperson.getFirstName());

                System.out.println("Last name: " + eachperson.getLastName());
                System.out.println("Address: " + eachperson.getAddress());
                System.out.println("Phone number:" + eachperson.getPhoneNumber());
                System.out.println("Email: " + eachperson.getEmail());
                System.out.println("----------------------------------");

            }//End For Each Loop
        }while (yes.equalsIgnoreCase("yes"));

        }

        }






