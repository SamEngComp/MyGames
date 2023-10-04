package Domain.UseCases

import Domain.Models.Game

interface RetrieveGameUseCaseInterface {
    fun getGames(): List<Game>?
}