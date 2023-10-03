package Infra

import Data.Endpoints.Endpoint
import Domain.RequestModels.RequestModel

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

interface Dispatch {
    fun execute(endpoint: Endpoint, requestModel: RequestModel): HttpResponse<String>?
}

class DispatchGames: Dispatch {

    fun buildURI(endpoint: Endpoint, requestModel: RequestModel): URI {
        var address = endpoint.path() + "?"
        val queryParams = requestModel.queryParameters()
        for (key in queryParams) address += "$key=$queryParams&"

        address.removeRange(address.lastIndex, address.length)

        return URI.create(address)
    }

    override fun execute(endpoint: Endpoint, requestModel: RequestModel): HttpResponse<String>? {
        var uri: URI? = null
        var response: HttpResponse<String>? = null

        val createURI = runCatching {
            uri = this.buildURI(endpoint, requestModel)
        }

        createURI.onSuccess {
            val client: HttpClient = HttpClient.newHttpClient()
            val request = HttpRequest.newBuilder()
                .uri(uri)
                .build()

            response = client
                .send(request, HttpResponse.BodyHandlers.ofString())
        }

        return response
    }
}