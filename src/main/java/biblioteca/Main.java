package Biblioteca.src.main.java.biblioteca;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        boolean flag = false;
        int valorInt = 0;
        String valorStr = "";
        Mensagens mensagens = new Mensagens();
        Biblioteca biblioteca = new Biblioteca();

        while (!flag) {

            valorStr = JOptionPane.showInputDialog(null, mensagens.menuPrincipal());
            if (valorStr == null || valorStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, valorStr);
            }
            int opcaoMenu = Integer.parseInt(valorStr);

            switch (opcaoMenu) {
                case 1:
                    do {
                        valorInt = Integer.parseInt(JOptionPane.showInputDialog(null, mensagens.menuUsuario()));
                        switch (valorInt) {
                            case 1:
                                String loginEntrada, senhaEntrada, telefoneEntrada;
                                loginEntrada = JOptionPane.showInputDialog(null, mensagens.whichLogin());
                                senhaEntrada = JOptionPane.showInputDialog(null, mensagens.whichSenha());
                                telefoneEntrada = JOptionPane.showInputDialog(null, mensagens.whichTelefone());
                                biblioteca.cadastrarUsuario(loginEntrada, senhaEntrada, telefoneEntrada);
                                break;

                            default:
                                break;
                        }

                    } while (valorInt != 0);

                    break;

                case 2:
                    JOptionPane.showInputDialog(null, mensagens.menuLivro());
                    break;

                case 3:
                    biblioteca.listarUsuario();
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Nenhuma das opções escolhidas.");
                    break;
            }
        }
    }
}
