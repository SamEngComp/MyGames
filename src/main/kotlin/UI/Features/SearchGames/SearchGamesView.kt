package UI.Features.SearchGames

import java.util.Scanner

class SearchGamesView(val viewModel: SearchGamesViewModel) {

    // PROPERTIES

    val input = Scanner(System.`in`)

    // INITIALIZER

    init {
        showMenu()
    }

    // METHODS

    private fun showMenu() {
        println("Would you like to see the game list? Y/N")
        val operation = input.nextLine()

        if (operation.equals("Y", true)) {
            println(viewModel.retrieveGames())
        }
        else println("To the next!")
    }
}