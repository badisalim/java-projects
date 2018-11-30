package Lectures1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kid {

    private String name;
    private Integer numberOfCandies;
    private List<String> namesOfCandies = new ArrayList<>();
    private List<Integer> numbersOfCandies = new ArrayList<>();
    private Boolean stamped = false;

    public Kid(String name, Integer numberOfCandies, List<String> namesOfCandies,List<Integer>numbersOfCandies) {
        this.name = name;
        this.numberOfCandies = numberOfCandies;
        this.namesOfCandies = namesOfCandies;
        this.numbersOfCandies = numbersOfCandies;
    }

    public void stamp() {
        stamped = true;

    }

    public String getName(){
        return name;
    }
    public Integer getNumberOfCandies() {
        return numberOfCandies;
    }
    public List<String> getNamesOfCandies() { return namesOfCandies; }
    public List<Integer> getNumbersOfCandies() { return numbersOfCandies; }
    public Boolean isStamped() { return stamped; }

}

