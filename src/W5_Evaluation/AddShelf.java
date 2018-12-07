package W5_Evaluation;

import W5_6Wardrobe.Furniture;
import W5_6Wardrobe.Step;

public class AddShelf implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("shelf");
    }
}
