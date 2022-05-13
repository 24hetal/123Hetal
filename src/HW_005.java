import java.util.Arrays;
import java.util.HashSet;

public class HW_005 {
//find common elements between two arrays(string values)
          public static void main(String[] args) {
       {
               String[] array1 = {"jeni", "shanay", "heeya", "shriya", "krishna", "sonu","neel", "jinisha"};

                String[] array2 = {"archi", "jeni", "ved", "prisha", "shanay", "Dev", "JAnvi", "griva"};

                System.out.println("Array1 : "+ Arrays.toString(array1));
                System.out.println("Array2 : "+ Arrays.toString(array2));

                HashSet<String> set = new HashSet<String>();

                for (int y = 0; y < array1.length; y++)
                {
                    for (int z = 0; z < array2.length; z++)
                    {
                        if(array1[y].equals(array2[z]))
                        {
                            set.add(array1[y]);
}
                    }
                }
                System.out.println("Common element : "+(set));}
          }
}









