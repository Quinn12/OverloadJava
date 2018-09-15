package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  b for business or c for customer.");
        String input = sc.nextLine();
        String BusName;
        String Name;
        String PhoneNum;

        while (true)
        {
            //String rex = "^(1\\\\-)?[0-9]{3}\\\\-?[0-9]{3}\\\\-?[0-9]{4}$";

            if (input.equals("b"))
            {
                System.out.println("Thank you for doing business with use.");
                System.out.println("Please enter your business name: ");
                BusName = sc.next();
                Boolean BusIntCheck = isInteger(BusName);
                while (input.equals("b")) {
                    if (BusIntCheck == true)
                    {
                        System.out.println("Incorrect format, Please enter your business name: ");
                        BusName = sc.next();
                        BusIntCheck = isInteger(BusName);
                    }

                    if (BusIntCheck == false) {
                        System.out.println("Please enter you contact name: ");
                        Name = sc.next();
                        Boolean NameIntCheck = isInteger(Name);
                        if (NameIntCheck == true) {
                            System.out.println("Incorrect format, Please enter your contact name: ");
                            Name = sc.next();
                            NameIntCheck = isInteger(Name);
                        }
                        if (NameIntCheck == false) {
                            if (NameIntCheck == false) {
                                System.out.println("Please enter you phone number: ");
                                PhoneNum = sc.next();
                                Pattern p = Pattern.compile("\\d(3)-\\d(7)");
                                Matcher m = p.matcher(PhoneNum);
                                Boolean PhoneIntCheck = isInteger(PhoneNum);
                                System.out.println(PhoneNum);
                                if (m.matches() || PhoneIntCheck) {
                                    System.out.println("Excellent thank you for doing business with use!");
                                    System.out.println("Business Name: " + BusName);
                                    System.out.println("contact Name: " + Name);
                                    System.out.println("Phone Name: " + PhoneNum);
                                    input ="";
                                } else {
                                    System.out.println("Incorrect format, Please enter your phone number: ");
                                    PhoneNum = sc.next();
                                    PhoneIntCheck = isInteger(PhoneNum);
                                }
                            }
                        }
                    }
                }
            }

        if (input.equals("c"))
        {
            System.out.println("Thank you for doing business with use.");
            System.out.println("Please enter you name: ");
            Name = sc.next();
            Boolean NameIntCheck = isInteger(Name);
            while (input.equals("c")) {
                if (NameIntCheck == true) {
                    System.out.println("Incorrect format, Please enter your contact name: ");
                    Name = sc.next();
                    NameIntCheck = isInteger(Name);
                }

                if (NameIntCheck == false) {
                    System.out.println("Please enter you phone number: ");
                    PhoneNum = sc.next();
                    Boolean PhoneIntCheck = isInteger(PhoneNum);
                    Pattern p = Pattern.compile("\\d(3)-\\d(7)");
                    Matcher m = p.matcher(PhoneNum);
                    if (m.matches() || PhoneIntCheck)
                    {
                        System.out.println("contact Name: " + Name);
                        System.out.println("Phone Name: " + PhoneNum);
                        input ="";
                    } else {
                        System.out.println("Incorrect format, Please enter your phone number: ");
                        PhoneNum = sc.next();
                        PhoneIntCheck = isInteger(PhoneNum);
                    }
                }
            }
        }

        else {
            System.out.println("Enter  b for business or c for customer.");
            input = sc.next();
        }
        }
    }

    public static boolean isInteger(String s)
    {
        boolean isValidInteger;
        try
        {
            Integer.parseInt(s);
            isValidInteger = true;
        }
        catch (NumberFormatException ex)
        {
            isValidInteger = false;
        }

       return isValidInteger;
    }

   // public static boolean NumAmount(String in)
   // {
    //    Pattern p = Pattern.compile("\\d(3)-\\d(7)");
   //     Matcher m = p.matcher(in);
        //return in.charAt(0) == '0' && in.charAt(0) == '7' && in.length() == 11 && in.matches("[0-9]+");
   // }
}
