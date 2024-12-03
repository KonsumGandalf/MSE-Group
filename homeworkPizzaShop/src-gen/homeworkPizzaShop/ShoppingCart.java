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
 *   <li>{@link homeworkPizzaShop.ShoppingCart#getDiscount <em>Discount</em>}</li>
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
	 * Returns the value of the '<em><b>Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount</em>' attribute.
	 * @see #setDiscount(float)
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getShoppingCart_Discount()
	 * @model
	 * @generated
	 */
	float getDiscount();

	/**
	 * Sets the value of the '{@link homeworkPizzaShop.ShoppingCart#getDiscount <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount</em>' attribute.
	 * @see #getDiscount()
	 * @generated
	 */
	void setDiscount(float value);

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
