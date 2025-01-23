package com.curso.v1;

public class Principal3 {

	public static void main(String[] args) {
		new Principal3().print(new int[] {1,2,3});
	}
	
	private void print(int[] weather) {
		                
		for(int i=0, j=3; i<weather.length; ++i) { 
			System.out.println(weather[i]);
		}
	}

//	private void print(int[] weather) {
//		//      i=2                 
//		for(int i=weather.length-1; i>=0; i--) { 
//			System.out.println(weather[i]);
//		}
//	}
//	private void print(int[] weather) {
//		for(int w : weather) { 
//			System.out.println(weather[i]);
//		}
//	}
//	private void print(int[] weather) {
//		//        0; i<=2               ;
//		for(int i=0; i<=weather.length-1; ++i) { 
//			System.out.println(weather[i]);
//		}
//	}
//	private void print(int[] weather) {
//		//      i=3             
//		for(int i=weather.length; i>0; i-- ) { 
//			System.out.println(weather[i]);
//			//ArrayIndexOutOfBoundsException
//		}
//	}

}
