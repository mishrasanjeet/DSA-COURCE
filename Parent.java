import java.util.*;
public class Parent {

    public void m1(){
        System.out.println("this is the parent class.");
    }
    public static void main(String[] args){
        Child child=new Child();
        child.m1();
    }
}

class Child extends Parent{
    public void m1(){
        System.out.print("this is child class");
    }

    public static void main(String[] args){
        Parent c=new Parent();
        c.m1();
    }

}
