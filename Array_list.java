import java.util.ArrayList;
public class Array_list {
    public static void main(String[] args) 
    {
        /*
        An ArrayList in Java is a resizable array implementation of the  interface in the Java Collection Framework. 
        It is used to store elements in an ordered sequence and can dynamically grow or shrink in size as elements are added or removed.
        Key Points
        - Dynamic size: Automatically resizes when elements are added or removed.
        - Index-based access: Provides fast random access to elements.
        - Maintains order: Preserves the order of insertion. 
        - Allows duplicates & nulls: You can store repeated values and null.
        - Implements: List, RandomAccess, Cloneable, Serializable.
        */
        
        ArrayList<Integer> arrlist =new ArrayList<Integer>();
        arrlist.add(10);
        arrlist.add(20);
        arrlist.add(30);
        arrlist.add(40);
        arrlist.add(50);

        System.out.println("Index value of 3 : "+arrlist.get(3));
        System.out.println("size of array list : "+arrlist.size());

                        //printing values in list
        System.out.print("Printing list with loop : ");
        for(int i=0;i<arrlist.size();i++)
        {
            System.out.print(arrlist.get(i)+" ");
        }
        System.out.print("\nPrinting list without loop : ");
        for(int x:arrlist)
        {
            System.out.print(x+" ");
        }
        
        
        arrlist.remove(2);// removing 2 index
        
        System.out.println("\nchecking for 15 : "+arrlist.contains(15));
        System.out.println("checking for 20 : "+arrlist.contains(20));
        System.out.println(arrlist);

        arrlist.add(2,30);//adding value to index 2
        arrlist.set(2,35);//updating value of index 2
        System.out.println(arrlist);

    }
}
