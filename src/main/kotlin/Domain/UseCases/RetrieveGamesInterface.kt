package Domain.UseCases

import Domain.Models.InfoGame

interface RetrieveGamesInterface {
    fun getGames(): MutableList<InfoGame>?
}