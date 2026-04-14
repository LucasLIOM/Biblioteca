package Biblioteca.biblioteca.model;

public class Exemplar {

    private int id;
    private int livroId;
    private String status;

    public Exemplar(int id, int livroId, String status) {
        this.id = id;
        this.livroId = livroId;
        this.status = status;
    }
}