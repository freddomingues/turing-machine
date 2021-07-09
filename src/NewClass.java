/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fred_
 */
public class NewClass {
    
    public static String dobrar(int lista[]){
        for(int i = 0; i < lista.length; i++){
            lista[i] = lista[i] * 2;
        }
        return ""+lista;
    }
    
    public static void exibir(int[] lista){
        for(Integer x : lista){
            System.out.print(x + ",");
        }
    }
    
    public static void main(String[] args) {
        int[] lista = {1,2,3,4};
        exibir(lista);
        System.out.println("");
        dobrar(lista);
        exibir(lista);
    }    
}
