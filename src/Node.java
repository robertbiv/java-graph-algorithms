//Robert Bennethum
public class Node {
    String label; //room name

// nodes on each direction
    Node north;
    Node east;
    Node south;
    Node west;
//set up room num
    Node(String label) {
//set all to null
        this.label = label;

        north = null;
        east = null;
        south = null;
        west = null;
    }
}