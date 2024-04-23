import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el límite de su TDC: ");
        double limiteDeTarjeta = teclado.nextDouble();
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito(limiteDeTarjeta);


        int salir = 1;

        while (salir != 0) {
            System.out.println("Escribe la descripción del Producto: ");
            String descripcionDelProducto = teclado.next();

            System.out.println("Ingresa el valor del Producto: ");
            Double valorDelProducto = Double.valueOf(teclado.next());

            Compra compra = new Compra(descripcionDelProducto, valorDelProducto);
            boolean compraRealizada = tarjetaDeCredito.lanzarCompra(compra);

            if (compraRealizada){
                System.out.println("     Compra Realizada!");
                System.out.println("""
                        ¿Continuar comprando?
                        Escriba 1 para CONTINUAR ó 0 para SALIR
                        """);
                salir = teclado.nextInt();
            } else {
                System.out.println("Saldo INSUFICIENTE!\n");
                salir = 0;
            }
        }

        System.out.println("COMPRAS REALIZADAS: \n");

        //Lista ordenada por valores de MENOR a MAYOR
        Collections.sort(tarjetaDeCredito.getListaDeCompras());

        for (Compra compra : tarjetaDeCredito.getListaDeCompras()) {
            System.out.println(compra.getDescripcionProducto() + ": " + compra.getValorProducto());
        }

        System.out.println("---------------------------------------------------\n");
        System.out.println("TOTAL: $ " + tarjetaDeCredito.getTotal());
        System.out.println("Saldo de la TDC: $ " + tarjetaDeCredito.getSaldo());
    }
}
