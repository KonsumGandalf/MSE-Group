/**
 */
package homeworkPizzaShop;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link homeworkPizzaShop.Store#getStoreID <em>Store ID</em>}</li>
 *   <li>{@link homeworkPizzaShop.Store#getAddress <em>Address</em>}</li>
 *   <li>{@link homeworkPizzaShop.Store#getOpeningHours <em>Opening Hours</em>}</li>
 *   <li>{@link homeworkPizzaShop.Store#getEmployee <em>Employee</em>}</li>
 * </ul>
 *
 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getStore()
 * @model
 * @generated
 */
public interface Store extends EObject {
	/**
	 * Returns the value of the '<em><b>Store ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store ID</em>' attribute.
	 * @see #setStoreID(int)
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getStore_StoreID()
	 * @model
	 * @generated
	 */
	int getStoreID();

	/**
	 * Sets the value of the '{@link homeworkPizzaShop.Store#getStoreID <em>Store ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store ID</em>' attribute.
	 * @see #getStoreID()
	 * @generated
	 */
	void setStoreID(int value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getStore_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link homeworkPizzaShop.Store#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Opening Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening Hours</em>' attribute.
	 * @see #setOpeningHours(String)
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getStore_OpeningHours()
	 * @model
	 * @generated
	 */
	String getOpeningHours();

	/**
	 * Sets the value of the '{@link homeworkPizzaShop.Store#getOpeningHours <em>Opening Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening Hours</em>' attribute.
	 * @see #getOpeningHours()
	 * @generated
	 */
	void setOpeningHours(String value);

	/**
	 * Returns the value of the '<em><b>Employee</b></em>' containment reference list.
	 * The list contents are of type {@link homeworkPizzaShop.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee</em>' containment reference list.
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getStore_Employee()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Employee> getEmployee();

} // Store
