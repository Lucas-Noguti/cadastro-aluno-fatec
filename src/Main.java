import dao.AlunoDAO;
import model.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.setNome("Carlos");

        new AlunoDAO().adicionarAluno(a);
    }
}
