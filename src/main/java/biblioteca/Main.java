package Biblioteca.src.main.java.biblioteca;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        boolean flag = false;
        Mensagens mensagens = new Mensagens();
        Biblioteca biblioteca = new Biblioteca();

        

        do{
            String valorStr = JOptionPane.showInputDialog(null, mensagens.menuPrincipal());
            if(valorStr == null || valorStr.isEmpty()){
                JOptionPane.showMessageDialog(null, valorStr);
            }
            int opcaoMenu = Integer.parseInt(valorStr);


            switch (opcaoMenu) {
                case 1:
                    JOptionPane.showInputDialog(null, mensagens.menuUsuario());
                break;
            
                case 2:
                    JOptionPane.showInputDialog(null, mensagens.menuLivro());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Nenhuma das opções escolhidas.");
                    break;
            }
        }while(!flag);
        
       /*  biblioteca.listarLivro();
        biblioteca.cadastrarLivro("Harry Potter", "Mundo de fantasias e magias", "J.K. Rolling", "26.06.1997");
        biblioteca.listarLivro();
        biblioteca.cadastrarLivro("Cronicas de Gelo e Fogo", "Mundo de fantasias e magias", "George R.R. Martin", "06.08.1996");
        biblioteca.listarLivro();
        biblioteca.removerLivro(1);
        biblioteca.listarLivro();
        biblioteca.cadastrarLivro("As Crônicas de Nárnia", "Mundo de fantasias", "C.S. Lewis", "16.10.1950");
        biblioteca.listarLivro();*/
    }
}
