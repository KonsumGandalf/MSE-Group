/**
 */
package homeworkPizzaShop;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link homeworkPizzaShop.Customer#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link homeworkPizzaShop.Customer#getCustomer <em>Customer</em>}</li>
 * </ul>
 *
 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends User {
	/**
	 * Returns the value of the '<em><b>Customer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer ID</em>' attribute.
	 * @see #setCustomerID(int)
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getCustomer_CustomerID()
	 * @model
	 * @generated
	 */
	int getCustomerID();

	/**
	 * Sets the value of the '{@link homeworkPizzaShop.Customer#getCustomerID <em>Customer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer ID</em>' attribute.
	 * @see #getCustomerID()
	 * @generated
	 */
	void setCustomerID(int value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' containment reference list.
	 * The list contents are of type {@link homeworkPizzaShop.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' containment reference list.
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getCustomer_Customer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Order> getCustomer();

} // Customer
