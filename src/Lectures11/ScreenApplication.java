package Lectures11;

import Lectures7.Car;
import Lectures7.Seller;

public class ScreenApplication {

    public static void main(String[] args) {

        Screen screen = new Screen();
        Customer customer1=new Customer("Badi", "Economic");
        Customer customer2=new Customer("Riyad", "Business");
        Customer customer3=new Customer("leen ","");

        screen.display(customer1);
        screen.display(customer2);
        screen.display(customer3);



    }

}
