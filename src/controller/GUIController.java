package controller;

import view.GUIFrame;

public class GUIController
{
	private GUIFrame appFrame;
	
	public void start()
	{
		setAppFrame(new GUIFrame(this));
	}

	public GUIFrame getAppFrame()
	{
		return appFrame;
	}

	public void setAppFrame(GUIFrame appFrame)
	{
		this.appFrame = appFrame;
	}
}
