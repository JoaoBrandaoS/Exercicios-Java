package ExercicioRepeticao;


public class Some {
    
    public static void main(String [] args){

         int a = 3;
         int limite =18;
         double total= 0; 
         
         for(int i = 0; i <limite; i+=a){
            total += a + i;

         } 
         
         System.out.println(total);
    }

}
