package BatalhaPokemons.Services

import BatalhaPokemons.Pokemon.Pokemon

object PokemonService {
    val pokemonsDisponiveis = Pokemon.todosPokemons.values
        .mapIndexed { index, pokemon -> index + 1 to pokemon }
        .toMap()


    fun exibirPokemons(pokemonsNumerados: Map<Int, Pokemon>) {
        pokemonsNumerados.forEach { (index, pokemon) ->
            println("$index - ${pokemon.nome}")
        }
    }
}



