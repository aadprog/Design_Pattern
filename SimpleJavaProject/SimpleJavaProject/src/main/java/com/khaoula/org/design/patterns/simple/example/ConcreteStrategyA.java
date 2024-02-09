package com.khaoula.org.design.patterns.simple.example;

class ConcreteStrategyA implements Strategy {
	
    @Override
    public void execute() {
        System.out.println("L'execution de : ConcreteStrategyA");
    }
}