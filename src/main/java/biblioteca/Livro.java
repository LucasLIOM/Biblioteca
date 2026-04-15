public class Livro {
    private int id = 0;
    private String titulo;
    private String descricao;
    private String dataPublicacao;
    private String autor;

    Livro(int id, String titulo, String descricao, String dataPublicacao, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataPublicacao = dataPublicacao;
        this.autor = autor;
    }

    // Getters e Setters
    public void setIdLivro(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIdLivro() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public String getAutor() {
        return autor;
    }
}