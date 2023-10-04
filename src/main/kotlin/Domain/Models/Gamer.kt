package Domain.Models

import com.google.gson.annotations.SerializedName

data class Gamer(@SerializedName("nome") val name: String,
                 val email: String,
                 @SerializedName("dataNascimento") val dateBirth: String,
                 @SerializedName("usuario") val userName: String,
                 @SerializedName("idInterno") val internalId: String) {
    override fun toString(): String {
        return "Name: $name\n" +
                "E-mail: $email\n" +
                "User name: $userName\n" +
                "Date birth: $dateBirth"

    }
}