import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2;
	String result;
	g.setGreeting("Howdy");
	g.greet("Tom");
	g.setGreeting("sup");
	g.greet("Fred");
	result = g.greet("Tom");
	System.out.println(result);
	result = g2.greet("Sarah");
	System.out.println(result);

	/* 1. Try:
	   g.setGreeting("Howdy");
	   g.greet("Tom");
	   g.setGreeting("sup");
	   g.greet("Fred");
	*/


    }
}
