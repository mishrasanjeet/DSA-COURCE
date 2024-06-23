package DesignPattern;
import java.util.*;
public class Samosa {
    //how to use the sunglton pattern
    //if you make the constructor as a private then you can make the class as singleton
    // singlton means you don't want to give the permission to any one create the ovbject of that class.
private static Samosa samosa;
    private Samosa(){}

    //if any one want to get the object for this class the use this method that method only one time create the object of that class.
    // this is call lazy initialization because whenever  this method will not called by the any class for the time beaing object is not created;
    //if you see the eagger initialization then please chek the burger class.
    public static Samosa getSamosa(){
        if(samosa==null){//in this case the thread safty environment create the multiple object
            //because if there are multiple thered then eatch thread create the object at single time that means there are multiple objects are created.
            //if you want to privent the thrad and create the object one by one then use the synchronized block.
            synchronized (Samosa.class) {//THIS IS CALLED SYNCHRONIZED BLOC IF ANY THRED COMES INTO HERE THEN UNTIL TO COMPLETE THE PROCESS OF THAT THREAD OTHER THREAD
                //ARE NOT ACCESS THOSE CODES. BECAUSE SYNCHRONIZE BLOCK RUN ONE BYB ONE.
                if (samosa==null) {
                    samosa = new Samosa();
                    return samosa;
                }
            }

        }
        return samosa;
    }
}
