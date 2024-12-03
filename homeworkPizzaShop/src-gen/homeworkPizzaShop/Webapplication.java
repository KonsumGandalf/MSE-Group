/**
 */
package homeworkPizzaShop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Webapplication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link homeworkPizzaShop.Webapplication#getStoremanagementsystem <em>Storemanagementsystem</em>}</li>
 *   <li>{@link homeworkPizzaShop.Webapplication#getWebsite <em>Website</em>}</li>
 *   <li>{@link homeworkPizzaShop.Webapplication#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getWebapplication()
 * @model
 * @generated
 */
public interface Webapplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Storemanagementsystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storemanagementsystem</em>' containment reference.
	 * @see #setStoremanagementsystem(StoreManagementSystem)
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getWebapplication_Storemanagementsystem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StoreManagementSystem getStoremanagementsystem();

	/**
	 * Sets the value of the '{@link homeworkPizzaShop.Webapplication#getStoremanagementsystem <em>Storemanagementsystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storemanagementsystem</em>' containment reference.
	 * @see #getStoremanagementsystem()
	 * @generated
	 */
	void setStoremanagementsystem(StoreManagementSystem value);

	/**
	 * Returns the value of the '<em><b>Website</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website</em>' containment reference.
	 * @see #setWebsite(Website)
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getWebapplication_Website()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Website getWebsite();

	/**
	 * Sets the value of the '{@link homeworkPizzaShop.Webapplication#getWebsite <em>Website</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website</em>' containment reference.
	 * @see #getWebsite()
	 * @generated
	 */
	void setWebsite(Website value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getWebapplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link homeworkPizzaShop.Webapplication#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Webapplication
