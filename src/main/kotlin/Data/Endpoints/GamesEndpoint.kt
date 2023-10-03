package Data.Endpoints

import Data.Http.HttpMethod

enum class GamesEndpoint: Endpoint {
    retrieveGames {
        override fun path() = "https://www.cheapshark.com/api/1.0/games"
        override fun method() = HttpMethod.get
    };

    abstract override fun path(): String
    abstract override fun method(): HttpMethod
}