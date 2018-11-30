package Lectures7;

public class CarShopApplication {


    public static void main(String[] args) {

        Car bmw = new Car("BMW");
        Seller seller=new Seller();
        seller.recievCar(bmw);
    }
}
