
package dev.cozi.grimscaffold;

import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;
import dev.cozi.addon.modules.Movement.GrimScaffold;

public class GrimScaffoldAddon extends MeteorAddon {
    @Override
    public void onInitialize() {
        Modules.get().add(new GrimScaffold());
    }

    @Override
    public String getPackage() {
        return "dev.cozi.grimscaffold";
    }
}
