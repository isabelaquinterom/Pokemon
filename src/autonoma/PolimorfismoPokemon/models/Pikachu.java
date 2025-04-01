package autonoma.PolimorfismoPokemon.models;

public class Pikachu extends Pokemon implements PokemonElectrico {
    
    public Pikachu(int numPokedex, String nombre, double peso, int temporada) {
        super(numPokedex, nombre, peso, temporada);
    }
    
    @Override
    public void atacarImpactrueno() {
        mostrarMensaje("Impactrueno");
    }
    
    @Override
    public void atacarPunioTrueno() {
        mostrarMensaje("Puño Trueno");
    }
    
    @Override
    public void atacarRayo() {
        mostrarMensaje("Rayo");
    }
    
    @Override
    public void atacarRayoCarga() {
        mostrarMensaje("Rayo Carga");
    }
}
