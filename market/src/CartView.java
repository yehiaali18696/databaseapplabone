import java.util.List;

public class CartView {
    private CartService cartService;

    public CartView(CartService cartService) {
        this.cartService = cartService;
    }

    public void displayAllCarts() {
        List<Cart> carts = cartService.getAllCarts();

        // Display the carts
        for (Cart cart : carts) {
            System.out.println("Cart ID: " + cart.Id);
            System.out.println("Value: " + cart.Value);

            // Display the articles in the cart
            List<Article> articles = cart.Articles;
            for (Article article : articles) {
                System.out.println("Article ID: " + article.id);
                System.out.println("Article Name: " + article.name);
                System.out.println("Price: " + article.price);
                System.out.println("Quantity: " + article.quantity);
                System.out.println("Unit: " + article.unit);
                System.out.println("--------------------");
            }

            System.out.println("====================");
        }
    }
    public static void main(String[] args) {
        CartService cartService = new CartService();
        CartView cartView = new CartView(cartService);
        cartView.displayAllCarts();
    }
}
