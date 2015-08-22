package metier;

import java.util.Vector;


public class Agrégation {
	
	// v1 vecteur de perf
  public double choquet(Vector v1 , Vector v2 , double[][] tab){
		
		double res=0;
		double s1=0;
		
		for(int i=0;i<v1.size();i++){
			for(int j=0;j<v2.size();j++){
				
				if(i==j){
					s1+=( (double)v1.get(i)) * (double)v2.get(j);
				}
			}
		}
		
		double s2=0;
		
		for(int i=0;i<v1.size();i++){
			
			for(int j=0;j<v1.size();j++){
				
				s2= s2+Math.abs( ( (double)v1.get(i)) - ( (double)v1.get(j) ) ) * tab[i][j];
			}
			
		}
		System.out.println(s2);
		res=s1-s2/2;
    	return res;
}
}
