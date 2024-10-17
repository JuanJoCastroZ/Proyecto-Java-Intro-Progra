/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase5practica;

/**
 *
 * @author Aulas Heredia
 */
public class Clase5Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llamados al carro
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();
        
        carro1.marca = "Fiat";
        carro2.marca = "BYD";
        carro3.marca = "Honda";
        
        carro1.placa = "BTE-245";
        carro2.placa = "QPO-897";
        carro3.placa = "RGB-777";
        
        carro1.marchamoActivo = true;
        carro2.marchamoActivo = false;
        carro3.marchamoActivo = true;
        
        //Metodos
        carro1.cambioEstadoMarchamo(false);
        carro3.cambioDeMarca("Chevrolet");
        
        //Llamados al chofer
        Chofer conductor1 = new Chofer();
        Chofer conductor2 = new Chofer();
        Chofer conductor3 = new Chofer();
        
        conductor1.carroDesignado = carro1.marca;
        conductor2.carroDesignado = carro3.marca;
        conductor3.carroDesignado = carro2.marca;
        
        conductor1.nombre = "Juan";
        conductor2.nombre = "Carlos";
        conductor3.nombre = "Luis";
        
        conductor1.cedula = "402640370";
        conductor2.cedula = "103140243";
        conductor3.cedula = "607010203";
        
        conductor1.salario = 505000;
        conductor2.salario = 505000;
        conductor3.salario = 525000;
        
        //Metodos
        if(carro3.marchamoActivo == true){
            conductor1.cambioDeCarro(carro3.marca);
        }
        else{
            System.out.println("Este carro no se puede cambiar dado a que su marchamo esta vencido.");
        }
        if(carro1.marchamoActivo == true){
            conductor2.cambioDeCarro(carro1.marca);
        }
        else{
            System.out.println("Este carro no se puede cambiar dado a que su marchamo esta vencido.");
        }
        
        conductor2.salarioNeto();
        
        
        
    }
    
}
