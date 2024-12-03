/**
 */
package homeworkPizzaShop;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Management System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link homeworkPizzaShop.StoreManagementSystem#getStore <em>Store</em>}</li>
 *   <li>{@link homeworkPizzaShop.StoreManagementSystem#getUser <em>User</em>}</li>
 *   <li>{@link homeworkPizzaShop.StoreManagementSystem#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getStoreManagementSystem()
 * @model
 * @generated
 */
public interface StoreManagementSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Store</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store</em>' containment reference.
	 * @see #setStore(Store)
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getStoreManagementSystem_Store()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Store getStore();

	/**
	 * Sets the value of the '{@link homeworkPizzaShop.StoreManagementSystem#getStore <em>Store</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store</em>' containment reference.
	 * @see #getStore()
	 * @generated
	 */
	void setStore(Store value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference list.
	 * The list contents are of type {@link homeworkPizzaShop.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference list.
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getStoreManagementSystem_User()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<User> getUser();

	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference list.
	 * The list contents are of type {@link homeworkPizzaShop.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference list.
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getStoreManagementSystem_Order()
	 * @model required="true"
	 * @generated
	 */
	EList<Order> getOrder();

} // StoreManagementSystem
