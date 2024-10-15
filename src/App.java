public class App {
    public static void main(String[] args) throws Exception {
        Galinha galinha1 = new Galinha("Cláudia", 2, "Carijó");

        galinha1.mostrarGalinha();
        System.out.println(galinha1.calculaIdadeGalinha("2021-01-01"));
    }
}
