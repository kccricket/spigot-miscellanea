package net.kccricket.spigotmiscellanea.command.commands;

import net.kccricket.spigotmiscellanea.command.VCommand;
import net.kccricket.spigotmiscellanea.zcore.enums.Message;
import net.kccricket.spigotmiscellanea.zcore.enums.Permission;
import net.kccricket.spigotmiscellanea.zcore.utils.commands.CommandType;
import net.kccricket.spigotmiscellanea.MiscellaneaPlugin;

public class CommandTemplateReload extends VCommand {

	public CommandTemplateReload(MiscellaneaPlugin plugin) {
		super(plugin);
		this.setPermission(Permission.EXAMPLE_PERMISSION_RELOAD);
		this.addSubCommand("reload", "rl");
		this.setDescription(Message.DESCRIPTION_RELOAD);
	}

	@Override
	protected CommandType perform(MiscellaneaPlugin plugin) {
		
		plugin.reloadFiles();
		message(sender, Message.RELOAD);
		
		return CommandType.SUCCESS;
	}

}
