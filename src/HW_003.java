public class HW_003 {
//enter any string and count total number of 'a' in that string
    public static void main(String[] args) {
        String input = " Javaaaaaaaaaa ";
        //  search Character 'a'.
        char search = 'a';

        int count=0;
        for(int i=0; i<input.length(); i++)
        {
            if(input.charAt(i) == search)
                count++;
        }
       System.out.println("This Character '"+search+"' appears in string "+count+" times.");

   }
}
