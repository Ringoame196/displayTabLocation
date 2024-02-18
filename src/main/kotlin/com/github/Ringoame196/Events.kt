package com.github.Ringoame196

import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent
import org.bukkit.plugin.Plugin

class Events() : Listener {
    @EventHandler
    fun onPlayerMove(e: PlayerMoveEvent) {
        val player = e.player
        val location = player.location
        val targetBlock = player.getTargetBlock(null, 10)
        val x = location.x.toInt()
        val y = location.y.toInt()
        val z = location.z.toInt()
        player.setPlayerListHeaderFooter("${ChatColor.AQUA}[座標]", "${ChatColor.YELLOW}x:$x,y:$y,z:$z ブロック:${targetBlock.type}")
    }
}
