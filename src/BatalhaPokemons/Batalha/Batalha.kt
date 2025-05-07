package BatalhaPokemons.Batalha

import BatalhaPokemons.Pokemon.Pokemon
import kotlin.random.Random

class Batalha(private val pokemon1: Pokemon, private val pokemon2: Pokemon) {

    fun iniciar() {
        println("🔥 Batalha entre ${pokemon1.nome} e ${pokemon2.nome} começou!\n")

        val vencedor = if (Random.nextBoolean()) pokemon1 else pokemon2

        println("🏆 ${vencedor.nome} venceu a batalha!")
    }
}
