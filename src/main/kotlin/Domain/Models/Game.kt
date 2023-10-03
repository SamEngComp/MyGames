package Domain.Models

data class Game(val title: String,
                val thumb: String) {

    var description: String? = null

    override fun toString(): String {
        var gameReport = "Chosen game: $title\n" + "Thumb URL: $thumb\n"
        if (description?.isBlank() == true) gameReport += "Description: $description"
        return gameReport
    }
}