package W2_5EditorMagazine;

import W2_1ArticlePrinter.Printer;

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
