//Robert Bennethum
import java.util.*;
import java.util.Map.Entry;
public class RegistrationProblem {
        // make hashmap
        HashMap<Integer,ArrayList<String>> student = new HashMap<Integer,ArrayList<String>>();
        //print out
        public void printData()
        {
            for (Entry<Integer, ArrayList<String>> hashEntry : student.entrySet())
            {
                System.out.print(hashEntry.getKey()+" | ");
                for(String fruitNo : hashEntry.getValue())
                { System.out.print(fruitNo+" "); }
                System.out.println();
            }
        }
        //input data
        public void insertData(Integer name ,String number)
        {
            if(student.get(name)==null)
            { student.put(name, new ArrayList<String>()); }
            student.get(name).add(number);
        }
}
