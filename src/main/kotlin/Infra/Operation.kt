package Infra

import Data.Endpoints.Endpoint
import Domain.RequestModels.RequestModel
import com.google.gson.Gson

data class Operation(val dispatch: Dispatch) {
    inline fun <reified T> execute(endpoint: Endpoint, requestModel: RequestModel): T? {
        val response = dispatch.execute(endpoint, requestModel) ?: return null

        val json = response.body()
        val gson = Gson()
        val model = gson.fromJson(json, T::class.java)
        return model
    }
}