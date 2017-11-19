package deez.togglesneak.gui;

import java.io.IOException;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.settings.GameSettings;

public class GuiOptionsReplace extends GuiOptions
{
	private GuiButton btnToggleSneakOptions;
	
	public GuiOptionsReplace(GuiScreen parentScreen, GameSettings settings)
	{	
		super(parentScreen, settings);
	}
	
	public void initGui()
	{
		super.initGui();
		
		btnToggleSneakOptions = new GuiButton(9999, this.width /2 - 155, this.height / 6 + 42, 150, 20, "ToggleSneak Options");
		this.buttonList.add(btnToggleSneakOptions);
	}
	
	protected void actionPerformed(GuiButton buttonPressed)
	{
		try
		{
			super.actionPerformed(buttonPressed);
			
			if(buttonPressed.id == 9999)
			{
				this.mc.gameSettings.saveOptions();
				this.mc.displayGuiScreen(new GuiTSConfig(this));
			}
		}
		catch (IOException ex)
		{
			;
		}
	}
}