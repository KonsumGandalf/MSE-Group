/**
 */
package ecore_homework1.1.homework1_1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cart Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore_homework1.1.homework1_1.CartItem#getExtraWishes <em>Extra Wishes</em>}</li>
 * </ul>
 *
 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getCartItem()
 * @model
 * @generated
 */
public interface CartItem extends EObject
{
	/**
	 * Returns the value of the '<em><b>Extra Wishes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Wishes</em>' attribute.
	 * @see #setExtraWishes(String)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getCartItem_ExtraWishes()
	 * @model
	 * @generated
	 */
	String getExtraWishes();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.CartItem#getExtraWishes <em>Extra Wishes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Wishes</em>' attribute.
	 * @see #getExtraWishes()
	 * @generated
	 */
	void setExtraWishes(String value);

} // CartItem
