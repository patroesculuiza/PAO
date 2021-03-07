package service;
import model.Client;
import model.Review;
import model.CSVService;
import repository.ClientRepository;
import repository.ReviewRepository;
import repository.RutaRepository;

import java.io.*;
public class ReviewCSVService implements CSVService {
    private static ReviewCSVService reviewCSVService=null;
    private ReviewRepository reviewRepository=new ReviewRepository();
    private ReviewCSVService(){
    }
    public static ReviewCSVService getReviewCSVService(){
        if(reviewCSVService==null)
            reviewCSVService=new ReviewCSVService();
        return reviewCSVService;
    }
    @Override
    public void loadData() {
        try{
            File file = new File("reviewdata.csv");

            //Check if file is new
            if(!file.exists())
                return;

            BufferedReader input = new BufferedReader(new FileReader(file));
            String line;
            while((line = input.readLine()) != null)
            {
                String[] value = line.split(",");
                Review review = new Review(value[0],Integer.parseInt(value[1]),value[2]);
                reviewRepository.addReview(review);
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public void writeData() {
        try {
            File file = new File("reviewdata.csv");

            BufferedWriter output = new BufferedWriter(new FileWriter(file));

            for (Review review : reviewRepository.getReviews()) {
                output.write(review.getReview());
                output.write(",");
                output.write(Integer.toString(review.getNota()));
                output.write(",");
                output.write(review.getAnonim());
                output.newLine();
                output.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
