/**
 */
package homeworkPizzaShop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link homeworkPizzaShop.Payment#getTransactionNumber <em>Transaction Number</em>}</li>
 *   <li>{@link homeworkPizzaShop.Payment#isIsSucessful <em>Is Sucessful</em>}</li>
 * </ul>
 *
 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getPayment()
 * @model
 * @generated
 */
public interface Payment extends EObject {
	/**
	 * Returns the value of the '<em><b>Transaction Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Number</em>' attribute.
	 * @see #setTransactionNumber(int)
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getPayment_TransactionNumber()
	 * @model
	 * @generated
	 */
	int getTransactionNumber();

	/**
	 * Sets the value of the '{@link homeworkPizzaShop.Payment#getTransactionNumber <em>Transaction Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Number</em>' attribute.
	 * @see #getTransactionNumber()
	 * @generated
	 */
	void setTransactionNumber(int value);

	/**
	 * Returns the value of the '<em><b>Is Sucessful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sucessful</em>' attribute.
	 * @see #setIsSucessful(boolean)
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getPayment_IsSucessful()
	 * @model
	 * @generated
	 */
	boolean isIsSucessful();

	/**
	 * Sets the value of the '{@link homeworkPizzaShop.Payment#isIsSucessful <em>Is Sucessful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sucessful</em>' attribute.
	 * @see #isIsSucessful()
	 * @generated
	 */
	void setIsSucessful(boolean value);

} // Payment
