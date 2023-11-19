import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //inicializacão do scaner e do limite do cartao
        System.out.println("Digite o limite do cartão: ");
        double limite = leitor.nextDouble();
        // criacao de um novo objeto cartao;
        CartaoDeCredito cartao = new CartaoDeCredito(limite);
        // inicializacao de variavel de controle do loop while
        int continua = 1;

        while (continua != 0){
            System.out.println("Digite a descricão da compra: ");
            String descricao = leitor.next(); // leitura e gravacao de descricao
            System.out.println("Digite o valor: ");
            double valor = leitor.nextDouble(); // leitura e gravacao de valor
            // criacao de um novo objeto compra com descricao e valor, que foram obtidos antes
            Compra compra = new Compra(descricao, valor);
            // retorno de condicional se pode efetuar a compra ou nao, de acordo com a regra dentro de lancaCompra em cartao.
            boolean compraRealizada = cartao.lancaCompra(compra);

            // caso compra realizada dê TRUE
            if(compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("Deseja continuar? DIGITE [1 PARA SIM] OU [0 PARA NÃO] ");
                continua = leitor.nextInt();
            }else {
                System.out.println("Compra não autorizada!");
                System.out.println("Saldo insulficiente.");
                continua = 0;
            }
        }
    }
}
