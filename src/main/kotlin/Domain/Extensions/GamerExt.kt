package Domain.Extensions

import Domain.Models.Gamer

fun Gamer.createGamer(): Gamer {
    return Gamer(this.name, this.email, this.dateBirth, this.userName, this.internalId)
}