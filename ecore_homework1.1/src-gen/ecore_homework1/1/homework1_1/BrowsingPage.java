/**
 */
package ecore_homework1.1.homework1_1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Browsing Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore_homework1.1.homework1_1.BrowsingPage#getFilter <em>Filter</em>}</li>
 *   <li>{@link ecore_homework1.1.homework1_1.BrowsingPage#getProductpage <em>Productpage</em>}</li>
 * </ul>
 *
 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getBrowsingPage()
 * @model
 * @generated
 */
public interface BrowsingPage extends Webpage
{
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * The literals are from the enumeration {@link ecore_homework1.1.homework1_1.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see ecore_homework1.1.homework1_1.Category
	 * @see #setFilter(Category)
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getBrowsingPage_Filter()
	 * @model
	 * @generated
	 */
	Category getFilter();

	/**
	 * Sets the value of the '{@link ecore_homework1.1.homework1_1.BrowsingPage#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see ecore_homework1.1.homework1_1.Category
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(Category value);

	/**
	 * Returns the value of the '<em><b>Productpage</b></em>' containment reference list.
	 * The list contents are of type {@link ecore_homework1.1.homework1_1.ProductPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productpage</em>' containment reference list.
	 * @see ecore_homework1.1.homework1_1.Homework1_1Package#getBrowsingPage_Productpage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductPage> getProductpage();

} // BrowsingPage
