/**
 */
package homeworkPizzaShop.impl;

import homeworkPizzaShop.Employee;
import homeworkPizzaShop.HomeworkPizzaShopPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link homeworkPizzaShop.impl.EmployeeImpl#getEmployeeID <em>Employee ID</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.EmployeeImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends UserImpl implements Employee {
	/**
	 * The default value of the '{@link #getEmployeeID() <em>Employee ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeID()
	 * @generated
	 * @ordered
	 */
	protected static final int EMPLOYEE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEmployeeID() <em>Employee ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeID()
	 * @generated
	 * @ordered
	 */
	protected int employeeID = EMPLOYEE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected String position = POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HomeworkPizzaShopPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEmployeeID() {
		return employeeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmployeeID(int newEmployeeID) {
		int oldEmployeeID = employeeID;
		employeeID = newEmployeeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.EMPLOYEE__EMPLOYEE_ID,
					oldEmployeeID, employeeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(String newPosition) {
		String oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.EMPLOYEE__POSITION,
					oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.EMPLOYEE__EMPLOYEE_ID:
			return getEmployeeID();
		case HomeworkPizzaShopPackage.EMPLOYEE__POSITION:
			return getPosition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.EMPLOYEE__EMPLOYEE_ID:
			setEmployeeID((Integer) newValue);
			return;
		case HomeworkPizzaShopPackage.EMPLOYEE__POSITION:
			setPosition((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.EMPLOYEE__EMPLOYEE_ID:
			setEmployeeID(EMPLOYEE_ID_EDEFAULT);
			return;
		case HomeworkPizzaShopPackage.EMPLOYEE__POSITION:
			setPosition(POSITION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.EMPLOYEE__EMPLOYEE_ID:
			return employeeID != EMPLOYEE_ID_EDEFAULT;
		case HomeworkPizzaShopPackage.EMPLOYEE__POSITION:
			return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (employeeID: ");
		result.append(employeeID);
		result.append(", position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
