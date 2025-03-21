package dao;

import model.Aluno;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {

    public void adicionarAluno(Aluno aluno) {
        String sql = "INSERT INTO ALUNO (NOME) VALUES (?)";

        PreparedStatement ps = null;

        try {
            ps = ConexaoBD.getConexao().prepareStatement(sql);
            ps.setString(1, aluno.getNome());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
