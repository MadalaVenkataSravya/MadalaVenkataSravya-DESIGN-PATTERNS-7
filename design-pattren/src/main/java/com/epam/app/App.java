package com.epam.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



import java.util.logging.Level; 
//import java.util.logging.Logger;

interface College {

public void join();
}
class College_type implements College {

public void join() {
System.out.print("College:\n");
}

}

class College_Reputation implements College {

protected College College;

public College_Reputation(College h){
this.College=h;
}


public void join() {
this.College.join();
}

}
 class IIT extends College_Reputation {

public IIT(College h) {
super(h);
}


public void join(){
super.join();
System.out.print("This is an IIT College.\n");
}
}
 class Emcet extends College_Reputation {

public Emcet(College h) {
super(h);
}


public void join(){
super.join();
System.out.print("This is an EMCET College.\n");
}
}


public class App
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
   
    public static void main( String[] args )
    {
       LOGGER.log(null, null, Level.INFO,"use of memento,behaviour patterns and decorate,structural patterns.\n");
       College iit = new IIT(new College_type());
       College emcet =new Emcet(new College_type());
       			iit.join();
                emcet.join();
System.out.println("\n*****");

College Emcet_IIT = new IIT(new Emcet(new College_type()));
Emcet_IIT.join();
       LOGGER.log(null, null, Level.INFO,"program terminated.\n");
       
    }
}
