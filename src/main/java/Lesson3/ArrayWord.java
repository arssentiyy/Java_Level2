package Lesson3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayWord {
    public static void main(String[] args) {
        genArray();
    }

    private static void genArray() {
        List<String> list1 = new ArrayList(20);
        List<String> list2 = new ArrayList<>(10);
        List<String> list3= new ArrayList<>(10);

        list1.add("A");
        list1.add("V");
        list1.add("V");
        list1.add("V");
        list1.add("W");
        list1.add("W");
        list1.add("W");
        list1.add("A");
        list1.add("X");
        list1.add("A");
        list1.add("A");
        list1.add("W");
        list1.add("A");
        list1.add("X");
        list1.add("W");
        list1.add("A");
        list1.add("V");
        list1.add("V");
        list1.add("A");
        list1.add("V");


        for (int i = 0; i < list1.size(); i++) {
            if(list2.contains(list1.get(i))) {
            } else {
                list2.add(list1.get(i));
            }
        }
        System.out.println(list2);

        for (int i = 0; i < list2.size(); i++) {
            int c = 0;
            for (int i1 = 0; i1 < list1.size(); i1++) {
            if (list2.get(i).equals(list1.get(i1))){
                c++;
                }
            }
            list3.add(list2.get(i) + "-->" + c);

        }

        System.out.println(list3);
    }

}