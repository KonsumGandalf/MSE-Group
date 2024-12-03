/**
 */
package homeworkPizzaShop.impl;

import homeworkPizzaShop.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HomeworkPizzaShopFactoryImpl extends EFactoryImpl implements HomeworkPizzaShopFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HomeworkPizzaShopFactory init() {
		try {
			HomeworkPizzaShopFactory theHomeworkPizzaShopFactory = (HomeworkPizzaShopFactory) EPackage.Registry.INSTANCE
					.getEFactory(HomeworkPizzaShopPackage.eNS_URI);
			if (theHomeworkPizzaShopFactory != null) {
				return theHomeworkPizzaShopFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HomeworkPizzaShopFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HomeworkPizzaShopFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case HomeworkPizzaShopPackage.BROWSING_PAGE:
			return createBrowsingPage();
		case HomeworkPizzaShopPackage.PRODUCT_PAGE:
			return createProductPage();
		case HomeworkPizzaShopPackage.CART_ITEM:
			return createCartItem();
		case HomeworkPizzaShopPackage.SHOPPING_CART:
			return createShoppingCart();
		case HomeworkPizzaShopPackage.PRODUCT:
			return createProduct();
		case HomeworkPizzaShopPackage.EMPLOYEE:
			return createEmployee();
		case HomeworkPizzaShopPackage.CUSTOMER:
			return createCustomer();
		case HomeworkPizzaShopPackage.INFORMATION_PAGE:
			return createInformationPage();
		case HomeworkPizzaShopPackage.LANDING_PAGE:
			return createLandingPage();
		case HomeworkPizzaShopPackage.ORDER:
			return createOrder();
		case HomeworkPizzaShopPackage.STORE:
			return createStore();
		case HomeworkPizzaShopPackage.WEBAPPLICATION:
			return createWebapplication();
		case HomeworkPizzaShopPackage.PAYMENT:
			return createPayment();
		case HomeworkPizzaShopPackage.STORE_MANAGEMENT_SYSTEM:
			return createStoreManagementSystem();
		case HomeworkPizzaShopPackage.WEBSITE:
			return createWebsite();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case HomeworkPizzaShopPackage.STATUS:
			return createStatusFromString(eDataType, initialValue);
		case HomeworkPizzaShopPackage.CATEGORY:
			return createCategoryFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case HomeworkPizzaShopPackage.STATUS:
			return convertStatusToString(eDataType, instanceValue);
		case HomeworkPizzaShopPackage.CATEGORY:
			return convertCategoryToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BrowsingPage createBrowsingPage() {
		BrowsingPageImpl browsingPage = new BrowsingPageImpl();
		return browsingPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPage createProductPage() {
		ProductPageImpl productPage = new ProductPageImpl();
		return productPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CartItem createCartItem() {
		CartItemImpl cartItem = new CartItemImpl();
		return cartItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShoppingCart createShoppingCart() {
		ShoppingCartImpl shoppingCart = new ShoppingCartImpl();
		return shoppingCart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InformationPage createInformationPage() {
		InformationPageImpl informationPage = new InformationPageImpl();
		return informationPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingPage createLandingPage() {
		LandingPageImpl landingPage = new LandingPageImpl();
		return landingPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Store createStore() {
		StoreImpl store = new StoreImpl();
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Webapplication createWebapplication() {
		WebapplicationImpl webapplication = new WebapplicationImpl();
		return webapplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Payment createPayment() {
		PaymentImpl payment = new PaymentImpl();
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoreManagementSystem createStoreManagementSystem() {
		StoreManagementSystemImpl storeManagementSystem = new StoreManagementSystemImpl();
		return storeManagementSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Website createWebsite() {
		WebsiteImpl website = new WebsiteImpl();
		return website;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatusFromString(EDataType eDataType, String initialValue) {
		Status result = Status.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategoryFromString(EDataType eDataType, String initialValue) {
		Category result = Category.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HomeworkPizzaShopPackage getHomeworkPizzaShopPackage() {
		return (HomeworkPizzaShopPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HomeworkPizzaShopPackage getPackage() {
		return HomeworkPizzaShopPackage.eINSTANCE;
	}

} //HomeworkPizzaShopFactoryImpl
