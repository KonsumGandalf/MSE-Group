/**
 */
package ecore_homework1.1.homework1_1.impl;

import ecore_homework1.1.homework1_1.Homework1_1Package;
import ecore_homework1.1.homework1_1.Order;
import ecore_homework1.1.homework1_1.Store;
import ecore_homework1.1.homework1_1.StoreManagementSystem;
import ecore_homework1.1.homework1_1.User;

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
 * An implementation of the model object '<em><b>Store Management System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore_homework1.1.homework1_1.impl.StoreManagementSystemImpl#getStore <em>Store</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.impl.StoreManagementSystemImpl#getUser <em>User</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.impl.StoreManagementSystemImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreManagementSystemImpl extends MinimalEObjectImpl.Container implements StoreManagementSystem
{
	/**
	 * The cached value of the '{@link #getStore() <em>Store</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStore()
	 * @generated
	 * @ordered
	 */
	protected Store store;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected EList<User> user;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> order;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreManagementSystemImpl()
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
		return Homework1_1Package.Literals.STORE_MANAGEMENT_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Store getStore()
	{
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStore(Store newStore, NotificationChain msgs)
	{
		Store oldStore = store;
		store = newStore;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Homework1_1Package.STORE_MANAGEMENT_SYSTEM__STORE, oldStore, newStore);
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
	public void setStore(Store newStore)
	{
		if (newStore != store)
		{
			NotificationChain msgs = null;
			if (store != null)
				msgs = ((InternalEObject)store).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Homework1_1Package.STORE_MANAGEMENT_SYSTEM__STORE, null, msgs);
			if (newStore != null)
				msgs = ((InternalEObject)newStore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Homework1_1Package.STORE_MANAGEMENT_SYSTEM__STORE, null, msgs);
			msgs = basicSetStore(newStore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Homework1_1Package.STORE_MANAGEMENT_SYSTEM__STORE, newStore, newStore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getUser()
	{
		if (user == null)
		{
			user = new EObjectContainmentEList<User>(User.class, this, Homework1_1Package.STORE_MANAGEMENT_SYSTEM__USER);
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Order> getOrder()
	{
		if (order == null)
		{
			order = new EObjectContainmentEList<Order>(Order.class, this, Homework1_1Package.STORE_MANAGEMENT_SYSTEM__ORDER);
		}
		return order;
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
			case Homework1_1Package.STORE_MANAGEMENT_SYSTEM__STORE:
				return basicSetStore(null, msgs);
			case Homework1_1Package.STORE_MANAGEMENT_SYSTEM__USER:
				return ((InternalEList<?>)getUser()).basicRemove(otherEnd, msgs);
			case Homework1_1Package.STORE_MANAGEMENT_SYSTEM__ORDER:
				return ((InternalEList<?>)getOrder()).basicRemove(otherEnd, msgs);
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
			case Homework1_1Package.STORE_MANAGEMENT_SYSTEM__STORE:
				return getStore();
			case Homework1_1Package.STORE_MANAGEMENT_SYSTEM__USER:
				return getUser();
			case Homework1_1Package.STORE_MANAGEMENT_SYSTEM__ORDER:
				return getOrder();
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
			case Homework1_1Package.STORE_MANAGEMENT_SYSTEM__STORE:
				setStore((Store)newValue);
				return;
			case Homework1_1Package.STORE_MANAGEMENT_SYSTEM__USER:
				getUser().clear();
				getUser().addAll((Collection<? extends User>)newValue);
				return;
			case Homework1_1Package.STORE_MANAGEMENT_SYSTEM__ORDER:
				getOrder().clear();
				getOrder().addAll((Collection<? extends Order>)newValue);
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
			case Homework1_1Package.STORE_MANAGEMENT_SYSTEM__STORE:
				setStore((Store)null);
				return;
			case Homework1_1Package.STORE_MANAGEMENT_SYSTEM__USER:
				getUser().clear();
				return;
			case Homework1_1Package.STORE_MANAGEMENT_SYSTEM__ORDER:
				getOrder().clear();
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
			case Homework1_1Package.STORE_MANAGEMENT_SYSTEM__STORE:
				return store != null;
			case Homework1_1Package.STORE_MANAGEMENT_SYSTEM__USER:
				return user != null && !user.isEmpty();
			case Homework1_1Package.STORE_MANAGEMENT_SYSTEM__ORDER:
				return order != null && !order.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StoreManagementSystemImpl
