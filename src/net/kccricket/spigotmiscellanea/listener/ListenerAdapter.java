package net.kccricket.spigotmiscellanea.listener;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

import net.kccricket.spigotmiscellanea.zcore.utils.ZUtils;

public abstract class ListenerAdapter extends ZUtils {

	protected void onJoin(PlayerJoinEvent event, Player player) {
	}

	protected void onQuit(PlayerQuitEvent event, Player player) {
	}

	protected void onRespawn(PlayerRespawnEvent event, Player player) {
	}

	protected void onChangeWorld(PlayerChangedWorldEvent event, Player player, World worldFrom, World worldTo) {
	}

	protected void onMove(PlayerMoveEvent event, Player player) {
	}

	protected void onInventoryClick(InventoryClickEvent event, Player player) {
	}

	protected void onInventoryClose(InventoryCloseEvent event, Player player) {
	}

	protected void onInventoryDrag(InventoryDragEvent event, Player player) {
	}

	protected void onBlockBreak(BlockBreakEvent event, Player player) {
	}

	protected void onBlockPlace(BlockPlaceEvent event, Player player) {
	}

	protected void onEntityDeath(EntityDeathEvent event, Entity entity) {
	}

	protected void onInteract(PlayerInteractEvent event, Player player) {
	}

	protected void onCraftItem(CraftItemEvent event) {
	}

	protected void onCommand(PlayerCommandPreprocessEvent event, Player player, String message) {
	}

	protected void onGamemodeChange(PlayerGameModeChangeEvent event, Player player, GameMode newGameMode) {
	}

	protected void onDrop(PlayerDropItemEvent event, Player player) {
	}

	protected void onMobSpawn(CreatureSpawnEvent event) {
	}
	
	protected void onDamageByEntity(EntityDamageByEntityEvent event, DamageCause cause, double damage, LivingEntity damager,
			LivingEntity entity) {
	}

	protected void onPlayerDamagaByPlayer(EntityDamageByEntityEvent event, DamageCause cause, double damage,
			Player damager, Player entity) {
	}

	protected void onPlayerDamagaByArrow(EntityDamageByEntityEvent event, DamageCause cause, double damage,
			Projectile damager, Player entity) {
	}

	protected void onItemisOnGround(PlayerDropItemEvent event, Player player, Item item, Location location) {
	}

	protected void onItemMove(PlayerDropItemEvent event, Player player, Item item, Location location, Block block) {
	}

	protected void onPlayerWalk(PlayerMoveEvent event, Player player, int i) {
	}

	protected void onTeleport(PlayerTeleportEvent event, Player player) {
	}
}
