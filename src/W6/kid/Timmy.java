package lecture.week6.kid;

public class Timmy extends Kid {

    public Timmy(String favouriteFood) {
        super(favouriteFood);
    }

    @Override
    protected String getSentence() {
        return "Are we there yet?";
    }


}
