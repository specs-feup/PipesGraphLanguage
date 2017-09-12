/*
 * generated by Xtext 2.12.0
 */
package org.xtext.pipesgraph.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.pipesgraph.ui.internal.PipesgraphActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PipesGraphExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return PipesgraphActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return PipesgraphActivator.getInstance().getInjector(PipesgraphActivator.ORG_XTEXT_PIPESGRAPH_PIPESGRAPH);
	}
	
}
