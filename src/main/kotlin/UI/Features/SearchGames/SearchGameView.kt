package UI.Features.SearchGames

import java.util.Scanner

class SearchGameView(val viewModel: SearchGameViewModel) {

    // PROPERTIES

    val input = Scanner(System.`in`)

    // INITIALIZER

    init {
        showMenu()
    }

    // METHODS

    private fun showMenu() {
        println("Want to search for a game? Y/N")
        val operation = input.nextLine()

        if (operation.equals("Y", true)) {
            println("Enter the game title?")
            val title = input.nextLine()
            viewModel.retrieveGame(title)
        }
        else println("To the next!")
    }
}