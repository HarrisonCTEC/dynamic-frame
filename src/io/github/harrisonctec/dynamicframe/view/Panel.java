package io.github.harrisonctec.dynamicframe.view;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.*;

import io.github.harrisonctec.dynamicframe.controller.Controller;

public class Panel extends JPanel
{
	private Controller baseController;
	private SpringLayout baseLayout;
	JScrollPane displayPane;

	public Panel(Controller baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.displayPane = new JScrollPane();
		setupPanel();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		int startOffset = 0;
		
		for(int count = 0; count < 5; count++)
		{
			JLabel test = new JLabel("" + count + " label");
			JTextField textField = new JTextField(10);
			this.add(test);
			this.add(textField);
			baseLayout.putConstraint(SpringLayout.NORTH, test, startOffset, SpringLayout.NORTH, displayPane);
			startOffset += 20;
			baseLayout.putConstraint(SpringLayout.NORTH, textField, startOffset, SpringLayout.NORTH, displayPane);
			startOffset += 50;

		}
	}
	
	private void setupListeners()
	{
		ArrayList<JTextField> myTextFields = new ArrayList<JTextField>();
		for(Component current : this.getComponents())
		{
			if(current instanceof JTextField)
			{
				myTextFields.add((JTextField) current);
			}
		}
	}

}
