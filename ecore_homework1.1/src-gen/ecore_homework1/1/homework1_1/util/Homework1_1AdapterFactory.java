/**
 */
package ecore_homework1.1.homework1_1.util;

import ecore_homework1.1.homework1_1.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ecore_homework1.1.homework1_1.Homework1_1Package
 * @generated
 */
public class Homework1_1AdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Homework1_1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Homework1_1AdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = Homework1_1Package.eINSTANCE;
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
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Homework1_1Switch<Adapter> modelSwitch =
		new Homework1_1Switch<Adapter>()
		{
			@Override
			public Adapter caseWebpage(Webpage object)
			{
				return createWebpageAdapter();
			}
			@Override
			public Adapter caseProductPage(ProductPage object)
			{
				return createProductPageAdapter();
			}
			@Override
			public Adapter caseInformationPage(InformationPage object)
			{
				return createInformationPageAdapter();
			}
			@Override
			public Adapter caseBrowsingPage(BrowsingPage object)
			{
				return createBrowsingPageAdapter();
			}
			@Override
			public Adapter caseLandingPage(LandingPage object)
			{
				return createLandingPageAdapter();
			}
			@Override
			public Adapter caseShoppingCart(ShoppingCart object)
			{
				return createShoppingCartAdapter();
			}
			@Override
			public Adapter caseCartItem(CartItem object)
			{
				return createCartItemAdapter();
			}
			@Override
			public Adapter caseProduct(Product object)
			{
				return createProductAdapter();
			}
			@Override
			public Adapter caseCustomer(Customer object)
			{
				return createCustomerAdapter();
			}
			@Override
			public Adapter caseWebapplication(Webapplication object)
			{
				return createWebapplicationAdapter();
			}
			@Override
			public Adapter caseStoreManagementSystem(StoreManagementSystem object)
			{
				return createStoreManagementSystemAdapter();
			}
			@Override
			public Adapter caseOrder(Order object)
			{
				return createOrderAdapter();
			}
			@Override
			public Adapter caseUser(User object)
			{
				return createUserAdapter();
			}
			@Override
			public Adapter caseEmployee(Employee object)
			{
				return createEmployeeAdapter();
			}
			@Override
			public Adapter casePayment(Payment object)
			{
				return createPaymentAdapter();
			}
			@Override
			public Adapter caseStore(Store object)
			{
				return createStoreAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
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
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ecore_homework1.1.homework1_1.Webpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore_homework1.1.homework1_1.Webpage
	 * @generated
	 */
	public Adapter createWebpageAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore_homework1.1.homework1_1.ProductPage <em>Product Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore_homework1.1.homework1_1.ProductPage
	 * @generated
	 */
	public Adapter createProductPageAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore_homework1.1.homework1_1.InformationPage <em>Information Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore_homework1.1.homework1_1.InformationPage
	 * @generated
	 */
	public Adapter createInformationPageAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore_homework1.1.homework1_1.BrowsingPage <em>Browsing Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore_homework1.1.homework1_1.BrowsingPage
	 * @generated
	 */
	public Adapter createBrowsingPageAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore_homework1.1.homework1_1.LandingPage <em>Landing Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore_homework1.1.homework1_1.LandingPage
	 * @generated
	 */
	public Adapter createLandingPageAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore_homework1.1.homework1_1.ShoppingCart <em>Shopping Cart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore_homework1.1.homework1_1.ShoppingCart
	 * @generated
	 */
	public Adapter createShoppingCartAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore_homework1.1.homework1_1.CartItem <em>Cart Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore_homework1.1.homework1_1.CartItem
	 * @generated
	 */
	public Adapter createCartItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore_homework1.1.homework1_1.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore_homework1.1.homework1_1.Product
	 * @generated
	 */
	public Adapter createProductAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore_homework1.1.homework1_1.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore_homework1.1.homework1_1.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore_homework1.1.homework1_1.Webapplication <em>Webapplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore_homework1.1.homework1_1.Webapplication
	 * @generated
	 */
	public Adapter createWebapplicationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore_homework1.1.homework1_1.StoreManagementSystem <em>Store Management System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore_homework1.1.homework1_1.StoreManagementSystem
	 * @generated
	 */
	public Adapter createStoreManagementSystemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore_homework1.1.homework1_1.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore_homework1.1.homework1_1.Order
	 * @generated
	 */
	public Adapter createOrderAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore_homework1.1.homework1_1.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore_homework1.1.homework1_1.User
	 * @generated
	 */
	public Adapter createUserAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore_homework1.1.homework1_1.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore_homework1.1.homework1_1.Employee
	 * @generated
	 */
	public Adapter createEmployeeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore_homework1.1.homework1_1.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore_homework1.1.homework1_1.Payment
	 * @generated
	 */
	public Adapter createPaymentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecore_homework1.1.homework1_1.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecore_homework1.1.homework1_1.Store
	 * @generated
	 */
	public Adapter createStoreAdapter()
	{
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
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //Homework1_1AdapterFactory
