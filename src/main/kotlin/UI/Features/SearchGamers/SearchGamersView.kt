package UI.Features.SearchGamers

import java.util.*

class SearchGamersView(val viewModel: SearchGamersViewModel) {

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
            println(viewModel.retrieveGamers())
        }
        else println("To the next!")
    }
}