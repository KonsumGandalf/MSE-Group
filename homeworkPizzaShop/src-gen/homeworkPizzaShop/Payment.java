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
 *   <li>{@link homeworkPizzaShop.Payment#getCreditCardInfomration <em>Credit Card Infomration</em>}</li>
 *   <li>{@link homeworkPizzaShop.Payment#isIsSucessful <em>Is Sucessful</em>}</li>
 * </ul>
 *
 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getPayment()
 * @model
 * @generated
 */
public interface Payment extends EObject {
	/**
	 * Returns the value of the '<em><b>Credit Card Infomration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Card Infomration</em>' attribute.
	 * @see #setCreditCardInfomration(String)
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getPayment_CreditCardInfomration()
	 * @model
	 * @generated
	 */
	String getCreditCardInfomration();

	/**
	 * Sets the value of the '{@link homeworkPizzaShop.Payment#getCreditCardInfomration <em>Credit Card Infomration</em>}' attribute.
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
