package com.company;


import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        String yes = "";
        String ftname;
        String no = "";

        //Prepare to accept user input
        Scanner keyboard = new Scanner(System.in);

        //Add people object to array list named thePersonList
        ArrayList<Person> thePersonList = new ArrayList<Person>();


        //Run for loop 5 times for each new person object
        for (int i = 0; i < 3; i++) {//Start For Loop

            //Creating newPerson object variable
            Person newPerson = new Person();
            //Prompts user to enter first name stores name in set firstName
            System.out.println("Enter persons first name");
            newPerson.setFirstName(keyboard.nextLine());
            //Adding person to array list
            thePersonList.add(newPerson);
            //Storing String as sting variable
            String p = newPerson.getFirstName();


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
//
//                Prompt user to search records
            System.out.println("Do you Want to Search Records by First Name Yes or No");
            yes = keyboard.nextLine();
            no = keyboard.nextLine();



//If user enters no run do loop once to print current address book

                do {
                    for (Person eachperson : thePersonList) {//Start For Each Loop

                        //Print list from enhanced for loop (getting variables from eachperson) within the the ArrayList thePersonList.
                        System.out.println("---------------");
                        System.out.println("First name: " + eachperson.getFirstName());
                        System.out.println("Last name: " + eachperson.getLastName());
                        System.out.println("Address: " + eachperson.getAddress());
                        System.out.println("Phone number:" + eachperson.getPhoneNumber());
                        System.out.println("Email: " + eachperson.getEmail());
                        System.out.println("--------------");

                        no=keyboard.nextLine();
                    }
                }while (no.equalsIgnoreCase("no"));
            System.out.println("Do you Want to Search More Records by First Name Yes or No");
            yes = keyboard.nextLine();
            no = keyboard.nextLine();


//If user enters yes have them type first name to search address book
            if (yes.equalsIgnoreCase("yes")) {
                System.out.println("Please type first name to search the address book");
                ftname = keyboard.nextLine();

//If first name String dosnt match p(getFirstName String) run For Loop

                if (ftname.contentEquals(p)) {//Start If String compare if

                    for (Person eachperson : thePersonList) {//Start For Each Loop


                        System.out.println("----------------------------------");

                        //Print list from enhanced for loop (getting variables from eachperson) within the the ArrayList thePersonList.
                        System.out.println("---------------");
                        System.out.println("First name: " + eachperson.getFirstName());
                        System.out.println("Last name: " + eachperson.getLastName());
                        System.out.println("Address: " + eachperson.getAddress());
                        System.out.println("Phone number:" + eachperson.getPhoneNumber());
                        System.out.println("Email: " + eachperson.getEmail());
                        System.out.println("--------------");
                    }//End For Loop

                    }//End If String compare if
                }//End Ignore

            }

        }
    }







