package Domain.Models

data class InfoGame(val info: Game) {
    override fun toString(): String {
        return info.toString()
    }
}