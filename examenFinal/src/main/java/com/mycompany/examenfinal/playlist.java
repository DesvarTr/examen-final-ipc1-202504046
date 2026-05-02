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
    private nodoDoble actual;
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
            actual = cabeza;
            actual.contenido.reproducir();
                
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
    
    public void siguiente(){
    
        if(cabeza == null){System.out.println("Lista vacia");}
        else{
        
            if(actual == cola){
                System.out.println("Ya no hay siguientes");
                return;
            }
            actual = actual.next;
            actual.contenido.reproducir();
        
        }
    
    }
    
    public void anterior(){
    
        if(cabeza == null){System.out.println("Lista vacia");}
        else{
        
            if(actual == cabeza){
                System.out.println("Ya no hay anteriores");
                return;
            }
            actual = actual.prev;
            actual.contenido.reproducir();
        
        }
    
    }
    
    public void eliminarActual(){
    
        if(cabeza == null){
            System.out.println("Lista vacia");
        }
        // Caso cabeza
        if(actual == cabeza){
            cabeza = cabeza.next;
            cabeza.prev = null;
            actual = cabeza;
        }
        // Caso cola
        else if (actual == cola) {
        
            cola = cola.prev;
            cola.next = null;
            actual = cola;
            
        }
        // Caso intermedio
        else {
        
            actual.next.prev = actual.prev;
            actual.prev.next = actual.next;
            actual = actual.next;
            
        }
        
        tamanio--;
    
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
