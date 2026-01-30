package VetoresListas.Pensionato;

public class Aluguel {
    public String nome;
    public String email;
    public int quarto;


    public Aluguel(String nome, String email, int quarto) {
        this.nome = nome;
        this.email = email;
        this.quarto = quarto;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

      public String toString() {
        return quarto + ": " + nome + ", " + email;
    }
}


