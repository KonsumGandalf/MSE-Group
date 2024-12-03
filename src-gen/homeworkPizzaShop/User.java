/**
 */
package homeworkPizzaShop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link homeworkPizzaShop.User#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link homeworkPizzaShop.User#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getUser()
 * @model abstract="true"
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Address</em>' attribute.
	 * @see #setEmailAddress(String)
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getUser_EmailAddress()
	 * @model
	 * @generated
	 */
	String getEmailAddress();

	/**
	 * Sets the value of the '{@link homeworkPizzaShop.User#getEmailAddress <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Address</em>' attribute.
	 * @see #getEmailAddress()
	 * @generated
	 */
	void setEmailAddress(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link homeworkPizzaShop.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // User
