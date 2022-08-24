public class Main {
    public static void main(String[] args){
        Reloj r = new Reloj();
        System.out.println(r.toTime());
        System.out.println(r.toShortTime());
        r.aumentarMinuto();
        System.out.println(r.toShortTime());
        Tienda t = new Tienda();
        System.out.println(t);
        t.cambiarColor("VERDE");
        System.out.println(t);
    }
}
