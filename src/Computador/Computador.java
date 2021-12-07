/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computador;

/**
 *
 * @author IFSC
 */
public class Computador {
    private MemoriaRAM memoriaram;
    private HD hd;
    private Processador processador;
    private PlacaDeVideo placadevideo;
    
    public void pc(){
        memoriaram = new MemoriaRAM();
        hd = new HD();
        processador = new Processador();
        placadevideo = new PlacaDeVideo();
    }
        void imprimeDados(){
        System.out.println("---------PC---------");
        System.out.println("Quantidade de nucleos: "+processador);
        System.out.println("Modelo da placa de video: "+placadevideo);
        System.out.println("Quantidade de RAM: "+memoriaram);
        System.out.println("Tamanho do HD: "+hd);
    }
        
}
