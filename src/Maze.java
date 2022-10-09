//Robert Bennethum
import java.util.Scanner;
public class Maze {

    public void run() {
        //create nodes
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");
        Node h = new Node("H");
        Node i = new Node("I");
        Node j = new Node("J");
        Node k = new Node("K");
        Node l = new Node("L");
//link nodes together
        a.south = e;
        a.east = b;
        b.west = a;
        b.south = f;
        c.east = d;
        c.south = g;
        d.west = c;
        e.north = a;
        e.south = i;
        f.north = b;
        f.east = g;
        g.north = c;
        g.south = k;
        g.west = f;
        g.east = h;
        h.west = g;
        h.south = l;
        i.north = e;
        i.east = j;
        j.west = i;
        k.north = g;
        l.north = h;

        Node current = a; //set initial node to current
        Node goal = l; //set finish to l
        Scanner scanner = new Scanner(System.in);
        String userInput;
//loop until win
        while (!current.equals(goal)) { //find and display which direction
            String dir = null;
            if (current.north != null)
            { dir = "north"; }

            if (current.south != null) {
                if (dir == null)
                { dir = "south"; }
                else
                { dir += " or south"; }
            }

            if (current.east != null) {
                if (dir == null)
                { dir = "east"; }
                else
                { dir += " or east"; }
            }

            if (current.west != null) {
                if (dir == null)
                { dir = "west"; }
                else
                { dir += " or west"; }
            }
// displaying current room and available directions to go
            System.out.println("You are in room "+current.label+" of twisty little passages, all alike. You can go "+dir+".");
// getting user input
            userInput = scanner.nextLine();
// check input
            if (userInput.equalsIgnoreCase("N") && current.north != null) { current = current.north; }
            else if (userInput.equalsIgnoreCase("E") && current.east != null) { current = current.east; }
            else if (userInput.equalsIgnoreCase("W") && current.west != null) { current = current.west; }
            else if (userInput.equalsIgnoreCase("S") && current.south != null) { current = current.south; }
            if (current.equals(goal)) { //check if win
                System.out.println("Congratulations. You win! (Room "+current.label+")"); //finish message
            }
        }
    }
}