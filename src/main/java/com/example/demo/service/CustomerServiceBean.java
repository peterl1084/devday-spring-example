package com.example.demo.service;

import java.util.Collections;
import java.util.List;

import com.vaadin.spring.annotation.SpringComponent;

@SpringComponent
public class CustomerServiceBean implements CustomerService {

	@Override
	public List<Customer> getCustomers(String filter, int offset, int count) {
		System.out.println(
				"Invoking customer service with filter: " + filter + " offset: " + offset + " count: " + count);
		return Collections.emptyList();
	}

	@Override
	public int countCustomers(String filter) {
		System.out.println("Invoking customer service with filter: " + filter);
		return 0;
	}
}
