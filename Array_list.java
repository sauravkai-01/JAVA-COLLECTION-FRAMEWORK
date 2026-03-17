import java.util.ArrayList;
public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist =new ArrayList<Integer>();
        arrlist.add(10);
        arrlist.add(20);
        arrlist.add(30);
        arrlist.add(40);
        arrlist.add(50);

        System.out.println("Index value of 3 : "+arrlist.get(3));
        System.out.println("size of array list : "+arrlist.size());
        System.out.print("value of list : ");
        for(int i=0;i<arrlist.size();i++)
        {
            System.out.print(arrlist.get(i)+" ");
        }
        System.out.println();
        arrlist.remove(2);// removing 3 index
        for(int x:arrlist)
        {
            System.out.print(x+" ");
        }

        System.out.println("\nchecking for 15 : "+arrlist.contains(15));
        System.out.println("checking for 20 : "+arrlist.contains(20));
    }
}
