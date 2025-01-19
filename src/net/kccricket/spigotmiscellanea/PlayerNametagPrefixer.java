package net.kccricket.spigotmiscellanea;

import org.bukkit.GameMode;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

import com.nametagedit.plugin.NametagEdit;
import com.nametagedit.plugin.api.INametagApi;

import net.kccricket.spigotmiscellanea.listener.ListenerAdapter;

public class PlayerNametagPrefixer extends ListenerAdapter {
    private final INametagApi nametagAPI;

    PlayerNametagPrefixer() {
        this.nametagAPI = NametagEdit.getApi();
    }

    protected void onGamemodeChange(PlayerGameModeChangeEvent event, Player player, GameMode newGameMode) {
        this.updateNametag(player, newGameMode);
    }

    protected void onJoin(PlayerJoinEvent event, Player player) {
        this.updateNametag(player, player.getGameMode());
    }

    protected void onRespawn(PlayerRespawnEvent event, Player player) {
        this.updateNametag(player, player.getGameMode());
    }

    protected void onChangeWorld(PlayerChangedWorldEvent event, Player player, World worldFrom, World worldTo) {
        this.updateNametag(player, player.getGameMode());
    }

    private void updateNametag(Player player, GameMode newGameMode) {
        if (!player.isOnline()) {
            return;
        }
        
        switch (newGameMode) {
            case SURVIVAL:
                this.nametagAPI.setPrefix(player, "&c❤ &r");   
                break;
            case CREATIVE:
                this.nametagAPI.setPrefix(player, "&aΩ &r");
                break;
            case ADVENTURE:
                this.nametagAPI.setPrefix(player, "&c💘 &r");
                break;
            default:
                this.nametagAPI.setPrefix(player, "");
                break;
        }
    }
}
