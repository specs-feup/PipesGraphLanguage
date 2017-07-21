/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.sorting.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.sorting.ui.internal.SortingActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SortingExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SortingActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SortingActivator.getInstance().getInjector(SortingActivator.ORG_XTEXT_EXAMPLE_SORTING_SORTING);
	}
	
}
