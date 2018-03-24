/*
 * generated by hypermodels.com with Xtext 2.13.0
 */
package com.hypermodel.games.engine.ui;

import com.google.inject.Injector;
import com.hypermodel.games.engine.ui.internal.EngineActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GameDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(EngineActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		EngineActivator activator = EngineActivator.getInstance();
		return activator != null ? activator.getInjector(EngineActivator.COM_HYPERMODEL_GAMES_ENGINE_GAMEDSL) : null;
	}

}
