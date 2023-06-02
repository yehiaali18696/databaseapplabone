import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CartService {
    private CartRepository cartRepository;

    public CartService() {
       
        Article article1 = new Article(1, "Shirt", 29.99, 5, "pcs");
        Article article2 = new Article(2, "Book", 12.50, 2, "pieces");
        Article article3 = new Article(3, "Chair", 79.99, 1, "unit");
        List<Article> articles = new ArrayList<>();
        articles.add(article1);
        articles.add(article2);
        articles.add(article3);
        List<Article> articles2 = new ArrayList<>();
        articles2.add(article3);
        Cart cart1 = new Cart(1, LocalDateTime.now(), LocalDateTime.now(), 123, articles, 149);
        Cart cart2 = new Cart(2, LocalDateTime.now(), LocalDateTime.now(), 456, articles2, 64);

        // Output the cart details
       
          CartRepository cartRepository = new CartRepository();
          cartRepository.insertCart(cart2);
          cartRepository.insertCart(cart1);
          this.cartRepository = cartRepository;
    }

    public List<Cart> getAllCarts() {
        List<Cart> carts = cartRepository.getAllCarts();

        // Calculate the value of each cart
        for (Cart cart : carts) {
            int value = 0;
            List<Article> articles = cart.Articles;

            for (Article article : articles) {
                double articleValue = article.price * article.quantity;
                value += articleValue;
            }

            cart.Value= value;
        }

        return carts;
    }
}