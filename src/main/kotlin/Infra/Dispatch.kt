package Infra

import Data.Endpoints.Endpoint
import Domain.RequestModels.RequestModel

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

interface Dispatch {
    fun execute(endpoint: Endpoint, requestModel: RequestModel?): HttpResponse<String>?
}

class DispatchGames: Dispatch {

    private fun buildURI(endpoint: Endpoint, requestModel: RequestModel?): URI? {
        var address = endpoint.path()

        if (requestModel != null) {
            address += "?"
            val queryParams = requestModel.queryParameters()

            for (query in queryParams) address += "$query&"
            address = address.dropLast(1)
        }

        return URI.create(address) ?: null
    }

    override fun execute(endpoint: Endpoint, requestModel: RequestModel?): HttpResponse<String>? {
        val uri: URI = buildURI(endpoint, requestModel) ?: return null

        val client: HttpClient = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .uri(uri)
            .build()

        return client
            .send(request, HttpResponse.BodyHandlers.ofString())
    }
}