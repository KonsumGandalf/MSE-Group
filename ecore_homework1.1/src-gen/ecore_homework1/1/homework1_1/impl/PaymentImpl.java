/**
 */
package ecore_homework1.1.homework1_1.impl;

import ecore_homework1.1.homework1_1.Homework1_1Package;
import ecore_homework1.1.homework1_1.Payment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore_homework1.1.homework1_1.impl.PaymentImpl#getCreditCardInfomration <em>Credit Card Infomration</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.impl.PaymentImpl#isIsSucessful <em>Is Sucessful</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentImpl extends MinimalEObjectImpl.Container implements Payment
{
	/**
	 * The default value of the '{@link #getCreditCardInfomration() <em>Credit Card Infomration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCardInfomration()
	 * @generated
	 * @ordered
	 */
	protected static final String CREDIT_CARD_INFOMRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreditCardInfomration() <em>Credit Card Infomration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCardInfomration()
	 * @generated
	 * @ordered
	 */
	protected String creditCardInfomration = CREDIT_CARD_INFOMRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSucessful() <em>Is Sucessful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSucessful()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUCESSFUL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSucessful() <em>Is Sucessful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSucessful()
	 * @generated
	 * @ordered
	 */
	protected boolean isSucessful = IS_SUCESSFUL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentImpl()
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
		return Homework1_1Package.Literals.PAYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreditCardInfomration()
	{
		return creditCardInfomration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreditCardInfomration(String newCreditCardInfomration)
	{
		String oldCreditCardInfomration = creditCardInfomration;
		creditCardInfomration = newCreditCardInfomration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Homework1_1Package.PAYMENT__CREDIT_CARD_INFOMRATION, oldCreditCardInfomration, creditCardInfomration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSucessful()
	{
		return isSucessful;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSucessful(boolean newIsSucessful)
	{
		boolean oldIsSucessful = isSucessful;
		isSucessful = newIsSucessful;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Homework1_1Package.PAYMENT__IS_SUCESSFUL, oldIsSucessful, isSucessful));
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
			case Homework1_1Package.PAYMENT__CREDIT_CARD_INFOMRATION:
				return getCreditCardInfomration();
			case Homework1_1Package.PAYMENT__IS_SUCESSFUL:
				return isIsSucessful();
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
			case Homework1_1Package.PAYMENT__CREDIT_CARD_INFOMRATION:
				setCreditCardInfomration((String)newValue);
				return;
			case Homework1_1Package.PAYMENT__IS_SUCESSFUL:
				setIsSucessful((Boolean)newValue);
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
			case Homework1_1Package.PAYMENT__CREDIT_CARD_INFOMRATION:
				setCreditCardInfomration(CREDIT_CARD_INFOMRATION_EDEFAULT);
				return;
			case Homework1_1Package.PAYMENT__IS_SUCESSFUL:
				setIsSucessful(IS_SUCESSFUL_EDEFAULT);
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
			case Homework1_1Package.PAYMENT__CREDIT_CARD_INFOMRATION:
				return CREDIT_CARD_INFOMRATION_EDEFAULT == null ? creditCardInfomration != null : !CREDIT_CARD_INFOMRATION_EDEFAULT.equals(creditCardInfomration);
			case Homework1_1Package.PAYMENT__IS_SUCESSFUL:
				return isSucessful != IS_SUCESSFUL_EDEFAULT;
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
		result.append(" (creditCardInfomration: ");
		result.append(creditCardInfomration);
		result.append(", isSucessful: ");
		result.append(isSucessful);
		result.append(')');
		return result.toString();
	}

} //PaymentImpl
