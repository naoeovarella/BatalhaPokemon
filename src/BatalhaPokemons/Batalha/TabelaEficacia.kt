package BatalhaPokemons.Batalha

import BatalhaPokemons.Enums.TiposPokemon

class TabelaEficacia {

    private val superEficaz: Map<TiposPokemon, List<TiposPokemon>> = mapOf(
        TiposPokemon.FOGO to listOf(TiposPokemon.PLANTA, TiposPokemon.GELO, TiposPokemon.INSETO, TiposPokemon.METALICO),
        TiposPokemon.AGUA to listOf(TiposPokemon.FOGO, TiposPokemon.TERRA, TiposPokemon.METALICO),
        TiposPokemon.PLANTA to listOf(TiposPokemon.AGUA, TiposPokemon.TERRA),
        TiposPokemon.ELETRICO to listOf(TiposPokemon.AGUA, TiposPokemon.VOADOR),
        TiposPokemon.VOADOR to listOf(TiposPokemon.PLANTA, TiposPokemon.LUTA, TiposPokemon.INSETO),
        TiposPokemon.TERRA to listOf(TiposPokemon.FOGO, TiposPokemon.ELETRICO, TiposPokemon.METALICO, TiposPokemon.VENENOSO),
        TiposPokemon.PSIQUICO to listOf(TiposPokemon.LUTA, TiposPokemon.VENENOSO),
        TiposPokemon.LUTA to listOf(TiposPokemon.NORMAL, TiposPokemon.METALICO, TiposPokemon.SOMBRIO),
        TiposPokemon.DRAGAO to listOf(TiposPokemon.DRAGAO),
        TiposPokemon.FANTASMA to listOf(TiposPokemon.PSIQUICO, TiposPokemon.FANTASMA),
        TiposPokemon.GELO to listOf(TiposPokemon.DRAGAO, TiposPokemon.PLANTA, TiposPokemon.VOADOR, TiposPokemon.TERRA),
        TiposPokemon.VENENOSO to listOf(TiposPokemon.PLANTA, TiposPokemon.FADA),
        TiposPokemon.METALICO to listOf(TiposPokemon.FADA, TiposPokemon.GELO, TiposPokemon.INSETO),
        TiposPokemon.INSETO to listOf(TiposPokemon.PSIQUICO, TiposPokemon.PLANTA, TiposPokemon.SOMBRIO),
        TiposPokemon.SOMBRIO to listOf(TiposPokemon.PSIQUICO, TiposPokemon.FANTASMA),
        TiposPokemon.FADA to listOf(TiposPokemon.LUTA, TiposPokemon.SOMBRIO, TiposPokemon.DRAGAO)
    )

    private val poucoEficaz: Map<TiposPokemon, List<TiposPokemon>> = mapOf(
        TiposPokemon.FOGO to listOf(TiposPokemon.FOGO, TiposPokemon.AGUA, TiposPokemon.PEDRA, TiposPokemon.DRAGAO),
        TiposPokemon.AGUA to listOf(TiposPokemon.AGUA, TiposPokemon.PLANTA, TiposPokemon.DRAGAO),
        TiposPokemon.PLANTA to listOf(TiposPokemon.FOGO, TiposPokemon.PLANTA, TiposPokemon.INSETO, TiposPokemon.VOADOR, TiposPokemon.DRAGAO),
        TiposPokemon.ELETRICO to listOf(TiposPokemon.ELETRICO, TiposPokemon.PLANTA, TiposPokemon.DRAGAO),
        TiposPokemon.VOADOR to listOf(TiposPokemon.ELETRICO, TiposPokemon.METALICO),
        TiposPokemon.TERRA to listOf(TiposPokemon.PLANTA, TiposPokemon.INSETO),
        TiposPokemon.PSIQUICO to listOf(TiposPokemon.METALICO, TiposPokemon.PSIQUICO),
        TiposPokemon.LUTA to listOf(TiposPokemon.VOADOR, TiposPokemon.PSIQUICO, TiposPokemon.FADA, TiposPokemon.VENENOSO),
        TiposPokemon.DRAGAO to listOf(TiposPokemon.METALICO),
        TiposPokemon.FANTASMA to listOf(TiposPokemon.SOMBRIO),
        TiposPokemon.GELO to listOf(TiposPokemon.FOGO, TiposPokemon.AGUA, TiposPokemon.METALICO),
        TiposPokemon.VENENOSO to listOf(TiposPokemon.TERRA, TiposPokemon.FANTASMA, TiposPokemon.VENENOSO),
        TiposPokemon.METALICO to listOf(TiposPokemon.FOGO, TiposPokemon.AGUA, TiposPokemon.ELETRICO),
        TiposPokemon.INSETO to listOf(TiposPokemon.FOGO, TiposPokemon.LUTA, TiposPokemon.FANTASMA),
        TiposPokemon.SOMBRIO to listOf(TiposPokemon.LUTA, TiposPokemon.SOMBRIO, TiposPokemon.FADA),
        TiposPokemon.FADA to listOf(TiposPokemon.FOGO, TiposPokemon.METALICO, TiposPokemon.VENENOSO)
    )

    private val semEfeito: Map<TiposPokemon, List<TiposPokemon>> = mapOf(
        TiposPokemon.ELETRICO to listOf(TiposPokemon.TERRA),
        TiposPokemon.LUTA to listOf(TiposPokemon.FANTASMA),
        TiposPokemon.NORMAL to listOf(TiposPokemon.FANTASMA),
        TiposPokemon.DRAGAO to listOf(TiposPokemon.FADA),
        TiposPokemon.FANTASMA to listOf(TiposPokemon.NORMAL),
        TiposPokemon.VENENOSO to listOf(TiposPokemon.METALICO)
    )

    fun calcularMultiplicador(tipoAtaque: TiposPokemon, tipoDefensor: TiposPokemon): Double {
        return when {
            superEficaz[tipoAtaque]?.contains(tipoDefensor) == true -> 2.0
            poucoEficaz[tipoAtaque]?.contains(tipoDefensor) == true -> 0.5
            semEfeito[tipoAtaque]?.contains(tipoDefensor) == true -> 0.0
            else -> 1.0
        }
    }
}
