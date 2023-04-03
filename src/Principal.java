
public class Principal {
    public static void main(String[] args) {
        Bolsa<Chocolatina> bolsaCho = new Bolsa<Chocolatina>();
        Chocolatina c = new Chocolatina("milka");
        Chocolatina c1 = new Chocolatina("milka");
        Chocolatina c2 = new Chocolatina("ferrero");
        bolsaCho.add(c);
        bolsaCho.add(c1);
        bolsaCho.add(c2);
        for (Chocolatina chocolatina : bolsaCho) {
            System.out.println(chocolatina.getMarca());
        }

        Bolsa<Golosina> bolsaGol = new Bolsa<Golosina>();
        Golosina g = new Golosina("chicle", 0.5);
        Golosina g1 = new Golosina("paleta", 0.2);
        Golosina g2 = new Golosina("chocolate", 0.3);
        bolsaGol.add(g);
        bolsaGol.add(g1);
        bolsaGol.add(g2);
        for (Golosina golosina : bolsaGol) {
            System.out.println(golosina.toString());
        }
    }
}
