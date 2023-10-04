package Domain.Extensions

import Domain.Models.Game

fun Game.createGame(): Game {
    return Game(this.title, this.thumb, this.price, this.description)
}