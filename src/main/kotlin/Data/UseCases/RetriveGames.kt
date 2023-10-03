package Data.UseCases

import Domain.Models.InfoGame
import Domain.UseCases.RetrieveGamesInterface

class RetriveGames: RetrieveGamesInterface {
    override fun getGames(): MutableList<InfoGame>? {
        return null
    }
}