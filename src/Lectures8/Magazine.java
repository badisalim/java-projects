package Lectures8;

import Lectures4.Article;

import java.util.ArrayList;
import java.util.List;

public class Magazine {

    private String name;
    private List<Article> articles = new ArrayList<>();

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(Article article) {
        articles.add(article);
    }

    public List<Article> getArticles() {

        return articles;
    }
}


