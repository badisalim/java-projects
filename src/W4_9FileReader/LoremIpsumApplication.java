package W4_9FileReader;

import java.util.*;

public class LoremIpsumApplication {

    public static void main(String[] args) {
        FileReader reader = new FileReader();
        readDocument(reader);
        //readNames(reader);
        //readParticipants(reader);
    }

    private static void readDocument(FileReader reader) {
        System.out.println("---- DOCUMENT");
        List<String> lines = reader.asLines("W4_9FileReader/TextFile");
        for (String line : lines) {
            System.out.println(line);
        }
    }

}
