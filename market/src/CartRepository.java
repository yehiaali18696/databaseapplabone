import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class CartRepository {
    public List<Cart> carts;
    public CartRepository() {
        carts = new ArrayList<>();
    }
    
    public void insertCart(Cart cart) {
        carts.add(cart);
    }


    
    public Cart getCart(int id) {
        for (Cart cart : carts) {
            if (cart.Id == id) {
                return cart;
            }
        }
        return null; // Cart with the given id not found
    }
  
    public List<Cart> getAllCarts(LocalDateTime updateDate) {
        List<Cart> filteredCarts = new ArrayList<>();
        for (Cart cart : carts) {
            if (cart.UpdatedDate.equals(updateDate)) {
                filteredCarts.add(cart);
            }
        }
        return filteredCarts;
    }
    
    public List<Cart> getAllCarts() {
        return carts;
    }
public static void main(String[] args) {
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
}
    


    
}
