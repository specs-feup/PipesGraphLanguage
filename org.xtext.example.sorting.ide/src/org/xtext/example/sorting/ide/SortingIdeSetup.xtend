/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.sorting.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.sorting.SortingRuntimeModule
import org.xtext.example.sorting.SortingStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class SortingIdeSetup extends SortingStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new SortingRuntimeModule, new SortingIdeModule))
	}
	
}
