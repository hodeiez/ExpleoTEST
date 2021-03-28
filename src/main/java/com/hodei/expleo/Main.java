package com.hodei.expleo;

import java.util.Scanner;

public class Main {
    public static void startCalculator(){
        Calculator c=new Calculator();
        Scanner sc=new Scanner(System.in);
        System.out.println("select evaluation level: type-> 1 or 2 or 3");
        switch(sc.nextLine()){
            case "1"-> {
                System.out.println("type expression like-> 2+30");
                System.out.println(c.calculateLevel1(sc.nextLine()));
            }
            case "2"-> {
                System.out.println("type expression like-> 2+30+4");
                System.out.println(c.calculateLevel2(sc.nextLine()));
            }
            case "3"-> {
                System.out.println("type expression like-> 2 / 3 + 4 - 1");

                System.out.println(c.calculateLevel3(sc.nextLine()));
            }
        }
    }
    public static void startAnagram(){
        Scanner sc=new Scanner(System.in);
        System.out.println("type first string to compare");
        String s1= sc.nextLine();
        System.out.println("type second string to compare");
        String s2= sc.nextLine();
        System.out.println("Result: they are anagrams "+ Anagram.areAnagrams(s1,s2));
    }
    public static void startFindLinks(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Type url to search for links: (example-> www.google.com)");
        FindLinks.findLinks(sc.nextLine());
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("Select program to run:\n" +
                    "enter 1 for Anagram\n" +
                    "enter 2 for findLinks\n" +
                    "enter 3 for calculator\n" +
                    "enter 4 to exit");
            switch (sc.next()) {
                case "1" -> startAnagram();
                case "2" -> startFindLinks();
                case "3" -> startCalculator();
                case "4" -> System.exit(0);
            }
        }
    }
}
