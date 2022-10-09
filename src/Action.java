//Robert Bennethum
class Action extends Movie{
    Action(String rating, int id, String movieTitle){
        super(rating,id,movieTitle);
    }

    // late fees for action
    float calcLateFees(int days){
        float lateFees = 3;
        lateFees*=days;
        return lateFees;
    }
}