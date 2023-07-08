package com.company;

public class cwh_14_stringmethods {
    public static void main(String[] args) {
        String name = "Bhagya";
//        System.out.println(name.length());
//        char result = name.charAt(4);
//        System.out.println(result);
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());
//        System.out.println(name.trim());
        System.out.println(name.substring(3));
        System.out.println(name.substring(0,6));
        System.out.println(name.replace('a','s'));
        System.out.println(name.replace("gya","ayg"));
        System.out.println(name.endsWith("ya"));
        System.out.println(name.indexOf("a"));
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.equals("Bhagya"));
        System.out.println(name.equalsIgnoreCase("bhagya"));

    }
}
