/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Artista extends Usuario{
    private String curriculum;
    private ArrayList<String> distinciones;

    public Artista(String nombre, String apellido, String curriculum) {
        super(nombre, apellido);
        this.curriculum = curriculum;
        this.distinciones = new ArrayList<>();
    }

    public String getCurriculum() {
        return curriculum;
    }

    public ArrayList<String> getDistinciones() {
        return distinciones;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public void setDistinciones(ArrayList<String> distinciones) {
        this.distinciones = distinciones;
    }
    
    public void crearObra(String nombre, String descripcion, String estilo, float valor){
        this.obras.add(new Obra(nombre,descripcion,estilo,valor,this));
    }
}
