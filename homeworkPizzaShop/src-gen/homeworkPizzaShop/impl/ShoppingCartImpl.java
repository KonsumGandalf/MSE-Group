/**
 */
package homeworkPizzaShop.impl;

import homeworkPizzaShop.CartItem;
import homeworkPizzaShop.HomeworkPizzaShopPackage;
import homeworkPizzaShop.ShoppingCart;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shopping Cart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link homeworkPizzaShop.impl.ShoppingCartImpl#getTotalPrice <em>Total Price</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.ShoppingCartImpl#getDiscount <em>Discount</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.ShoppingCartImpl#getCartitem <em>Cartitem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShoppingCartImpl extends MinimalEObjectImpl.Container implements ShoppingCart {
	/**
	 * The default value of the '{@link #getTotalPrice() <em>Total Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalPrice() <em>Total Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPrice()
	 * @generated
	 * @ordered
	 */
	protected float totalPrice = TOTAL_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected static final float DISCOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected float discount = DISCOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCartitem() <em>Cartitem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartitem()
	 * @generated
	 * @ordered
	 */
	protected EList<CartItem> cartitem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShoppingCartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HomeworkPizzaShopPackage.Literals.SHOPPING_CART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getTotalPrice() {
		return totalPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalPrice(float newTotalPrice) {
		float oldTotalPrice = totalPrice;
		totalPrice = newTotalPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.SHOPPING_CART__TOTAL_PRICE,
					oldTotalPrice, totalPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getDiscount() {
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscount(float newDiscount) {
		float oldDiscount = discount;
		discount = newDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.SHOPPING_CART__DISCOUNT,
					oldDiscount, discount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CartItem> getCartitem() {
		if (cartitem == null) {
			cartitem = new EObjectContainmentEList<CartItem>(CartItem.class, this,
					HomeworkPizzaShopPackage.SHOPPING_CART__CARTITEM);
		}
		return cartitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.SHOPPING_CART__CARTITEM:
			return ((InternalEList<?>) getCartitem()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.SHOPPING_CART__TOTAL_PRICE:
			return getTotalPrice();
		case HomeworkPizzaShopPackage.SHOPPING_CART__DISCOUNT:
			return getDiscount();
		case HomeworkPizzaShopPackage.SHOPPING_CART__CARTITEM:
			return getCartitem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.SHOPPING_CART__TOTAL_PRICE:
			setTotalPrice((Float) newValue);
			return;
		case HomeworkPizzaShopPackage.SHOPPING_CART__DISCOUNT:
			setDiscount((Float) newValue);
			return;
		case HomeworkPizzaShopPackage.SHOPPING_CART__CARTITEM:
			getCartitem().clear();
			getCartitem().addAll((Collection<? extends CartItem>) newValue);
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
		case HomeworkPizzaShopPackage.SHOPPING_CART__TOTAL_PRICE:
			setTotalPrice(TOTAL_PRICE_EDEFAULT);
			return;
		case HomeworkPizzaShopPackage.SHOPPING_CART__DISCOUNT:
			setDiscount(DISCOUNT_EDEFAULT);
			return;
		case HomeworkPizzaShopPackage.SHOPPING_CART__CARTITEM:
			getCartitem().clear();
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
		case HomeworkPizzaShopPackage.SHOPPING_CART__TOTAL_PRICE:
			return totalPrice != TOTAL_PRICE_EDEFAULT;
		case HomeworkPizzaShopPackage.SHOPPING_CART__DISCOUNT:
			return discount != DISCOUNT_EDEFAULT;
		case HomeworkPizzaShopPackage.SHOPPING_CART__CARTITEM:
			return cartitem != null && !cartitem.isEmpty();
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
		result.append(" (totalPrice: ");
		result.append(totalPrice);
		result.append(", discount: ");
		result.append(discount);
		result.append(')');
		return result.toString();
	}

} //ShoppingCartImpl
