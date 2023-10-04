package Infra

import Data.Endpoints.Endpoint

import Domain.RequestModels.RequestModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

data class Operation(val dispatch: Dispatch) {
    inline fun <reified T> execute(endpoint: Endpoint, requestModel: RequestModel?): T? {
        val response = dispatch.execute(endpoint, requestModel) ?: return null

        val json = response.body()
        val gson = Gson()

        return gson.fromJson(json, T::class.java)
    }

    inline fun <reified T> executeForList(endpoint: Endpoint, requestModel: RequestModel?): List<T>? {
        val response = dispatch.execute(endpoint, requestModel) ?: return null

        val json = response.body()
        val gson = Gson()

        val modelType = object : TypeToken<List<T>>() {}.type

        return gson.fromJson(json, modelType)
    }
}