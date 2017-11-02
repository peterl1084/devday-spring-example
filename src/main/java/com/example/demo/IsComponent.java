package com.example.demo;

import com.vaadin.ui.Component;

public interface IsComponent<C extends Component> {

	@SuppressWarnings("unchecked")
	default C asComponent() {
		return (C) this;
	}
}
