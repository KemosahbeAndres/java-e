import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<RadioReloj> productos;
    private int cantidad;

    public Tienda() {
        this.productos = new ArrayList<RadioReloj>();
        this.productos.add( new RadioReloj("azul", 1, true) );
        this.productos.add( new RadioReloj("rojo", 2, true) );
        this.productos.add( new RadioReloj("amarillo", 1, false) );
        this.cantidad = this.productos.size();
    }

    public List<RadioReloj> getProductos() {
        return productos;
    }

    public void addProducto(RadioReloj producto) {
        this.productos.add(producto);
        this.cantidad = this.productos.size();
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString(){
        String salida = "";
        for (RadioReloj r: this.productos) {
            salida += r.toString() + "\n\n";
        }
        return salida;
    }

    public void cambiarColor(String color){
        for(RadioReloj r: this.productos){
            r.setColor(color);
        }
    }
}

