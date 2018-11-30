package ListTripBackPack;

public class ItemClass {

    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ItemClass{" +
                "name='" + name + '\'' +
                '}';
    }

    public ItemClass(String name) {
        this.name = name;


    }
}
