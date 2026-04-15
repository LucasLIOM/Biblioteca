import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Mensagens mensagens = new Mensagens();
        Biblioteca biblioteca = new Biblioteca();

        boolean flag = false;
        int valorInt = 0;
        int opcaoMenu = 0;
        String valorStr = "";

        while (!flag) {

            valorStr = readChar(mensagens.menuPrincipal());

            if (valorStr == null) {
                return;
            }

            try {
                opcaoMenu = Integer.parseInt(valorStr);
            } catch (NumberFormatException e) {
                warning("Digite apenas números!");
                continue;
            }

            switch (opcaoMenu) {
                case 1:
                    do {
                        Integer menuUsuario = readInt(mensagens.menuUsuario());

                        if (menuUsuario == null)
                            continue;

                        valorInt = menuUsuario;

                        switch (valorInt) {
                            case 1:
                                String loginEntrada, senhaEntrada, telefoneEntrada;

                                loginEntrada = readChar(mensagens.whichLogin());
                                senhaEntrada = readChar(mensagens.whichSenha());
                                telefoneEntrada = readChar(mensagens.whichTelefone());

                                if (loginEntrada == null || senhaEntrada == null || telefoneEntrada == null) {
                                    warning("Cadastro cancelado");
                                    break;
                                }

                                biblioteca.cadastrarUsuario(loginEntrada, senhaEntrada, telefoneEntrada);
                                break;

                            default:
                                break;
                        }

                    } while (valorInt != 0);
                    break;

                case 2:
                    do {
                        Integer menuLivro = readInt(mensagens.menuLivro());

                        if (menuLivro == null)
                            continue;

                        valorInt = menuLivro;

                        switch (valorInt) {
                            case 1:
                                String tituloEntrada, descricaoEntrada, autorEntrada, dataPubEntrada;

                                tituloEntrada = readChar(mensagens.whichTitulo());
                                descricaoEntrada = readChar(mensagens.whichDescricao());
                                autorEntrada = readChar(mensagens.whichAutor());
                                dataPubEntrada = readChar(mensagens.whichDataPub());

                                if (tituloEntrada == null || descricaoEntrada == null ||
                                        autorEntrada == null || dataPubEntrada == null) {
                                    warning("Cadastro de livro cancelado");
                                    break;
                                }

                                biblioteca.cadastrarLivro(tituloEntrada, descricaoEntrada, autorEntrada,
                                        dataPubEntrada);
                                break;

                            case 2:
                                String deletarLivroEntrada = readChar("Qual livro quer deletar?");

                                if (deletarLivroEntrada == null)
                                    break;

                                biblioteca.removerLivro(Integer.parseInt(deletarLivroEntrada));
                                break;

                            case 3:
                                biblioteca.listarLivro();
                                break;

                            default:
                                break;
                        }

                    } while (valorInt != 0);

                    break;

                case 3:
                    biblioteca.listarUsuario();
                    break;

                case 0:
                    flag = true;
                    break;

                default:
                    warning("Nenhuma das opções escolhidas.");
                    break;
            }
        }
    }

    public static String readChar(String mensagem) {
        String input = JOptionPane.showInputDialog(null, mensagem);

        if (input == null || input.trim().isEmpty()) {
            return null;
        }

        return input.trim();
    }

    public static Integer readInt(String mensagem) {
        String input = JOptionPane.showInputDialog(null, mensagem);

        if (input == null || input.trim().isEmpty()) {
            return null;
        }

        try {
            return Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            warning("Digite apenas números!");
            return null;
        }
    }

    public static void warning(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
}