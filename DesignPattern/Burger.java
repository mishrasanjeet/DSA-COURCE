package DesignPattern;
import java.util.*;
public class Burger {
    // this is call eager initialization;
    static Burger burger=new Burger();
    private Burger(){}

    public static Burger getBurger(){
        if(burger==null){
            burger=new Burger();
            return burger;
        }
        return burger;
    }


}
