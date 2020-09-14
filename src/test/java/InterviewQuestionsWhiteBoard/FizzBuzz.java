package InterviewQuestionsWhiteBoard;

public class FizzBuzz {
    //A typical round of Fizz Buzz can be:
    //Write a program that prints the numbers from 1 to 100 and for multiples of '3' print "Fizz" instead of the number
    // and for the multiples of '5' print "Buzz".


                            public static void main(String[] args) {
                                int numb = 100;
                                for (int i = 1; i <= numb; i++) {
                                    if (i % 3 == 0) {
                                        System.out.println("Fizz");
                                    } else {
                                        if (i % 5 == 0) {
                                            System.out.println("Buzz");
                                        }
                                        else{
                                            System.out.println(i + "");
                                        }
                                    }
                                }
                            }
                        }


