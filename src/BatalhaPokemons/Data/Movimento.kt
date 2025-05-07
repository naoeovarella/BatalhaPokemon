package BatalhaPokemons.Data

import BatalhaPokemons.Enums.TipoMovimento
import BatalhaPokemons.Enums.TiposPokemon

data class Movimento(

    val nome: String,
    val tipo: TiposPokemon,
    val tipoMovimento: TipoMovimento,
    val poder: Int,
    val precisao: Int,
    val descricao: String

) {

    fun usarAtaque(): String {
        return "$nome foi usado!"
    }
}

