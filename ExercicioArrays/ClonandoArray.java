package ExercicioArrays;

    public class ClonandoArray {

        public static void main(String [] args) {
            
            double [] NumerosA = {32,25,50,10,15,16,30};
            double [] NumerosB = {8,2,9,11,15,20};
            double [] TodosArrays = new double [(NumerosA.length + NumerosB.length)];
            double manipuladorA = 0;
            
            
            for(int i = 0; i < NumerosA.length; i++) {
                TodosArrays[i] = NumerosA[i];
            }
            
            for(int x = 0; x < NumerosB.length; x++){
                TodosArrays[7+x] = NumerosB[x];
            }
                    
            for(int z = 0; z < TodosArrays.length; z++) {
                
                for(int y= z+1; y < TodosArrays.length; y++) {
                    if (TodosArrays[z] > TodosArrays[y]) {
                        
                        manipuladorA = TodosArrays[z];
                        //Aqui a variavel irá receber o primeiro valor da pocição do array Z,
                        //assim possibilida a troca
                        
                        TodosArrays[z] = TodosArrays[y];
                        //Aqui faço a troca dos valores dentro do array
                        
                        TodosArrays[y] = manipuladorA;
                        //Usando  a variavel que usei para armazenar, faço a troca e volto para a verificação
                    }
                }
                
            }
            for(double m : TodosArrays) {
                System.out.println(m);
            }
            
        }
        
    }

