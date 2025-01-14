/**
 */
package homeworkPizzaShop.provider;

import homeworkPizzaShop.util.HomeworkPizzaShopAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HomeworkPizzaShopItemProviderAdapterFactory extends HomeworkPizzaShopAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HomeworkPizzaShopItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link homeworkPizzaShop.BrowsingPage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrowsingPageItemProvider browsingPageItemProvider;

	/**
	 * This creates an adapter for a {@link homeworkPizzaShop.BrowsingPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBrowsingPageAdapter() {
		if (browsingPageItemProvider == null) {
			browsingPageItemProvider = new BrowsingPageItemProvider(this);
		}

		return browsingPageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link homeworkPizzaShop.ProductPage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPageItemProvider productPageItemProvider;

	/**
	 * This creates an adapter for a {@link homeworkPizzaShop.ProductPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductPageAdapter() {
		if (productPageItemProvider == null) {
			productPageItemProvider = new ProductPageItemProvider(this);
		}

		return productPageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link homeworkPizzaShop.CartItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartItemItemProvider cartItemItemProvider;

	/**
	 * This creates an adapter for a {@link homeworkPizzaShop.CartItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCartItemAdapter() {
		if (cartItemItemProvider == null) {
			cartItemItemProvider = new CartItemItemProvider(this);
		}

		return cartItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link homeworkPizzaShop.ShoppingCart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShoppingCartItemProvider shoppingCartItemProvider;

	/**
	 * This creates an adapter for a {@link homeworkPizzaShop.ShoppingCart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShoppingCartAdapter() {
		if (shoppingCartItemProvider == null) {
			shoppingCartItemProvider = new ShoppingCartItemProvider(this);
		}

		return shoppingCartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link homeworkPizzaShop.Product} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductItemProvider productItemProvider;

	/**
	 * This creates an adapter for a {@link homeworkPizzaShop.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductAdapter() {
		if (productItemProvider == null) {
			productItemProvider = new ProductItemProvider(this);
		}

		return productItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link homeworkPizzaShop.Employee} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeItemProvider employeeItemProvider;

	/**
	 * This creates an adapter for a {@link homeworkPizzaShop.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmployeeAdapter() {
		if (employeeItemProvider == null) {
			employeeItemProvider = new EmployeeItemProvider(this);
		}

		return employeeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link homeworkPizzaShop.Customer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerItemProvider customerItemProvider;

	/**
	 * This creates an adapter for a {@link homeworkPizzaShop.Customer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomerAdapter() {
		if (customerItemProvider == null) {
			customerItemProvider = new CustomerItemProvider(this);
		}

		return customerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link homeworkPizzaShop.InformationPage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationPageItemProvider informationPageItemProvider;

	/**
	 * This creates an adapter for a {@link homeworkPizzaShop.InformationPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInformationPageAdapter() {
		if (informationPageItemProvider == null) {
			informationPageItemProvider = new InformationPageItemProvider(this);
		}

		return informationPageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link homeworkPizzaShop.LandingPage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandingPageItemProvider landingPageItemProvider;

	/**
	 * This creates an adapter for a {@link homeworkPizzaShop.LandingPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLandingPageAdapter() {
		if (landingPageItemProvider == null) {
			landingPageItemProvider = new LandingPageItemProvider(this);
		}

		return landingPageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link homeworkPizzaShop.Order} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItemProvider orderItemProvider;

	/**
	 * This creates an adapter for a {@link homeworkPizzaShop.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrderAdapter() {
		if (orderItemProvider == null) {
			orderItemProvider = new OrderItemProvider(this);
		}

		return orderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link homeworkPizzaShop.Store} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreItemProvider storeItemProvider;

	/**
	 * This creates an adapter for a {@link homeworkPizzaShop.Store}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStoreAdapter() {
		if (storeItemProvider == null) {
			storeItemProvider = new StoreItemProvider(this);
		}

		return storeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link homeworkPizzaShop.Webapplication} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebapplicationItemProvider webapplicationItemProvider;

	/**
	 * This creates an adapter for a {@link homeworkPizzaShop.Webapplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWebapplicationAdapter() {
		if (webapplicationItemProvider == null) {
			webapplicationItemProvider = new WebapplicationItemProvider(this);
		}

		return webapplicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link homeworkPizzaShop.Payment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentItemProvider paymentItemProvider;

	/**
	 * This creates an adapter for a {@link homeworkPizzaShop.Payment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPaymentAdapter() {
		if (paymentItemProvider == null) {
			paymentItemProvider = new PaymentItemProvider(this);
		}

		return paymentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link homeworkPizzaShop.StoreManagementSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreManagementSystemItemProvider storeManagementSystemItemProvider;

	/**
	 * This creates an adapter for a {@link homeworkPizzaShop.StoreManagementSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStoreManagementSystemAdapter() {
		if (storeManagementSystemItemProvider == null) {
			storeManagementSystemItemProvider = new StoreManagementSystemItemProvider(this);
		}

		return storeManagementSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link homeworkPizzaShop.Website} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebsiteItemProvider websiteItemProvider;

	/**
	 * This creates an adapter for a {@link homeworkPizzaShop.Website}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWebsiteAdapter() {
		if (websiteItemProvider == null) {
			websiteItemProvider = new WebsiteItemProvider(this);
		}

		return websiteItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (browsingPageItemProvider != null)
			browsingPageItemProvider.dispose();
		if (productPageItemProvider != null)
			productPageItemProvider.dispose();
		if (cartItemItemProvider != null)
			cartItemItemProvider.dispose();
		if (shoppingCartItemProvider != null)
			shoppingCartItemProvider.dispose();
		if (productItemProvider != null)
			productItemProvider.dispose();
		if (employeeItemProvider != null)
			employeeItemProvider.dispose();
		if (customerItemProvider != null)
			customerItemProvider.dispose();
		if (informationPageItemProvider != null)
			informationPageItemProvider.dispose();
		if (landingPageItemProvider != null)
			landingPageItemProvider.dispose();
		if (orderItemProvider != null)
			orderItemProvider.dispose();
		if (storeItemProvider != null)
			storeItemProvider.dispose();
		if (webapplicationItemProvider != null)
			webapplicationItemProvider.dispose();
		if (paymentItemProvider != null)
			paymentItemProvider.dispose();
		if (storeManagementSystemItemProvider != null)
			storeManagementSystemItemProvider.dispose();
		if (websiteItemProvider != null)
			websiteItemProvider.dispose();
	}

}
