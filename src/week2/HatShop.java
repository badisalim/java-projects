package week2;

import week2.ReverseNumbers;

import java.util.ArrayList;
import java.util.List;

public class HatShop {

    public static void main(String[] args) {
        List<Integer> hatPrices = new ArrayList<>();
        hatPrices.add(10);
        hatPrices.add(20);
        hatPrices.add(30);
        System.out.println(hatPrices);
        List<Integer> reversedHatPrices = ReverseNumbers.reverse(hatPrices);
        System.out.println(reversedHatPrices);

    }

}
