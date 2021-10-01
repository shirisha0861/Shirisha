package package1;
import java.util.Collection;
import java.util.*;

public class Program3 {
    public static void main(String[] args){
        List <Integer> obj3=new ArrayList<>();
        obj3.add(11);
        obj3.add(21);
        obj3.add(31);
        obj3.add(41);
        obj3.add(51);

        if(obj3.contains(41))
            System.out.println("41 is present in the array list");
        else
            System.out.println("41 does not exist in the array list");

        //System.out.println(obj3.contains(11));
    }
}
