public class Main {
    public static void main(String[] args) {
        ConversordeMoedas conversordeMoedas = new ConversordeMoedas();

        Moedas valorConvertido = conversordeMoedas.convereterMoedas("USD", "BRL", 1);

        System.out.println(valorConvertido);
    }
}