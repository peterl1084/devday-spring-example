package com.example.demo.views;

import com.example.demo.IsComponent;
import com.vaadin.ui.VerticalLayout;

public interface FilterComponent extends IsComponent<VerticalLayout> {

	String getFilter();

	public class FilterEvent {
	}
}
