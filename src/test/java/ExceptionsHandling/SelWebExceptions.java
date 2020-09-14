package ExceptionsHandling;

import java.util.Scanner;

public class SelWebExceptions {
    public static void main (String[]args) {

//
//        try {
//            int[] a= {3,5,7};
//            System.out.println(a[0]);
//        }
//   catch (Exception e){
//       System.out.println("Exept happened");


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Whts ur fav color?");
//        int n = scan.nextInt();
//        System.out.println(n);

        try {
            int[] a = null;
            int[] ab = {4};

            System.out.println(ab[1]);
        } catch (NullPointerException ex) {
            System.out.println("U entered incorrect index value");
        }
        catch (ArrayIndexOutOfBoundsException eBounds){
            System.out.println("Out of bounds.");
        }

    }}
