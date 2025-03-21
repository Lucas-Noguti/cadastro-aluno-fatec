package model;

import java.time.LocalDate;

public class Aluno {

   private int idAluno;
   private String nome;

    public int getIdAluno() {
        return idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
