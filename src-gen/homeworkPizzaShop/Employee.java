/**
 */
package homeworkPizzaShop;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link homeworkPizzaShop.Employee#getEmployeeID <em>Employee ID</em>}</li>
 *   <li>{@link homeworkPizzaShop.Employee#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends User {
	/**
	 * Returns the value of the '<em><b>Employee ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee ID</em>' attribute.
	 * @see #setEmployeeID(int)
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getEmployee_EmployeeID()
	 * @model
	 * @generated
	 */
	int getEmployeeID();

	/**
	 * Sets the value of the '{@link homeworkPizzaShop.Employee#getEmployeeID <em>Employee ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee ID</em>' attribute.
	 * @see #getEmployeeID()
	 * @generated
	 */
	void setEmployeeID(int value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(String)
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getEmployee_Position()
	 * @model
	 * @generated
	 */
	String getPosition();

	/**
	 * Sets the value of the '{@link homeworkPizzaShop.Employee#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(String value);

} // Employee
