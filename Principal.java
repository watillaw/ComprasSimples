import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = leitor.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int continua = 1;

        while (continua != 0){
            System.out.println("Digite a descricão da compra: ");
            String descricao = leitor.next
            

        }
    }
}
