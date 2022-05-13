public class HW_004 {
    //printing multiplication table in do while loop

public static void main(String[] args) {

    int x=1;
    do{
        int y=1;
        do{
            System.out.print(x * y +"\t");
            y++;
        }while( y <= 3 );
        x++;
        System.out.println();
    }while( x <= 12 );

}
}



