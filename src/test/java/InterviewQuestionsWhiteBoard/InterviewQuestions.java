package InterviewQuestionsWhiteBoard;

import org.testng.Assert;
import org.testng.annotations.Test;

//count letters in a word converting it to CharArray
public class InterviewQuestions {
    @Test
    public static void countNumb(){
        String mystring = "Hello Spring";
        char myChar = 'l';
        int numberOfLetters = countLetters(mystring,myChar);
       // Assert.assertEquals(numberOfLetters, 5);

    }

    private static int countLetters(String mystring, char myChar) {
        int result = 0;
        for (char eachChar : mystring.toCharArray()) {
            if (eachChar == myChar) {
                result++;
            }

        }

        return result;

    }}

//fizz buzz



