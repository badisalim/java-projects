package A;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        System.out.println(" input name");
        Scanner scanner=new Scanner((System.in));
        String answer=scanner.nextLine();
        System.out.println(" input number");
        Integer answerNo=scanner.nextInt();
        System.out.println(answer);
        System.out.println(answerNo);
    }
}
