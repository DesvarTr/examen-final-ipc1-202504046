package com.mycompany.examenfinal;

/**
 *
 * @author gonza
 */
public class ExamenFinal {

    public static void main(String[] args) {
        
        cancion song1 = new cancion("Enamorado tuyo",180,"CDN");
        cancion song2 = new cancion("Highway to hell",190,"AC/DC");
        cancion song3 = new cancion("Robot",180,"Esteman");
        
        playlist lista = new playlist();
        lista.agregarCancion(song1);
        lista.agregarCancion(song2);
        lista.agregarCancion(song3);
        
        lista.mostrarPlaylist();
        
        lista.siguiente();
        lista.siguiente();
        lista.anterior();
        lista.mostrarPlaylist();
        lista.eliminarActual();
        lista.eliminarActual();
        lista.eliminarActual();
        
        lista.mostrarPlaylist();
        
    }
}
