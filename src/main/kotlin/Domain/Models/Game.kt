package Domain.Models

import com.google.gson.annotations.SerializedName

data class Game(@SerializedName("titulo") val title: String,
                @SerializedName("capa") val thumb: String,
                @SerializedName("preco") val price: Double,
                @SerializedName("descricao") var description: String) {

    override fun toString(): String {
        return "Chosen game: $title\n" +
                "Thumb URL: $thumb\n" +
                "Price: $price" +
                "Description: $description"
    }
}

fun Game.createGame(): Game {
    return Game(this.title, this.thumb, this.price, this.description)
}