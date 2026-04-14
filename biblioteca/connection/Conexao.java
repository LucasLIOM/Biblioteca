package Biblioteca.biblioteca.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    // 🔗 Dados do banco
    private static final String URL =
            "jdbc:mysql://localhost:3306/biblioteca?useTimezone=true&serverTimezone=UTC";

    private static final String USER = "root";
    private static final String PASSWORD = "MyLuk_04"; // coloque sua senha real aqui

    public static Connection conectar() {

        try {
            // 🔥 FORÇA carregamento do driver (resolve muitos erros)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 🔌 Conexão com o banco
            return DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver MySQL não encontrado. Verifique o JAR no classpath.");

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar no banco: " + e.getMessage());
        }
    }
}