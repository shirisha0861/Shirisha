package package1;
import java.util.Collection;
import java.util.*;

public class Program5 {
    public static void main(String[] args){
        ArrayList<Integer>  AL= new ArrayList<>();
        AL.add(10);
        AL.add(20);
        AL.add(30);
        AL.add(40);
        AL.add(50);
        System.out.println("The elements in arraylist:"+AL);
        System.out.println("The size of the arraylist is:"+AL.size());
        AL.remove(1);
        System.out.println("The size of the arraylist after deleteing an element is:"+AL.size());
        System.out.println("The elements in arraylist:"+AL);


    }
}
