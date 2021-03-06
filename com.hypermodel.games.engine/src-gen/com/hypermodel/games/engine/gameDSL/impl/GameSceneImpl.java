/**
 * generated by hypermodels.com with Xtext 2.13.0
 */
package com.hypermodel.games.engine.gameDSL.impl;

import com.hypermodel.games.engine.gameDSL.GameDSLPackage;
import com.hypermodel.games.engine.gameDSL.GameScene;
import com.hypermodel.games.engine.gameDSL.GameScore;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Scene</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.hypermodel.games.engine.gameDSL.impl.GameSceneImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.hypermodel.games.engine.gameDSL.impl.GameSceneImpl#isHasScore <em>Has Score</em>}</li>
 *   <li>{@link com.hypermodel.games.engine.gameDSL.impl.GameSceneImpl#getScore <em>Score</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameSceneImpl extends MinimalEObjectImpl.Container implements GameScene
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isHasScore() <em>Has Score</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasScore()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_SCORE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasScore() <em>Has Score</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasScore()
   * @generated
   * @ordered
   */
  protected boolean hasScore = HAS_SCORE_EDEFAULT;

  /**
   * The cached value of the '{@link #getScore() <em>Score</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScore()
   * @generated
   * @ordered
   */
  protected GameScore score;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GameSceneImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GameDSLPackage.Literals.GAME_SCENE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameDSLPackage.GAME_SCENE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasScore()
  {
    return hasScore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasScore(boolean newHasScore)
  {
    boolean oldHasScore = hasScore;
    hasScore = newHasScore;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameDSLPackage.GAME_SCENE__HAS_SCORE, oldHasScore, hasScore));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameScore getScore()
  {
    return score;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScore(GameScore newScore, NotificationChain msgs)
  {
    GameScore oldScore = score;
    score = newScore;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GameDSLPackage.GAME_SCENE__SCORE, oldScore, newScore);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScore(GameScore newScore)
  {
    if (newScore != score)
    {
      NotificationChain msgs = null;
      if (score != null)
        msgs = ((InternalEObject)score).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GameDSLPackage.GAME_SCENE__SCORE, null, msgs);
      if (newScore != null)
        msgs = ((InternalEObject)newScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GameDSLPackage.GAME_SCENE__SCORE, null, msgs);
      msgs = basicSetScore(newScore, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameDSLPackage.GAME_SCENE__SCORE, newScore, newScore));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GameDSLPackage.GAME_SCENE__SCORE:
        return basicSetScore(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GameDSLPackage.GAME_SCENE__NAME:
        return getName();
      case GameDSLPackage.GAME_SCENE__HAS_SCORE:
        return isHasScore();
      case GameDSLPackage.GAME_SCENE__SCORE:
        return getScore();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GameDSLPackage.GAME_SCENE__NAME:
        setName((String)newValue);
        return;
      case GameDSLPackage.GAME_SCENE__HAS_SCORE:
        setHasScore((Boolean)newValue);
        return;
      case GameDSLPackage.GAME_SCENE__SCORE:
        setScore((GameScore)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GameDSLPackage.GAME_SCENE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GameDSLPackage.GAME_SCENE__HAS_SCORE:
        setHasScore(HAS_SCORE_EDEFAULT);
        return;
      case GameDSLPackage.GAME_SCENE__SCORE:
        setScore((GameScore)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GameDSLPackage.GAME_SCENE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GameDSLPackage.GAME_SCENE__HAS_SCORE:
        return hasScore != HAS_SCORE_EDEFAULT;
      case GameDSLPackage.GAME_SCENE__SCORE:
        return score != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", hasScore: ");
    result.append(hasScore);
    result.append(')');
    return result.toString();
  }

} //GameSceneImpl
