@file:JsModule("@minecraft/server")

package server

/**
 * Contains return data on the result of a command execution.
 */
open external class CommandResult {
    /**
     * If the command operates against a number of entities,
     * blocks, or items, this returns the number of successful
     * applications of this command.
     */
    open val successCount: Number
}