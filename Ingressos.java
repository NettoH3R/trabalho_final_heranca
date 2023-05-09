public class Ingressos{

    private float valor;
    
    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "O valor é: " + this.valor;
    }

    public Ingressos(float valor){
        this.valor = valor;
    }
}