
public class TestGen {
    public static void main(String[] args) {
        // Crear una Cajoneria de Golosinas
    	Cajoneria<Golosina> cajoneria = new Cajoneria<Golosina>("Golosinas");


        // Agregar golosinas a la cajoneria
        cajoneria.add(new Golosina("Chicle", 0.1));
        cajoneria.add(new Golosina("Paleta", 0.2));
        cajoneria.add(new Golosina("Chocolate", 0.3));
        cajoneria.add(new Golosina("Gomitas", 0.4));
        cajoneria.add(new Golosina("Caramelos", 0.5));

        // Verificar la existencia de algunas golosinas en la cajoneria
        Golosina golosina1 = new Golosina("Chicle", 0.1);
        Golosina golosina2 = new Golosina("Gomitas", 0.4);
        System.out.println("La cajoneria contiene la golosina " + golosina1 + ": " + cajoneria.contains(golosina1));
        System.out.println("La cajoneria contiene la golosina " + golosina2 + ": " + cajoneria.contains(golosina2));

        // Eliminar una golosina de la cajoneria
        Golosina golosina3 = new Golosina("Paleta", 0.2);
        System.out.println("Eliminando la golosina " + golosina3);
        cajoneria.delete(golosina3);
        System.out.println("La cajoneria contiene la golosina " + golosina3 + ": " + cajoneria.contains(golosina3));
    }
}

