public class Emprestimo {
    private String dataEmprestimo;
    private String dataRetorno;

    Emprestimo(String dataEmprestimo, String dataRetorno) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataRetorno = dataRetorno;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataRetorno(String dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataRetorno() {
        return dataRetorno;
    }
}
