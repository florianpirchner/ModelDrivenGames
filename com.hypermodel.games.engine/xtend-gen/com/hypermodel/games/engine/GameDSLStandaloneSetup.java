/**
 * generated by Xtext 2.12.0
 */
package com.hypermodel.games.engine;

import com.hypermodel.games.engine.GameDSLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class GameDSLStandaloneSetup extends GameDSLStandaloneSetupGenerated {
  public static void doSetup() {
    new GameDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}