public class Principal {
    public static void main(String[] args) {
        
        Ingressos ingresso1 = new Ingressos(20);
        IngressosVIP ingressosVIP1 = new IngressosVIP(20, 15);

        System.out.println("Valor do ingresso: " + ingresso1.toString());
        System.out.println(ingressosVIP1.toString());
    }
}
