package com.nt.comp;

public final class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("BlueDart::0-param constructor");
	}

	public String deliver(int oid) {
		
		return "delivering"+oid+" order id product using dtdc";
	}
    
}
