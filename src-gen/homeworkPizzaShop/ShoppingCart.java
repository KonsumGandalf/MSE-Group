/**
 */
package homeworkPizzaShop;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shopping Cart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link homeworkPizzaShop.ShoppingCart#getTotalPrice <em>Total Price</em>}</li>
 *   <li>{@link homeworkPizzaShop.ShoppingCart#getDiscrount <em>Discrount</em>}</li>
 *   <li>{@link homeworkPizzaShop.ShoppingCart#getCustomer <em>Customer</em>}</li>
 *   <li>{@link homeworkPizzaShop.ShoppingCart#getCartitem <em>Cartitem</em>}</li>
 * </ul>
 *
 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getShoppingCart()
 * @model
 * @generated
 */
public interface ShoppingCart extends EObject {
	/**
	 * Returns the value of the '<em><b>Total Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Price</em>' attribute.
	 * @see #setTotalPrice(float)
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getShoppingCart_TotalPrice()
	 * @model
	 * @generated
	 */
	float getTotalPrice();

	/**
	 * Sets the value of the '{@link homeworkPizzaShop.ShoppingCart#getTotalPrice <em>Total Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Price</em>' attribute.
	 * @see #getTotalPrice()
	 * @generated
	 */
	void setTotalPrice(float value);

	/**
	 * Returns the value of the '<em><b>Discrount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discrount</em>' attribute.
	 * @see #setDiscrount(float)
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getShoppingCart_Discrount()
	 * @model
	 * @generated
	 */
	float getDiscrount();

	/**
	 * Sets the value of the '{@link homeworkPizzaShop.ShoppingCart#getDiscrount <em>Discrount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discrount</em>' attribute.
	 * @see #getDiscrount()
	 * @generated
	 */
	void setDiscrount(float value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' containment reference.
	 * @see #setCustomer(Customer)
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getShoppingCart_Customer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link homeworkPizzaShop.ShoppingCart#getCustomer <em>Customer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' containment reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Cartitem</b></em>' containment reference list.
	 * The list contents are of type {@link homeworkPizzaShop.CartItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartitem</em>' containment reference list.
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getShoppingCart_Cartitem()
	 * @model containment="true"
	 * @generated
	 */
	EList<CartItem> getCartitem();

} // ShoppingCart
