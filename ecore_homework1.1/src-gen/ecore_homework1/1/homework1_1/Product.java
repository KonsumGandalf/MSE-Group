/**
 */
package ecore_homework1.1.homework1_1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore_homework1.1.homework1_1.Product#getProductID <em>Product ID</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.Product#getPrice <em>Price</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.Product#getTitle <em>Title</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.Product#isInStock <em>In Stock</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.Product#getCartitem <em>Cartitem</em>}</li>
 * </ul>
 *
 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getProduct()
 * @model
 * @generated
 */
public interface Product extends EObject
{
	/**
	 * Returns the value of the '<em><b>Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product ID</em>' attribute.
	 * @see #setProductID(int)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getProduct_ProductID()
	 * @model
	 * @generated
	 */
	int getProductID();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.Product#getProductID <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product ID</em>' attribute.
	 * @see #getProductID()
	 * @generated
	 */
	void setProductID(int value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getProduct_Price()
	 * @model
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.Product#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getProduct_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.Product#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>In Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Stock</em>' attribute.
	 * @see #setInStock(boolean)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getProduct_InStock()
	 * @model
	 * @generated
	 */
	boolean isInStock();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.Product#isInStock <em>In Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Stock</em>' attribute.
	 * @see #isInStock()
	 * @generated
	 */
	void setInStock(boolean value);

	/**
	 * Returns the value of the '<em><b>Cartitem</b></em>' containment reference list.
	 * The list contents are of type {@link ecore_homework1.1.homework1_1.CartItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartitem</em>' containment reference list.
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getProduct_Cartitem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CartItem> getCartitem();

} // Product
