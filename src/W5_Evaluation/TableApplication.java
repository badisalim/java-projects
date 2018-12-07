package W5_Evaluation;

import W5_6Wardrobe.Wardrobe;
import W5_6Wardrobe.WardrobeBuilder;

public class TableApplication {

    public static void main(String[] args) {

        TvTableBuilder tvTableBuilder = new TvTableBuilder();

        TvTable buildTvTable = tvTableBuilder.build();


        System.out.println(buildTvTable);

    }
}
