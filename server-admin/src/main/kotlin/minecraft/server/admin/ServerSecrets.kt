@file: JsModule("@minecraft/server-admin")

package minecraft.server.admin

/**
 * A collection of server secrets defined in dedicated server
 * configuration.
 */
open external class ServerSecrets {
    /**
     * A list of available, configured server secrets.
     */
    val names: Array<String>

    /**
     * Returns a SecretString that is a placeholder for a secret
     * configured in a JSON file. In certain objects, like an
     * HttpHeader, this Secret is resolved at the time of execution
     * but is not made available to the script environment.
     * @param name
     */
    open fun get(name: String): SecretString
}