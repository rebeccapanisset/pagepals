package br.com.numsei.pagepals.database.models;

import java.util.List;

public class Publisher {
    
    private String name;
    private String website;

    // Relacionamentos
    private List<Book> books;
}
