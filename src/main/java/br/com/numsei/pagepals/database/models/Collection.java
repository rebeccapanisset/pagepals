package br.com.numsei.pagepals.database.models;

import java.util.List;

public class Collection {
    
    private String title;
    private Integer volumes; // quantidade de volumes da coleção

    private List<Book> books; // livros que pertencem aquela coleção
}
