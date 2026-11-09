/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author Gabrieli
 */
public class ListaImpressoes {
    
    private static ArrayList<Impressao> lista = new ArrayList<>();
    
    public static void adicionar(Impressao impressao){
        lista.add(impressao);
    }
    
    public static ArrayList<Impressao> getLista(){
        return lista;
    }
    
public static void remover(int indice){
    lista.remove(indice);
}
    
public static void atualizar(int indice, Impressao impressao){
    lista.set(indice, impressao);
}

}