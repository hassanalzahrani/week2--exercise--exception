import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        /////task1

        try {


            System.out.print("enter first number");
            int number1 = scanner.nextInt();
            System.out.print("enter second number");
            int number2 = scanner.nextInt();

            int sum = number1 + number2;
            int substract = number1 - number2;
            int multiply = number1 * number2;
            int divide = number1 / number2;
            int remainder = number1 % number2;

            System.out.println(number1 + "+" + number2 + "=" + sum);
            System.out.println(number1 + "-" + number2 + "=" + substract);
            System.out.println(number1 + "*" + number2 + "+" + multiply);
            System.out.println(number1 + "/" + number2 + "=" + divide);
            System.out.println(number1 + "%" + number2 + "=" + remainder);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("please enter integer numbers");
        }


        /////task2


        try {


            System.out.println("enter number");
            int number3 = scanner.nextInt();


            for (int i = 1; i <= 10; i++) {
                System.out.println(number3 + " x " + i + " = " + number3 * i);
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("wrong input please enter integer numbers only");
        }


        //// task 3


        try {


            System.out.println("Enter Raduis");
            int R = scanner.nextInt();
            double s = 3.141592653;
            double A = R * s;
            System.out.println("Area =" + A);
            double P = 2 * s * R;
            System.out.println("Perimeter" + P);
        } catch (InputMismatchException e) {
            System.out.println("please enter number only");
        }


        // task 4
        try {


            System.out.print("Enter the count of numbers: ");
            int count = scanner.nextInt();

            double AV = 0;
            for (int N = 1; N <= count; N++) {
                System.out.print("Enter an integer: ");
                int number = scanner.nextInt();
                AV += number;
            }

            double average = (double) AV / count;

            System.out.println("The average is: " + average);
        } catch (InputMismatchException e) {
            System.out.println("accepts integer numbers only");
        }

        //Task 5
        try {


            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            System.out.print("Enter third number: ");
            int num33 = scanner.nextInt();
            int result = num1 + num33;
            if (result == num33) {
                System.out.println("true" + result);
            } else {
                System.out.println("false");

            }
        } catch (InputMismatchException e) {
            System.out.println("please enter integer numbers only");
        }


//        /////////////////////////////////////////////task7

        try {


            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            String result1 = (number % 2 == 0) ? "even" : "odd";
            System.out.println(number + " is " + result1);

        } catch (InputMismatchException e) {
            System.out.println("please enter integer numbers only");
        }
////////////////////task 8
//
//

        try {


            System.out.print("Enter temperature in centigrade: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        } catch (InputMismatchException e) {
            System.out.println(" please enter integer numbers only");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

////        ////////////task10
////
////

        try {


            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();

            System.out.print("Enter the height of the rectangle: ");
            double height = scanner.nextDouble();

            double area = width * height;
            double perimeter = 2 * (width + height);

            System.out.println("Area is " + width + " * " + height + " = " + area);
            System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);

        } catch (InputMismatchException e) {
            System.out.println("plese enter Integer numbers only");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
//        /////////task9
//
        try {


            System.out.print("Enter a string: ");
            String str = scanner.nextLine();

            System.out.print("Enter an index: ");
            int index = scanner.nextInt();

            if (index >= 0 && index < str.length()) {
                char character = str.charAt(index);
                System.out.println("Character at index " + index + ": " + character);
            } else {
                System.out.println("Invalid index.");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        ///////task6


        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String reversedWord = reverseString(word);
        System.out.println("Reversed word: " + reversedWord);
    }

    public static void reverswordd(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String reversedWord = reverseString(word);
        System.out.println("Reversed word: " + reversedWord);
    }

    public static String reverseString(String word) throws IllegalArgumentException {
        if (word == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }
}