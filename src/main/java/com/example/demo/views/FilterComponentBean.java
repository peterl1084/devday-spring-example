package com.example.demo.views;

import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.spring.events.EventBus;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@SpringComponent
@ViewScope
public class FilterComponentBean extends VerticalLayout implements FilterComponent {

	private TextField filterField;

	@Autowired
	private EventBus.ViewEventBus eventBus;

	public FilterComponentBean() {
		setMargin(false);
		filterField = new TextField("Filter");
		filterField.addValueChangeListener(e -> eventBus.publish(this, new FilterEvent()));
		
		addComponent(filterField);
	}

	@Override
	public String getFilter() {
		return filterField.getValue();
	}
}
