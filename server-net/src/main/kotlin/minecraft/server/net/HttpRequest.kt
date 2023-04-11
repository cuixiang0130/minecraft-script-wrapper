@file: JsModule("@minecraft/server-net")

package minecraft.server.net

import minecraft.server.admin.SecretString

/**
 * Main object for structuring a request.
 */
open external class HttpRequest(uri: String) {
    /**
     * Content of the body of the HTTP request.
     */
    open var body: String
    /**
     * A collection of HTTP headers to add to the outbound request.
     */
    open var headers: Array<HttpHeader>
    /**
     * HTTP method (e.g., GET or PUT or PATCH) to use for making
     * the request.
     */
    open var method: HttpRequestMethod
    /**
     * Amount of time, in seconds, before the request times out and
     * is abandoned.
     */
    open var timeout: Number
    /**
     * The HTTP resource to access.
     */
    open var uri: String
    /**
     * Adds an additional header to the overall list of headers
     * used in the corresponding HTTP request.
     * @param key
     * @param value
     */
    open fun addHeader(key: String, value: SecretString): HttpRequest
    /**
     * Adds an additional header to the overall list of headers
     * used in the corresponding HTTP request.
     * @param key
     * @param value
     */
    open fun addHeader(key: String, value: String): HttpRequest
    open fun setBody(body: String): HttpRequest
    open fun setHeaders(headers: Array<HttpHeader>): HttpRequest
    open fun setMethod(method: HttpRequestMethod): HttpRequest
    open fun setTimeout(timeout: Number): HttpRequest
}