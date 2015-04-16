package io.github.harrisonctec.dynamicframe.view;

import io.github.harrisonctec.dynamicframe.controller.Controller;
import javax.swing.JFrame;

public class Frame extends JFrame
{
	private Panel basePanel;
	private Controller baseController;
	
	public Frame(Controller baseController)
	{
		setTitle("Database");
		this.baseController = baseController;
		this.basePanel = new Panel(baseController);
		
		setupFrame();
	}
	
	
	private void setupFrame()
	{
		this.setSize(1024, 768);
		this.setContentPane(basePanel);
		this.setVisible(true);
	}
}
