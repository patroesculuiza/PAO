package repository;
import model.Review;
import java.util.ArrayList;

public class ReviewRepository {
    private ArrayList<Review> reviews;
    public ReviewRepository()
    {
        reviews=new ArrayList<>();
    }
    public void addReview(Review r)
    {
        reviews.add(r);
    }
    public void removeReview(Review r)
    {
        reviews.remove(r);
    }
    public ArrayList<Review> getReviews()
    {
        return reviews;
    }
}
