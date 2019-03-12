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
public class OnLinePayment {
    private WebGallery webGallery;

    public OnLinePayment(WebGallery webGallery) {
        this.webGallery = webGallery;
    }

    public WebGallery getWebGallery() {
        return webGallery;
    }

    public void setWebGallery(WebGallery webGallery) {
        this.webGallery = webGallery;
    }
    
    public void transferirDinero(float dinero){
        this.webGallery.setIngresos(this.webGallery.getIngresos()+dinero);
    }
}
