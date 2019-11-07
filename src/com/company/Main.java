package com.company;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
       List<Countries> countries = new ArrayList<Countries>();
       countries.add(new France("France","Paris",66.99D,"francais"));
       countries.add(new Russia("Rusia","Moscow",144.5D,"Vladimir Putin"));
     for(Countries c:countries){
         System.out.println(c.toString());
         c.traditionalFood();
     }
    }
}
