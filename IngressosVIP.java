public class IngressosVIP extends Ingressos{
    private float valorAdcional;

    public void setValorAdcional(float valorAdcional) {
        this.valorAdcional = valorAdcional;
    }

    public float getValorAdcional() {
        return valorAdcional;
    }
    

    public IngressosVIP(float valor, float valorAdcional){
        super(valor);
        this.valorAdcional = valorAdcional;
        valor = valor + valorAdcional;
    }

    public String toString() {
        return "O valor é: " + (getValor() + getValorAdcional()) ;
    }
}
