package class15HW;

public class Student {
    //Create  class Student that will have a method getGrade. Your method should accept the score of a
    // student and return a grade:
    //score > 90 - A
    //score >80 - B
    //score >70 - C
    //C - D
    //anything else - F
    String getGrade(int score) {
        if (score > 90) {
            return "A";
        } else if (score > 80) {
            return "B";
        } else if (score > 70) {
            return "C";
        } else if (score > 50) {
            return "D";
        } else {
            return "F";
        }
    }

    //a method that will take a number and prints whether the number is even or odd
    String isEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    //a method to return whether given number is prime or not
    String isPrime(int number) {
        String flag = "";
        for (int a = 2; a < number; a++) {
            if (number % a == 0 || number == 0 || number == 1) {
                flag = number + " is not a prime number";
                break;
            } else {
                flag = number + " is a prime number";
                break;
            }
        }
        return flag;
    }

    // a method that will take 2 parameters as a numbers and prints which number is larger.
    String isLarger(int score1, int score2) {
        String flag = "";
        if (score1 > score2) {
            flag = score1 + " is Larger";
        } else {
            flag = score2 + " is Larger";
        }
        return flag;
    }
    //Create a method that will print whether given String is palindrome or not.
    String isPalindrome(String word) {
        StringBuilder reverse = new StringBuilder(word);
        if (word.equals(reverse.reverse().toString())) {
            return word+" is a palindrome";
        } else {
            return word+" is not a palindrome";
        }
    }
}


