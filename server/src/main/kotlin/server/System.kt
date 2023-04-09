@file:JsModule("@minecraft/server")

package server

/**
 * A class that provides system-level events and functions.
 */
open external class System {
    /**
     * Runs a specified function at a future time. This is
     * frequently used to implement delayed behaviors and game
     * loops.
     * @param callback
     * Function callback to run when the tickDelay time criteria is
     * met.
     * @return
     * An opaque identifier that can be used with the `clearRun`
     * function to cancel the execution of this run.
     */
    open fun run(callback: () -> Unit): Number
}