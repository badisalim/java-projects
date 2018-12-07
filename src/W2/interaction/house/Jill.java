package W2.interaction.house;

import lecture.week2.interaction.house.upstairs.Grandma;
import lecture.week2.interaction.house.upstairs.Tim;

public class Jill {

    private void speak() {
        System.out.println("Jill speaks.");
    }

    private void speakWithTim(Tim tim) {
        tim.speak();
    }

    private void speakWithGrandma(Grandma grandma){
        // cannot speak with grandma
    }

}
