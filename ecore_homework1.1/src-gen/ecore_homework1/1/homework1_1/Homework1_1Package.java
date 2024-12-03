/**
 */
package ecore_homework1.1.homework1_1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ecore_homework1.1.homework1_1.Homework1_1Factory
 * @model kind="package"
 * @generated
 */
public interface Homework1_1Package extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "homework1_1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/homework1_1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "homework1_1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Homework1_1Package eINSTANCE = ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl.init();

	/**
	 * The meta object id for the '{@link ecore_homework1.1.homework1_1.impl.WebpageImpl <em>Webpage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore_homework1.1.homework1_1.impl.WebpageImpl
	 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getWebpage()
	 * @generated
	 */
	int WEBPAGE = 0;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE__URL = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE__TITLE = 1;

	/**
	 * The number of structural features of the '<em>Webpage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Webpage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore_homework1.1.homework1_1.impl.ProductPageImpl <em>Product Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore_homework1.1.homework1_1.impl.ProductPageImpl
	 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getProductPage()
	 * @generated
	 */
	int PRODUCT_PAGE = 1;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAGE__URL = WEBPAGE__URL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAGE__TITLE = WEBPAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAGE__DESCRIPTION = WEBPAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAGE__RATING = WEBPAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAGE__PRODUCT = WEBPAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAGE_FEATURE_COUNT = WEBPAGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Product Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAGE_OPERATION_COUNT = WEBPAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecore_homework1.1.homework1_1.impl.InformationPageImpl <em>Information Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore_homework1.1.homework1_1.impl.InformationPageImpl
	 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getInformationPage()
	 * @generated
	 */
	int INFORMATION_PAGE = 2;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_PAGE__URL = WEBPAGE__URL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_PAGE__TITLE = WEBPAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_PAGE__TEXT = WEBPAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Information Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_PAGE_FEATURE_COUNT = WEBPAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Information Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_PAGE_OPERATION_COUNT = WEBPAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecore_homework1.1.homework1_1.impl.BrowsingPageImpl <em>Browsing Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore_homework1.1.homework1_1.impl.BrowsingPageImpl
	 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getBrowsingPage()
	 * @generated
	 */
	int BROWSING_PAGE = 3;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSING_PAGE__URL = WEBPAGE__URL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSING_PAGE__TITLE = WEBPAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSING_PAGE__FILTER = WEBPAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Productpage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSING_PAGE__PRODUCTPAGE = WEBPAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Browsing Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSING_PAGE_FEATURE_COUNT = WEBPAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Browsing Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSING_PAGE_OPERATION_COUNT = WEBPAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecore_homework1.1.homework1_1.impl.LandingPageImpl <em>Landing Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore_homework1.1.homework1_1.impl.LandingPageImpl
	 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getLandingPage()
	 * @generated
	 */
	int LANDING_PAGE = 4;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAGE__URL = WEBPAGE__URL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAGE__TITLE = WEBPAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Welcome Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAGE__WELCOME_MESSAGE = WEBPAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Landing Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAGE_FEATURE_COUNT = WEBPAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Landing Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAGE_OPERATION_COUNT = WEBPAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecore_homework1.1.homework1_1.impl.ShoppingCartImpl <em>Shopping Cart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore_homework1.1.homework1_1.impl.ShoppingCartImpl
	 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getShoppingCart()
	 * @generated
	 */
	int SHOPPING_CART = 5;

	/**
	 * The feature id for the '<em><b>Total Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_CART__TOTAL_PRICE = 0;

	/**
	 * The feature id for the '<em><b>Discrount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_CART__DISCROUNT = 1;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_CART__CUSTOMER = 2;

	/**
	 * The feature id for the '<em><b>Cartitem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_CART__CARTITEM = 3;

	/**
	 * The number of structural features of the '<em>Shopping Cart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_CART_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Shopping Cart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_CART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore_homework1.1.homework1_1.impl.CartItemImpl <em>Cart Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore_homework1.1.homework1_1.impl.CartItemImpl
	 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getCartItem()
	 * @generated
	 */
	int CART_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Extra Wishes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ITEM__EXTRA_WISHES = 0;

	/**
	 * The number of structural features of the '<em>Cart Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cart Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore_homework1.1.homework1_1.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore_homework1.1.homework1_1.impl.ProductImpl
	 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 7;

	/**
	 * The feature id for the '<em><b>Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_ID = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TITLE = 2;

	/**
	 * The feature id for the '<em><b>In Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__IN_STOCK = 3;

	/**
	 * The feature id for the '<em><b>Cartitem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CARTITEM = 4;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore_homework1.1.homework1_1.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore_homework1.1.homework1_1.impl.UserImpl
	 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getUser()
	 * @generated
	 */
	int USER = 12;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore_homework1.1.homework1_1.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore_homework1.1.homework1_1.impl.CustomerImpl
	 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 8;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EMAIL_ADDRESS = USER__EMAIL_ADDRESS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Customer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CUSTOMER_ID = USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = USER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecore_homework1.1.homework1_1.impl.WebapplicationImpl <em>Webapplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore_homework1.1.homework1_1.impl.WebapplicationImpl
	 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getWebapplication()
	 * @generated
	 */
	int WEBAPPLICATION = 9;

	/**
	 * The feature id for the '<em><b>Storemanagementsystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBAPPLICATION__STOREMANAGEMENTSYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBAPPLICATION__DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Webpage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBAPPLICATION__WEBPAGE = 2;

	/**
	 * The number of structural features of the '<em>Webapplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBAPPLICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Webapplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBAPPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore_homework1.1.homework1_1.impl.StoreManagementSystemImpl <em>Store Management System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore_homework1.1.homework1_1.impl.StoreManagementSystemImpl
	 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getStoreManagementSystem()
	 * @generated
	 */
	int STORE_MANAGEMENT_SYSTEM = 10;

	/**
	 * The feature id for the '<em><b>Store</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_MANAGEMENT_SYSTEM__STORE = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_MANAGEMENT_SYSTEM__USER = 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_MANAGEMENT_SYSTEM__ORDER = 2;

	/**
	 * The number of structural features of the '<em>Store Management System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_MANAGEMENT_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Store Management System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_MANAGEMENT_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore_homework1.1.homework1_1.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore_homework1.1.homework1_1.impl.OrderImpl
	 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 11;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__IS_ACTIVE = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Order ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDER_ID = 3;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PAYMENT = 4;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__CUSTOMER = 5;

	/**
	 * The feature id for the '<em><b>Employee</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__EMPLOYEE = 6;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore_homework1.1.homework1_1.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore_homework1.1.homework1_1.impl.EmployeeImpl
	 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 13;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMAIL_ADDRESS = USER__EMAIL_ADDRESS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Employee ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMPLOYEE_ID = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__POSITION = USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = USER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecore_homework1.1.homework1_1.impl.PaymentImpl <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore_homework1.1.homework1_1.impl.PaymentImpl
	 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 14;

	/**
	 * The feature id for the '<em><b>Credit Card Infomration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__CREDIT_CARD_INFOMRATION = 0;

	/**
	 * The feature id for the '<em><b>Is Sucessful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__IS_SUCESSFUL = 1;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore_homework1.1.homework1_1.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore_homework1.1.homework1_1.impl.StoreImpl
	 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getStore()
	 * @generated
	 */
	int STORE = 15;

	/**
	 * The feature id for the '<em><b>Store ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__STORE_ID = 0;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ADRESS = 1;

	/**
	 * The feature id for the '<em><b>Opening Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__OPENING_HOURS = 2;

	/**
	 * The feature id for the '<em><b>Employee</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__EMPLOYEE = 3;

	/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore_homework1.1.homework1_1.Category <em>Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore_homework1.1.homework1_1.Category
	 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 16;

	/**
	 * The meta object id for the '{@link ecore_homework1.1.homework1_1.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore_homework1.1.homework1_1.Status
	 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 17;


	/**
	 * Returns the meta object for class '{@link ecore_homework1.1.homework1_1.Webpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Webpage</em>'.
	 * @see ecore_homework1.1.homework1_1.Webpage
	 * @generated
	 */
	EClass getWebpage();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.Webpage#getURL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URL</em>'.
	 * @see ecore_homework1.1.homework1_1.Webpage#getURL()
	 * @see #getWebpage()
	 * @generated
	 */
	EAttribute getWebpage_URL();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.Webpage#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see ecore_homework1.1.homework1_1.Webpage#getTitle()
	 * @see #getWebpage()
	 * @generated
	 */
	EAttribute getWebpage_Title();

	/**
	 * Returns the meta object for class '{@link ecore_homework1.1.homework1_1.ProductPage <em>Product Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Page</em>'.
	 * @see ecore_homework1.1.homework1_1.ProductPage
	 * @generated
	 */
	EClass getProductPage();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.ProductPage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ecore_homework1.1.homework1_1.ProductPage#getDescription()
	 * @see #getProductPage()
	 * @generated
	 */
	EAttribute getProductPage_Description();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.ProductPage#getRating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rating</em>'.
	 * @see ecore_homework1.1.homework1_1.ProductPage#getRating()
	 * @see #getProductPage()
	 * @generated
	 */
	EAttribute getProductPage_Rating();

	/**
	 * Returns the meta object for the containment reference '{@link ecore_homework1.1.homework1_1.ProductPage#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product</em>'.
	 * @see ecore_homework1.1.homework1_1.ProductPage#getProduct()
	 * @see #getProductPage()
	 * @generated
	 */
	EReference getProductPage_Product();

	/**
	 * Returns the meta object for class '{@link ecore_homework1.1.homework1_1.InformationPage <em>Information Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Page</em>'.
	 * @see ecore_homework1.1.homework1_1.InformationPage
	 * @generated
	 */
	EClass getInformationPage();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.InformationPage#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ecore_homework1.1.homework1_1.InformationPage#getText()
	 * @see #getInformationPage()
	 * @generated
	 */
	EAttribute getInformationPage_Text();

	/**
	 * Returns the meta object for class '{@link ecore_homework1.1.homework1_1.BrowsingPage <em>Browsing Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Browsing Page</em>'.
	 * @see ecore_homework1.1.homework1_1.BrowsingPage
	 * @generated
	 */
	EClass getBrowsingPage();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.BrowsingPage#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see ecore_homework1.1.homework1_1.BrowsingPage#getFilter()
	 * @see #getBrowsingPage()
	 * @generated
	 */
	EAttribute getBrowsingPage_Filter();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore_homework1.1.homework1_1.BrowsingPage#getProductpage <em>Productpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Productpage</em>'.
	 * @see ecore_homework1.1.homework1_1.BrowsingPage#getProductpage()
	 * @see #getBrowsingPage()
	 * @generated
	 */
	EReference getBrowsingPage_Productpage();

	/**
	 * Returns the meta object for class '{@link ecore_homework1.1.homework1_1.LandingPage <em>Landing Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Landing Page</em>'.
	 * @see ecore_homework1.1.homework1_1.LandingPage
	 * @generated
	 */
	EClass getLandingPage();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.LandingPage#getWelcomeMessage <em>Welcome Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Welcome Message</em>'.
	 * @see ecore_homework1.1.homework1_1.LandingPage#getWelcomeMessage()
	 * @see #getLandingPage()
	 * @generated
	 */
	EAttribute getLandingPage_WelcomeMessage();

	/**
	 * Returns the meta object for class '{@link ecore_homework1.1.homework1_1.ShoppingCart <em>Shopping Cart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shopping Cart</em>'.
	 * @see ecore_homework1.1.homework1_1.ShoppingCart
	 * @generated
	 */
	EClass getShoppingCart();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.ShoppingCart#getTotalPrice <em>Total Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Price</em>'.
	 * @see ecore_homework1.1.homework1_1.ShoppingCart#getTotalPrice()
	 * @see #getShoppingCart()
	 * @generated
	 */
	EAttribute getShoppingCart_TotalPrice();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.ShoppingCart#getDiscrount <em>Discrount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discrount</em>'.
	 * @see ecore_homework1.1.homework1_1.ShoppingCart#getDiscrount()
	 * @see #getShoppingCart()
	 * @generated
	 */
	EAttribute getShoppingCart_Discrount();

	/**
	 * Returns the meta object for the containment reference '{@link ecore_homework1.1.homework1_1.ShoppingCart#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Customer</em>'.
	 * @see ecore_homework1.1.homework1_1.ShoppingCart#getCustomer()
	 * @see #getShoppingCart()
	 * @generated
	 */
	EReference getShoppingCart_Customer();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore_homework1.1.homework1_1.ShoppingCart#getCartitem <em>Cartitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cartitem</em>'.
	 * @see ecore_homework1.1.homework1_1.ShoppingCart#getCartitem()
	 * @see #getShoppingCart()
	 * @generated
	 */
	EReference getShoppingCart_Cartitem();

	/**
	 * Returns the meta object for class '{@link ecore_homework1.1.homework1_1.CartItem <em>Cart Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cart Item</em>'.
	 * @see ecore_homework1.1.homework1_1.CartItem
	 * @generated
	 */
	EClass getCartItem();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.CartItem#getExtraWishes <em>Extra Wishes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Wishes</em>'.
	 * @see ecore_homework1.1.homework1_1.CartItem#getExtraWishes()
	 * @see #getCartItem()
	 * @generated
	 */
	EAttribute getCartItem_ExtraWishes();

	/**
	 * Returns the meta object for class '{@link ecore_homework1.1.homework1_1.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see ecore_homework1.1.homework1_1.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.Product#getProductID <em>Product ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product ID</em>'.
	 * @see ecore_homework1.1.homework1_1.Product#getProductID()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ProductID();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.Product#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see ecore_homework1.1.homework1_1.Product#getPrice()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Price();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.Product#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see ecore_homework1.1.homework1_1.Product#getTitle()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Title();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.Product#isInStock <em>In Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Stock</em>'.
	 * @see ecore_homework1.1.homework1_1.Product#isInStock()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_InStock();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore_homework1.1.homework1_1.Product#getCartitem <em>Cartitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cartitem</em>'.
	 * @see ecore_homework1.1.homework1_1.Product#getCartitem()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Cartitem();

	/**
	 * Returns the meta object for class '{@link ecore_homework1.1.homework1_1.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see ecore_homework1.1.homework1_1.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.Customer#getCustomerID <em>Customer ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer ID</em>'.
	 * @see ecore_homework1.1.homework1_1.Customer#getCustomerID()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CustomerID();

	/**
	 * Returns the meta object for class '{@link ecore_homework1.1.homework1_1.Webapplication <em>Webapplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Webapplication</em>'.
	 * @see ecore_homework1.1.homework1_1.Webapplication
	 * @generated
	 */
	EClass getWebapplication();

	/**
	 * Returns the meta object for the containment reference '{@link ecore_homework1.1.homework1_1.Webapplication#getStoremanagementsystem <em>Storemanagementsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Storemanagementsystem</em>'.
	 * @see ecore_homework1.1.homework1_1.Webapplication#getStoremanagementsystem()
	 * @see #getWebapplication()
	 * @generated
	 */
	EReference getWebapplication_Storemanagementsystem();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.Webapplication#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see ecore_homework1.1.homework1_1.Webapplication#getDomain()
	 * @see #getWebapplication()
	 * @generated
	 */
	EAttribute getWebapplication_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore_homework1.1.homework1_1.Webapplication#getWebpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Webpage</em>'.
	 * @see ecore_homework1.1.homework1_1.Webapplication#getWebpage()
	 * @see #getWebapplication()
	 * @generated
	 */
	EReference getWebapplication_Webpage();

	/**
	 * Returns the meta object for class '{@link ecore_homework1.1.homework1_1.StoreManagementSystem <em>Store Management System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store Management System</em>'.
	 * @see ecore_homework1.1.homework1_1.StoreManagementSystem
	 * @generated
	 */
	EClass getStoreManagementSystem();

	/**
	 * Returns the meta object for the containment reference '{@link ecore_homework1.1.homework1_1.StoreManagementSystem#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Store</em>'.
	 * @see ecore_homework1.1.homework1_1.StoreManagementSystem#getStore()
	 * @see #getStoreManagementSystem()
	 * @generated
	 */
	EReference getStoreManagementSystem_Store();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore_homework1.1.homework1_1.StoreManagementSystem#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User</em>'.
	 * @see ecore_homework1.1.homework1_1.StoreManagementSystem#getUser()
	 * @see #getStoreManagementSystem()
	 * @generated
	 */
	EReference getStoreManagementSystem_User();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore_homework1.1.homework1_1.StoreManagementSystem#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order</em>'.
	 * @see ecore_homework1.1.homework1_1.StoreManagementSystem#getOrder()
	 * @see #getStoreManagementSystem()
	 * @generated
	 */
	EReference getStoreManagementSystem_Order();

	/**
	 * Returns the meta object for class '{@link ecore_homework1.1.homework1_1.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see ecore_homework1.1.homework1_1.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.Order#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see ecore_homework1.1.homework1_1.Order#isIsActive()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_IsActive();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.Order#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see ecore_homework1.1.homework1_1.Order#getStatus()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Status();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.Order#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see ecore_homework1.1.homework1_1.Order#getAddress()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Address();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.Order#getOrderID <em>Order ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order ID</em>'.
	 * @see ecore_homework1.1.homework1_1.Order#getOrderID()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_OrderID();

	/**
	 * Returns the meta object for the containment reference '{@link ecore_homework1.1.homework1_1.Order#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Payment</em>'.
	 * @see ecore_homework1.1.homework1_1.Order#getPayment()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Payment();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore_homework1.1.homework1_1.Order#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customer</em>'.
	 * @see ecore_homework1.1.homework1_1.Order#getCustomer()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Customer();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore_homework1.1.homework1_1.Order#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employee</em>'.
	 * @see ecore_homework1.1.homework1_1.Order#getEmployee()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Employee();

	/**
	 * Returns the meta object for class '{@link ecore_homework1.1.homework1_1.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see ecore_homework1.1.homework1_1.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.User#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Address</em>'.
	 * @see ecore_homework1.1.homework1_1.User#getEmailAddress()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_EmailAddress();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecore_homework1.1.homework1_1.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for class '{@link ecore_homework1.1.homework1_1.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see ecore_homework1.1.homework1_1.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.Employee#getEmployeeID <em>Employee ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employee ID</em>'.
	 * @see ecore_homework1.1.homework1_1.Employee#getEmployeeID()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_EmployeeID();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.Employee#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see ecore_homework1.1.homework1_1.Employee#getPosition()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Position();

	/**
	 * Returns the meta object for class '{@link ecore_homework1.1.homework1_1.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see ecore_homework1.1.homework1_1.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.Payment#getCreditCardInfomration <em>Credit Card Infomration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Card Infomration</em>'.
	 * @see ecore_homework1.1.homework1_1.Payment#getCreditCardInfomration()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_CreditCardInfomration();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.Payment#isIsSucessful <em>Is Sucessful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Sucessful</em>'.
	 * @see ecore_homework1.1.homework1_1.Payment#isIsSucessful()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_IsSucessful();

	/**
	 * Returns the meta object for class '{@link ecore_homework1.1.homework1_1.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store</em>'.
	 * @see ecore_homework1.1.homework1_1.Store
	 * @generated
	 */
	EClass getStore();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.Store#getStoreID <em>Store ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store ID</em>'.
	 * @see ecore_homework1.1.homework1_1.Store#getStoreID()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_StoreID();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.Store#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adress</em>'.
	 * @see ecore_homework1.1.homework1_1.Store#getAdress()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_Adress();

	/**
	 * Returns the meta object for the attribute '{@link ecore_homework1.1.homework1_1.Store#getOpeningHours <em>Opening Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opening Hours</em>'.
	 * @see ecore_homework1.1.homework1_1.Store#getOpeningHours()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_OpeningHours();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore_homework1.1.homework1_1.Store#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employee</em>'.
	 * @see ecore_homework1.1.homework1_1.Store#getEmployee()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_Employee();

	/**
	 * Returns the meta object for enum '{@link ecore_homework1.1.homework1_1.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category</em>'.
	 * @see ecore_homework1.1.homework1_1.Category
	 * @generated
	 */
	EEnum getCategory();

	/**
	 * Returns the meta object for enum '{@link ecore_homework1.1.homework1_1.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see ecore_homework1.1.homework1_1.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Homework1_1Factory getHomework1_1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link ecore_homework1.1.homework1_1.impl.WebpageImpl <em>Webpage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore_homework1.1.homework1_1.impl.WebpageImpl
		 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getWebpage()
		 * @generated
		 */
		EClass WEBPAGE = eINSTANCE.getWebpage();

		/**
		 * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBPAGE__URL = eINSTANCE.getWebpage_URL();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBPAGE__TITLE = eINSTANCE.getWebpage_Title();

		/**
		 * The meta object literal for the '{@link ecore_homework1.1.homework1_1.impl.ProductPageImpl <em>Product Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore_homework1.1.homework1_1.impl.ProductPageImpl
		 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getProductPage()
		 * @generated
		 */
		EClass PRODUCT_PAGE = eINSTANCE.getProductPage();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PAGE__DESCRIPTION = eINSTANCE.getProductPage_Description();

		/**
		 * The meta object literal for the '<em><b>Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PAGE__RATING = eINSTANCE.getProductPage_Rating();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PAGE__PRODUCT = eINSTANCE.getProductPage_Product();

		/**
		 * The meta object literal for the '{@link ecore_homework1.1.homework1_1.impl.InformationPageImpl <em>Information Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore_homework1.1.homework1_1.impl.InformationPageImpl
		 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getInformationPage()
		 * @generated
		 */
		EClass INFORMATION_PAGE = eINSTANCE.getInformationPage();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_PAGE__TEXT = eINSTANCE.getInformationPage_Text();

		/**
		 * The meta object literal for the '{@link ecore_homework1.1.homework1_1.impl.BrowsingPageImpl <em>Browsing Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore_homework1.1.homework1_1.impl.BrowsingPageImpl
		 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getBrowsingPage()
		 * @generated
		 */
		EClass BROWSING_PAGE = eINSTANCE.getBrowsingPage();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROWSING_PAGE__FILTER = eINSTANCE.getBrowsingPage_Filter();

		/**
		 * The meta object literal for the '<em><b>Productpage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROWSING_PAGE__PRODUCTPAGE = eINSTANCE.getBrowsingPage_Productpage();

		/**
		 * The meta object literal for the '{@link ecore_homework1.1.homework1_1.impl.LandingPageImpl <em>Landing Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore_homework1.1.homework1_1.impl.LandingPageImpl
		 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getLandingPage()
		 * @generated
		 */
		EClass LANDING_PAGE = eINSTANCE.getLandingPage();

		/**
		 * The meta object literal for the '<em><b>Welcome Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDING_PAGE__WELCOME_MESSAGE = eINSTANCE.getLandingPage_WelcomeMessage();

		/**
		 * The meta object literal for the '{@link ecore_homework1.1.homework1_1.impl.ShoppingCartImpl <em>Shopping Cart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore_homework1.1.homework1_1.impl.ShoppingCartImpl
		 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getShoppingCart()
		 * @generated
		 */
		EClass SHOPPING_CART = eINSTANCE.getShoppingCart();

		/**
		 * The meta object literal for the '<em><b>Total Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_CART__TOTAL_PRICE = eINSTANCE.getShoppingCart_TotalPrice();

		/**
		 * The meta object literal for the '<em><b>Discrount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_CART__DISCROUNT = eINSTANCE.getShoppingCart_Discrount();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_CART__CUSTOMER = eINSTANCE.getShoppingCart_Customer();

		/**
		 * The meta object literal for the '<em><b>Cartitem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_CART__CARTITEM = eINSTANCE.getShoppingCart_Cartitem();

		/**
		 * The meta object literal for the '{@link ecore_homework1.1.homework1_1.impl.CartItemImpl <em>Cart Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore_homework1.1.homework1_1.impl.CartItemImpl
		 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getCartItem()
		 * @generated
		 */
		EClass CART_ITEM = eINSTANCE.getCartItem();

		/**
		 * The meta object literal for the '<em><b>Extra Wishes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART_ITEM__EXTRA_WISHES = eINSTANCE.getCartItem_ExtraWishes();

		/**
		 * The meta object literal for the '{@link ecore_homework1.1.homework1_1.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore_homework1.1.homework1_1.impl.ProductImpl
		 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Product ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRODUCT_ID = eINSTANCE.getProduct_ProductID();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRICE = eINSTANCE.getProduct_Price();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__TITLE = eINSTANCE.getProduct_Title();

		/**
		 * The meta object literal for the '<em><b>In Stock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__IN_STOCK = eINSTANCE.getProduct_InStock();

		/**
		 * The meta object literal for the '<em><b>Cartitem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__CARTITEM = eINSTANCE.getProduct_Cartitem();

		/**
		 * The meta object literal for the '{@link ecore_homework1.1.homework1_1.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore_homework1.1.homework1_1.impl.CustomerImpl
		 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Customer ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CUSTOMER_ID = eINSTANCE.getCustomer_CustomerID();

		/**
		 * The meta object literal for the '{@link ecore_homework1.1.homework1_1.impl.WebapplicationImpl <em>Webapplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore_homework1.1.homework1_1.impl.WebapplicationImpl
		 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getWebapplication()
		 * @generated
		 */
		EClass WEBAPPLICATION = eINSTANCE.getWebapplication();

		/**
		 * The meta object literal for the '<em><b>Storemanagementsystem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBAPPLICATION__STOREMANAGEMENTSYSTEM = eINSTANCE.getWebapplication_Storemanagementsystem();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBAPPLICATION__DOMAIN = eINSTANCE.getWebapplication_Domain();

		/**
		 * The meta object literal for the '<em><b>Webpage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBAPPLICATION__WEBPAGE = eINSTANCE.getWebapplication_Webpage();

		/**
		 * The meta object literal for the '{@link ecore_homework1.1.homework1_1.impl.StoreManagementSystemImpl <em>Store Management System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore_homework1.1.homework1_1.impl.StoreManagementSystemImpl
		 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getStoreManagementSystem()
		 * @generated
		 */
		EClass STORE_MANAGEMENT_SYSTEM = eINSTANCE.getStoreManagementSystem();

		/**
		 * The meta object literal for the '<em><b>Store</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_MANAGEMENT_SYSTEM__STORE = eINSTANCE.getStoreManagementSystem_Store();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_MANAGEMENT_SYSTEM__USER = eINSTANCE.getStoreManagementSystem_User();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_MANAGEMENT_SYSTEM__ORDER = eINSTANCE.getStoreManagementSystem_Order();

		/**
		 * The meta object literal for the '{@link ecore_homework1.1.homework1_1.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore_homework1.1.homework1_1.impl.OrderImpl
		 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__IS_ACTIVE = eINSTANCE.getOrder_IsActive();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__STATUS = eINSTANCE.getOrder_Status();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ADDRESS = eINSTANCE.getOrder_Address();

		/**
		 * The meta object literal for the '<em><b>Order ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ORDER_ID = eINSTANCE.getOrder_OrderID();

		/**
		 * The meta object literal for the '<em><b>Payment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__PAYMENT = eINSTANCE.getOrder_Payment();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__CUSTOMER = eINSTANCE.getOrder_Customer();

		/**
		 * The meta object literal for the '<em><b>Employee</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__EMPLOYEE = eINSTANCE.getOrder_Employee();

		/**
		 * The meta object literal for the '{@link ecore_homework1.1.homework1_1.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore_homework1.1.homework1_1.impl.UserImpl
		 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Email Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL_ADDRESS = eINSTANCE.getUser_EmailAddress();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '{@link ecore_homework1.1.homework1_1.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore_homework1.1.homework1_1.impl.EmployeeImpl
		 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Employee ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__EMPLOYEE_ID = eINSTANCE.getEmployee_EmployeeID();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__POSITION = eINSTANCE.getEmployee_Position();

		/**
		 * The meta object literal for the '{@link ecore_homework1.1.homework1_1.impl.PaymentImpl <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore_homework1.1.homework1_1.impl.PaymentImpl
		 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Credit Card Infomration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__CREDIT_CARD_INFOMRATION = eINSTANCE.getPayment_CreditCardInfomration();

		/**
		 * The meta object literal for the '<em><b>Is Sucessful</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__IS_SUCESSFUL = eINSTANCE.getPayment_IsSucessful();

		/**
		 * The meta object literal for the '{@link ecore_homework1.1.homework1_1.impl.StoreImpl <em>Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore_homework1.1.homework1_1.impl.StoreImpl
		 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getStore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getStore();

		/**
		 * The meta object literal for the '<em><b>Store ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__STORE_ID = eINSTANCE.getStore_StoreID();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__ADRESS = eINSTANCE.getStore_Adress();

		/**
		 * The meta object literal for the '<em><b>Opening Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__OPENING_HOURS = eINSTANCE.getStore_OpeningHours();

		/**
		 * The meta object literal for the '<em><b>Employee</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__EMPLOYEE = eINSTANCE.getStore_Employee();

		/**
		 * The meta object literal for the '{@link ecore_homework1.1.homework1_1.Category <em>Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore_homework1.1.homework1_1.Category
		 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getCategory()
		 * @generated
		 */
		EEnum CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '{@link ecore_homework1.1.homework1_1.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore_homework1.1.homework1_1.Status
		 * @see ecore_homework1.1.homework1_1.impl.Homework1_1PackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

	}

} //Homework1_1Package
