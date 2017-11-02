package com.example.demo.views;

import com.example.demo.menu.MenuItem;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = "")
@MenuItem(caption = "Home", icon = VaadinIcons.HOME)
public class HomeView extends VerticalLayout implements View {

	public HomeView() {
		addComponent(new Label("Home view"));
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}
}
