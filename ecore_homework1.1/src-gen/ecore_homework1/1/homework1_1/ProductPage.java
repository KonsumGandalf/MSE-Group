/**
 */
package ecore_homework1.1.homework1_1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore_homework1.1.homework1_1.ProductPage#getDescription <em>Description</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.ProductPage#getRating <em>Rating</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.ProductPage#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getProductPage()
 * @model
 * @generated
 */
public interface ProductPage extends Webpage
{
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getProductPage_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.ProductPage#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating</em>' attribute.
	 * @see #setRating(float)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getProductPage_Rating()
	 * @model
	 * @generated
	 */
	float getRating();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.ProductPage#getRating <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating</em>' attribute.
	 * @see #getRating()
	 * @generated
	 */
	void setRating(float value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' containment reference.
	 * @see #setProduct(Product)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getProductPage_Product()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.ProductPage#getProduct <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' containment reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

} // ProductPage
