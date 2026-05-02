/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenfinal;

/**
 *
 * @author gonza
 */
public class playlist {
    
    private nodoDoble cabeza;
    private nodoDoble cola;
    private cancion actual;
    private int tamanio;
    
    public playlist(){
    
        this.cabeza = null;
        this.cola = null;
        this.actual = null;
        this.tamanio = 0;
        
    }
    
    public void agregarCancion(cancion c){
    
        nodoDoble newNode = new nodoDoble(c);
        if(cabeza == null){
            
            cabeza = newNode;
            cola = newNode;
                
        } else {
        
            nodoDoble currentNode = cabeza;
            while(currentNode.next!=null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.prev = currentNode;
            cola = currentNode.next;
        
        }
        tamanio++;
    
    }
    
    public void mostrarPlaylist(){
    
        if(cabeza == null){
            System.out.println("COLA VACIA");      
        } else {
        
            nodoDoble currentNode = cabeza;
            while(currentNode!=null){
                System.out.println("Cancion: "+currentNode.contenido.titulo+" By: "+
                        currentNode.contenido.artista);
                currentNode = currentNode.next;
            }
        
        }
        
    }
    
}
