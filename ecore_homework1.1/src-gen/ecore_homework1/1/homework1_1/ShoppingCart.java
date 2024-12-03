/**
 */
package ecore_homework1.1.homework1_1;

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
 *   <li>{@link ecore_homework1.1.homework1_1.ShoppingCart#getTotalPrice <em>Total Price</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.ShoppingCart#getDiscrount <em>Discrount</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.ShoppingCart#getCustomer <em>Customer</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.ShoppingCart#getCartitem <em>Cartitem</em>}</li>
 * </ul>
 *
 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getShoppingCart()
 * @model
 * @generated
 */
public interface ShoppingCart extends EObject
{
	/**
	 * Returns the value of the '<em><b>Total Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Price</em>' attribute.
	 * @see #setTotalPrice(float)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getShoppingCart_TotalPrice()
	 * @model
	 * @generated
	 */
	float getTotalPrice();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.ShoppingCart#getTotalPrice <em>Total Price</em>}' attribute.
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
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getShoppingCart_Discrount()
	 * @model
	 * @generated
	 */
	float getDiscrount();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.ShoppingCart#getDiscrount <em>Discrount</em>}' attribute.
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
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getShoppingCart_Customer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.ShoppingCart#getCustomer <em>Customer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' containment reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Cartitem</b></em>' containment reference list.
	 * The list contents are of type {@link ecore_homework1.1.homework1_1.CartItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartitem</em>' containment reference list.
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getShoppingCart_Cartitem()
	 * @model containment="true"
	 * @generated
	 */
	EList<CartItem> getCartitem();

} // ShoppingCart
