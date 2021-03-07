package model;

public class Review {
    private String review;
    private int nota;
    private String anonim;
    public Review(String review,int nota,String anonim)
    {
        this.review=review;
        this.nota=nota;
        this.anonim=anonim;
    }

    public int getNota() {
        return nota;
    }

    public String getAnonim() {
        return anonim;
    }

    public String getReview() {
        return review;
    }

    public void setAnonim(String anonim) {
        this.anonim = anonim;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setReview(String review) {
        this.review = review;
    }


    public String toString() {
        return "Review{" +
                "review='" + review + '\'' +
                ", nota=" + nota +
                ", anonim='" + anonim + '\'' +
                '}';
    }
}
