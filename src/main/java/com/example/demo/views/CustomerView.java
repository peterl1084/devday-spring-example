package com.example.demo.views;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.spring.events.EventBus;
import org.vaadin.spring.events.annotation.EventBusListenerMethod;

import com.example.demo.menu.MenuItem;
import com.example.demo.service.Customer;
import com.example.demo.views.FilterComponent.FilterEvent;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = "customers")
@MenuItem(caption = "Customers", icon = VaadinIcons.USERS)
public class CustomerView extends VerticalLayout implements View {

	@Autowired
	private Grid<Customer> customerGrid;

	@Autowired
	private FilterComponent filterComponent;

	@Autowired
	private EventBus.ViewEventBus eventBus;

	@PostConstruct
	protected void initialize() {
		setSizeFull();
		
		addComponent(filterComponent.asComponent());
		addComponent(customerGrid);
		customerGrid.setSizeFull();

		eventBus.subscribe(this);
		setExpandRatio(customerGrid, 1);
	}

	@EventBusListenerMethod
	protected void onFilterValueChange(FilterEvent filterEvent) {
		customerGrid.getDataProvider().refreshAll();
	}

	@Override
	public void enter(ViewChangeEvent event) {
	}
}
