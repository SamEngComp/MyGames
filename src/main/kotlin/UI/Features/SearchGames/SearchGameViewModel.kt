package UI.Features.SearchGames

import Domain.Models.Game
import Domain.RequestModels.InfoGamesRequestModel
import Domain.UseCases.RetrieveGameUseCaseInterface

class SearchGameViewModel(val useCase: RetrieveGameUseCaseInterface) {

    // METHODS

    fun retrieveGame(title: String): String {
        val result = useCase.getGames(InfoGamesRequestModel(title))
        return setupListView(result)
    }

    fun setupListView(gameList: MutableList<Game>?): String {
        if (gameList.isNullOrEmpty()) return "Game not found"
        var gameListString = "*************************\n" + "Result list:\n"
        for (game in gameList) {
            gameListString += game.toString() + "\n"
        }
        gameListString += "*************************\n"
        return gameListString
    }
}