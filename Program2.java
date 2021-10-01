package package1;
import java.util.Collection;
import java.util.*;

public class Program2 {
    public static void main(String[] args){
        ArrayList<String>  obj2= new ArrayList<>();
        obj2.add("Hubli");
        obj2.add("Ballari");
        obj2.add("bangalore");
        obj2.add("udpi");

        System.out.println("The contents of list the are:  "+"\n"+obj2);
        String[] myarray=new String[obj2.size()];
        obj2.toArray(myarray);

        for(int i=0;i<myarray.length;i++) {
            System.out.println("the elements are:"+myarray[i]);
        }
    }
}
