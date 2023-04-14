@file: JsModule("@minecraft/server-ui")

package minecraft.server.ui

import minecraft.server.Player
import kotlin.js.Promise

/**
 * Builds a simple two-button modal dialog.
 */
open external class MessageFormData {
    /**
     * Method that sets the body text for the modal form.
     * @param bodyText
     */
    open fun body(bodyText: String): MessageFormData

    /**
     * Method that sets the text for the first button of the
     * dialog.
     * @param text
     */
    open fun button1(text: String): MessageFormData

    /**
     * This method sets the text for the second button on the
     * dialog.
     * @param text
     */
    open fun button2(text: String): MessageFormData

    /**
     * Creates and shows this modal popup form. Returns
     * asynchronously when the player confirms or cancels the
     * dialog.
     * @param player
     * Player to show this dialog to.
     * @throws Error This function can throw errors.
     */
    open fun show(player: Player): Promise<MessageFormResponse>

    /**
     * This builder method sets the title for the modal dialog.
     * @param titleText
     */
    open fun title(titleText: String): MessageFormData
}