package Data.UseCases

import Data.Endpoints.GamesEndpoint

import Domain.Extensions.createGamer
import Domain.Models.Gamer
import Domain.UseCases.RetrieveGamersUseCaseInterface

import Infra.Operation

class RetrieveGamersUseCase(val operation: Operation): RetrieveGamersUseCaseInterface {
    override fun getGamers(): List<Gamer>? {
        var gamerList = operation.execute<Array<Gamer>>(GamesEndpoint.retrieveGamers, null)
        return gamerList?.map { gamer ->  gamer.createGamer()}
    }
}