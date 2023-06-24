package org.test;

public class HdfcBank extends RbiBank{
@Override
public void savings() {
System.out.println("3"); 
super.savings();

}
public static void main(String[] args) {
	HdfcBank h = new HdfcBank();
	h.savings();
	h.fixed();
}
}
