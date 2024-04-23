public class Compra  implements Comparable<Compra>{

    private String descripcionProducto;
    private double valorProducto;

    //CONSTRUCTOR, que recibe la descripción y valor del producto
    public Compra(String descripcionProducto, double valorProducto) {
        this.descripcionProducto = descripcionProducto;
        this.valorProducto = valorProducto;
    }


    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public double getValorProducto() {
        return valorProducto;
    }

    // SOBREESCRITURA del toString para modificar nuestros valores deseados
    @Override
    public String toString() {
        return "Compra: " +
                " Descripción = " + descripcionProducto +
                "valorProducto = " + valorProducto;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        //Conversión de double primitivo a Double (wraper)
        return Double.valueOf(this.valorProducto).compareTo(Double.valueOf(otraCompra.getValorProducto()));
    }
}
