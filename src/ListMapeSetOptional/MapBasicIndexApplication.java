package ListMapeSetOptional;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BasicIndexApplication {

    public static void main(String[] args) {

        Map<Integer, String> Book = new HashMap<>();


        System.out.println(Book);



        Integer page3=3;
        Integer page2=2;
        Integer page1=1;


        String topic3="Science";
        String topic2="Math";
        String topic1="Phesics";

        Book.put(3,topic1);
        Book.put(2,topic2);
        Book.put(1,topic3);
        System.out.println(Book);

//        Collection<String> bookPages = Book.values();
//
//        System.out.println(bookPages);
//
//        Set<Integer> bookTopic = Book.keySet();
//
//        System.out.println(bookTopic);
        System.out.println(Book.values());
        System.out.println(Book.keySet());

         String newTopic="new topic";
Book.put(2,newTopic);
        System.out.println(Book);

        boolean containsPage2 = Book.containsKey(2);

        System.out.println("Is Page 2 there? : " + containsPage2);

        System.out.println(Book.get(2));

        System.out.println(Book.size());


    }



}
