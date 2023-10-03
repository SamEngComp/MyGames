package Data.Endpoints

import Data.Http.HttpMethod

interface Endpoint {
    fun path(): String
    fun method(): HttpMethod
}