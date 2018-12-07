package W5_Evaluation;

import W5_1Circle.Shape;
import W5_3Colore.Colored;
import W5_3Colore.Rectangle;
import W5_6Wardrobe.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TvTableBuilderTest {

    @Test
    void testTable() {
        TvTableBuilder tvTableBuilder = new TvTableBuilder();

        TvTable tvTable = tvTableBuilder.build();
        List<String> expected = Arrays.asList("leg", "leg", "leg", "leg", "shelf", "top");

        Assertions.assertEquals(expected, tvTable.getParts());

    }


}