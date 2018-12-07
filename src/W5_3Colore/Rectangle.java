package W5_3Colore;

import W5_1Circle.Shape;

public class Rectangle implements Colored, Shape {

    public String getColore() {
        return "violet";
    }

    @Override
    public String toString() {
        return getColore()+" "+getName();
    }

    @Override
    public String getName() {
        return "rectangle";


    }
}
