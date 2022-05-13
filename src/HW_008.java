public class HW_008 {
//transpose matrix of 2-D
    public static void main(String args[]){

        int original[][]={{3,3,3},{2,2,2},{4,4,4}};

        System.out.println("without interchange/transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(original[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Print with interchange/transpose value:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(original[j][i]+" ");
            }
            System.out.println();
        }
    }}


