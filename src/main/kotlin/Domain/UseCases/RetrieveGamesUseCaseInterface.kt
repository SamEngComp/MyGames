package Domain.UseCases

import Domain.Models.Game

interface RetrieveGamesUseCaseInterface {
    fun getGames(): List<Game>?
}