/**
 */
package ecore_homework1.1.homework1_1.impl;

import ecore_homework1.1.homework1_1.Homework1_1Package;
import ecore_homework1.1.homework1_1.LandingPage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landing Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore_homework1.1.homework1_1.impl.LandingPageImpl#getWelcomeMessage <em>Welcome Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LandingPageImpl extends WebpageImpl implements LandingPage
{
	/**
	 * The default value of the '{@link #getWelcomeMessage() <em>Welcome Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWelcomeMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String WELCOME_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWelcomeMessage() <em>Welcome Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWelcomeMessage()
	 * @generated
	 * @ordered
	 */
	protected String welcomeMessage = WELCOME_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandingPageImpl()
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
		return Homework1_1Package.Literals.LANDING_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWelcomeMessage()
	{
		return welcomeMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWelcomeMessage(String newWelcomeMessage)
	{
		String oldWelcomeMessage = welcomeMessage;
		welcomeMessage = newWelcomeMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Homework1_1Package.LANDING_PAGE__WELCOME_MESSAGE, oldWelcomeMessage, welcomeMessage));
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
			case Homework1_1Package.LANDING_PAGE__WELCOME_MESSAGE:
				return getWelcomeMessage();
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
			case Homework1_1Package.LANDING_PAGE__WELCOME_MESSAGE:
				setWelcomeMessage((String)newValue);
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
			case Homework1_1Package.LANDING_PAGE__WELCOME_MESSAGE:
				setWelcomeMessage(WELCOME_MESSAGE_EDEFAULT);
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
			case Homework1_1Package.LANDING_PAGE__WELCOME_MESSAGE:
				return WELCOME_MESSAGE_EDEFAULT == null ? welcomeMessage != null : !WELCOME_MESSAGE_EDEFAULT.equals(welcomeMessage);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (welcomeMessage: ");
		result.append(welcomeMessage);
		result.append(')');
		return result.toString();
	}

} //LandingPageImpl
