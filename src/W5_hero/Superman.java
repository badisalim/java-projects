package W5_hero;

public class Superman implements Hero{

    @Override
    public String getName() {
        return "Superman";
    }

    @Override
    public void saveTheCity() {
        System.out.println("Using his superpowers");
    }
}
