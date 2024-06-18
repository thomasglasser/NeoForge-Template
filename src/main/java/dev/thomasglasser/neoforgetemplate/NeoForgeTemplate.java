package dev.thomasglasser.neoforgetemplate;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(NeoForgeTemplate.MOD_ID)
public class NeoForgeTemplate
{
    public static final String MOD_ID = "neoforgetemplate";
    private static final Logger LOGGER = LogUtils.getLogger();

    public NeoForgeTemplate(IEventBus modEventBus)
    {

    }
}
