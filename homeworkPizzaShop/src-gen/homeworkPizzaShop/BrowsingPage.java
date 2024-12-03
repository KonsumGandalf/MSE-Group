/**
 */
package homeworkPizzaShop;

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
 *   <li>{@link homeworkPizzaShop.BrowsingPage#getFilter <em>Filter</em>}</li>
 *   <li>{@link homeworkPizzaShop.BrowsingPage#getProductpage <em>Productpage</em>}</li>
 * </ul>
 *
 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getBrowsingPage()
 * @model
 * @generated
 */
public interface BrowsingPage extends Webpage {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * The literals are from the enumeration {@link homeworkPizzaShop.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see homeworkPizzaShop.Category
	 * @see #setFilter(Category)
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getBrowsingPage_Filter()
	 * @model
	 * @generated
	 */
	Category getFilter();

	/**
	 * Sets the value of the '{@link homeworkPizzaShop.BrowsingPage#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see homeworkPizzaShop.Category
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(Category value);

	/**
	 * Returns the value of the '<em><b>Productpage</b></em>' containment reference list.
	 * The list contents are of type {@link homeworkPizzaShop.ProductPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productpage</em>' containment reference list.
	 * @see homeworkPizzaShop.HomeworkPizzaShopPackage#getBrowsingPage_Productpage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductPage> getProductpage();

} // BrowsingPage
