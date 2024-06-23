package DesignPattern;

import java.util.*;
public class Khana {

    public static void main(String[] args){
        //here you don't have access to create the samosa object due to samosa costructor decleare as a private.
        // Samosa s=new Samosa();
        //if you call the multiple time but only single object created.
        Samosa samosa=Samosa.getSamosa();
        System.out.println(samosa.hashCode());
        Samosa samosa2=Samosa.getSamosa();
        System.out.println(samosa2.hashCode());
        System.out.println("burger object");
        Burger burger=Burger.getBurger();
        System.out.println(burger.hashCode());
        Burger burger1=Burger.getBurger();
        System.out.println(burger1.hashCode());

    }

}
