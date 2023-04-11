@file: JsModule("@minecraft/server-admin")

package minecraft.server.admin

/**
 * A collection of server variables defined in dedicated server
 * configuration.
 */
open external class ServerVariables {
    /**
     * A list of available, configured server variables.
     */
    val names: Array<String>

    /**
     * Returns the value of variable that has been configured in a
     * dedicated server configuration JSON file.
     * @param name
     */
    open fun get(name: String): Any
}