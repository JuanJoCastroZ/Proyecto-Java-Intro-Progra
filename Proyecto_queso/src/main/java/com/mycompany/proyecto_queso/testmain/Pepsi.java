/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_queso.testmain;

import com.mycompany.proyecto_queso.Proyecto_queso;

/**
 *
 * @author Juan Jose
 */
public class Pepsi {
    public Proyecto_queso cc = new Proyecto_queso();
    public void Prueba(){
        int resultado = cc.sumar(1, 2);
        System.out.println(resultado);
    }
    public static void main(String[] args){
        Pepsi pe = new Pepsi();
        pe.Prueba();
    }
}
