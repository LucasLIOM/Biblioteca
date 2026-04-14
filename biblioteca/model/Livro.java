package Biblioteca.biblioteca.model;

public class Livro {

    private int id;
    private String titulo;
    private String descricao;
    private String autor;
    private String dataPublicacao;

    public Livro(int id, String titulo, String descricao, String autor, String dataPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", data publicacao='" + dataPublicacao + '\'' +
                ", descricao=" + descricao +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAutor() {
        return autor;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

}