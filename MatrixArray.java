package matrix;

/**
 *
 * @author OWNER
 */
public class MatrixArray {
    public int[] matrix;
    public int rows;
    public int cols;
    //constructor
    //matrix using a one dimension array
    public MatrixArray(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        
       matrix = new  int[this.rows*this.cols];
       for(int i = 0; i< matrix.length; i++){
           matrix[i] = 0;
       }
    }
    
    public void consolePrint(){
         for(int i = 1; i< matrix.length+1; i++){
           //problem arrises when i = 0. to not create bugs with modulus
           // then i has to be initialized with 1
               if(i%10 == 0 )
                    {
                     System.out.print(matrix[i-1] + "\n");

                    }
               else{
                      System.out.print(matrix[i-1] + "\t");
                   }
          }
    }
    public void changeEvenColsPattern(){
        for(int i = 1; i< matrix.length + 1; i++){
           if(i%2 == 0){
               matrix[i -1] = 0;
           }
           else{
               matrix[i -1] = 1;
           }
       }
    }
        
    public void changeAllEvenPattern(){
        for(int i = 1; i< matrix.length + 1; i++){
           if(i%2 != 0){
               matrix[i -1] = 1;
           }
           
       }
        for(int i = 1; i< matrix.length + 1; i++){
            if(i%2 == 0){
                
                if(i>= 0 && i<=10 ){
                     matrix[i-1] = 0;
               
               
                }
                else if(i > 10 && i<= 2*10){
                     matrix[i -1] = 1;
                }
                 else if(i > 2*10 && i<= 3*10){
                     matrix[i -1] = 0;
                }
                else if(i > 3*10 && i<= 4*10){
                     matrix[i -1] = 1;
                }
                else if(i > 4*10 && i<= 5*10){
                     matrix[i -1] = 0;
                }
                else if(i > 5*10 && i<= 6*10){
                     matrix[i -1] = 1;
                }
                else if(i > 6*10 && i<= 7*10){
                     matrix[i -1] = 0;
                }
                else if(i > 7*10 && i<= 8*10){
                     matrix[i -1] = 1;
                }
                else if(i > 8*10 && i<= 9*10){
                     matrix[i -1] = 0;
                }
                else if(i > 9*10 && i<= 10*10){
                     matrix[i -1] = 1;
                }
                
            }
  
           
       }
    }
    public int getSum(){
        int sum = 0;
        for(int i = 0; i< matrix.length; i++){
            sum = sum + matrix[i];
        }
        return sum;
    }
    public double getAverage(){
        int sum = 0;
        for(int i = 0; i< matrix.length; i++){
            sum = sum + matrix[i];
        }
        double average = sum/(double)matrix.length;
        return average;
    }
    
}
