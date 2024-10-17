/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase5practica;

/**
 *
 * @author Aulas Heredia
 */
public class Carro {
    //Atributos
    public String marca;
    public String placa;
    public boolean marchamoActivo;
    
    public void cambioDeMarca(String marca){
        String marcaAnterior = this.marca;
        this.marca = marca;
        System.out.println("El modelo del carro " + marcaAnterior + " ha cambiado a " + this.marca);
    }
    public void cambioEstadoMarchamo(boolean marchamoActivo){
        this.marchamoActivo = marchamoActivo;
        if(this.marchamoActivo){
            System.out.println("El marchamo se cambio a activo.");
        }
        else{
            System.out.println("El marchamo se cambio a inactivo.");
        }
    }
    
    
}
