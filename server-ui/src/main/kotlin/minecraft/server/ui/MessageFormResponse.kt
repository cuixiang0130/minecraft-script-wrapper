@file: JsModule("@minecraft/server-ui")

package minecraft.server.ui

/**
 * Returns data about the player results from a modal message
 * form.
 */
open external class MessageFormResponse : FormResponse {
    /**
     * If true, the form was canceled by the player (e.g., they
     * selected the pop-up X close button).
     */
    override val isCanceled: Boolean

    /**
     * Returns the index of the button that was pushed.
     */
    open val selection: Number
}