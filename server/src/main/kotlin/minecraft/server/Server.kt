@file:JsModule("@minecraft/server")

package minecraft.server

/**
 * A class that provides system-level events and functions.
 */
external val system: System

/**
 * A class that wraps the state of a world - a set of
 * dimensions and the environment of Minecraft.
 */
external val world: World