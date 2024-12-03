/**
 */
package homeworkPizzaShop.impl;

import homeworkPizzaShop.Customer;
import homeworkPizzaShop.Employee;
import homeworkPizzaShop.HomeworkPizzaShopPackage;
import homeworkPizzaShop.Order;
import homeworkPizzaShop.Payment;
import homeworkPizzaShop.Status;

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
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link homeworkPizzaShop.impl.OrderImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.OrderImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.OrderImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.OrderImpl#getOrderID <em>Order ID</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.OrderImpl#getPayment <em>Payment</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.OrderImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.OrderImpl#getEmployee <em>Employee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends MinimalEObjectImpl.Container implements Order {
	/**
	 * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status STATUS_EDEFAULT = Status.IN_PREPARTION;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status = STATUS_EDEFAULT;

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
	 * The default value of the '{@link #getOrderID() <em>Order ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderID()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrderID() <em>Order ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderID()
	 * @generated
	 * @ordered
	 */
	protected int orderID = ORDER_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected Payment payment;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customer;

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
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HomeworkPizzaShopPackage.Literals.ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.ORDER__IS_ACTIVE,
					oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.ORDER__STATUS, oldStatus,
					status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.ORDER__ADDRESS, oldAddress,
					address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOrderID() {
		return orderID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderID(int newOrderID) {
		int oldOrderID = orderID;
		orderID = newOrderID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.ORDER__ORDER_ID, oldOrderID,
					orderID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Payment getPayment() {
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayment(Payment newPayment, NotificationChain msgs) {
		Payment oldPayment = payment;
		payment = newPayment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HomeworkPizzaShopPackage.ORDER__PAYMENT, oldPayment, newPayment);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayment(Payment newPayment) {
		if (newPayment != payment) {
			NotificationChain msgs = null;
			if (payment != null)
				msgs = ((InternalEObject) payment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - HomeworkPizzaShopPackage.ORDER__PAYMENT, null, msgs);
			if (newPayment != null)
				msgs = ((InternalEObject) newPayment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - HomeworkPizzaShopPackage.ORDER__PAYMENT, null, msgs);
			msgs = basicSetPayment(newPayment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.ORDER__PAYMENT, newPayment,
					newPayment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Customer> getCustomer() {
		if (customer == null) {
			customer = new EObjectContainmentEList<Customer>(Customer.class, this,
					HomeworkPizzaShopPackage.ORDER__CUSTOMER);
		}
		return customer;
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
					HomeworkPizzaShopPackage.ORDER__EMPLOYEE);
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
		case HomeworkPizzaShopPackage.ORDER__PAYMENT:
			return basicSetPayment(null, msgs);
		case HomeworkPizzaShopPackage.ORDER__CUSTOMER:
			return ((InternalEList<?>) getCustomer()).basicRemove(otherEnd, msgs);
		case HomeworkPizzaShopPackage.ORDER__EMPLOYEE:
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
		case HomeworkPizzaShopPackage.ORDER__IS_ACTIVE:
			return isIsActive();
		case HomeworkPizzaShopPackage.ORDER__STATUS:
			return getStatus();
		case HomeworkPizzaShopPackage.ORDER__ADDRESS:
			return getAddress();
		case HomeworkPizzaShopPackage.ORDER__ORDER_ID:
			return getOrderID();
		case HomeworkPizzaShopPackage.ORDER__PAYMENT:
			return getPayment();
		case HomeworkPizzaShopPackage.ORDER__CUSTOMER:
			return getCustomer();
		case HomeworkPizzaShopPackage.ORDER__EMPLOYEE:
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
		case HomeworkPizzaShopPackage.ORDER__IS_ACTIVE:
			setIsActive((Boolean) newValue);
			return;
		case HomeworkPizzaShopPackage.ORDER__STATUS:
			setStatus((Status) newValue);
			return;
		case HomeworkPizzaShopPackage.ORDER__ADDRESS:
			setAddress((String) newValue);
			return;
		case HomeworkPizzaShopPackage.ORDER__ORDER_ID:
			setOrderID((Integer) newValue);
			return;
		case HomeworkPizzaShopPackage.ORDER__PAYMENT:
			setPayment((Payment) newValue);
			return;
		case HomeworkPizzaShopPackage.ORDER__CUSTOMER:
			getCustomer().clear();
			getCustomer().addAll((Collection<? extends Customer>) newValue);
			return;
		case HomeworkPizzaShopPackage.ORDER__EMPLOYEE:
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
		case HomeworkPizzaShopPackage.ORDER__IS_ACTIVE:
			setIsActive(IS_ACTIVE_EDEFAULT);
			return;
		case HomeworkPizzaShopPackage.ORDER__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case HomeworkPizzaShopPackage.ORDER__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case HomeworkPizzaShopPackage.ORDER__ORDER_ID:
			setOrderID(ORDER_ID_EDEFAULT);
			return;
		case HomeworkPizzaShopPackage.ORDER__PAYMENT:
			setPayment((Payment) null);
			return;
		case HomeworkPizzaShopPackage.ORDER__CUSTOMER:
			getCustomer().clear();
			return;
		case HomeworkPizzaShopPackage.ORDER__EMPLOYEE:
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
		case HomeworkPizzaShopPackage.ORDER__IS_ACTIVE:
			return isActive != IS_ACTIVE_EDEFAULT;
		case HomeworkPizzaShopPackage.ORDER__STATUS:
			return status != STATUS_EDEFAULT;
		case HomeworkPizzaShopPackage.ORDER__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case HomeworkPizzaShopPackage.ORDER__ORDER_ID:
			return orderID != ORDER_ID_EDEFAULT;
		case HomeworkPizzaShopPackage.ORDER__PAYMENT:
			return payment != null;
		case HomeworkPizzaShopPackage.ORDER__CUSTOMER:
			return customer != null && !customer.isEmpty();
		case HomeworkPizzaShopPackage.ORDER__EMPLOYEE:
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
		result.append(" (isActive: ");
		result.append(isActive);
		result.append(", status: ");
		result.append(status);
		result.append(", address: ");
		result.append(address);
		result.append(", orderID: ");
		result.append(orderID);
		result.append(')');
		return result.toString();
	}

} //OrderImpl
