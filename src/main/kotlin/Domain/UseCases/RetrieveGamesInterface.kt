package Domain.UseCases

import Domain.Models.InfoGames
import Domain.RequestModels.InfoGamesRequestModel

interface RetrieveGamesInterface {
    fun getGames(requestModel: InfoGamesRequestModel): MutableList<InfoGames>?
}