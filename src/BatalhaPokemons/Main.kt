package BatalhaPokemons

import BatalhaPokemons.Batalha.Batalha
import BatalhaPokemons.Data.Jogador
import BatalhaPokemons.Pokemon.Pokemon
import BatalhaPokemons.Services.PokemonService.pokemonsDisponiveis

fun main() {
    pokemonsDisponiveis.values.toList().forEachIndexed { index, pokemon ->
        println("${index + 1}: ${pokemon.nome}")
    }

    println("Jogador 1, digite seu nickname:")
    val nickname1 = readln().trim()
    val jogador1 = Jogador(nickname1)

    println("Jogador 2, digite seu nickname:")
    val nickname2 = readln().trim()
    val jogador2 = Jogador(nickname2)

    montarTime(jogador1, pokemonsDisponiveis)
    montarTime(jogador2, pokemonsDisponiveis)

    println("\nTimes montados:")
    println("${jogador1.nickname}: ${jogador1.time.map { it.nome }}")
    println("${jogador2.nickname}: ${jogador2.time.map { it.nome }}")

    val pokemon1 = jogador1.time.random()
    val pokemon2 = jogador2.time.random()

    println("\n⚔️ Batalha entre ${pokemon1.nome} (${jogador1.nickname}) e ${pokemon2.nome} (${jogador2.nickname})!")

    val batalha = Batalha(pokemon1, pokemon2)
    batalha.iniciar()
}

fun montarTime(jogador: Jogador, pokemonsDisponiveis: Map<Int, Pokemon>) {
    while (jogador.time.size < Jogador.LIMITE_TIME) {
        println("\n${jogador.nickname}, escolha seu Pokémon (${jogador.time.size + 1}/${Jogador.LIMITE_TIME}):")
        pokemonsDisponiveis.forEach { (numero, pokemon) ->
            println("$numero - ${pokemon.nome} (${pokemon.tipo.joinToString(", ")})")
        }

        print("Digite o número do Pokémon: ")
        val escolha = readln().trim().toIntOrNull()

        if (escolha != null && pokemonsDisponiveis.containsKey(escolha)) {
            val pokemonEscolhido = pokemonsDisponiveis[escolha]!!
            jogador.adicionarPokemon(pokemonEscolhido)
        } else {
            println("Escolha inválida. Tente novamente.")
        }
    }
}
