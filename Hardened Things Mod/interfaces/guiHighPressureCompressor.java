package EasyCompressorMod.interfaces;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import EasyCompressorMod.tileentity.tileEntityHighPressureCompressor;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@SideOnly(Side.CLIENT)
public class guiHighPressureCompressor extends GuiContainer{
	
	private ItemStack[] items;

	public guiHighPressureCompressor(InventoryPlayer invPlayer, tileEntityHighPressureCompressor lpc) {
		
		super(new containerHighPressureCompressor(invPlayer, lpc));
		
		xSize = 176;
		ySize = 154;
	}
	
	private static final ResourceLocation texture = new ResourceLocation("easycompressor", "textures/gui/highPressureCompressorGUI.png");

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1, 1, 1, 1);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
	    drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	
	}
	
	//In the GUI the Top Name
	@Override
	protected void drawGuiContainerForegroundLayer(int x, int y) {
		fontRenderer.drawString("   High Pressure Compressor", 8, 6, 0x404040);
	}
	/*
	
	@Override
	public void initGui() {
		super.initGui();
		buttonList.clear();        //ID     Rechts      Unten      Laenge/Hoehe des Buttons
		buttonList.add(new GuiButton(0, guiLeft + 75, guiTop + 45, 60, 20, "Compress"));
	                                                                         //Text im Button
	}    
	//Was gemacht wird wenn Button gedrueckt wird
	@Override
	protected void actionPerformed(GuiButton button) {
		if(button.id == 0){		
			
		}
	} 
	
	*/

}
