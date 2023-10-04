package Data.Endpoints

import Data.Http.HttpMethod

enum class GamesEndpoint: Endpoint {

    // CASES

    retrieveGames {
        override fun path() = "https://raw.githubusercontent.com/jeniblodev/arquivosJson/main/jogos.json"
        override fun method() = HttpMethod.get
    },

    retrieveGamers {
        override fun path() = "https://raw.githubusercontent.com/jeniblodev/arquivosJson/main/gamers.json"
        override fun method() = HttpMethod.get
    };

    // METHODS

    abstract override fun path(): String
    abstract override fun method(): HttpMethod
}