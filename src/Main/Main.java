/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) throws IOException {
        WebGallery webGallery = new WebGallery(null);
        OnLinePayment onlinePayment = new OnLinePayment(webGallery);
        webGallery.setOnlinePayment(onlinePayment);
        
        Artista artista1 = new Artista("Victor Hugo","Rodriguez", "Dedicado");
        ArrayList<String> dists = new ArrayList<>();
        dists.add("Bueno"); dists.add("Talentoso");
        artista1.setDistinciones(dists);
        artista1.crearObra("Monalisa", "Hermosa", "Modernismo", 300000);
        
        Comprador comprador1 = new Comprador("Alberto", "Carrasco");
        webGallery.registrarArtista(artista1);
        webGallery.registrarComprador(comprador1);
        webGallery.realizarCompra(comprador1, artista1.getObras().get(0));
    }
}
