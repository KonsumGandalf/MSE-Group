/**
 */
package ecore_homework1.1.homework1_1.impl;

import ecore_homework1.1.homework1_1.CartItem;
import ecore_homework1.1.homework1_1.Customer;
import ecore_homework1.1.homework1_1.Homework1_1Package;
import ecore_homework1.1.homework1_1.ShoppingCart;

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
 *   <li>{@link ecore_homework1.1.homework1_1.impl.ShoppingCartImpl#getTotalPrice <em>Total Price</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.impl.ShoppingCartImpl#getDiscrount <em>Discrount</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.impl.ShoppingCartImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.impl.ShoppingCartImpl#getCartitem <em>Cartitem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShoppingCartImpl extends MinimalEObjectImpl.Container implements ShoppingCart
{
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
	 * The default value of the '{@link #getDiscrount() <em>Discrount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscrount()
	 * @generated
	 * @ordered
	 */
	protected static final float DISCROUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDiscrount() <em>Discrount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscrount()
	 * @generated
	 * @ordered
	 */
	protected float discrount = DISCROUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

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
	protected ShoppingCartImpl()
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
		return Homework1_1Package.Literals.SHOPPING_CART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getTotalPrice()
	{
		return totalPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalPrice(float newTotalPrice)
	{
		float oldTotalPrice = totalPrice;
		totalPrice = newTotalPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Homework1_1Package.SHOPPING_CART__TOTAL_PRICE, oldTotalPrice, totalPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getDiscrount()
	{
		return discrount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscrount(float newDiscrount)
	{
		float oldDiscrount = discrount;
		discrount = newDiscrount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Homework1_1Package.SHOPPING_CART__DISCROUNT, oldDiscrount, discrount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Customer getCustomer()
	{
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(Customer newCustomer, NotificationChain msgs)
	{
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Homework1_1Package.SHOPPING_CART__CUSTOMER, oldCustomer, newCustomer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomer(Customer newCustomer)
	{
		if (newCustomer != customer)
		{
			NotificationChain msgs = null;
			if (customer != null)
				msgs = ((InternalEObject)customer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Homework1_1Package.SHOPPING_CART__CUSTOMER, null, msgs);
			if (newCustomer != null)
				msgs = ((InternalEObject)newCustomer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Homework1_1Package.SHOPPING_CART__CUSTOMER, null, msgs);
			msgs = basicSetCustomer(newCustomer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Homework1_1Package.SHOPPING_CART__CUSTOMER, newCustomer, newCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CartItem> getCartitem()
	{
		if (cartitem == null)
		{
			cartitem = new EObjectContainmentEList<CartItem>(CartItem.class, this, Homework1_1Package.SHOPPING_CART__CARTITEM);
		}
		return cartitem;
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
			case Homework1_1Package.SHOPPING_CART__CUSTOMER:
				return basicSetCustomer(null, msgs);
			case Homework1_1Package.SHOPPING_CART__CARTITEM:
				return ((InternalEList<?>)getCartitem()).basicRemove(otherEnd, msgs);
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
			case Homework1_1Package.SHOPPING_CART__TOTAL_PRICE:
				return getTotalPrice();
			case Homework1_1Package.SHOPPING_CART__DISCROUNT:
				return getDiscrount();
			case Homework1_1Package.SHOPPING_CART__CUSTOMER:
				return getCustomer();
			case Homework1_1Package.SHOPPING_CART__CARTITEM:
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case Homework1_1Package.SHOPPING_CART__TOTAL_PRICE:
				setTotalPrice((Float)newValue);
				return;
			case Homework1_1Package.SHOPPING_CART__DISCROUNT:
				setDiscrount((Float)newValue);
				return;
			case Homework1_1Package.SHOPPING_CART__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case Homework1_1Package.SHOPPING_CART__CARTITEM:
				getCartitem().clear();
				getCartitem().addAll((Collection<? extends CartItem>)newValue);
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
			case Homework1_1Package.SHOPPING_CART__TOTAL_PRICE:
				setTotalPrice(TOTAL_PRICE_EDEFAULT);
				return;
			case Homework1_1Package.SHOPPING_CART__DISCROUNT:
				setDiscrount(DISCROUNT_EDEFAULT);
				return;
			case Homework1_1Package.SHOPPING_CART__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case Homework1_1Package.SHOPPING_CART__CARTITEM:
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case Homework1_1Package.SHOPPING_CART__TOTAL_PRICE:
				return totalPrice != TOTAL_PRICE_EDEFAULT;
			case Homework1_1Package.SHOPPING_CART__DISCROUNT:
				return discrount != DISCROUNT_EDEFAULT;
			case Homework1_1Package.SHOPPING_CART__CUSTOMER:
				return customer != null;
			case Homework1_1Package.SHOPPING_CART__CARTITEM:
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
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (totalPrice: ");
		result.append(totalPrice);
		result.append(", discrount: ");
		result.append(discrount);
		result.append(')');
		return result.toString();
	}

} //ShoppingCartImpl
