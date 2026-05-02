/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenfinal;

/**
 *
 * @author gonza
 */
public class cancion extends multimedia{

    
    public String artista;
    
    public cancion(String titulo, int duracion, String artista){
    
        super(titulo, duracion);
        this.artista = artista;
        
    }
            
    @Override
    public void reproducir() {
        System.out.println(titulo+" -- PLAYING...");
    }
    
}
