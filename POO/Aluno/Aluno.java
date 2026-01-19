package POO.Aluno;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public void resultadoFinal() {
        if (notaFinal() >= 60.0) {
            System.out.println("Aluno Aprovado");;
        } else {
            System.out.println("Aluno Reprovado");
            System.out.printf("Faltaram %.2f pontos%n", 60.0 - notaFinal());
        }
    }
}
