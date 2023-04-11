@file: JsModule("@minecraft/server-ui")

package minecraft.server.ui

/**
 * Returns data about player responses to a modal form.
 */
open external class ModalFormResponse : FormResponse {
    /**
     * An ordered set of values based on the order of controls
     * specified by ModalFormData.
     */
    open var formValues: Array<Any>

    /**
     * If true, the form was canceled by the player (e.g., they
     * selected the pop-up X close button).
     */
    override val isCanceled: Boolean
}