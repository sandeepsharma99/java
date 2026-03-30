import java.util.ArrayList;
import java.util.Collections;

class ArrayLists{


    public static void main (String arg[]){
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add element
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get element
        System.out.println(list.get(0));
        list.get(1);
        list.get(2); 

        //add element in list
        list.add(0,5);
        System.out.println(list);

        //set element
        list.set(0,6);
        System.out.println(list);

        //remove element
        list.remove(3);
        System.out.println(list);

        //arraylist size
        int size = list.size();
        System.out.println(size);

        //loop
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);

    }
}