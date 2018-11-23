package week2;

import week2.InsistantCalculatorMagnet;

import java.util.Scanner;
public class NewTest2 {
    public static void main(String[] args) {
        sumNumber();
        Integer number = InsistantCalculatorMagnet.sumNumbers();

    }


        public static Integer sumNumber(){
            Integer number1 = getNumber();
            Integer number2 = getNumber();

            Integer sum = number1 + number2;
            System.out.println("The sum is: " + sum);
            return sum;


        }

        public static Integer getNumber() {
            System.out.println("Tell me one number: ");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();



        }

    }




