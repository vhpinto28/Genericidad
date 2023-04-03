
class DemoMetodoGenerico {

    static <T> boolean exist(T[] arr, T x) {
        for (T elem : arr) {
            if (elem.equals(x)) {
                return true;
            }
        }
        return false;
    }

    static <T extends Comparable<T>> boolean igualArrays(T[] x, T[] y) {
        //Si las longitudes de los array son diferentes,
        // entonces los array son diferentes
        if (x.length != y.length)
            return false;
        for (int i = 0; i < x.length; i++)
            if (!x[i].equals(y[i]))
                return false; //arrays diferentes
        return true; // Contenido de arrays son equivalentes
    }

    public static void main(String[] args) {
        Golosina[] golosinas = {new Golosina("Chicle", 0.2), new Golosina("Paleta", 0.3), new Golosina("Caramelo", 0.1)};
        Chocolatina[] chocolatinas = {new Chocolatina("Milka"), new Chocolatina("Ferrero"), new Chocolatina("Snickers")};

        // Ejemplo de uso de exist()
        System.out.println(exist(golosinas, new Golosina("Chicle", 0.2))); // true
        System.out.println(exist(chocolatinas, new Chocolatina("Milka"))); // true
        System.out.println(exist(chocolatinas, new Chocolatina("Mars"))); // false

        // Ejemplo de uso de igualArrays()
        Integer[] nums = {1, 2, 3, 4, 5};
        Integer[] nums2 = {1, 2, 3, 4, 5};
        Integer[] nums3 = {1, 2, 7, 4, 5};
        Integer[] nums4 = {1, 2, 7, 4, 5, 6};
        if (igualArrays(nums, nums))
            System.out.println("nums es igual a nums");
        if (igualArrays(nums, nums2))
            System.out.println("nums es igual a nums2");
        if (igualArrays(nums, nums3))
            System.out.println("nums es igual a nums3");
        if (igualArrays(nums, nums4))
            System.out.println("nums es igual a nums4");
        // Crea un array de double //A
        // Double[] dvals = {1.1, 2.2, 3.3, 4.4, 5.5}; //B
        //if(igualArrays(nums,dvals)) //C
        // System.out.println("nums es igual a dvals"); //D
    }
}
