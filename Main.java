
public class Main {

	public static int MAX =5;
    public static int[] Grilo = new int [MAX]; //
    public static int[] Pulos = new int [MAX]; // A int aqui define que só serão 5 contadores de pulo 
    public static int Colocacao = 1;   
    public static int Pista= 100;
    public static boolean Fim = false;
    
    
            
    public static void main(String[] args) {
        for (int indice=0;indice < MAX; indice++){
            Grilo[indice] = 0;
            Pulos[indice] = 0;    
          //  System.out.println(Grilo[indice]);
        }
        int maxThread = 4;
        int nElements = MAX / maxThread;
		
		CorridaDeGrilos [] threads = new CorridaDeGrilos[maxThread];
		
		//Pra aparecer todos os grilos, subistituir o nElements por Max
		for (int i = 0; i < maxThread; i++){
			threads[i] = new CorridaDeGrilos(MAX, Grilo, Pulos, Colocacao, Pista, Fim, i * nElements);
			threads[i].start();
		}
		
		
		for (int i = 0; i < maxThread; i++){
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }   
}