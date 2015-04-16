package io.github.harrisonctec.dynamicframe.controller;

import io.github.harrisonctec.dynamicframe.view.Frame;
import io.github.harrisonctec.dynamicframe.view.Panel;
import java.awt.Container;
import java.util.ArrayList;

public class Controller
{
	private Frame baseFrame;


	public Controller()
	{
		baseFrame = new Frame(this);
	}

	public void start()
	{
		Container basePanel = baseFrame.getContentPane();
	}

}
