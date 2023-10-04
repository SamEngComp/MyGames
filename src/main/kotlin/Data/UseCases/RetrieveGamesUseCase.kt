package Data.UseCases

import Data.Endpoints.GamesEndpoint

import Domain.Models.Game
import Domain.Extensions.createGame
import Domain.UseCases.RetrieveGamesUseCaseInterface

import Infra.Operation

class RetrieveGamesUseCase(val operation: Operation) : RetrieveGamesUseCaseInterface {

    override fun getGames(): List<Game>? {
        val gameList = operation.execute<Array<Game>>(GamesEndpoint.retrieveGames, null)
        return gameList?.map { game -> game.createGame() }
    }
}