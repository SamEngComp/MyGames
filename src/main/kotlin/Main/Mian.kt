import Data.UseCases.RetrieveGameUseCase

import Infra.DispatchGames
import Infra.Operation

import UI.Features.SearchGames.SearchGameView
import UI.Features.SearchGames.SearchGameViewModel

fun main() {

    // PROPERTIES

    val dispatch = DispatchGames()
    val operation = Operation(dispatch)
    val useCase = RetrieveGameUseCase(operation)
    val viewModel = SearchGameViewModel(useCase)
    val view = SearchGameView(viewModel)

}