/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.PolimorfismoPokemon.negocio;

import autonoma.PolimorfismoPokemon.models.Bulbasaur;
import autonoma.PolimorfismoPokemon.models.Charmander;
import autonoma.PolimorfismoPokemon.models.Pikachu;
import autonoma.PolimorfismoPokemon.models.Pokemon;
import autonoma.PolimorfismoPokemon.models.Squirtle;

/**
 *
 * @author Asus
 */
public class PokemonService {
    // Método para crear un Pikachu con valores predeterminados
    public Pikachu crearPikachu() {
        return new Pikachu(25, "Pikachu", 6.0, 1);
    }
    
    // Método para crear un Charmander con valores predeterminados
    public Charmander crearCharmander() {
        return new Charmander(4, "Charmander", 8.5, 1);
    }
    
    // Método para crear un Bulbasaur con valores predeterminados
    public Bulbasaur crearBulbasaur() {
        return new Bulbasaur(1, "Bulbasaur", 6.9, 1);
    }
    
    // Método para crear un Squirtle con valores predeterminados
    public Squirtle crearSquirtle() {
        return new Squirtle(7, "Squirtle", 9.0, 1);
    }
    
    // Método para realizar un ataque genérico
    public void realizarAtaqueGenerico(Pokemon pokemon) {
        // Ataques comunes disponibles para todos los Pokémon
        pokemon.atacarPlacaje();
        pokemon.atacarAranazo();
        pokemon.atacarMordisco();
    }
    
    // Métodos específicos para cada tipo de Pokémon
    public void realizarAtaquesElectricos(Pikachu pikachu) {
        pikachu.atacarImpactrueno();
        pikachu.atacarPunioTrueno();
        pikachu.atacarRayo();
        pikachu.atacarRayoCarga();
    }
    
    public void realizarAtaquesFuego(Charmander charmander) {
        charmander.atacarPunioFuego();
        charmander.atacarAscuas();
        charmander.atacarLanzallamas();
    }
    
    public void realizarAtaquesPlanta(Bulbasaur bulbasaur) {
        bulbasaur.atacarParalizar();
        bulbasaur.atacarDrenaje();
        bulbasaur.atacarHojaAfilada();
        bulbasaur.atacarLatigoCepa();
    }
    
    public void realizarAtaquesAgua(Squirtle squirtle) {
        squirtle.atacarHidrobomba();
        squirtle.atacarPistolaAgua();
        squirtle.atacarBurbuja();
        squirtle.atacarHidropulso();
    }
}

