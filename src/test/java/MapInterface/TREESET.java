package MapInterface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TREESET {
    public static void main(String[]args){
    Set<Integer> setValue = new TreeSet<Integer>();
      setValue.add(4432);
      setValue.add(890);
      setValue.add(234);
      setValue.add(234);

      //System.out.println(setValue.contains(4432));
//      for(int i=0; i<setValu; i++){
//          System.out.println("Hello " + i);
        //System.out.println(setValue);
//        Iterator <String> it = new iterator()
//            public boolean hasNext() {
//                return false;
//            }
//
//            public String next() {
//                return null;

        for (int i : setValue){
            System.out.println(i);
            }
        }
      }

//      System.out.println(setValue);
//      for(int i : setValue){
//          System.out.println("Ny index " +  ":"  + " " + i);
//      }


