/**
 */
package ecore_homework1.1.homework1_1;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link ecore_homework1.1.homework1_1.Webapplication#getStoremanagementsystem <em>Storemanagementsystem</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.Webapplication#getDomain <em>Domain</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.Webapplication#getWebpage <em>Webpage</em>}</li>
 * </ul>
 *
 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getWebapplication()
 * @model
 * @generated
 */
public interface Webapplication extends EObject
{
	/**
	 * Returns the value of the '<em><b>Storemanagementsystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storemanagementsystem</em>' containment reference.
	 * @see #setStoremanagementsystem(StoreManagementSystem)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getWebapplication_Storemanagementsystem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StoreManagementSystem getStoremanagementsystem();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.Webapplication#getStoremanagementsystem <em>Storemanagementsystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storemanagementsystem</em>' containment reference.
	 * @see #getStoremanagementsystem()
	 * @generated
	 */
	void setStoremanagementsystem(StoreManagementSystem value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getWebapplication_Domain()
	 * @model
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.Webapplication#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

	/**
	 * Returns the value of the '<em><b>Webpage</b></em>' containment reference list.
	 * The list contents are of type {@link ecore_homework1.1.homework1_1.Webpage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webpage</em>' containment reference list.
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getWebapplication_Webpage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Webpage> getWebpage();

} // Webapplication
