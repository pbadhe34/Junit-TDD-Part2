 
//This class uses the java class generated from Groovy script
import groovy.lang.Binding;
import groovy.lang.Script;

public class UseGroovyScript {
	public static void main(String[] args) {
		System.out.println("UseGroovyScript main");
		// lets pass in some variables
		Binding binding = new Binding();
		binding.setVariable("cheese", "Cheddar");
		binding.setVariable("args", args);

		System.out.println("Invoking  ScriptClass main");
		ScriptClass script = new ScriptClass();
		script.main(args);
		 
		System.out.println("Invoking  ScriptJavaClass run");
		Script script2 = new ScriptJavaClass();
		//ScriptJavaClass script2 = new ScriptJavaClass();
		//script2.main(args);
		script2.run();
	}
}
