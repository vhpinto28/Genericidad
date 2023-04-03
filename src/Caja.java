import java.util.ArrayList;

public class Caja<T> {
    private String color;
    private ArrayList<T> contenido;
    
    

    public Caja(String color) {
        this.color = color;
        this.contenido = new ArrayList<>();
    }

    public Caja() {
        // TODO Auto-generated constructor stub
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public ArrayList<T> getContenido() {
        return contenido;
    }

    public boolean addObject(T golosina) {
        return this.contenido.add((T) golosina);
    }

    public boolean contains(T obj) {
        return this.contenido.contains(obj);
    }

    public T removeObject(T obj) {
        if (this.contenido.contains(obj)) {
            this.contenido.remove(obj);
            return obj;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-10s %-10s\n", "Color:", getColor()));
        sb.append(String.format("%-10s %-10s\n", "Contenido:", getContenido()));
        return sb.toString();
    }
}




