/**
 */
package homeworkPizzaShop.impl;

import homeworkPizzaShop.Employee;
import homeworkPizzaShop.HomeworkPizzaShopPackage;
import homeworkPizzaShop.Store;

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
 * An implementation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link homeworkPizzaShop.impl.StoreImpl#getStoreID <em>Store ID</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.StoreImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.StoreImpl#getOpeningHours <em>Opening Hours</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.StoreImpl#getEmployee <em>Employee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreImpl extends MinimalEObjectImpl.Container implements Store {
	/**
	 * The default value of the '{@link #getStoreID() <em>Store ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreID()
	 * @generated
	 * @ordered
	 */
	protected static final int STORE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStoreID() <em>Store ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreID()
	 * @generated
	 * @ordered
	 */
	protected int storeID = STORE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpeningHours() <em>Opening Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningHours()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENING_HOURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpeningHours() <em>Opening Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningHours()
	 * @generated
	 * @ordered
	 */
	protected String openingHours = OPENING_HOURS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmployee() <em>Employee</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployee()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> employee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HomeworkPizzaShopPackage.Literals.STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStoreID() {
		return storeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoreID(int newStoreID) {
		int oldStoreID = storeID;
		storeID = newStoreID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.STORE__STORE_ID, oldStoreID,
					storeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.STORE__ADDRESS, oldAddress,
					address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOpeningHours() {
		return openingHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpeningHours(String newOpeningHours) {
		String oldOpeningHours = openingHours;
		openingHours = newOpeningHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.STORE__OPENING_HOURS,
					oldOpeningHours, openingHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Employee> getEmployee() {
		if (employee == null) {
			employee = new EObjectContainmentEList<Employee>(Employee.class, this,
					HomeworkPizzaShopPackage.STORE__EMPLOYEE);
		}
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.STORE__EMPLOYEE:
			return ((InternalEList<?>) getEmployee()).basicRemove(otherEnd, msgs);
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
		case HomeworkPizzaShopPackage.STORE__STORE_ID:
			return getStoreID();
		case HomeworkPizzaShopPackage.STORE__ADDRESS:
			return getAddress();
		case HomeworkPizzaShopPackage.STORE__OPENING_HOURS:
			return getOpeningHours();
		case HomeworkPizzaShopPackage.STORE__EMPLOYEE:
			return getEmployee();
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
		case HomeworkPizzaShopPackage.STORE__STORE_ID:
			setStoreID((Integer) newValue);
			return;
		case HomeworkPizzaShopPackage.STORE__ADDRESS:
			setAddress((String) newValue);
			return;
		case HomeworkPizzaShopPackage.STORE__OPENING_HOURS:
			setOpeningHours((String) newValue);
			return;
		case HomeworkPizzaShopPackage.STORE__EMPLOYEE:
			getEmployee().clear();
			getEmployee().addAll((Collection<? extends Employee>) newValue);
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
		case HomeworkPizzaShopPackage.STORE__STORE_ID:
			setStoreID(STORE_ID_EDEFAULT);
			return;
		case HomeworkPizzaShopPackage.STORE__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case HomeworkPizzaShopPackage.STORE__OPENING_HOURS:
			setOpeningHours(OPENING_HOURS_EDEFAULT);
			return;
		case HomeworkPizzaShopPackage.STORE__EMPLOYEE:
			getEmployee().clear();
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
		case HomeworkPizzaShopPackage.STORE__STORE_ID:
			return storeID != STORE_ID_EDEFAULT;
		case HomeworkPizzaShopPackage.STORE__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case HomeworkPizzaShopPackage.STORE__OPENING_HOURS:
			return OPENING_HOURS_EDEFAULT == null ? openingHours != null : !OPENING_HOURS_EDEFAULT.equals(openingHours);
		case HomeworkPizzaShopPackage.STORE__EMPLOYEE:
			return employee != null && !employee.isEmpty();
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
		result.append(" (storeID: ");
		result.append(storeID);
		result.append(", address: ");
		result.append(address);
		result.append(", openingHours: ");
		result.append(openingHours);
		result.append(')');
		return result.toString();
	}

} //StoreImpl
