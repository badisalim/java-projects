package W6_CarEvaluation;

public class ManualCar extends Car {
    @Override
    protected String getBrand(String brand) {
        return "Audi";
    }

    @Override
    protected String drive() {
        return "Manual";
    }
}
