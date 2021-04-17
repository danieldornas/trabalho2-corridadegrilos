/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 * @author Lucas
 */

public class CorridaDeGrilos extends Thread {
	
	public static int MAX;
    public static int[] Grilo; //
    public static int[] Pulos; // A int aqui define que se serao 5 contadores de pulo 
    public static int Colocacao;   
    public static int Pista;
    public static boolean Fim;
    public static int offSet;
    
	
	public CorridaDeGrilos(int _MAX, int _Grilo[], int _Pulos[], int _Colocacao,int _Pista, boolean _Fim, int _offSet) {
		MAX = _MAX;
		Grilo = _Grilo;
		Pulos = _Pulos;
		Colocacao = _Colocacao;
		Pista = _Pista;
		Fim = _Fim;
		offSet = _offSet;
	}
	
	//@Override
	public void run() {
		super.run();
		
        while (!Fim){
            for(int indice=0;indice <MAX; indice++){
               if (Grilo [indice]<Pista){
                   
               
                int pulinho = (int) (Math.random()*40);
            //   System.out.println(pulinho);
            Grilo [indice]+=pulinho;
            Pulos[indice]+=1;
            System.out.println("O Grilo_0"+(indice+1)+" pulou "+pulinho+"cm e já percorreu "+Grilo[indice]+"cm");
            if (Grilo[indice]>=Pista){
                System.out.println("Grilo_0"+(indice+1)+" alcançou a linha de chegada com "+Pulos[indice]+" pulos");
                Colocacao +=1;
            }
               }
            }
            if (Grilo[0]>=Pista && Grilo[1]>=Pista && Grilo[2]>=Pista && Grilo[3]>=Pista && Grilo[4]>=Pista)
            Fim = true;
        }
		}
}

