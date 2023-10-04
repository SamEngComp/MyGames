package UI.Features.SearchGamers

import Domain.Models.Gamer
import Domain.UseCases.RetrieveGamersUseCaseInterface

class SearchGamersViewModel(val useCase: RetrieveGamersUseCaseInterface) {

    fun retrieveGamers(): String {
        val gamers = useCase.getGamers()
        return setupListView(gamers)
    }

    private fun setupListView(gamerList: List<Gamer>?): String {
        if (gamerList.isNullOrEmpty()) return "Gamers not found"
        var gameListString = "*************************\nResult list:\n\n"

        val gamers = gamerList.toList()
        for (gamer in gamers) gameListString += "${gamer.toString()}\n\n"

        gameListString += "*************************\n"
        return gameListString
    }
}