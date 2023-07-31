package com.uis.Map;

public class WeakHashMap {

	public static void main(String[] args) {
		WeakHashMap m1 =  new WeakHashMap();
		
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(11);
		
		Temp t = new Temp();
//		m.put(I1, "Bharu");
//		m.put(I2, "Sharu");
		
	//	m1.put(t,"B");	*************error
		System.out.println(m1);
	}

}
class Temp{

	@Override
	public String toString() {
		return "Temp";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finallize method called");
	}
	
	
}
