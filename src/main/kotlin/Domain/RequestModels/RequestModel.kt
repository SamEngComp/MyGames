package Domain.RequestModels

interface RequestModel {
    fun queryParameters(): Map<String, Any>
}