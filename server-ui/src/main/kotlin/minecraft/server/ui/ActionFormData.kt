@file: JsModule("@minecraft/server-ui")

package minecraft.server.ui

import minecraft.server.Player
import kotlin.js.Promise

/**
 * Builds a simple player form with buttons that let the player
 * take action.
 */
open external class ActionFormData {
    /**
     * Method that sets the body text for the modal form.
     * @param bodyText
     */
    open fun body(bodyText: String): ActionFormData

    /**
     * Adds a button to this form with an icon from a resource
     * pack.
     * @param text
     * @param iconPath
     */
    open fun button(text: String, iconPath: String = definedExternally): ActionFormData

    /**
     * Creates and shows this modal popup form. Returns
     * asynchronously when the player confirms or cancels the
     * dialog.
     * @param player
     * Player to show this dialog to.
     * @throws Error This function can throw errors.
     */
    open fun show(player: Player): Promise<ActionFormResponse>

    /**
     * This builder method sets the title for the modal dialog.
     * @param titleText
     */
    open fun title(titleText: String): ActionFormData
}