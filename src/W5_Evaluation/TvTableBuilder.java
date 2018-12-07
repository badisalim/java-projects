package W5_Evaluation;

import W5_6Wardrobe.AddShelf;
import W5_6Wardrobe.AddTop;
import W5_6Wardrobe.Step;

import java.util.Arrays;
import java.util.List;

public class TvTableBuilder {

    Step legs=new AddLegs();
    Step shelf=new AddShelf();
    Step top=new AddTop();
    List<Step>steps= Arrays.asList(legs,legs,legs,legs,shelf,top);

    public TvTable build(){
        TvTable tvTable=new TvTable();
        for(Step step:steps){

            step.perform(tvTable);
        }
      return tvTable;
    }


}
