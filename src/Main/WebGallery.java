/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author Estudiante
 */
public class WebGallery {
    private ArrayList<Obra> obras;
    private ArrayList<Artista> artistas;
    private ArrayList<Comprador> compradores;
    private OnLinePayment onlinePayment;
    private float ingresos;

    public WebGallery(OnLinePayment onlinePayment) {
        this.obras = new ArrayList<>();
        this.artistas = new ArrayList<>();
        this.compradores = new ArrayList<>();
        this.onlinePayment = onlinePayment;
    }

    public ArrayList<Obra> getObras() {
        return obras;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public ArrayList<Comprador> getCompradores() {
        return compradores;
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    public void setCompradores(ArrayList<Comprador> compradores) {
        this.compradores = compradores;
    }
    
    public void registrarArtista(Artista artista){
        this.artistas.add(artista);
        for(int i = 0; i < artista.getObras().size(); i++){
            this.obras.add(artista.getObras().get(i));
        }
    }
    
    public void registrarComprador(Comprador comprador){
        this.compradores.add(comprador);
    }
    
    public void realizarCompra(Comprador comprador, Obra obra) throws IOException{
        comprador.comprarObra(obra);
        this.onlinePayment.transferirDinero(obra.getValor());
        
        FileWriter f = new FileWriter("Informacion");
        
        f.write("Comprador: " + comprador.getNombre() + " " + comprador.getApellido() + '\n');
        f.write('\n');
        f.write("Artista: " + obra.getArtista().getNombre() + " " + obra.getArtista().getApellido() + " " + obra.getArtista().getCurriculum() + " ");
        for(int i = 0; i < obra.getArtista().getDistinciones().size(); i++){
            f.write(obra.getArtista().getDistinciones().get(i) + " ");
        }
        f.write('\n');
        f.write('\n');
        f.write(Integer.toString(obra.getArtista().getObras().size()) + '\n');
        f.write('\n');
        for(int i = 0; i < obra.getArtista().getObras().size(); i++){
            f.write("Obra " + Integer.toString(i+1) + ": " + obra.getNombre() + obra.getDescripcion() + obra.getEstilo() + Float.toString(obra.getValor()) + '\n');
        }
        
    }

    public OnLinePayment getOnlinePayment() {
        return onlinePayment;
    }

    public void setOnlinePayment(OnLinePayment onlinePayment) {
        this.onlinePayment = onlinePayment;
    }

    public float getIngresos() {
        return ingresos;
    }

    public void setIngresos(float ingresos) {
        this.ingresos = ingresos;
    }
    
    public float calcularValorObras(){
        float suma = 0;
        for(int i = 0; i < this.obras.size(); i++){
            suma+=this.obras.get(i).getValor();
        }
        return suma;
    }
    
}
