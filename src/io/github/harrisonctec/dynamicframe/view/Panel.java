package io.github.harrisonctec.dynamicframe.view;

import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import io.github.harrisonctec.dynamicframe.controller.Controller;

public class Panel
{
	private Controller baseController;
	private SpringLayout baseLayout;
	JScrollPane displayPane;

	public Panel(Controller baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.displayPane = new JScrollPane();

	}

}
