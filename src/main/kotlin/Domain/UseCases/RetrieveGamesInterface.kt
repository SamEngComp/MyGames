package Domain.UseCases

import Domain.Models.Game
import Domain.RequestModels.InfoGamesRequestModel

interface RetrieveGamesInterface {
    fun getGames(requestModel: InfoGamesRequestModel): MutableList<Game>?
}