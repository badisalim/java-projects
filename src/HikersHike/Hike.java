package Lectures3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hike {

    private Gatherer gatherer = new Gatherer();

    private List<Hiker> hikers = new ArrayList<>();

    public void signUp() {
        hikers = gatherer.signUp();
    }

    public void showHikers() {
        for (Hiker hiker : hikers) {
            System.out.println("Hiker: " + hiker.getName());
        }
    }

    public static class Gatherer {

        private Scanner scanner = new Scanner(System.in);
        private AutomaticGatherer automaticGatherer = new AutomaticGatherer();

        public List<Hiker> signUp() {
            List<Hiker> hikers = new ArrayList<>();
            hikers.addAll(automaticGatherer.getConfirmedHikers());

            String name = askForName();
            while (!name.isEmpty()) {
                Hiker hiker = new Hiker(name);
                hikers.add(hiker);
                name = askForName();
            }
            return hikers;
        }

        private String askForName() {
            System.out.print("Write your name: ");
            return scanner.nextLine();
        }

    }
}
