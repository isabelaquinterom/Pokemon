/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.PolimorfismoPokemon.main;

/**
 *
 * @author Asus
 */
public class PolimorfismoPokemon  {
    public static void PolimosrfimoPokemon(String[]args){
        // Crear instancia del servicio
        PokemonService pokemonService = new PokemonService();
        
        // Crear instancias de Pokémon
        Pikachu pikachu = pokemonService.crearPikachu();
        Charmander charmander = pokemonService.crearCharmander();
        Bulbasaur bulbasaur = pokemonService.crearBulbasaur();
        Squirtle squirtle = pokemonService.crearSquirtle();
        
        System.out.println("=== Demostración de ataques de Pikachu ===");
        pokemonService.realizarAtaqueGenerico(pikachu);
        pokemonService.realizarAtaquesElectricos(pikachu);
        
        System.out.println("\n=== Demostración de ataques de Charmander ===");
        pokemonService.realizarAtaqueGenerico(charmander);
        pokemonService.realizarAtaquesFuego(charmander);
        
        System.out.println("\n=== Demostración de ataques de Bulbasaur ===");
        pokemonService.realizarAtaqueGenerico(bulbasaur);
        pokemonService.realizarAtaquesPlanta(bulbasaur);
        
        System.out.println("\n=== Demostración de ataques de Squirtle ===");
        pokemonService.realizarAtaqueGenerico(squirtle);
        pokemonService.realizarAtaquesAgua(squirtle);
    }
}
    
    

