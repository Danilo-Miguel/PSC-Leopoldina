package com.mycompany.universidade_db;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Querys {

    public static void main(String[] args) throws SQLException {

        String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
                    int ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o ra do aluno"));
                    String email = JOptionPane.showInputDialog("Digite o email do aluno");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite o idade do aluno"));
                    String telefone = JOptionPane.showInputDialog("Digite o telefone do aluno");
                    Aluno aluno = new Aluno();
                    aluno.setNome(nome);
                    aluno.setRa(ra);
                    aluno.setEmail(email);
                    aluno.setIdade(idade);
                    aluno.setTelefone(telefone);
                    aluno.inserirAluno();
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (opcao != 0);
    }
}
