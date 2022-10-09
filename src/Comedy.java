//Robert Bennethum
class Comedy extends Movie{
    Comedy(String rating, int id, String movieTitle){

        super(rating,id,movieTitle);
    }
    //late fees for comedy
    float calcLateFees(int days){
        float lateFees = 2.50F;
        lateFees*=days;
        return lateFees;
    }

}