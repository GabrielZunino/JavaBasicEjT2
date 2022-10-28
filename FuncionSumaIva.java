package com.ejemplo;

/**
 * Funcion que calcula el iva
 */

public class FuncionSumaIva   {

    public static void main(String[] args) {

        double precio = 10.5;

        double precioIva = getPrecioIva(precio);

        System.out.println("Precio con iva "+ precioIva);
    }

     static double getPrecioIva(double precio) {
         return precio * (1 + 0.21);                 //Calculo del iva
    }

}
