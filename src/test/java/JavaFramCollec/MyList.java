package JavaFramCollec;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@Test
public class MyList{ //implements Collection {

public static void main(String []args) {
   List <Integer> mylist = new ArrayList<Integer>();
    mylist.add(7);
Iterator <Integer> it = mylist.iterator();
while(it.hasNext()){

    System.out.println(mylist);
    break;

}}}

//    public int size() {
//        return 0;
//    }
//
//    public boolean isEmpty() {
//        return false;
//    }
//
//    public boolean contains(Object o) {
//        return false;
//    }
//
//    public Iterator iterator() {
//        return null;
//    }
//
//    public Object[] toArray() {
//        return new Object[0];
//    }
//
//    public boolean add(Object o) {
//        return false;
//    }
//
//    public boolean remove(Object o) {
//        return false;
//    }
//
//    public boolean addAll(Collection c) {
//        return false;
//    }
//
//    public void clear() {
//
//    }
//
//    public boolean equals(Object o) {
//        return false;
//    }
//
//    public int hashCode() {
//        return 0;
//    }
//
//    public boolean retainAll(Collection c) {
//        return false;
//    }
//
//    public boolean removeAll(Collection c) {
//        return false;
//    }
//
//    public boolean containsAll(Collection c) {
//        return false;
//    }
//
//    public Object[] toArray(Object[] a) {
//        return new Object[0];
//    }
//}