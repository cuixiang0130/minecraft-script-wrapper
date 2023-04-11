@file: JsModule("@minecraft/server-net")

package minecraft.server.net

/**
 * Main object that contains result information from a request.
 */
open external class HttpResponse {
    /**
     * Body content of the HTTP response.
     */
    open val body: String
    /**
     * A collection of HTTP response headers returned from the
     * request.
     */
    open val headers: Array<HttpHeader>
    /**
     * Information that was used to formulate the HTTP response
     * that this object represents.
     */
    open val request: HttpRequest
    /**
     * HTTP response code for the request. For example, 404
     * represents resource not found, and 500 represents an
     * internal server error.
     */
    open val status: Number
}