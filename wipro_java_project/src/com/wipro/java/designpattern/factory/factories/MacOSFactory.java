package com.wipro.java.designpattern.factory.factories;

import com.wipro.java.designpattern.factory.buttons.Button;
import com.wipro.java.designpattern.factory.buttons.MacOSButton;
import com.wipro.java.designpattern.factory.checkboxes.Checkbox;
import com.wipro.java.designpattern.factory.checkboxes.MacOSCheckbox;
/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new MacOSCheckbox();
	}

}
