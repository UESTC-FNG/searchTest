package com.example.demo;

public class Test {
    public static void main(String[] args) {
        String s= "there is a cat";
        String cat = s.replaceAll("cat", "\"\"");
        System.out.println(cat);
    }
}
