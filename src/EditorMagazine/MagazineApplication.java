package Lectures8;

import Lectures4.Printer;

public class MagazineApplication {
    public static void main(String[] args) {
        Printer printer = new Printer();
        //printer.print(article);

        Editor editor = new Editor();
        Magazine magazine = editor.writeMagazine();

        printer.printMagazine(magazine);
//        Magazine magazine = new Magazine();
//        List<Article> articles = new Magazine().getMagazineArticles();

    }


}
