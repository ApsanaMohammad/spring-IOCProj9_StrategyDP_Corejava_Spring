package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public final class FlipKart {
     private Courier courier;

     public FlipKart() {
    	 System.out.println("FlipKart::0-param constructor");
     }
     
     public void setCouier( Courier courier) {
    	 this.courier=courier;
     }
     
     //business method
     public String shopping(String[] items,float[] prices) {
    	 float billamount=0;
    	 for(float p:prices){
    		 billamount+=p;   
    	 }
    	 //generate order id
    	 int oid =new Random().nextInt(1000);
    	 String msg =courier.deliver(oid);
    	 return Arrays.toString(items)+" with prices "+Arrays.toString(prices)+" having bill amount" +billamount+msg;
     }
	@Override
	public String toString() {
		return "FlipKart [courier=" + courier + "]";
	}
     
	
}
