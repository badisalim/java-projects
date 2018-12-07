package W5_Evaluation;

import W5_6Wardrobe.Furniture;

import java.util.ArrayList;
import java.util.List;

public class TvTable implements Furniture {


    private List<String> parts = new ArrayList<>();

    @Override
    public String toString() {
        return "TvTable{" +
                "parts=" + parts +
                '}';
    }

    @Override
    public void add(String part) {
        parts.add(part);
    }

    public List<String> getParts() {
        return parts;
    }
}
