/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.PolimorfismoPokemon.main;

import autonoma.PolimorfismoPokemon.models.Bulbasaur;
import autonoma.PolimorfismoPokemon.models.Charmander;
import autonoma.PolimorfismoPokemon.models.Pikachu;
import autonoma.PolimorfismoPokemon.models.Squirtle;
import autonoma.PolimorfismoPokemon.negocio.PokemonService;

/**
 *
 * @author Asus
 */
public class PolimorfismoPokemon  {
    public static void main (String[]args){
        // Crear instancia del servicio
        PokemonService pokemonService = new PokemonService();
        
        // Crear instancias de Pokémon
        Pikachu pikachu = pokemonService.crearPikachu();
        Charmander charmander = pokemonService.crearCharmander();
        Bulbasaur bulbasaur = pokemonService.crearBulbasaur();
        Squirtle squirtle = pokemonService.crearSquirtle();
        
        System.out.println("=== Demostracion de ataques de Pikachu ===");
        pokemonService.realizarAtaqueGenerico(pikachu);
        pokemonService.realizarAtaquesElectricos(pikachu);
        
        System.out.println("\n=== Demostracion de ataques de Charmander ===");
        pokemonService.realizarAtaqueGenerico(charmander);
        pokemonService.realizarAtaquesFuego(charmander);
        
        System.out.println("\n=== Demostracion de ataques de Bulbasaur ===");
        pokemonService.realizarAtaqueGenerico(bulbasaur);
        pokemonService.realizarAtaquesPlanta(bulbasaur);
        
        System.out.println("\n=== Demostracion de ataques de Squirtle ===");
        pokemonService.realizarAtaqueGenerico(squirtle);
        pokemonService.realizarAtaquesAgua(squirtle);
    }
}
    
    

