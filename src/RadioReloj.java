public class RadioReloj {
    private String color;
    private int peso;
    private boolean original;
    private Reloj reloj;

    public RadioReloj(String color, int peso, boolean original, Reloj reloj) {
        this.color = color;
        this.peso = peso;
        this.original = original;
        if(this.original){
            this.reloj = reloj;
        }else{
            this.reloj = null;
        }
    }
    public RadioReloj(String color, int peso, boolean original) {
        this(color, peso, original, new Reloj());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if(peso < 0) return;
        this.peso = peso;
    }

    public boolean isOriginal() {
        return original;
    }

    private void setOriginal(boolean original) {
        this.original = original;
    }

    public Reloj getReloj() {
        return reloj;
    }

    public void setReloj(Reloj reloj) {
        if(!this.original) return;
        this.reloj = reloj;
    }

    @Override
    public String toString() {
        String salida = "";
        salida += "RADIORELOJ\n";
        salida += "Color: " + this.color + "\n";
        salida += "Peso: " + String.format("%dkg", this.peso) + "\n";
        if(this.original){
            salida += "Original: Si\n";
            salida += "Reloj: " + this.reloj.toShortTime();
        }else{
            salida += "Original: No";
        }
        return salida;
    }
}
