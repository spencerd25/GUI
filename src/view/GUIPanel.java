package view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import controller.GUIController;

public class GUIPanel extends JPanel
{
	/**
	 * @author Spencer Davy
	 */
	private static final long serialVersionUID = 1L;
	private GUIController baseController;
	private SpringLayout baseLayout;
	private JButton firstButton;
	private JButton secondButton;
	
	public GUIPanel(GUIController baseController)
	{
		this.setBaseController(baseController);
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("my first button!!!!");
		secondButton = new JButton("wow I made a second button!");
		
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(secondButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -250, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -280, SpringLayout.EAST, this);
		
		baseLayout.putConstraint(SpringLayout.NORTH, secondButton, 0, SpringLayout.NORTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, secondButton, 27, SpringLayout.EAST, firstButton);
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
