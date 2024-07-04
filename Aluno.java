package com.mycompany.universidade_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Aluno {

    private int id_aluno;
    private String nome;
    private int ra;
    private String email;
    private int idade;
    private String telefone;

    public void inserirAluno() throws SQLException {

        String sql = "INSERT INTO aluno(nome_aluno, idade_aluno, ra_aluno, email_aluno, telefone_aluno)VALUES(?, ?, ?, ?, ?)";

        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()) {

            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, getNome());
            ps.setInt(2, getIdade());
            ps.setInt(3, getRa());
            ps.setString(4, getEmail());
            ps.setString(5, getTelefone());
            ps.execute();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * @return the id_aluno
     */
    public int getId_aluno() {
        return id_aluno;
    }

    /**
     * @param id_aluno the id_aluno to set
     */
    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ra
     */
    public int getRa() {
        return ra;
    }

    /**
     * @param ra the ra to set
     */
    public void setRa(int ra) {
        this.ra = ra;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
