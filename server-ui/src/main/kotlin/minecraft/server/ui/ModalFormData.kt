@file: JsModule("@minecraft/server-ui")

package minecraft.server.ui

import minecraft.server.Player
import kotlin.js.Promise

/**
 * Used to create a fully customizable pop-up form for a
 * player.
 */
open external class ModalFormData {
    /**
     * Adds a dropdown with choices to the form.
     * @param label
     * @param options
     * @param defaultValueIndex
     */
    open fun dropdown(
        label: String,
        options: Array<String>,
        defaultValueIndex: Number = definedExternally
    ): ModalFormData

    /**
     * Adds an icon to the form using a graphic resource from a
     * resource pack.
     * @param iconPath
     */
    open fun icon(iconPath: String): ModalFormData

    /**
     * Creates and shows this modal popup form. Returns
     * asynchronously when the player confirms or cancels the
     * dialog.
     * @param player
     * Player to show this dialog to.
     * @throws Error
     * This function can throw errors.
     */
    open fun show(player: Player): Promise<ModalFormResponse>

    /**
     * Adds a numeric slider to the form.
     * @param label
     * @param minimumValue
     * @param maximumValue
     * @param valueStep
     * @param defaultValue
     */
    open fun slider(
        label: String,
        minimumValue: Number,
        maximumValue: Number,
        valueStep: Number,
        defaultValue: Number = definedExternally
    ): ModalFormData

    /**
     * Adds a textbox to the form.
     * @param label
     * @param placeholderText
     * @param defaultValue
     */
    open fun textField(label: String, placeholderText: String, defaultValue: String = definedExternally): ModalFormData

    /**
     * This builder method sets the title for the modal dialog.
     * @param titleText
     */
    open fun title(titleText: String): ModalFormData

    /**
     * Adds a toggle checkbox button to the form.
     * @param label
     * @param defaultValue
     */
    open fun toggle(label: String, defaultValue: Boolean = definedExternally): ModalFormData
}