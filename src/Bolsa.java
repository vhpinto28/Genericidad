import java.util.Iterator;
import java.util.ArrayList;
public class Bolsa<T> implements Iterable<T> {
    private ArrayList<T> lista = new ArrayList<T>(3);
    private int tope;

    public Bolsa() {
        this(3); // llamamos al constructor actual y le pasamos un valor para el tope
    }

    public Bolsa(int tope) {
        super();
        this.tope = tope;
    }

    public void add(T objeto) {
        if (lista.size() < tope) {
            lista.add(objeto);
        } else {
            throw new RuntimeException("no caben mas");
        }
    }

    public Iterator<T> iterator() {
        return lista.iterator();
    }
}
