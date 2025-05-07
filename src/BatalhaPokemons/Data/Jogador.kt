package BatalhaPokemons.Data

import BatalhaPokemons.Pokemon.Pokemon

data class Jogador(val nickname: String, val time: MutableList<Pokemon> = mutableListOf()) {
    fun adicionarPokemon(pokemon: Pokemon) {
        if (time.size < LIMITE_TIME) {
            time.add(pokemon)
        } else {
            println("Limite de Pokémon atingido para $nickname!")
        }
    }

    fun mostrarTime() {
        println("Time de $nickname:")
        time.forEach { println("- ${it.nome}") }
    }

    companion object {
        const val LIMITE_TIME = 5
    }
}

