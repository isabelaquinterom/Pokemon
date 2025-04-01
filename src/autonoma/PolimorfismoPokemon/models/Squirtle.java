package autonoma.PolimorfismoPokemon.models;

public class Squirtle extends Pokemon implements PokemonAgua {
    
    public Squirtle(int numPokedex, String nombre, double peso, int temporada) {
        super(numPokedex, nombre, peso, temporada);
    }
    
    @Override
    public void atacarHidrobomba() {
        mostrarMensaje("Hidrobomba");
    }
    
    @Override
    public void atacarPistolaAgua() {
        mostrarMensaje("Pistola Agua");
    }
    
    @Override
    public void atacarBurbuja() {
        mostrarMensaje("Burbuja");
    }
    
    @Override
    public void atacarHidropulso() {
        mostrarMensaje("Hidropulso");
    }
}
