/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenfinal;

/**
 *
 * @author gonza
 */
public class nodoDoble {
    
    protected cancion contenido;
    public nodoDoble next;
    public nodoDoble prev;
    
    public nodoDoble(cancion contenido){
    
        this.contenido = contenido;
        this.next = null;
        this.prev = null;
    
    }
    
}
