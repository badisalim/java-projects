package W6_CarEvaluation;

public class AutomaticCar extends Car {
    @Override
    protected String getBrand(String brand) {
        return "Mercedes";
    }

    @Override
    protected String drive() {
        return "Automatic";
    }
}
