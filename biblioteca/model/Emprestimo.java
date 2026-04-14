package Biblioteca.biblioteca.model;

public class Emprestimo {

    private int id;
    private int usuarioId;
    private int exemplarId;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(int id, int usuarioId, int exemplarId, String dataEmprestimo, String dataDevolucao) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.exemplarId = exemplarId;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }
}