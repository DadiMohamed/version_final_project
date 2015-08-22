package metier;

import java.util.Vector;

public class OptimisationPerFix {
	
	// v le vecteur des poids des indicateur , ta[][] est le matrice des interactions
	public Vector<Double> preparerCoeff( Vector<Double> v ,Vector<Float> w  , double[][] tab ){
		

		  //res est le vecteur des coefficient pour la contrainte choquet( p*1,p*2,..,p*n)=perf souhaité 
		  Vector<Double> res=new Vector<Double>();
		  
		  double[] coeff ={0,0,0,0,0};
		  
		  for(int i=0;i<v.size();i++){
		   
		   
		   
		   for(int j=0;j<i;j++){
			   
			   if(w.get(i) > w.get(j)){
				   
				   
				   coeff[i]=coeff[i] - 0.5 * tab[i][j] ;
				   coeff[j]=coeff[j] + 0.5 * tab[i][j] ;
				   
			   }else{
				  
				   coeff[i]=coeff[i] + 0.5 * tab[i][j] ;
				   coeff[j]=coeff[j] - 0.5 * tab[i][j] ;
			   }
		    
			   
		   }
		   
		    
		     
		  }
		  
		  for(int k=0;k<v.size();k++){
			   
			   res.addElement(  (coeff[k] + v.get(k)) * w.get(k) ) ;
		   }
		       
		
		return res;
		
		
	}
	
}
