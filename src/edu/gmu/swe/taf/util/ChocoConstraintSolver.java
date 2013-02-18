/**
 * 
 */
package edu.gmu.swe.taf.util;

import java.util.ArrayList;
import java.util.List;

import choco.Choco;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.variables.integer.IntegerVariable;

/**
 * A utility class that solve Integer and Rational constraints.
 *
 * @author Nan Li
 * @version 1.0 Feb 18, 2013
 */
public class ChocoConstraintSolver {
	CPModel model;
	CPSolver solver;
	
	/**
	 * Constructs an object of ChocoConstraintsSolver with no parameters
	 */
	public ChocoConstraintSolver() {
	}
	
	/**
	 * Solves the conditions specified in the parameters.
	 *
	 * @param conditions	an array of test value domains and constraints
	 * @return 				an Integer value in a String format
	 */
	public String solveIntegerConstraint(String[] conditions){
		model = new CPModel();
		solver = new CPSolver();
		List<Integer> domains = new ArrayList<Integer>();
		List<String> constraints = new ArrayList<String>();
		
		//Separate test domains and constraints from the parameter
		for(String s: conditions){
			if(s.indexOf(">") != -1){
				constraints.add(s.trim());
			}
			else{
				domains.add(new Integer(Integer.valueOf(s.trim())));
				//System.out.println(Integer.valueOf(s.trim()));
			}
		}
		//System.out.println(constraints.size());
		
		//If the test domain is not provided by users, all integers are considered.
		//Otherwise, add the test values to the model.
		IntegerVariable v = null;
		/*
		if(domains != null)
			if(domains.size() != 0){
				
				for(Integer i: domains){
					v = Choco.makeIntVar("v", i, i);
					model.addConstraint(Choco.gt(v, i.intValue()));
					
					//Add the constraints to the model
					for(String c: constraints){
						//System.out.println(s1);
						if(c.indexOf(">") != -1){
							String temp = c.substring(c.lastIndexOf(">") + 1, c.length());
							System.out.println(": " + temp);
							model.addConstraint(Choco.gt(v, Integer.valueOf(temp.trim()).intValue()));
						}	
					}
					
					solver.read(model);
					solver.solve();
					System.out.println(": " + String.valueOf(solver.getVar(v).getVal()));
				}
			}
			else{
				v = Choco.makeIntVar("v", -32768, 32767);
				model.addVariable(v);
			}*/
		v = Choco.makeIntVar("v", -32768, 32767);
		model.addVariable(v);	
		
		//Add the constraints to the model
		for(String s1: constraints){
			//System.out.println(s1);
			if(s1.indexOf(">") != -1){
				String temp = s1.substring(s1.lastIndexOf(">") + 1, s1.length());
				//System.out.println(": " + temp);
				model.addConstraint(Choco.gt(v, Integer.valueOf(temp.trim()).intValue()));
			}	
		}
		
		solver.read(model);
		solver.solve();
		return String.valueOf(solver.getVar(v).getVal());
	}

}
