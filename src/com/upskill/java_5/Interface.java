package com.upskill.java_5;

public interface Interface {

	public abstract void iDoor();
	
	public abstract int iWheel();
	
	public abstract String iEngine();
}


/*
(Parent)				   (Keyword) 				(Child)				 (Keyword) 				(GrandChild)						
Class						extends				 Class
Abstract Class(+2)   		extends				 Class(-2)
Interface(+2)				implements	  		 Class(-2)
Interface(+2)				extends				 InterfaceZ(+2)			implements	  			 Class(-4)

*/