package Data.UseCases

import Data.Endpoints.GamesEndpoint
import Domain.Models.Game
import Domain.Models.createGame

import Domain.UseCases.RetrieveGameUseCaseInterface

import Infra.Operation

class RetrieveGameUseCase(val operation: Operation) : RetrieveGameUseCaseInterface {

    override fun getGames(): List<Game>? {
        val gameList = operation.executeForList<Game>(GamesEndpoint.retrieveGames, null)
        return gameList?.map { game -> game.createGame() }
    }
}