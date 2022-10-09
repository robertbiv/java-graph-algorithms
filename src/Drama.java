//Robert Bennethum
class Drama extends Movie{
    Drama(String rating, int id, String movieTitle){

        super(rating,id,movieTitle);
    }
    //late fees for drama
    float calcLateFees(int days){
        float lateFees = 2;
        lateFees*=days;
        return lateFees;
    }


}