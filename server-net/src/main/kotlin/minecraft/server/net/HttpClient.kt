@file: JsModule("@minecraft/server-net")

package minecraft.server.net

import kotlin.js.Promise

open external class HttpClient {
    /**
     * Cancels all pending requests.
     * @param reason
     */
    open fun cancelAll(reason: String)

    /**
     * Performs a simple HTTP get request.
     * @param uri
     * URL to make an HTTP Request to.
     * @return
     * An awaitable promise that contains the HTTP response.
     */
    open fun get(uri: String): Promise<HttpResponse>

    /**
     * Performs an HTTP request.
     * @param config
     * Contains an HTTP Request object with configuration data on
     * the HTTP request.
     * @return
     * An awaitable promise that contains the HTTP response.
     */
    open fun request(config: HttpRequest): Promise<HttpResponse>
}