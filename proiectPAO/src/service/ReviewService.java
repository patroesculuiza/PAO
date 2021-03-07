package service;
import model.Review;
import repository.ReviewRepository;
import java.util.ArrayList;
public class ReviewService {
    private ReviewRepository reviewRepository;
    private AuditService auditService;
    public ReviewService()
    {
        auditService = AuditService.getAuditService();
        reviewRepository=new ReviewRepository();
    }
    public void addReview(Review r){
        reviewRepository.addReview(r);
        auditService.writeData("ReviewService: addReview");
    }
    public void removeReview(Review r){
        reviewRepository.removeReview(r);
    }



}
