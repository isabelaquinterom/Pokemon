/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.PolimorfismoPokemon.models;

/**
 *
 * @author Asus Isabela Quintero
 * 
 */
public abstract class Pokemon {
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected int temporada;
    
    // Constructor
    public Pokemon(int numPokedex, String nombre, double peso, int temporada) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.temporada = temporada;
    }
    
    // Métodos comunes
    public void atacarPlacaje() {
        mostrarMensaje("Placaje");
    }
    
    public void atacarAranazo() {
        mostrarMensaje("Arañazo");
    }
    
    public void atacarMordisco() {
        mostrarMensaje("Mordisco");
    }
    
    // Método para mostrar mensajes
    public void mostrarMensaje(String ataque) {
        System.out.println("Soy " + nombre + " y estoy atacando con " + ataque);
    }
    
    // Getters y setters
    public int getNumPokedex() {
        return numPokedex;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public int getTemporada() {
        return temporada;
    }
}
    

