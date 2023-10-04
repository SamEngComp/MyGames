package Domain.UseCases

import Domain.Models.Gamer

interface RetrieveGamersUseCaseInterface {
    fun getGamers(): List<Gamer>?
}