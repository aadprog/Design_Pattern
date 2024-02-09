package com.khaoula.org.design.patterns.simple.example;

import com.khaoula.org.design.patterns.simple.example.SimpleClass;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SimpleClassTest {

	@Test
	public void testAddtion() {

    	SimpleClass simpleClass= new SimpleClass();
        
		int additionResult = simpleClass.add(2,5);
		
		if (additionResult != 7) {
            throw new RuntimeException("Addition result doesn't match the expected result");
        }
		
		
	}
	@Test
    public void testSingleton() {
        // Deux références
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 != singleton2) {
            throw new RuntimeException("Singleton instance mismatch");
        }
    }

	@Test
    public void testConcreteStrategyA() {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.executeStrategy();
        assertTrue(true); 
    }

    @Test
    public void testConcreteStrategyB() {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy();
        assertTrue(true);
    }

    @Test
    public void testContextChangingStrategy() {
        Context context = new Context();

        context.setStrategy(new ConcreteStrategyA());
        context.executeStrategy();
        assertTrue(true); 

        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy();
        assertTrue(true); 
    }
    @Test
    public void testNullStrategy() {
        Context context = new Context();
        Throwable exception = assertThrows(NullPointerException.class, () -> {context.executeStrategy(); 
        });
        assertNotNull(exception);
    }
	}
	 
