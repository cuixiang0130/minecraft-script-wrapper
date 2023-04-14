import minecraft.server.MinecraftDimensionTypes
import minecraft.server.system
import minecraft.server.world

var curTick = 0

fun tick() {
    if (curTick % 100 == 0) {
        world.getDimension(MinecraftDimensionTypes.overworld).runCommandAsync("tell @a hello")
        world.getAllPlayers().forEach {
            it.runCommandAsync("say ${it.name}")
        }
    }
    curTick++
    system.run(::tick)
}

fun main() {
    system.run(::tick)
}

