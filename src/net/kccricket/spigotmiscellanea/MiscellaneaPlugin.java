package net.kccricket.spigotmiscellanea;

import net.kccricket.spigotmiscellanea.placeholder.LocalPlaceholder;
import net.kccricket.spigotmiscellanea.save.Config;
import net.kccricket.spigotmiscellanea.save.MessageLoader;
import net.kccricket.spigotmiscellanea.zcore.ZPlugin;

/**
 * System to create your plugins very simply Projet:
 * <a href="https://github.com/Maxlego08/TemplatePlugin">https://github.com/Maxlego08/TemplatePlugin</a>
 *
 * @author Maxlego08
 */
public class MiscellaneaPlugin extends ZPlugin {

    @Override
    public void onEnable() {
        LocalPlaceholder placeholder = LocalPlaceholder.getInstance();
        placeholder.setPrefix("miscellanea");

        this.preEnable();

        this.addListener(new PlayerNametagPrefixer());

        this.addSave(Config.getInstance());
        this.addSave(new MessageLoader(this));

        this.loadFiles();
        this.postEnable();
    }

    @Override
    public void onDisable() {

        this.preDisable();

        this.saveFiles();

        this.postDisable();
    }

}
