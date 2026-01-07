package estruturaCondicional;

public class ex4 {
    int horaInicial = 10;  
    int horaFinal = 19;

    public void calcularDuracao() {
        int duracao;

        if (horaFinal < horaInicial) {
            duracao = (24 - horaInicial) + horaFinal;
        } else {
            duracao = horaFinal - horaInicial;
        }

        System.out.println("A duração do jogo foi de " + duracao + " horas.");
    }
}
