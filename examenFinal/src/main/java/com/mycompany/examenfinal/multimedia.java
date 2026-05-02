/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenfinal;

/**
 *
 * @author gonza
 */
public abstract class multimedia {
    
    public String titulo;
    public int duracion;
    
    public multimedia(String titulo,int duracion){
    
        this.titulo = titulo;
        this.duracion = duracion;
    
    }
    
    public abstract void reproducir();
    
}
