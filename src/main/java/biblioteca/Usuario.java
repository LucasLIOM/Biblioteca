public class Usuario {
    private int idUsuario;
    private String login;
    private String senha;
    private String telefone;

    Usuario(int idUsuario, String login, String senha, String telefone) {
        this.idUsuario = idUsuario;
        this.login = login;
        this.senha = senha;
        this.telefone = telefone;
    }

    // Getters e Setters
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getTelefone() {
        return telefone;
    }
}