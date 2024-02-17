package br.com.numsei.pagepals.database.models;

public class Book {
    
    private String isbn10;
    private String isbn13;

    private String title;
    private String subtitle;

    // private String type; // livro/quadrinho/revista (fazer herança?)
    private String genre;// cadastro de generos? mais de um genero? acredito que mais de um genero fica melhor
    // fantasia
    // romance
    // ficcao científica
    // mistério

    private Integer pages; 
    // (classificação por qtd páginas)
    // <= 100 --- conto
    // <= 250 --- pequeno
    // <= 350 --- médio
    // <= 500 --- grande
    // <= 1000 --- calhamaço
    // > 1000 --- colossal

    private Integer publicationYear;

    private String synopsis;

    private String coverImg;

    private String language; // idiomas pre determinados

    private boolean kindleUnlimited;// se esse livro esta disponível no kindle unlimited

    private boolean onlyEbook;// se esse livro está disponível somente em ebook

    private String price;
    // seria interessante mostrar alguns anúncios de preços do livro, será que tem como trazer tipo uma pesquisa da web?


    // Relacionamentos
    private Author author;

    private Publisher publisher; // criar obj?

    private BookCollection bookCollection; // Relacionamento com a tabela pivot
    private Collection collection; //serie/colecao; boolean? ou coloca o nome? criar um obj?
    // se não tem coleção então é livro único
    // tipo da coleção
    // - duologia
    // - trilogia
    // - serie
}
