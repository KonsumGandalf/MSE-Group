/**
 */
package ecore_homework1.1.homework1_1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore_homework1.1.homework1_1.Store#getStoreID <em>Store ID</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.Store#getAdress <em>Adress</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.Store#getOpeningHours <em>Opening Hours</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.Store#getEmployee <em>Employee</em>}</li>
 * </ul>
 *
 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getStore()
 * @model
 * @generated
 */
public interface Store extends EObject
{
	/**
	 * Returns the value of the '<em><b>Store ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store ID</em>' attribute.
	 * @see #setStoreID(int)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getStore_StoreID()
	 * @model
	 * @generated
	 */
	int getStoreID();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.Store#getStoreID <em>Store ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store ID</em>' attribute.
	 * @see #getStoreID()
	 * @generated
	 */
	void setStoreID(int value);

	/**
	 * Returns the value of the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adress</em>' attribute.
	 * @see #setAdress(String)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getStore_Adress()
	 * @model
	 * @generated
	 */
	String getAdress();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.Store#getAdress <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adress</em>' attribute.
	 * @see #getAdress()
	 * @generated
	 */
	void setAdress(String value);

	/**
	 * Returns the value of the '<em><b>Opening Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening Hours</em>' attribute.
	 * @see #setOpeningHours(String)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getStore_OpeningHours()
	 * @model
	 * @generated
	 */
	String getOpeningHours();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.Store#getOpeningHours <em>Opening Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening Hours</em>' attribute.
	 * @see #getOpeningHours()
	 * @generated
	 */
	void setOpeningHours(String value);

	/**
	 * Returns the value of the '<em><b>Employee</b></em>' containment reference list.
	 * The list contents are of type {@link ecore_homework1.1.homework1_1.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee</em>' containment reference list.
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getStore_Employee()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Employee> getEmployee();

} // Store
