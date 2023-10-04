package Domain.RequestModels

class InfoGamesRequestModel(val titleGame: String): RequestModel {
    override fun queryParameters(): Map<String, Any> {
        val queryParams = LinkedHashMap<String, Any>()
        queryParams["title"] = titleGame
        return queryParams
    }
}