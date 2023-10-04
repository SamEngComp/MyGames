package UI.Features.SearchGames

import Domain.Models.Game
import Domain.UseCases.RetrieveGamesUseCaseInterface

class SearchGamesViewModel(val useCase: RetrieveGamesUseCaseInterface) {

    // METHODS

    fun retrieveGames(): String {
        val result = useCase.getGames()
        return setupListView(result)
    }

    private fun setupListView(gameList: List<Game>?): String {
        if (gameList.isNullOrEmpty()) return "Game not found"
        var gameListString = "*************************\nResult list:\n\n"

        val games = gameList.toList()
        for (game in games) gameListString += "${game.toString()}\n\n"

        gameListString += "*************************\n"
        return gameListString
    }
}