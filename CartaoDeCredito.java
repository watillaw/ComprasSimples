import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double saldo;
    private double limite;
    private List<Compra> compras;



    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra){
        if(this.limite >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
       return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }
}
