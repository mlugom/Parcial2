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
public class Comprador extends Usuario{
    private WebGallery webGallery;
    public Comprador(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public WebGallery getWebGallery() {
        return webGallery;
    }

    public void setWebGallery(WebGallery webGallery) {
        this.webGallery = webGallery;
    }
    
    public void comprarObra(Obra obra){
        this.obras.add(obra);
    }
}
