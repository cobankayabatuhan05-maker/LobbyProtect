package me.yigit.lobbyprotect;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.Listener;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.block.BlockBreakEvent;
import cn.nukkit.event.block.BlockPlaceEvent;

public class LobbyProtect extends PluginBase implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("LobbyProtect aktif!");
    }

    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        if (!e.getPlayer().isOp()
                && e.getBlock().getLevel().getName().equalsIgnoreCase("redcastle")) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onPlace(BlockPlaceEvent e) {
        if (!e.getPlayer().isOp()
                && e.getBlock().getLevel().getName().equalsIgnoreCase("redcastle")) {
            e.setCancelled(true);
        }
    }
            }
