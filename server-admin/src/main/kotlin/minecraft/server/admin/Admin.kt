@file: JsModule("@minecraft/server-admin")

package minecraft.server.admin

/**
 * A globally available object that returns a list of
 * dedicated-server configured secrets.
 */
external val secrets: ServerSecrets

/**
 * A globally available object that returns a list of
 * dedicated-server configured variables.
 */
external val variables: ServerVariables