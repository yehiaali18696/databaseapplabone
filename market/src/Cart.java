import java.util.Date;
import java.util.List;
import java.time.*;
import java.time.LocalDateTime;


public class Cart {
    public int Id ;
        public LocalDateTime CreatedDate ;
        public LocalDateTime UpdatedDate ;
        public int UserId ;
        public List<Article> Articles ;
        public int Value ;


        public Cart(Integer id, LocalDateTime createdDate, LocalDateTime updatedDate, Integer userId, List<Article> articles, int d) {
            this.Id = id;
            this.CreatedDate = createdDate;
            this.UpdatedDate = updatedDate;
            this.UserId = userId;
            this.Articles = articles;
            this.Value = d;
        }

     
}
    

