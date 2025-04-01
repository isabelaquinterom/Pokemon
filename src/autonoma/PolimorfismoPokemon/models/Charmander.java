package autonoma.PolimorfismoPokemon.models;

public class Charmander extends Pokemon implements PokemonFuego {
    
    public Charmander(int numPokedex, String nombre, double peso, int temporada) {
        super(numPokedex, nombre, peso, temporada);
    }
    
    @Override
    public void atacarPunioFuego() {
        mostrarMensaje("Puño Fuego");
    }
    
    @Override
    public void atacarAscuas() {
        mostrarMensaje("Ascuas");
    }
    
    @Override
    public void atacarLanzallamas() {
        mostrarMensaje("Lanzallamas");
    }
}