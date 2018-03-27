/**
 * generated by hypermodels.com with Xtext 2.13.0
 */
package com.hypermodel.games.engine.gameDSL.impl;

import com.hypermodel.games.engine.gameDSL.GameDSLPackage;
import com.hypermodel.games.engine.gameDSL.GameDisplay;
import com.hypermodel.games.engine.gameDSL.GameDisplayValueType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Display</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.hypermodel.games.engine.gameDSL.impl.GameDisplayImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.hypermodel.games.engine.gameDSL.impl.GameDisplayImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.hypermodel.games.engine.gameDSL.impl.GameDisplayImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link com.hypermodel.games.engine.gameDSL.impl.GameDisplayImpl#isHasInitial <em>Has Initial</em>}</li>
 *   <li>{@link com.hypermodel.games.engine.gameDSL.impl.GameDisplayImpl#getInitialNumberValue <em>Initial Number Value</em>}</li>
 *   <li>{@link com.hypermodel.games.engine.gameDSL.impl.GameDisplayImpl#getInitialIntValue <em>Initial Int Value</em>}</li>
 *   <li>{@link com.hypermodel.games.engine.gameDSL.impl.GameDisplayImpl#getInitialStringValue <em>Initial String Value</em>}</li>
 *   <li>{@link com.hypermodel.games.engine.gameDSL.impl.GameDisplayImpl#isHasDelta <em>Has Delta</em>}</li>
 *   <li>{@link com.hypermodel.games.engine.gameDSL.impl.GameDisplayImpl#getDeltaValue <em>Delta Value</em>}</li>
 *   <li>{@link com.hypermodel.games.engine.gameDSL.impl.GameDisplayImpl#getTimePeriod <em>Time Period</em>}</li>
 *   <li>{@link com.hypermodel.games.engine.gameDSL.impl.GameDisplayImpl#isHasAdder <em>Has Adder</em>}</li>
 *   <li>{@link com.hypermodel.games.engine.gameDSL.impl.GameDisplayImpl#isHasSetter <em>Has Setter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameDisplayImpl extends MinimalEObjectImpl.Container implements GameDisplay
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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final GameDisplayValueType TYPE_EDEFAULT = GameDisplayValueType.INT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected GameDisplayValueType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected static final String FORMAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected String format = FORMAT_EDEFAULT;

  /**
   * The default value of the '{@link #isHasInitial() <em>Has Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasInitial()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_INITIAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasInitial() <em>Has Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasInitial()
   * @generated
   * @ordered
   */
  protected boolean hasInitial = HAS_INITIAL_EDEFAULT;

  /**
   * The default value of the '{@link #getInitialNumberValue() <em>Initial Number Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialNumberValue()
   * @generated
   * @ordered
   */
  protected static final float INITIAL_NUMBER_VALUE_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getInitialNumberValue() <em>Initial Number Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialNumberValue()
   * @generated
   * @ordered
   */
  protected float initialNumberValue = INITIAL_NUMBER_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getInitialIntValue() <em>Initial Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialIntValue()
   * @generated
   * @ordered
   */
  protected static final int INITIAL_INT_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInitialIntValue() <em>Initial Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialIntValue()
   * @generated
   * @ordered
   */
  protected int initialIntValue = INITIAL_INT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getInitialStringValue() <em>Initial String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialStringValue()
   * @generated
   * @ordered
   */
  protected static final String INITIAL_STRING_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInitialStringValue() <em>Initial String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialStringValue()
   * @generated
   * @ordered
   */
  protected String initialStringValue = INITIAL_STRING_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isHasDelta() <em>Has Delta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasDelta()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_DELTA_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasDelta() <em>Has Delta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasDelta()
   * @generated
   * @ordered
   */
  protected boolean hasDelta = HAS_DELTA_EDEFAULT;

  /**
   * The default value of the '{@link #getDeltaValue() <em>Delta Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeltaValue()
   * @generated
   * @ordered
   */
  protected static final float DELTA_VALUE_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getDeltaValue() <em>Delta Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeltaValue()
   * @generated
   * @ordered
   */
  protected float deltaValue = DELTA_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getTimePeriod() <em>Time Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimePeriod()
   * @generated
   * @ordered
   */
  protected static final float TIME_PERIOD_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getTimePeriod() <em>Time Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimePeriod()
   * @generated
   * @ordered
   */
  protected float timePeriod = TIME_PERIOD_EDEFAULT;

  /**
   * The default value of the '{@link #isHasAdder() <em>Has Adder</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasAdder()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_ADDER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasAdder() <em>Has Adder</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasAdder()
   * @generated
   * @ordered
   */
  protected boolean hasAdder = HAS_ADDER_EDEFAULT;

  /**
   * The default value of the '{@link #isHasSetter() <em>Has Setter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasSetter()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_SETTER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasSetter() <em>Has Setter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasSetter()
   * @generated
   * @ordered
   */
  protected boolean hasSetter = HAS_SETTER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GameDisplayImpl()
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
    return GameDSLPackage.Literals.GAME_DISPLAY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GameDSLPackage.GAME_DISPLAY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameDisplayValueType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(GameDisplayValueType newType)
  {
    GameDisplayValueType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameDSLPackage.GAME_DISPLAY__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFormat()
  {
    return format;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormat(String newFormat)
  {
    String oldFormat = format;
    format = newFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameDSLPackage.GAME_DISPLAY__FORMAT, oldFormat, format));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasInitial()
  {
    return hasInitial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasInitial(boolean newHasInitial)
  {
    boolean oldHasInitial = hasInitial;
    hasInitial = newHasInitial;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameDSLPackage.GAME_DISPLAY__HAS_INITIAL, oldHasInitial, hasInitial));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getInitialNumberValue()
  {
    return initialNumberValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialNumberValue(float newInitialNumberValue)
  {
    float oldInitialNumberValue = initialNumberValue;
    initialNumberValue = newInitialNumberValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameDSLPackage.GAME_DISPLAY__INITIAL_NUMBER_VALUE, oldInitialNumberValue, initialNumberValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getInitialIntValue()
  {
    return initialIntValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialIntValue(int newInitialIntValue)
  {
    int oldInitialIntValue = initialIntValue;
    initialIntValue = newInitialIntValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameDSLPackage.GAME_DISPLAY__INITIAL_INT_VALUE, oldInitialIntValue, initialIntValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInitialStringValue()
  {
    return initialStringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialStringValue(String newInitialStringValue)
  {
    String oldInitialStringValue = initialStringValue;
    initialStringValue = newInitialStringValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameDSLPackage.GAME_DISPLAY__INITIAL_STRING_VALUE, oldInitialStringValue, initialStringValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasDelta()
  {
    return hasDelta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasDelta(boolean newHasDelta)
  {
    boolean oldHasDelta = hasDelta;
    hasDelta = newHasDelta;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameDSLPackage.GAME_DISPLAY__HAS_DELTA, oldHasDelta, hasDelta));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getDeltaValue()
  {
    return deltaValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeltaValue(float newDeltaValue)
  {
    float oldDeltaValue = deltaValue;
    deltaValue = newDeltaValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameDSLPackage.GAME_DISPLAY__DELTA_VALUE, oldDeltaValue, deltaValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getTimePeriod()
  {
    return timePeriod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimePeriod(float newTimePeriod)
  {
    float oldTimePeriod = timePeriod;
    timePeriod = newTimePeriod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameDSLPackage.GAME_DISPLAY__TIME_PERIOD, oldTimePeriod, timePeriod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasAdder()
  {
    return hasAdder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasAdder(boolean newHasAdder)
  {
    boolean oldHasAdder = hasAdder;
    hasAdder = newHasAdder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameDSLPackage.GAME_DISPLAY__HAS_ADDER, oldHasAdder, hasAdder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasSetter()
  {
    return hasSetter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasSetter(boolean newHasSetter)
  {
    boolean oldHasSetter = hasSetter;
    hasSetter = newHasSetter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameDSLPackage.GAME_DISPLAY__HAS_SETTER, oldHasSetter, hasSetter));
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
      case GameDSLPackage.GAME_DISPLAY__NAME:
        return getName();
      case GameDSLPackage.GAME_DISPLAY__TYPE:
        return getType();
      case GameDSLPackage.GAME_DISPLAY__FORMAT:
        return getFormat();
      case GameDSLPackage.GAME_DISPLAY__HAS_INITIAL:
        return isHasInitial();
      case GameDSLPackage.GAME_DISPLAY__INITIAL_NUMBER_VALUE:
        return getInitialNumberValue();
      case GameDSLPackage.GAME_DISPLAY__INITIAL_INT_VALUE:
        return getInitialIntValue();
      case GameDSLPackage.GAME_DISPLAY__INITIAL_STRING_VALUE:
        return getInitialStringValue();
      case GameDSLPackage.GAME_DISPLAY__HAS_DELTA:
        return isHasDelta();
      case GameDSLPackage.GAME_DISPLAY__DELTA_VALUE:
        return getDeltaValue();
      case GameDSLPackage.GAME_DISPLAY__TIME_PERIOD:
        return getTimePeriod();
      case GameDSLPackage.GAME_DISPLAY__HAS_ADDER:
        return isHasAdder();
      case GameDSLPackage.GAME_DISPLAY__HAS_SETTER:
        return isHasSetter();
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
      case GameDSLPackage.GAME_DISPLAY__NAME:
        setName((String)newValue);
        return;
      case GameDSLPackage.GAME_DISPLAY__TYPE:
        setType((GameDisplayValueType)newValue);
        return;
      case GameDSLPackage.GAME_DISPLAY__FORMAT:
        setFormat((String)newValue);
        return;
      case GameDSLPackage.GAME_DISPLAY__HAS_INITIAL:
        setHasInitial((Boolean)newValue);
        return;
      case GameDSLPackage.GAME_DISPLAY__INITIAL_NUMBER_VALUE:
        setInitialNumberValue((Float)newValue);
        return;
      case GameDSLPackage.GAME_DISPLAY__INITIAL_INT_VALUE:
        setInitialIntValue((Integer)newValue);
        return;
      case GameDSLPackage.GAME_DISPLAY__INITIAL_STRING_VALUE:
        setInitialStringValue((String)newValue);
        return;
      case GameDSLPackage.GAME_DISPLAY__HAS_DELTA:
        setHasDelta((Boolean)newValue);
        return;
      case GameDSLPackage.GAME_DISPLAY__DELTA_VALUE:
        setDeltaValue((Float)newValue);
        return;
      case GameDSLPackage.GAME_DISPLAY__TIME_PERIOD:
        setTimePeriod((Float)newValue);
        return;
      case GameDSLPackage.GAME_DISPLAY__HAS_ADDER:
        setHasAdder((Boolean)newValue);
        return;
      case GameDSLPackage.GAME_DISPLAY__HAS_SETTER:
        setHasSetter((Boolean)newValue);
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
      case GameDSLPackage.GAME_DISPLAY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GameDSLPackage.GAME_DISPLAY__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case GameDSLPackage.GAME_DISPLAY__FORMAT:
        setFormat(FORMAT_EDEFAULT);
        return;
      case GameDSLPackage.GAME_DISPLAY__HAS_INITIAL:
        setHasInitial(HAS_INITIAL_EDEFAULT);
        return;
      case GameDSLPackage.GAME_DISPLAY__INITIAL_NUMBER_VALUE:
        setInitialNumberValue(INITIAL_NUMBER_VALUE_EDEFAULT);
        return;
      case GameDSLPackage.GAME_DISPLAY__INITIAL_INT_VALUE:
        setInitialIntValue(INITIAL_INT_VALUE_EDEFAULT);
        return;
      case GameDSLPackage.GAME_DISPLAY__INITIAL_STRING_VALUE:
        setInitialStringValue(INITIAL_STRING_VALUE_EDEFAULT);
        return;
      case GameDSLPackage.GAME_DISPLAY__HAS_DELTA:
        setHasDelta(HAS_DELTA_EDEFAULT);
        return;
      case GameDSLPackage.GAME_DISPLAY__DELTA_VALUE:
        setDeltaValue(DELTA_VALUE_EDEFAULT);
        return;
      case GameDSLPackage.GAME_DISPLAY__TIME_PERIOD:
        setTimePeriod(TIME_PERIOD_EDEFAULT);
        return;
      case GameDSLPackage.GAME_DISPLAY__HAS_ADDER:
        setHasAdder(HAS_ADDER_EDEFAULT);
        return;
      case GameDSLPackage.GAME_DISPLAY__HAS_SETTER:
        setHasSetter(HAS_SETTER_EDEFAULT);
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
      case GameDSLPackage.GAME_DISPLAY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GameDSLPackage.GAME_DISPLAY__TYPE:
        return type != TYPE_EDEFAULT;
      case GameDSLPackage.GAME_DISPLAY__FORMAT:
        return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
      case GameDSLPackage.GAME_DISPLAY__HAS_INITIAL:
        return hasInitial != HAS_INITIAL_EDEFAULT;
      case GameDSLPackage.GAME_DISPLAY__INITIAL_NUMBER_VALUE:
        return initialNumberValue != INITIAL_NUMBER_VALUE_EDEFAULT;
      case GameDSLPackage.GAME_DISPLAY__INITIAL_INT_VALUE:
        return initialIntValue != INITIAL_INT_VALUE_EDEFAULT;
      case GameDSLPackage.GAME_DISPLAY__INITIAL_STRING_VALUE:
        return INITIAL_STRING_VALUE_EDEFAULT == null ? initialStringValue != null : !INITIAL_STRING_VALUE_EDEFAULT.equals(initialStringValue);
      case GameDSLPackage.GAME_DISPLAY__HAS_DELTA:
        return hasDelta != HAS_DELTA_EDEFAULT;
      case GameDSLPackage.GAME_DISPLAY__DELTA_VALUE:
        return deltaValue != DELTA_VALUE_EDEFAULT;
      case GameDSLPackage.GAME_DISPLAY__TIME_PERIOD:
        return timePeriod != TIME_PERIOD_EDEFAULT;
      case GameDSLPackage.GAME_DISPLAY__HAS_ADDER:
        return hasAdder != HAS_ADDER_EDEFAULT;
      case GameDSLPackage.GAME_DISPLAY__HAS_SETTER:
        return hasSetter != HAS_SETTER_EDEFAULT;
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
    result.append(", type: ");
    result.append(type);
    result.append(", format: ");
    result.append(format);
    result.append(", hasInitial: ");
    result.append(hasInitial);
    result.append(", initialNumberValue: ");
    result.append(initialNumberValue);
    result.append(", initialIntValue: ");
    result.append(initialIntValue);
    result.append(", initialStringValue: ");
    result.append(initialStringValue);
    result.append(", hasDelta: ");
    result.append(hasDelta);
    result.append(", deltaValue: ");
    result.append(deltaValue);
    result.append(", timePeriod: ");
    result.append(timePeriod);
    result.append(", hasAdder: ");
    result.append(hasAdder);
    result.append(", hasSetter: ");
    result.append(hasSetter);
    result.append(')');
    return result.toString();
  }

} //GameDisplayImpl