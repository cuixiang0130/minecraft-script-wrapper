@file: JsModule("@minecraft/server-ui")

package minecraft.server.ui

/**
 * Base type for a form response.
 */
open external class FormResponse {
    /**
     * If true, the form was canceled by the player (e.g., they
     * selected the pop-up X close button).
     */
    open val isCanceled: Boolean
}