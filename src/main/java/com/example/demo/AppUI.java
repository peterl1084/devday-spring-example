package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.menu.MainMenu;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;

@SpringUI
public class AppUI extends UI {

	@Autowired
	private MainMenu mainMenu;

	@Autowired
	private AppViewDisplay viewDisplay;

	@Override
	protected void init(VaadinRequest request) {
		setSizeFull();

		HorizontalLayout layout = new HorizontalLayout();
		layout.setSizeFull();

		layout.addComponent(mainMenu.asComponent());
		viewDisplay.setSizeFull();

		layout.addComponent(viewDisplay);

		layout.setExpandRatio(mainMenu.asComponent(), 1);
		layout.setExpandRatio(viewDisplay, 5);

		setContent(layout);
	}
}
