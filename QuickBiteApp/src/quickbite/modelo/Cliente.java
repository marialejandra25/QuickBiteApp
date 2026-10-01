/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickbite.modelo;

/**
 *
 * @author sebastiantorres
 */
public class Cliente {

    //Atributos
    private String nombre;
    private String correo;
    private double saldo;

    // Contructor
    public Cliente(String nombre, String correo, double saldo) {
        this.nombre = nombre;
        this.correo = correo;
        this.saldo = saldo;
    }

    // metodos
    public void mostrarInformacion() {
        System.out.println(nombre + " | " + correo + " | saldo: " + saldo);
    }

    public boolean puedePagar(double valor) {
        if (valor > this.saldo) {
            return false;

        } else {
            return true;
        }
    }

    public void pagar(double valor) {
        if (puedePagar(valor)) {
            this.saldo = this.saldo - valor;
            System.out.println("Pago Exitoso!");
        } else {
            System.out.println("No se pudo realizar el pago!");
        }
    }
    public String getNombre() {
        return nombre;
    }
}
