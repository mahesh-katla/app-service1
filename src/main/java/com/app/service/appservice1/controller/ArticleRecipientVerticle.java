package com.app.service.appservice1.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArticleRecipientVerticle  { //extends AbstractVerticle {

    public static final String GET_ALL_ARTICLES = "get.articles.all";

    //private final ObjectMapper mapper = Json.mapper;

    @Autowired
    private ArticleService articleService;

   
}