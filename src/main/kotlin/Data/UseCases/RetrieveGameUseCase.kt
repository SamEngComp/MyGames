package Data.UseCases

import Data.Endpoints.GamesEndpoint
import Domain.Models.Game
import Domain.RequestModels.InfoGamesRequestModel
import Domain.UseCases.RetrieveGameUseCaseInterface
import Infra.Operation

class RetrieveGameUseCase: RetrieveGameUseCaseInterface {

    val operation: Operation

    constructor(operation: Operation) {
        this.operation = operation
    }

    override fun getGames(requestModel: InfoGamesRequestModel): MutableList<Game>? {
        return operation.execute<MutableList<Game>>(GamesEndpoint.retrieveGames, requestModel)
    }
}