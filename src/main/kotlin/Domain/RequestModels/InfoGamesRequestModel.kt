package Domain.RequestModels

class InfoGamesRequestModel(val titleGame: String): RequestModel {
    override fun queryParameters(): Map<String, Any> {
        var queryParams = LinkedHashMap<String, Any>()
        queryParams["title"] = titleGame
        return queryParams
    }
}