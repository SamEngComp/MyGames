import Data.UseCases.RetrieveGamesUseCase
import Data.UseCases.RetrieveGamersUseCase

import Infra.DispatchGames
import Infra.Operation
import UI.Features.SearchGamers.SearchGamersView
import UI.Features.SearchGamers.SearchGamersViewModel

import UI.Features.SearchGames.SearchGamesView
import UI.Features.SearchGames.SearchGamesViewModel

fun main() {

    // PROPERTIES

    val dispatch = DispatchGames()
    val operation = Operation(dispatch)
    val useCase = RetrieveGamesUseCase(operation)
    val viewModel = SearchGamesViewModel(useCase)
    val view = SearchGamesView(viewModel)

    val useCaseGamers = RetrieveGamersUseCase(operation)
    val viewModelGamers = SearchGamersViewModel(useCaseGamers)
    val view2 = SearchGamersView(viewModelGamers)

}