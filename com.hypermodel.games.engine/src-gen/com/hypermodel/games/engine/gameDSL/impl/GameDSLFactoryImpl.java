/**
 * generated by hypermodels.com with Xtext 2.13.0
 */
package com.hypermodel.games.engine.gameDSL.impl;

import com.hypermodel.games.engine.gameDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameDSLFactoryImpl extends EFactoryImpl implements GameDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GameDSLFactory init()
  {
    try
    {
      GameDSLFactory theGameDSLFactory = (GameDSLFactory)EPackage.Registry.INSTANCE.getEFactory(GameDSLPackage.eNS_URI);
      if (theGameDSLFactory != null)
      {
        return theGameDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GameDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GameDSLPackage.GAME_MODEL: return createGameModel();
      case GameDSLPackage.GAME_PACKAGE: return createGamePackage();
      case GameDSLPackage.GAME_PLATFORM_CONFIG: return createGamePlatformConfig();
      case GameDSLPackage.GAME_PLATFORM_CONFIG_ANDROID: return createGamePlatformConfigAndroid();
      case GameDSLPackage.GAME_PLATFORM_CONFIG_IOS: return createGamePlatformConfigIOS();
      case GameDSLPackage.GAME_PLATFORM_CONFIG_IOSMOE: return createGamePlatformConfigIOSMOE();
      case GameDSLPackage.GAME_ROOT: return createGameRoot();
      case GameDSLPackage.GAME_SCREEN: return createGameScreen();
      case GameDSLPackage.GAME_SCENE: return createGameScene();
      case GameDSLPackage.GAME_SCORE: return createGameScore();
      case GameDSLPackage.GAME_DISPLAY: return createGameDisplay();
      case GameDSLPackage.GAME_SPRITE: return createGameSprite();
      case GameDSLPackage.GAME_VECTOR2D: return createGameVector2d();
      case GameDSLPackage.GAME_SPRITE_STATE: return createGameSpriteState();
      case GameDSLPackage.GAME_BODY_PROPERTY: return createGameBodyProperty();
      case GameDSLPackage.GAME_RULE: return createGameRule();
      case GameDSLPackage.GAME_SPRITE_ANIMATION: return createGameSpriteAnimation();
      case GameDSLPackage.GAME_SPRITE_STAND: return createGameSpriteStand();
      case GameDSLPackage.GAME_TEXTURE_REGION: return createGameTextureRegion();
      case GameDSLPackage.GAME_SPRITE_EVENT: return createGameSpriteEvent();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GameDSLPackage.GAME_DISPLAY_VALUE_TYPE:
        return createGameDisplayValueTypeFromString(eDataType, initialValue);
      case GameDSLPackage.GAME_SCREEN_ORIENTATION:
        return createGameScreenOrientationFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GameDSLPackage.GAME_DISPLAY_VALUE_TYPE:
        return convertGameDisplayValueTypeToString(eDataType, instanceValue);
      case GameDSLPackage.GAME_SCREEN_ORIENTATION:
        return convertGameScreenOrientationToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameModel createGameModel()
  {
    GameModelImpl gameModel = new GameModelImpl();
    return gameModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GamePackage createGamePackage()
  {
    GamePackageImpl gamePackage = new GamePackageImpl();
    return gamePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GamePlatformConfig createGamePlatformConfig()
  {
    GamePlatformConfigImpl gamePlatformConfig = new GamePlatformConfigImpl();
    return gamePlatformConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GamePlatformConfigAndroid createGamePlatformConfigAndroid()
  {
    GamePlatformConfigAndroidImpl gamePlatformConfigAndroid = new GamePlatformConfigAndroidImpl();
    return gamePlatformConfigAndroid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GamePlatformConfigIOS createGamePlatformConfigIOS()
  {
    GamePlatformConfigIOSImpl gamePlatformConfigIOS = new GamePlatformConfigIOSImpl();
    return gamePlatformConfigIOS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GamePlatformConfigIOSMOE createGamePlatformConfigIOSMOE()
  {
    GamePlatformConfigIOSMOEImpl gamePlatformConfigIOSMOE = new GamePlatformConfigIOSMOEImpl();
    return gamePlatformConfigIOSMOE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameRoot createGameRoot()
  {
    GameRootImpl gameRoot = new GameRootImpl();
    return gameRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameScreen createGameScreen()
  {
    GameScreenImpl gameScreen = new GameScreenImpl();
    return gameScreen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameScene createGameScene()
  {
    GameSceneImpl gameScene = new GameSceneImpl();
    return gameScene;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameScore createGameScore()
  {
    GameScoreImpl gameScore = new GameScoreImpl();
    return gameScore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameDisplay createGameDisplay()
  {
    GameDisplayImpl gameDisplay = new GameDisplayImpl();
    return gameDisplay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameSprite createGameSprite()
  {
    GameSpriteImpl gameSprite = new GameSpriteImpl();
    return gameSprite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameVector2d createGameVector2d()
  {
    GameVector2dImpl gameVector2d = new GameVector2dImpl();
    return gameVector2d;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameSpriteState createGameSpriteState()
  {
    GameSpriteStateImpl gameSpriteState = new GameSpriteStateImpl();
    return gameSpriteState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameBodyProperty createGameBodyProperty()
  {
    GameBodyPropertyImpl gameBodyProperty = new GameBodyPropertyImpl();
    return gameBodyProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameRule createGameRule()
  {
    GameRuleImpl gameRule = new GameRuleImpl();
    return gameRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameSpriteAnimation createGameSpriteAnimation()
  {
    GameSpriteAnimationImpl gameSpriteAnimation = new GameSpriteAnimationImpl();
    return gameSpriteAnimation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameSpriteStand createGameSpriteStand()
  {
    GameSpriteStandImpl gameSpriteStand = new GameSpriteStandImpl();
    return gameSpriteStand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameTextureRegion createGameTextureRegion()
  {
    GameTextureRegionImpl gameTextureRegion = new GameTextureRegionImpl();
    return gameTextureRegion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameSpriteEvent createGameSpriteEvent()
  {
    GameSpriteEventImpl gameSpriteEvent = new GameSpriteEventImpl();
    return gameSpriteEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameDisplayValueType createGameDisplayValueTypeFromString(EDataType eDataType, String initialValue)
  {
    GameDisplayValueType result = GameDisplayValueType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertGameDisplayValueTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameScreenOrientation createGameScreenOrientationFromString(EDataType eDataType, String initialValue)
  {
    GameScreenOrientation result = GameScreenOrientation.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertGameScreenOrientationToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameDSLPackage getGameDSLPackage()
  {
    return (GameDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GameDSLPackage getPackage()
  {
    return GameDSLPackage.eINSTANCE;
  }

} //GameDSLFactoryImpl
