package package1;
import java.util.Collection;
import java.util.*;

public class Program4 {
    public static void main(String[] args){
        Set <Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);

        boolean i=hs.contains(4);
        System.out.println("4 is exists in hashset: "+i);


    }
}
