package com.app.service.appservice1.controller;

public class Article {


    private Long id;
    private String article;

    private Article() {
    }


    public Article(Long id, String article) {
        super();
        this.id = id;
        this.article = article;
    }

    @Override
    public String toString() {
        return "Article [id=" + id + ", article=" + article + "]";
    }

    public Long getArticleId() {
        return id;
    }

    public void setArticleId(Long id) {
        this.id = id;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

}