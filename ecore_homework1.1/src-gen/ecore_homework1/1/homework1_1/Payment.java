/**
 */
package ecore_homework1.1.homework1_1;

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
 *   <li>{@link ecore_homework1.1.homework1_1.Payment#getCreditCardInfomration <em>Credit Card Infomration</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.Payment#isIsSucessful <em>Is Sucessful</em>}</li>
 * </ul>
 *
 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getPayment()
 * @model
 * @generated
 */
public interface Payment extends EObject
{
	/**
	 * Returns the value of the '<em><b>Credit Card Infomration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Card Infomration</em>' attribute.
	 * @see #setCreditCardInfomration(String)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getPayment_CreditCardInfomration()
	 * @model
	 * @generated
	 */
	String getCreditCardInfomration();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.Payment#getCreditCardInfomration <em>Credit Card Infomration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Card Infomration</em>' attribute.
	 * @see #getCreditCardInfomration()
	 * @generated
	 */
	void setCreditCardInfomration(String value);

	/**
	 * Returns the value of the '<em><b>Is Sucessful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sucessful</em>' attribute.
	 * @see #setIsSucessful(boolean)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getPayment_IsSucessful()
	 * @model
	 * @generated
	 */
	boolean isIsSucessful();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.Payment#isIsSucessful <em>Is Sucessful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sucessful</em>' attribute.
	 * @see #isIsSucessful()
	 * @generated
	 */
	void setIsSucessful(boolean value);

} // Payment
