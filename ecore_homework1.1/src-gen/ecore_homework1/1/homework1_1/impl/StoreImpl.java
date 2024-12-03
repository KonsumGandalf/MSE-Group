/**
 */
package ecore_homework1.1.homework1_1.impl;

import ecore_homework1.1.homework1_1.Employee;
import ecore_homework1.1.homework1_1.Homework1_1Package;
import ecore_homework1.1.homework1_1.Store;

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
 *   <li>{@link ecore_homework1.1.homework1_1.impl.StoreImpl#getStoreID <em>Store ID</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.impl.StoreImpl#getAdress <em>Adress</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.impl.StoreImpl#getOpeningHours <em>Opening Hours</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.impl.StoreImpl#getEmployee <em>Employee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreImpl extends MinimalEObjectImpl.Container implements Store
{
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
	 * The default value of the '{@link #getAdress() <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdress() <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdress()
	 * @generated
	 * @ordered
	 */
	protected String adress = ADRESS_EDEFAULT;

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
	protected StoreImpl()
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
		return Homework1_1Package.Literals.STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStoreID()
	{
		return storeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoreID(int newStoreID)
	{
		int oldStoreID = storeID;
		storeID = newStoreID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Homework1_1Package.STORE__STORE_ID, oldStoreID, storeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdress()
	{
		return adress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdress(String newAdress)
	{
		String oldAdress = adress;
		adress = newAdress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Homework1_1Package.STORE__ADRESS, oldAdress, adress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOpeningHours()
	{
		return openingHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpeningHours(String newOpeningHours)
	{
		String oldOpeningHours = openingHours;
		openingHours = newOpeningHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Homework1_1Package.STORE__OPENING_HOURS, oldOpeningHours, openingHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Employee> getEmployee()
	{
		if (employee == null)
		{
			employee = new EObjectContainmentEList<Employee>(Employee.class, this, Homework1_1Package.STORE__EMPLOYEE);
		}
		return employee;
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
			case Homework1_1Package.STORE__EMPLOYEE:
				return ((InternalEList<?>)getEmployee()).basicRemove(otherEnd, msgs);
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
			case Homework1_1Package.STORE__STORE_ID:
				return getStoreID();
			case Homework1_1Package.STORE__ADRESS:
				return getAdress();
			case Homework1_1Package.STORE__OPENING_HOURS:
				return getOpeningHours();
			case Homework1_1Package.STORE__EMPLOYEE:
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case Homework1_1Package.STORE__STORE_ID:
				setStoreID((Integer)newValue);
				return;
			case Homework1_1Package.STORE__ADRESS:
				setAdress((String)newValue);
				return;
			case Homework1_1Package.STORE__OPENING_HOURS:
				setOpeningHours((String)newValue);
				return;
			case Homework1_1Package.STORE__EMPLOYEE:
				getEmployee().clear();
				getEmployee().addAll((Collection<? extends Employee>)newValue);
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
			case Homework1_1Package.STORE__STORE_ID:
				setStoreID(STORE_ID_EDEFAULT);
				return;
			case Homework1_1Package.STORE__ADRESS:
				setAdress(ADRESS_EDEFAULT);
				return;
			case Homework1_1Package.STORE__OPENING_HOURS:
				setOpeningHours(OPENING_HOURS_EDEFAULT);
				return;
			case Homework1_1Package.STORE__EMPLOYEE:
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case Homework1_1Package.STORE__STORE_ID:
				return storeID != STORE_ID_EDEFAULT;
			case Homework1_1Package.STORE__ADRESS:
				return ADRESS_EDEFAULT == null ? adress != null : !ADRESS_EDEFAULT.equals(adress);
			case Homework1_1Package.STORE__OPENING_HOURS:
				return OPENING_HOURS_EDEFAULT == null ? openingHours != null : !OPENING_HOURS_EDEFAULT.equals(openingHours);
			case Homework1_1Package.STORE__EMPLOYEE:
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
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (storeID: ");
		result.append(storeID);
		result.append(", adress: ");
		result.append(adress);
		result.append(", openingHours: ");
		result.append(openingHours);
		result.append(')');
		return result.toString();
	}

} //StoreImpl
