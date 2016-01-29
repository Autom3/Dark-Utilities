package net.darkhax.darkutils.client;

import net.darkhax.darkutils.addons.thaumcraft.DarkUtilsThaumcraftAddon;
import net.darkhax.darkutils.blocks.BlockFilter;
import net.darkhax.darkutils.blocks.BlockTrapEffect;
import net.darkhax.darkutils.common.ProxyCommon;
import net.darkhax.darkutils.handler.ContentHandler;
import net.darkhax.darkutils.items.ItemMaterial;
import net.darkhax.darkutils.items.ItemMysteriousPotion;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ProxyClient extends ProxyCommon {
    
    @Override
    public void onPreInit () {
        
        Item item;
        
        item = Item.getItemFromBlock(ContentHandler.blockTrap);
        
        for (BlockTrapEffect.EnumType varient : BlockTrapEffect.EnumType.values())
            ModelLoader.setCustomModelResourceLocation(item, varient.meta, new ModelResourceLocation("darkutils:trap_" + varient.type, "inventory"));
            
        item = Item.getItemFromBlock(ContentHandler.blockEnderTether);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation("darkutils:ender_tether", "inventory"));
        
        item = Item.getItemFromBlock(ContentHandler.blockTrapMovement);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation("darkutils:trap_move", "inventory"));
        
        item = Item.getItemFromBlock(ContentHandler.blockGrate);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation("darkutils:grate", "inventory"));
        
        item = Item.getItemFromBlock(ContentHandler.blockFilter);
        for (BlockFilter.EnumType varient : BlockFilter.EnumType.values())
            ModelLoader.setCustomModelResourceLocation(item, varient.meta, new ModelResourceLocation("darkutils:filter_" + varient.type, "inventory"));
            
        item = Item.getItemFromBlock(ContentHandler.blockTimer);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation("darkutils:timer", "inventory"));
        
        item = Item.getItemFromBlock(ContentHandler.blockAntiSlime);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation("darkutils:anti_slime", "inventory"));
        
        for (int materialMeta = 0; materialMeta < ItemMaterial.varients.length; materialMeta++)
            ModelLoader.setCustomModelResourceLocation(ContentHandler.itemMaterial, materialMeta, new ModelResourceLocation("darkutils:material_" + ItemMaterial.varients[materialMeta], "inventory"));
            
        for (int meta = 0; meta < ItemMysteriousPotion.varients.length; meta++)
            ModelLoader.setCustomModelResourceLocation(ContentHandler.itemPotion, meta, new ModelResourceLocation("bottle_drinkable", "inventory"));
    }
    
    @Override
    public void onInit () {
    
    }
    
    @Override
    public void onPostInit () {
    
    }
    
    @Override
    public void thaumcraftPreInit () {
        
        ModelLoader.setCustomModelResourceLocation(DarkUtilsThaumcraftAddon.deathSword, 0, new ModelResourceLocation("darkutils:sword_death", "inventory"));
    }
}
