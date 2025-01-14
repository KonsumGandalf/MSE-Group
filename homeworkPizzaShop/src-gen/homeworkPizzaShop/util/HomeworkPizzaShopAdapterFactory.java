/**
 */
package homeworkPizzaShop.util;

import homeworkPizzaShop.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see homeworkPizzaShop.HomeworkPizzaShopPackage
 * @generated
 */
public class HomeworkPizzaShopAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HomeworkPizzaShopPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HomeworkPizzaShopAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HomeworkPizzaShopPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HomeworkPizzaShopSwitch<Adapter> modelSwitch = new HomeworkPizzaShopSwitch<Adapter>() {
		@Override
		public Adapter caseBrowsingPage(BrowsingPage object) {
			return createBrowsingPageAdapter();
		}

		@Override
		public Adapter caseUser(User object) {
			return createUserAdapter();
		}

		@Override
		public Adapter caseProductPage(ProductPage object) {
			return createProductPageAdapter();
		}

		@Override
		public Adapter caseCartItem(CartItem object) {
			return createCartItemAdapter();
		}

		@Override
		public Adapter caseShoppingCart(ShoppingCart object) {
			return createShoppingCartAdapter();
		}

		@Override
		public Adapter caseProduct(Product object) {
			return createProductAdapter();
		}

		@Override
		public Adapter caseEmployee(Employee object) {
			return createEmployeeAdapter();
		}

		@Override
		public Adapter caseWebpage(Webpage object) {
			return createWebpageAdapter();
		}

		@Override
		public Adapter caseCustomer(Customer object) {
			return createCustomerAdapter();
		}

		@Override
		public Adapter caseInformationPage(InformationPage object) {
			return createInformationPageAdapter();
		}

		@Override
		public Adapter caseLandingPage(LandingPage object) {
			return createLandingPageAdapter();
		}

		@Override
		public Adapter caseOrder(Order object) {
			return createOrderAdapter();
		}

		@Override
		public Adapter caseStore(Store object) {
			return createStoreAdapter();
		}

		@Override
		public Adapter caseWebapplication(Webapplication object) {
			return createWebapplicationAdapter();
		}

		@Override
		public Adapter casePayment(Payment object) {
			return createPaymentAdapter();
		}

		@Override
		public Adapter caseStoreManagementSystem(StoreManagementSystem object) {
			return createStoreManagementSystemAdapter();
		}

		@Override
		public Adapter caseWebsite(Website object) {
			return createWebsiteAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link homeworkPizzaShop.BrowsingPage <em>Browsing Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see homeworkPizzaShop.BrowsingPage
	 * @generated
	 */
	public Adapter createBrowsingPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link homeworkPizzaShop.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see homeworkPizzaShop.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link homeworkPizzaShop.ProductPage <em>Product Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see homeworkPizzaShop.ProductPage
	 * @generated
	 */
	public Adapter createProductPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link homeworkPizzaShop.CartItem <em>Cart Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see homeworkPizzaShop.CartItem
	 * @generated
	 */
	public Adapter createCartItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link homeworkPizzaShop.ShoppingCart <em>Shopping Cart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see homeworkPizzaShop.ShoppingCart
	 * @generated
	 */
	public Adapter createShoppingCartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link homeworkPizzaShop.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see homeworkPizzaShop.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link homeworkPizzaShop.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see homeworkPizzaShop.Employee
	 * @generated
	 */
	public Adapter createEmployeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link homeworkPizzaShop.Webpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see homeworkPizzaShop.Webpage
	 * @generated
	 */
	public Adapter createWebpageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link homeworkPizzaShop.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see homeworkPizzaShop.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link homeworkPizzaShop.InformationPage <em>Information Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see homeworkPizzaShop.InformationPage
	 * @generated
	 */
	public Adapter createInformationPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link homeworkPizzaShop.LandingPage <em>Landing Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see homeworkPizzaShop.LandingPage
	 * @generated
	 */
	public Adapter createLandingPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link homeworkPizzaShop.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see homeworkPizzaShop.Order
	 * @generated
	 */
	public Adapter createOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link homeworkPizzaShop.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see homeworkPizzaShop.Store
	 * @generated
	 */
	public Adapter createStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link homeworkPizzaShop.Webapplication <em>Webapplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see homeworkPizzaShop.Webapplication
	 * @generated
	 */
	public Adapter createWebapplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link homeworkPizzaShop.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see homeworkPizzaShop.Payment
	 * @generated
	 */
	public Adapter createPaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link homeworkPizzaShop.StoreManagementSystem <em>Store Management System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see homeworkPizzaShop.StoreManagementSystem
	 * @generated
	 */
	public Adapter createStoreManagementSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link homeworkPizzaShop.Website <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see homeworkPizzaShop.Website
	 * @generated
	 */
	public Adapter createWebsiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HomeworkPizzaShopAdapterFactory
