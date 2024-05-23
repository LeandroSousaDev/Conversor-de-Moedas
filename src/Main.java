
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
                1 - Converter de BRL para USD
                2 - Converter de USD para BRL
                3 - Sair
                """;

        while (opcao != 3) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1) {
                System.out.println("Digite valor para converter:");
                valor = leitura.nextDouble();
                Moedas valorConvertido = conversordeMoedas.convereterMoedas("BRL", "USD", valor);
                System.out.println(valorConvertido);
            } else if (opcao == 2) {
                System.out.println("Digite valor para converter:");
                valor = leitura.nextDouble();
                Moedas valorConvertido = conversordeMoedas.convereterMoedas("USD", "BRL", valor);
                System.out.println(valorConvertido);
            } else if (opcao != 3) {
                System.out.println("opção invalida");
            }
        }


    }
}