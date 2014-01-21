package view;

import javax.swing.JFrame;

import controller.GUIController;

public class GUIFrame extends JFrame
{
	/**
	 * @author Spencer Davy
	 */
	private static final long serialVersionUID = 1L;

	private GUIController baseController;
	
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.setBaseController(baseController);
		basePanel = new GUIPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500, 500);
		this.setVisible(true);
	}

	public GUIController getBaseController()
	{
		return baseController;
	}

	public void setBaseController(GUIController baseController)
	{
		this.baseController = baseController;
	}
}
