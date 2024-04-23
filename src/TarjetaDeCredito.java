import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito{

    private Double limiteDeTarjeta;
    private Double saldo;
    private List<Compra> listaDeCompras;
    private double total;

    // CONSTRUCTOR, que recibe el limíte de la TDC
    //
    public TarjetaDeCredito(Double limiteDeTarjeta) {
        this.limiteDeTarjeta = limiteDeTarjeta;
        this.saldo = limiteDeTarjeta;
        this.listaDeCompras = new ArrayList<>();
    }


    // LanzarCompra para verificar que el valor del saldo de la TDC
    // sea mayor o igual que el valor del producto, si sí restarlo al saldo, así como
    // agregar la compra a la lista de compras
    public boolean lanzarCompra(Compra compra){
        if (this.saldo >= compra.getValorProducto()) {
            this.saldo -= compra.getValorProducto();
            this.listaDeCompras.add(compra);
            this.total += compra.getValorProducto();
            return true;
        } else {
            return false;
        }
    }

    public double getTotal() {
        return total;
    }

//    public Double getLimiteDeTarjeta() {
//        return limiteDeTarjeta;
//    }

    public Double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }
}



