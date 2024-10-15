import java.time.LocalDate;
import java.time.Period;

public class Galinha {
    private String nome;
    private int idade;
    private String cor;

    Galinha( String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }


    public void salvarGalinha() {
        System.out.println("Salvando a galinha " + this.nome + " de " + this.idade + " anos de idade e cor " + this.cor);
    }

    public void botarOvo() {
        System.out.println("A galinha " + this.nome + " botou um ovo!");
    }

    public void cacarejar() {
        System.out.println("A galinha " + this.nome + " está cacarejando!");
    }

    public void comerMilho() {
        System.out.println("A galinha " + this.nome + " está comendo milho!");
    }

    public String calculaIdadeGalinha( String dataNascimento)  {
        Period periodo = Period.between(LocalDate.parse(dataNascimento), LocalDate.now());

        this.idade = periodo.getYears();

        return "A galinha " + 
        this.nome + " tem " + 
        this.idade + " anos de idade " + 
        periodo.getMonths() + " meses e " + 
        periodo.getDays() + " dias.";
    }
    
    public void mostrarGalinha() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Cor: " + this.cor);
    }

}
