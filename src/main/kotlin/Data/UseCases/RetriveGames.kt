package Data.UseCases

import Data.Endpoints.Endpoint
import Data.Endpoints.GamesEndpoint
import Domain.Models.InfoGames
import Domain.Models.Game
import Domain.RequestModels.InfoGamesRequestModel
import Domain.UseCases.RetrieveGamesInterface
import Infra.Operation

class RetriveGames: RetrieveGamesInterface {

    val operation: Operation

    constructor(operation: Operation) {
        this.operation = operation
    }

    override fun getGames(requestModel: InfoGamesRequestModel): MutableList<Game>? {
        return operation.execute<MutableList<Game>>(GamesEndpoint.retrieveGames, requestModel)
    }
}