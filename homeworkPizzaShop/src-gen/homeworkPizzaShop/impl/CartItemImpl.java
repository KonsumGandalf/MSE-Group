/**
 */
package homeworkPizzaShop.impl;

import homeworkPizzaShop.CartItem;
import homeworkPizzaShop.HomeworkPizzaShopPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cart Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link homeworkPizzaShop.impl.CartItemImpl#getExtraWishes <em>Extra Wishes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CartItemImpl extends MinimalEObjectImpl.Container implements CartItem {
	/**
	 * The default value of the '{@link #getExtraWishes() <em>Extra Wishes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraWishes()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRA_WISHES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtraWishes() <em>Extra Wishes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraWishes()
	 * @generated
	 * @ordered
	 */
	protected String extraWishes = EXTRA_WISHES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HomeworkPizzaShopPackage.Literals.CART_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExtraWishes() {
		return extraWishes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtraWishes(String newExtraWishes) {
		String oldExtraWishes = extraWishes;
		extraWishes = newExtraWishes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.CART_ITEM__EXTRA_WISHES,
					oldExtraWishes, extraWishes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.CART_ITEM__EXTRA_WISHES:
			return getExtraWishes();
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
		case HomeworkPizzaShopPackage.CART_ITEM__EXTRA_WISHES:
			setExtraWishes((String) newValue);
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
		case HomeworkPizzaShopPackage.CART_ITEM__EXTRA_WISHES:
			setExtraWishes(EXTRA_WISHES_EDEFAULT);
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
		case HomeworkPizzaShopPackage.CART_ITEM__EXTRA_WISHES:
			return EXTRA_WISHES_EDEFAULT == null ? extraWishes != null : !EXTRA_WISHES_EDEFAULT.equals(extraWishes);
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
		result.append(" (extraWishes: ");
		result.append(extraWishes);
		result.append(')');
		return result.toString();
	}

} //CartItemImpl
