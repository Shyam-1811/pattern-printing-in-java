public class charNumTriangle {
    public static void main(String[] args) {
       
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
              if (i % 2 != 0) {
                System.out.print(" "+j);
              }
              else if(i % 2 == 0){
                System.out.print(" "+((char)(j + 64)));
              }
            }
            System.out.println();
            }
        }
    }

