@file: JsModule("@minecraft/server-net")

package minecraft.server.net

import minecraft.server.admin.SecretString

/**
 * Represents an HTTP header - a key/value pair of
 * meta-information about a request.
 */
open external class HttpHeader {
    /**
     * Key of the HTTP header.
     */
    open var key: String
    /**
     * Value of the HTTP header.
     */
    open var value: dynamic /* minecraftserveradmin.SecretString | String */

    constructor(key: String, value: SecretString)
    constructor(key: String, value: String)
}