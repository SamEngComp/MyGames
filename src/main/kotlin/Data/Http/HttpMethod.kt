package Data.Http

enum class HttpMethod(val valueString: String) {
    get("GET"),
    put("PUT"),
    post("POST"),
    delete("DELETE");
}