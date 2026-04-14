package Biblioteca.biblioteca.dao;

import Biblioteca.biblioteca.connection.Conexao;
import Biblioteca.biblioteca.model.Livro;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {

    public void cadastrar(Livro livro) {
        String sql = "INSERT INTO livro (titulo, descricao, autor, dataPublicacao) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getDescricao());
            stmt.setString(3, livro.getAutor());
            stmt.setString(4, livro.getDataPublicacao());

            stmt.execute();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deletar(int id) {
        String sql = "DELETE FROM livro WHERE id=?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.execute();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Livro> listar() {
        List<Livro> lista = new ArrayList<>();

        String sql = "SELECT * FROM livro";

        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new Livro(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("descricao"),
                        rs.getString("autor"),
                        rs.getString("dataPublicacao")
                ));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return lista;
    }
}