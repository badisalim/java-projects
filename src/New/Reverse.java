package TestGit;

import Lectures7.Car;
import week2.ReverseNumInArray.ReverseNumbers;

public class Reverse {

    public void ReversNrToStr(ReversNrAndStr str00,ReversNrAndStr num00){

        System.out.println("revers number" + str00.getString());

        System.out.println("revers string" + num00.getNumber());


        String str0 = String.valueOf("01230");
        StringBuffer str = new StringBuffer(String.valueOf(str0));
        System.out.println("The string of numbers basic is : "+str0);
        str.reverse();
        System.out.println("The string of numbers reversed is : "+str);

        Integer str1=Integer.valueOf(str0);
        System.out.println("The string basic transferd to number and multiplyed by 2: " +str1*2);
        int st= str1*2;
        StringBuffer stt = new StringBuffer(String.valueOf(st));
         stt.reverse();
        System.out.println("The multiplyd number reversed to: "+stt);
        int n = 12340;
        StringBuffer str3 = new StringBuffer(String.valueOf(n));
        str3.reverse();
        System.out.println("The number 12340 reversed to: "+str3);

        StringBuffer str4 = new StringBuffer(String.valueOf(str3));
        str4.reverse();
        System.out.println("The reversed number transferd to string: "+str4);
    }
}
