@file: JsModule("@minecraft/server-net")

package minecraft.server.net

external enum class HttpRequestMethod {
    /**
     * Represents the method for an HTTP PUT request. GET requests
     * are commonly used to retrieve information about a resource
     * at the specified URI.
     */
    POST /* = 0 */,
    /**
     * Represents the method for an HTTP PUT request. PUT requests
     * are commonly used to update a single resource that already
     * exists in a resource collection.
     */
    PUT /* = 1 */,
    /**
     * Represents the method for an HTTP PUT request. POST requests
     * are commonly used to create a new resource that is a
     * subordinate of the specified URI.
     */
    GET /* = 2 */,
    /**
     * Represents the method for an HTTP HEAD request. HEAD
     * requests are similar to a GET request, but are commonly used
     * to retrieve just the HTTP response headers from the
     * specified URI, and not the body contents.
     */
    DELETE /* = 3 */,
    /**
     * Represents the method for an HTTP PUT request. GET requests
     * are commonly used to retrieve information about a resource
     * at the specified URI.
     */
    HEAD /* = 4 */
}