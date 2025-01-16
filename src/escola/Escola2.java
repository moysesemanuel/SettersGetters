package escola;
//Seguindo convenção Java Beans
public class Escola2 {
    public static void main(String[] args) {
        Aluno2 felipe = new Aluno2();

        felipe.setNome("Felipe");
        felipe.setIdade(12);
        felipe.setSexo("masculino");

        System.out.println("O aluno" + felipe.getNome() + " tem " + felipe.getIdade() + " anos " + " do sexo " + felipe.getSexo());
    }
}
