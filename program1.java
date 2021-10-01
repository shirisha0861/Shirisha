package package1;
import java.util.Collection;
import java.util.*;


public class program1 {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> obj=new ArrayList<>();
        {
            obj.add(10);
            obj.add(05);
            obj.add(20);
            obj.add(30);
            System.out.println("The array list are: "+obj);

            for(int i=0;i<obj.size();i++)
            {
                System.out.println(obj.get(i));
                //System.out.println(obj);
            }

        }
    }
}
