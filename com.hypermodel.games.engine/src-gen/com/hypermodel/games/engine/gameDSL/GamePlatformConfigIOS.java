/**
 * generated by hypermodels.com with Xtext 2.13.0
 */
package com.hypermodel.games.engine.gameDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Platform Config IOS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.hypermodel.games.engine.gameDSL.GamePlatformConfigIOS#isUseAccelerometer <em>Use Accelerometer</em>}</li>
 * </ul>
 *
 * @see com.hypermodel.games.engine.gameDSL.GameDSLPackage#getGamePlatformConfigIOS()
 * @model
 * @generated
 */
public interface GamePlatformConfigIOS extends EObject
{
  /**
   * Returns the value of the '<em><b>Use Accelerometer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use Accelerometer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use Accelerometer</em>' attribute.
   * @see #setUseAccelerometer(boolean)
   * @see com.hypermodel.games.engine.gameDSL.GameDSLPackage#getGamePlatformConfigIOS_UseAccelerometer()
   * @model
   * @generated
   */
  boolean isUseAccelerometer();

  /**
   * Sets the value of the '{@link com.hypermodel.games.engine.gameDSL.GamePlatformConfigIOS#isUseAccelerometer <em>Use Accelerometer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Use Accelerometer</em>' attribute.
   * @see #isUseAccelerometer()
   * @generated
   */
  void setUseAccelerometer(boolean value);

} // GamePlatformConfigIOS
