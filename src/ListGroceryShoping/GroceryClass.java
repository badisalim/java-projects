package ListMapeSetOptional;

public class GroceryClass {

    private String name;

    public GroceryClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name=" + name;


    }

}
