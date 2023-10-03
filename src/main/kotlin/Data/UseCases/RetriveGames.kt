package Data.UseCases

import Domain.Models.InfoGames
import Domain.RequestModels.InfoGamesRequestModel
import Domain.UseCases.RetrieveGamesInterface

class RetriveGames: RetrieveGamesInterface {
    override fun getGames(requestModel: InfoGamesRequestModel): MutableList<InfoGames>? {
        return null
    }
}