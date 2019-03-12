/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Estudiante
 */
public class Obra {
    private String nombre;
    private String descripcion;
    private String estilo;
    private float valor;
    private Artista artista;

    public Obra(String nombre, String descripcion, String estilo, float valor, Artista artista) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estilo = estilo;
        this.valor = valor;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstilo() {
        return estilo;
    }

    public float getValor() {
        return valor;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
    
}
