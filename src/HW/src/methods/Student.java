package HW.src.methods;

class Student {
    //Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade.
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
            return number + " is Even";
        } else {
            return number + " is Odd";
        }
    }

    //a method to return whether given number is prime or not
    String isPrime(int number) {
        String flag= "";
        for (int a = 2; a < number; a++) {
            if (number % a == 0 || number == 0 || number == 1) {
                flag = number + " is not a prime number";
            } else {
                flag = number + " is a prime number";
            }
        }
        return flag;
    }

    // a method that will take 2 parameters as a numbers and prints which number is larger.
    String isLarger(int score1, int score2) {
        if (score1 > score2) {
            return score1 + " is Larger";
        } else {
            return score2 + " is Larger";
        }
    }

    //Create a method that will print whether given String is palindrome or not.
    String isPalindrome(String word) {
        StringBuilder toReverse = new StringBuilder(word);
        if (word.equals(toReverse.reverse().toString())) {
            return word + " is a palindrome";
        } else {
            return word + " is not a palindrome";
        }
    }
}

