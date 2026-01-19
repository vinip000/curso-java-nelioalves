package POO.Funcionario;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double aumentarsalario(double taxa) {
        return (salarioBruto * taxa / 100) + salarioBruto;
    }
    public double salariosLiquido() {
        return salarioBruto - imposto;
    }

    public String toString() {
        return nome
            + ", $ "
            + String.format("%.2f", salariosLiquido());
    }
}
