package org.example;

public class FizzBuzzCheck {
    public String FizzBuzzChecker(int i) {
        // need a string array or and ArrayList
        String[] listOfFizzBuzz = new String[1];
        listOfFizzBuzz[0] = String.valueOf(i);

        if(i % 3 == 0 && i % 5 ==0) {
            listOfFizzBuzz[0] = "FizzBuzz";
            return listOfFizzBuzz[0];
        }else if(i % 3 == 0) {
            listOfFizzBuzz[0] = "Fizz";
            return listOfFizzBuzz[0];
        } else if(i % 5 ==0) {
            listOfFizzBuzz[0] = "Buzz";
            return listOfFizzBuzz[0];
        } else {
            return listOfFizzBuzz[0];
        }

    }
}
