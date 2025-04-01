package autonoma.PolimorfismoPokemon.models;

public class Bulbasaur extends Pokemon implements PokemonPlanta {
    
    public Bulbasaur(int numPokedex, String nombre, double peso, int temporada) {
        super(numPokedex, nombre, peso, temporada);
    }
    
    @Override
    public void atacarParalizar() {
        mostrarMensaje("Paralizar");
    }
    
    @Override
    public void atacarDrenaje() {
        mostrarMensaje("Drenaje");
    }
    
    @Override
    public void atacarHojaAfilada() {
        mostrarMensaje("Hoja Afilada");
    }
    
    @Override
    public void atacarLatigoCepa() {
        mostrarMensaje("Latigo Cepa");
    }
}