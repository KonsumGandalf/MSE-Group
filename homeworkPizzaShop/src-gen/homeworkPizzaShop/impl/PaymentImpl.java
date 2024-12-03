/**
 */
package homeworkPizzaShop.impl;

import homeworkPizzaShop.HomeworkPizzaShopPackage;
import homeworkPizzaShop.Payment;

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
 *   <li>{@link homeworkPizzaShop.impl.PaymentImpl#getTransactionNumber <em>Transaction Number</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.PaymentImpl#isIsSucessful <em>Is Sucessful</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentImpl extends MinimalEObjectImpl.Container implements Payment {
	/**
	 * The default value of the '{@link #getTransactionNumber() <em>Transaction Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSACTION_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTransactionNumber() <em>Transaction Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionNumber()
	 * @generated
	 * @ordered
	 */
	protected int transactionNumber = TRANSACTION_NUMBER_EDEFAULT;

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
	protected PaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HomeworkPizzaShopPackage.Literals.PAYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTransactionNumber() {
		return transactionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionNumber(int newTransactionNumber) {
		int oldTransactionNumber = transactionNumber;
		transactionNumber = newTransactionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.PAYMENT__TRANSACTION_NUMBER,
					oldTransactionNumber, transactionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSucessful() {
		return isSucessful;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSucessful(boolean newIsSucessful) {
		boolean oldIsSucessful = isSucessful;
		isSucessful = newIsSucessful;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.PAYMENT__IS_SUCESSFUL,
					oldIsSucessful, isSucessful));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.PAYMENT__TRANSACTION_NUMBER:
			return getTransactionNumber();
		case HomeworkPizzaShopPackage.PAYMENT__IS_SUCESSFUL:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.PAYMENT__TRANSACTION_NUMBER:
			setTransactionNumber((Integer) newValue);
			return;
		case HomeworkPizzaShopPackage.PAYMENT__IS_SUCESSFUL:
			setIsSucessful((Boolean) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.PAYMENT__TRANSACTION_NUMBER:
			setTransactionNumber(TRANSACTION_NUMBER_EDEFAULT);
			return;
		case HomeworkPizzaShopPackage.PAYMENT__IS_SUCESSFUL:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.PAYMENT__TRANSACTION_NUMBER:
			return transactionNumber != TRANSACTION_NUMBER_EDEFAULT;
		case HomeworkPizzaShopPackage.PAYMENT__IS_SUCESSFUL:
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
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (transactionNumber: ");
		result.append(transactionNumber);
		result.append(", isSucessful: ");
		result.append(isSucessful);
		result.append(')');
		return result.toString();
	}

} //PaymentImpl
