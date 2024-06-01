package com.nt.comp;

public final class DTDC implements Courier {
	
	public DTDC() {
		System.out.println("DTDC::0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return "delivering order id "+oid+" product using dtdc";
	}
    
}
