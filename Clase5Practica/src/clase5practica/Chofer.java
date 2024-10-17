/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase5practica;

/**
 *
 * @author Aulas Heredia
 */
public class Chofer {
    // Atributos
    public String cedula;
    public String nombre;
    public String carroDesignado;
    public double salario;
    // Metodos
    public void salarioNeto(){
        double salarioNeto = salario - salario * 0.0900;
        System.out.println("El salario neto del empleado " + nombre + " cedula " + cedula + " es de: " + salarioNeto);
    } 
    public void cambioDeCarro(String carroDesignado){
        String carroAnterior = this.carroDesignado;
        this.carroDesignado = carroDesignado;
        System.out.println("El nuevo carro asignado para " + nombre + " cedula " + cedula + " es: " + this.carroDesignado + ". Antes tenia " + carroAnterior);
    }
    
}
