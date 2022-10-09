//Robert Bennethum

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class MovieReview {
    void run() throws IOException{
// Read file
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Bobby School\\OneDrive - The Pennsylvania State University\\Documents\\Fall 2022\\Computer Science 221\\Java\\RBennethumPS2\\src\\movieRatings.txt"));
// Store file content as array
        LinkedHashMap<String,ArrayList<Integer>> movie_map = new LinkedHashMap<>();
        try {
            int num_movies = Integer.valueOf((br.readLine().trim())); //find number of movies
            for(int i=0; i<num_movies; i++){
                String movie_name = br.readLine().trim(); //read movie name
                int rating = Integer.valueOf((br.readLine().trim())); //read rating
                ArrayList<Integer> arr;
                if(!movie_map.containsKey(movie_name)){ //if movie map doesnt have movie, make it with 1 review
                    arr = new ArrayList<Integer>();
                    arr.add(1); //add a review
                    arr.add(rating); //add rating
                }
                else{ //if movie map already has moive name, update review count and rating
                    arr = movie_map.get(movie_name); //get reviews
//update reviews count and rating
                    arr.set(0,arr.get(0)+1);
                    arr.set(1,arr.get(1)+rating);
                }
                movie_map.put(movie_name, arr); //save updated reviews
            }
            for (Entry<String, ArrayList<Integer>> entry : movie_map.entrySet()) //average rating and print
            {
                ArrayList<Integer> ar = entry.getValue();
                double avg = Math.round(ar.get(1)*10.0/ar.get(0))/10.0; //get average
                System.out.println(entry.getKey() + ": " + ar.get(0)+" reviews, average of "+avg+" / 5");
            }
        } finally{
            br.close(); //close file
        }
    }
}