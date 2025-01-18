package net.kccricket.spigotmiscellanea.command.commands;

import net.kccricket.spigotmiscellanea.command.VCommand;
import net.kccricket.spigotmiscellanea.zcore.enums.Permission;
import net.kccricket.spigotmiscellanea.zcore.utils.commands.CommandType;
import net.kccricket.spigotmiscellanea.MiscellaneaPlugin;

public class CommandTemplate extends VCommand {

	public CommandTemplate(MiscellaneaPlugin plugin) {
		super(plugin);
		this.setPermission(Permission.EXAMPLE_PERMISSION);
		this.addSubCommand(new CommandTemplateReload(plugin));
	}

	@Override
	protected CommandType perform(MiscellaneaPlugin plugin) {
		syntaxMessage();
		return CommandType.SUCCESS;
	}

}
