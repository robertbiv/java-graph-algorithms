//Robert Bennethum
public class Movie {
    //instance variables
    String rating;
    int id;
    String title;
    // constructor
    Movie(String rating, int id, String title){
        this.rating=rating;
        this.id=id;
        this.title=title;
    }

    // getters and setters
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    // define equals
    public boolean equals(Object o)
    {
        Movie checkid = (Movie)o;
        return checkid.id == id;
    }

    // find late fees
    float calcLateFees(int days){
        float lateFees = 2;
        lateFees*=days;
        return lateFees;
    }
    // print output
    public String toString(){
        return "Rating="+getRating()+"\n"+"id Number="+getId()+"\n"+"Movie title="+getTitle();
    }
}
