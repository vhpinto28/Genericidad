import java.util.ArrayList;

public class Cajoneria<T> {
    private ArrayList<Caja<T>> cajas;
    

    public Cajoneria() {
        this.cajas = new ArrayList<>();
    }

    public Cajoneria(String string) {
		// TODO Auto-generated constructor stub
	}

	public void addCaja(Caja<T> caja) {
        this.cajas.add(caja);
    }

    public int getSize() {
        return this.cajas.size();
    }
    
    public void addGolosina(T golosina) {
        if (cajas == null) {
            cajas = new ArrayList<>();
        }
        boolean added = false;
        for (Caja<T> caja : cajas) {
            if (caja.getContenido().get(0) instanceof Golosina && caja.addObject(golosina)) {
                added = true;
                break;
            }
        }
        if (!added) {
            Caja<T> newCaja = new Caja<>();
            newCaja.setColor("blanco");
            newCaja.addObject(golosina);
            this.cajas.add(newCaja);
        }
    }

    public boolean contains(Golosina golosina) {
        for (Caja<T> caja : cajas) {
            if (caja.getContenido().equals(golosina)) {
                return true;
            }
        }
        return false;
    }

    public void addObject(T obj) {
        boolean added = false;
        for (Caja<T> caja : cajas) {
            if (caja.addObject(obj)) {
                added = true;
                break;
            }
        }
        if (!added) {
            Caja<T> newCaja = new Caja<>();
            newCaja.setColor("blanco");
            newCaja.addObject(obj);
            this.cajas.add(newCaja);
        }
    }

    public String search(T obj) {
        for (int i = 0; i < cajas.size(); i++) {
            Caja<T> caja = cajas.get(i);
            if (caja.contains(obj)) {
                return "Posicion: " + (i+1) + ", ColorCaja: " + caja.getColor();
            }
        }
        return "El elemento no se encuentra en ninguna caja.";
    }

    public T delete(T obj) {
        for (Caja<T> caja : cajas) {
            if (caja.contains(obj)) {
                return caja.removeObject(obj);
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Posicion\tColorCaja\tObjeto\n");
        for (int i = 0; i < cajas.size(); i++) {
            Caja<T> caja = cajas.get(i);
            for (T obj : caja.getContenido()) {
                sb.append((i+1) + "\t\t" + caja.getColor() + "\t\t" + obj.toString() + "\n");
            }
        }
        return sb.toString();
    }

	public void add(Golosina golosina) {
		// TODO Auto-generated method stub
		
	}
	
}

