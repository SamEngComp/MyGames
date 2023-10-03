package Domain.RequestModels

class InfoGamesRequestModel(val gameId: String): RequestModel {
    override fun queryParameters(): Map<String, Any> {
        var queryParams = LinkedHashMap<String, Any>()
        queryParams["id"] = gameId
        return queryParams
    }
}