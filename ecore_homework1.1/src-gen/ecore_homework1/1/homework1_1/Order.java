/**
 */
package ecore_homework1.1.homework1_1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore_homework1.1.homework1_1.Order#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.Order#getStatus <em>Status</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.Order#getAddress <em>Address</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.Order#getOrderID <em>Order ID</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.Order#getPayment <em>Payment</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.Order#getCustomer <em>Customer</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.Order#getEmployee <em>Employee</em>}</li>
 * </ul>
 *
 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject
{
	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getOrder_IsActive()
	 * @model
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.Order#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getOrder_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.Order#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getOrder_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.Order#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Order ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order ID</em>' attribute.
	 * @see #setOrderID(int)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getOrder_OrderID()
	 * @model
	 * @generated
	 */
	int getOrderID();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.Order#getOrderID <em>Order ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order ID</em>' attribute.
	 * @see #getOrderID()
	 * @generated
	 */
	void setOrderID(int value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' containment reference.
	 * @see #setPayment(Payment)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getOrder_Payment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Payment getPayment();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.Order#getPayment <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' containment reference.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(Payment value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' containment reference list.
	 * The list contents are of type {@link ecore_homework1.1.homework1_1.Customer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' containment reference list.
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getOrder_Customer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Customer> getCustomer();

	/**
	 * Returns the value of the '<em><b>Employee</b></em>' containment reference list.
	 * The list contents are of type {@link ecore_homework1.1.homework1_1.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee</em>' containment reference list.
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getOrder_Employee()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Employee> getEmployee();

} // Order
