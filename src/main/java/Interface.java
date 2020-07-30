

import java.util.ArrayList;
import java.util.Iterator;

class IteratorInterface {


    public static void main(String[] args) {
//        ArrayList<Integer> cars = new ArrayList<Integer>();
//        cars.add(10);
//        cars.add(20);
//        Iterator<Integer> i = cars.iterator();
//        while (i.hasNext()) {
//            System.out.println(i.next());
//        }
//    }


        ArrayList<String> cats = new ArrayList<String>();
         cats.add("A");
        cats.add("AM");
        cats.add("AAAM");
        cats.add("ANAKA");
         Iterator iterName = cats.iterator();
         //for (int i = 0; i<9; i++){
             //cats.add(new Cat())
        while (iterName.hasNext()){
            System.out.println(iterName.next());


         }

         }



}