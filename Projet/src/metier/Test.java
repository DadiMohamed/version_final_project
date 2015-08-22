package metier;

import java.util.Vector;

import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;

import com.joptimizer.functions.ConvexMultivariateRealFunction;
import com.joptimizer.functions.LinearMultivariateRealFunction;
import com.joptimizer.functions.PDQuadraticMultivariateRealFunction;
import com.joptimizer.optimizers.JOptimizer;
import com.joptimizer.optimizers.LPOptimizationRequest;
import com.joptimizer.optimizers.LPPrimalDualMethod;
import com.joptimizer.optimizers.NewtonLEConstrainedISP;
import com.joptimizer.optimizers.OptimizationRequest;
import com.joptimizer.optimizers.PrimalDualMethod;

public class Test {

	public static void main(String[] args) throws Exception {
		
		/* Vector p = new Vector(10) ;
		 p.addElement(new Double(0.1)) ;
		  p.addElement(new Double(0.1)) ;
		  p.addElement(new Double(0.25)) ;
		  p.addElement(new Double(0.05)) ;
		  p.addElement(new Double(0.5)) ;
		  
		  Vector w = new Vector(10) ;
		  w.addElement(new Float(0.7)) ;
		  w.addElement(new Float(0.8)) ;
		  w.addElement(new Float(0.6)) ;
		  w.addElement(new Float(0.7)) ;
		  w.addElement(new Float(0.15)) ;
		 
		  double[][] inter={ {0, 0.05, 0.05, 0, 0},{0.05,0,0,0,0.1},{0.05,0,0,0,0.3},{0,0,0,0,0},{0,0.1,0.3,0,0}};
		  
		 OptimisationPerFix per=new OptimisationPerFix() ;
		   Vector<Double> r= per.preparerCoeff(p, w  ,inter) ;
		   for(int i=0;i<r.size();i++){
		     System.out.println( " r[ "+ i + "] = " + r.get(i))  ;
		   }
		   
		   */
		
		//Objective function
				double[] c = new double[] { -1., -1. };	
				//Inequalities constraints
				double[][] G = new double[][] {{4./3., -1}, {-1./2., 1.}, {-2., -1.}, {1./3., 1.}};
				double[] h = new double[] {2., 1./2., 2., 1./2.};
				
				//Bounds on variables
				double[] lb = new double[] {0 , 0};
				double[] ub = new double[] {10, 10};
				
				//optimization problem
				LPOptimizationRequest or = new LPOptimizationRequest();
				or.setC(c);
				or.setG(G);
				or.setH(h);
				
				or.setLb(lb);
				or.setUb(ub);
				or.setDumpProblem(true); 
				//optimization
				LPPrimalDualMethod opt = new LPPrimalDualMethod();
				opt.setLPOptimizationRequest(or);
				int returnCode = opt.optimize();
				double[] sol = opt.getOptimizationResponse().getSolution();
		   
		   for(int i=0 ; i<sol.length ;i++){

			   System.out.println(sol[i]) ;
		   }
		   
		   
		   
		   
		   
		   
		   
	}	   	  
}
		
