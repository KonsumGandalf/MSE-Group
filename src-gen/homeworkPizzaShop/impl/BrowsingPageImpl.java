/**
 */
package homeworkPizzaShop.impl;

import homeworkPizzaShop.BrowsingPage;
import homeworkPizzaShop.Category;
import homeworkPizzaShop.HomeworkPizzaShopPackage;
import homeworkPizzaShop.ProductPage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Browsing Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link homeworkPizzaShop.impl.BrowsingPageImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link homeworkPizzaShop.impl.BrowsingPageImpl#getProductpage <em>Productpage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrowsingPageImpl extends WebpageImpl implements BrowsingPage {
	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final Category FILTER_EDEFAULT = Category.ON_SALE;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected Category filter = FILTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductpage() <em>Productpage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductpage()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductPage> productpage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrowsingPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HomeworkPizzaShopPackage.Literals.BROWSING_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilter(Category newFilter) {
		Category oldFilter = filter;
		filter = newFilter == null ? FILTER_EDEFAULT : newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPizzaShopPackage.BROWSING_PAGE__FILTER,
					oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductPage> getProductpage() {
		if (productpage == null) {
			productpage = new EObjectContainmentEList<ProductPage>(ProductPage.class, this,
					HomeworkPizzaShopPackage.BROWSING_PAGE__PRODUCTPAGE);
		}
		return productpage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.BROWSING_PAGE__PRODUCTPAGE:
			return ((InternalEList<?>) getProductpage()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.BROWSING_PAGE__FILTER:
			return getFilter();
		case HomeworkPizzaShopPackage.BROWSING_PAGE__PRODUCTPAGE:
			return getProductpage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HomeworkPizzaShopPackage.BROWSING_PAGE__FILTER:
			setFilter((Category) newValue);
			return;
		case HomeworkPizzaShopPackage.BROWSING_PAGE__PRODUCTPAGE:
			getProductpage().clear();
			getProductpage().addAll((Collection<? extends ProductPage>) newValue);
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
		case HomeworkPizzaShopPackage.BROWSING_PAGE__FILTER:
			setFilter(FILTER_EDEFAULT);
			return;
		case HomeworkPizzaShopPackage.BROWSING_PAGE__PRODUCTPAGE:
			getProductpage().clear();
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
		case HomeworkPizzaShopPackage.BROWSING_PAGE__FILTER:
			return filter != FILTER_EDEFAULT;
		case HomeworkPizzaShopPackage.BROWSING_PAGE__PRODUCTPAGE:
			return productpage != null && !productpage.isEmpty();
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
		result.append(" (filter: ");
		result.append(filter);
		result.append(')');
		return result.toString();
	}

} //BrowsingPageImpl
