package Domain.Models

data class InfoGames(val info: Game) {
    override fun toString(): String {
        return info.toString()
    }
}