package UI.Features.SearchGames

import Domain.Models.Game
import Domain.UseCases.RetrieveGameUseCaseInterface

class SearchGameViewModel(val useCase: RetrieveGameUseCaseInterface) {

    // METHODS

    fun retrieveGame(): String {
        val result = useCase.getGames()
        return setupListView(result)
    }

    fun setupListView(gameList: List<Game>?): String {
        if (gameList.isNullOrEmpty()) return "Game not found"
        var gameListString = "*************************\nResult list:\n\n"

        val games = gameList.toList()
        for (game in games) gameListString += "${game.toString()}\n\n"

        gameListString += "*************************\n"
        return gameListString
    }
}