package W6_HotAirBalloon;

public class HotAirBalloonApplication {

    public static void main(String[] args) {

        SmallHotAirBalloon smallBallon = new SmallHotAirBalloon();
        BigHotAirBalloon bigBallon = new BigHotAirBalloon();
        smallBallon.liftUp();
        smallBallon.land();
        bigBallon.liftUp();
        bigBallon.land();

        HotAirBalloon small = new SmallHotAirBalloon();
        HotAirBalloon big = new BigHotAirBalloon();


        small.liftUp();
        big.land();
    }
}
