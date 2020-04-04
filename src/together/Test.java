package together;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
     public static void main(String[] args) {
          MyArrayList my1 = new MyArrayList();
          MyLinkedList my = new MyLinkedList();
          //List<String> my = new ArrayList<>();
          my.add("1");
          my.add("2");
          my.add("3");
          my.add("4");
          my.add("5");
          my.add("6");
          my.add("7");
          my.add("8");
          my.add("9");
          my.add("10");
          my.add("11");
          System.out.println(my);
          my.remove(2);
          for (int i = 0; i<my.length(); i++) {
               System.out.println(my.get(i));
          }
     }

}
