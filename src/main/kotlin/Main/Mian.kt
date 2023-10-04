import Data.UseCases.RetrieveGamesUseCase

import Infra.DispatchGames
import Infra.Operation

import UI.Features.SearchGames.SearchGameView
import UI.Features.SearchGames.SearchGameViewModel

fun main() {

    // PROPERTIES

    val dispatch = DispatchGames()
    val operation = Operation(dispatch)
    val useCase = RetrieveGamesUseCase(operation)
    val viewModel = SearchGameViewModel(useCase)
    val view = SearchGameView(viewModel)

}