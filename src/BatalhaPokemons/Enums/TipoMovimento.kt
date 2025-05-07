package BatalhaPokemons.Enums

import BatalhaPokemons.Data.Movimento

enum class TipoMovimento {
    FISICO,
    ESPECIAL,
    ESTADO;

    object ListaMovimentos {
        val movimentos = listOf(
            // Fogo
            Movimento("Lança-Chamas", TiposPokemon.FOGO, ESPECIAL, 90, 100, "Pode causar queimadura"),
            Movimento("Brasa", TiposPokemon.FOGO, ESPECIAL, 40, 100, "Ataque básico de fogo"),

            // Água
            Movimento("Jato d'Água", TiposPokemon.AGUA, ESPECIAL, 40, 100, "Ataque básico de água"),
            Movimento("Hidro Bomba", TiposPokemon.AGUA, ESPECIAL, 110, 80, "Muito poderoso, mas com baixa precisão"),

            // Grama
            Movimento("Chicote de Vinha", TiposPokemon.PLANTA, FISICO, 45, 100, "Ataque físico com vinhas"),
            Movimento("Folha Navalha", TiposPokemon.PLANTA, ESPECIAL, 55, 95, "Pode causar crítico com mais facilidade"),

            // Elétrico
            Movimento("Choque do Trovão", TiposPokemon.ELETRICO, ESPECIAL, 40, 100, "Pode paralisar o alvo"),
            Movimento("Raio", TiposPokemon.ELETRICO, ESPECIAL, 90, 100, "Ataque elétrico forte com chance de paralisar"),

            // Terra
            Movimento("Terremoto", TiposPokemon.TERRA, FISICO, 100, 100, "Dano alto a todos os Pokémon em campo"),
            Movimento("Ataque de Areia", TiposPokemon.TERRA, ESTADO, 0, 100, "Reduz a precisão do alvo"),

            // Sombrio
            Movimento("Mordida", TiposPokemon.SOMBRIO, FISICO, 60, 100, "Pode causar flinch"),
            Movimento("Pulso Sombrio", TiposPokemon.SOMBRIO, ESPECIAL, 80, 100, "Pode causar flinch"),

            //  Rocha
            Movimento("Deslizamento de Pedras", TiposPokemon.PEDRA, FISICO, 75, 90, "Pode causar flinch"),
            Movimento("Pedra Afiada", TiposPokemon.PEDRA, FISICO, 100, 80, "Grande chance de acerto crítico"),

            //  Voador
            Movimento("Ataque de Asa", TiposPokemon.VOADOR, FISICO, 60, 100, "Ataque físico com as asas"),
            Movimento("Furacão", TiposPokemon.VOADOR, ESPECIAL, 110, 70, "Pode confundir o alvo"),

            //  Lutador
            Movimento("Soco Forte", TiposPokemon.LUTA, FISICO, 80, 100, "Ataque direto com força total"),
            Movimento("Chute Circular", TiposPokemon.LUTA, FISICO, 60, 95, "Pode causar flinch"),

            //  Fantasma
            Movimento("Bola Sombria", TiposPokemon.FANTASMA, ESPECIAL, 80, 100, "Pode reduzir a defesa especial"),
            Movimento("Assombração", TiposPokemon.FANTASMA, FISICO, 60, 100, "Ataque furtivo com dano direto"),

            //  Gelo
            Movimento("Raio Congelante", TiposPokemon.GELO, ESPECIAL, 90, 100, "Pode congelar o alvo"),
            Movimento("Neve em Pó", TiposPokemon.GELO, ESPECIAL, 40, 100, "Ataque básico de gelo"),

            //  Metálico
            Movimento("Cabeça de Ferro", TiposPokemon.METALICO, FISICO, 80, 100, "Pode causar flinch"),
            Movimento("Canhão de Flash", TiposPokemon.METALICO, ESPECIAL, 80, 100, "Ataque de energia metálica"),

            //  Dragão
            Movimento("Fúria do Dragão", TiposPokemon.DRAGAO, ESPECIAL, 85, 100, "Explosão dracônica poderosa"),
            Movimento("Garra de Dragão", TiposPokemon.DRAGAO, FISICO, 80, 100, "Ataque físico com garras afiadas"),

            //  Inseto
            Movimento("Corte X", TiposPokemon.INSETO, FISICO, 80, 100, "Ataque cortante"),
            Movimento("Picada Venenosa", TiposPokemon.INSETO, FISICO, 50, 100, "Pode envenenar o alvo"),

            //  Fada
            Movimento("Brilho Mágico", TiposPokemon.FADA, ESPECIAL, 80, 100, "Ataque encantado que nunca erra"),
            Movimento("Beijo Drenante", TiposPokemon.FADA, ESPECIAL, 50, 100, "Recupera parte do dano causado"),
            
            // Estado / Utilitários
            Movimento("Dança das Espadas", TiposPokemon.NORMAL, ESTADO, 0, 100, "Aumenta muito o ataque do usuário"),
            Movimento("Reflexo", TiposPokemon.PSIQUICO, ESTADO, 0, 100, "Reduz dano de ataques físicos"),
            Movimento("Barreira de Luz", TiposPokemon.PSIQUICO, ESTADO, 0, 100, "Reduz dano de ataques especiais"),
            Movimento("Cura Total", TiposPokemon.NORMAL, ESTADO, 0, 100, "Remove todos os status do usuário")
        )

        fun getMovimentosPorTipo(tipo: TiposPokemon): List<Movimento> {
            return movimentos.filter { it.tipo == tipo }
        }
    }
}