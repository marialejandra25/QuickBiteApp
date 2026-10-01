/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickbite.modelo;

/**
 *
 * @author sebastiantorres
 */
public class Plato {
    // Atributos
    private String nombre;
    private double precio;
    private int porcionesDisponibles;
    
    // Constructor unico con tres atributos
    public Plato(String nombre, double precio, int porcionesDisponibles) {
        this.nombre = nombre;
        this.precio = precio;
        this.porcionesDisponibles = porcionesDisponibles;
    }
    
    //Metodos
    public void mostrarInformacion() {
        System.out.println(nombre + "  |$ "+ precio + " | porciones: " + porcionesDisponibles);
    }
    
    public double calcularSubtotal(int cantidad) {
        double valor_subtotal = this.precio * cantidad;
        
        return valor_subtotal;
    }
    
    public boolean hayDisponibilidad(int cantidad){
        
       if(cantidad > this.porcionesDisponibles){
           return false;
       
       }else {
           return true;
       }
    }
    
    public void despachar(int cantidad) {
        boolean hay_disponibilidad = hayDisponibilidad(cantidad);
        
        if (hay_disponibilidad== true){
            this.porcionesDisponibles = this.porcionesDisponibles - cantidad;
            System.out.println("Porciones disponibles actualizada.");
        } else {
            System.out.println("Advertencia!, No hay disponibilidad");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getPorcionesDisponibles() {
        return porcionesDisponibles;
    } 
    
}
