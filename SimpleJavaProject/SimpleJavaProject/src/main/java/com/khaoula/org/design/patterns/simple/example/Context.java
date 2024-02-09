package com.khaoula.org.design.patterns.simple.example;

public class Context {
	    private Strategy strat;

	    public void setStrategy(Strategy strat) {
	        this.strat = strat;
	    }

	    public void executeStrategy() {
	        if (strat != null) {
	            strat.execute();
	        } else {
	            System.out.println("Pas de Strategy");
	        }
	    }
	    
}
