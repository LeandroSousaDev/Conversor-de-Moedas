
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ConversordeMoedas conversordeMoedas = new ConversordeMoedas();
        Scanner leitura = new Scanner(System.in).useLocale(Locale.US);
        int opcao = 0;
        double valor = 0;

        String menu = """
                ** Digite a sua opção **
                1 - Converter de Real para Dolar
                2 - Converter de Real para Euro
                3 - Converter de Dolar para Real
                4 - Converter de Dolar para Euro
                5 - Converter de Euro para Real
                6 - Converter de Euro para Dolar
                7 - Sair
                """;

        while (opcao != 7) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Digite valor para converter:");
                valor = leitura.nextDouble();
                Moedas valorConvertido = conversordeMoedas.convereterMoedas("BRL", "USD", valor);
                System.out.println("R$" + valor + " convertido para dolar é $" + valorConvertido);

            } else if (opcao == 2) {
                System.out.println("Digite valor para converter:");
                valor = leitura.nextDouble();
                Moedas valorConvertido = conversordeMoedas.convereterMoedas("BRL", "EUR", valor);
                System.out.println("R$" + valor + " convertido para euro é €" + valorConvertido);

            } else if (opcao == 3) {
                System.out.println("Digite valor para converter:");
                valor = leitura.nextDouble();
                Moedas valorConvertido = conversordeMoedas.convereterMoedas("USD", "BRL", valor);
                System.out.println("$" + valor + " convertido para real é R$" + valorConvertido);

            } else if (opcao == 4) {
                System.out.println("Digite valor para converter:");
                valor = leitura.nextDouble();
                Moedas valorConvertido = conversordeMoedas.convereterMoedas("USD", "EUR", valor);
                System.out.println("$" + valor + " convertido para euro é €" + valorConvertido);

            } else if (opcao == 5) {
                System.out.println("Digite valor para converter:");
                valor = leitura.nextDouble();
                Moedas valorConvertido = conversordeMoedas.convereterMoedas("EUR", "BRL", valor);
                System.out.println("€" + valor + " convertido para real é R$" + valorConvertido);

            } else if (opcao == 6) {
                System.out.println("Digite valor para converter:");
                valor = leitura.nextDouble();
                Moedas valorConvertido = conversordeMoedas.convereterMoedas("EUR", "USD", valor);
                System.out.println("€" + valor + " convertido para dolar é $" + valorConvertido);

            } else if (opcao != 7) {
                System.out.println("OPÇÃO INVALIDA");
            }


        }
    }
}