import java.io.*;
import java.util.*;

class Main implements Runnable {

	public static void main(String[] args) {

		new Thread(new Main()).start();
	}

	static String readLn(int maxLg){

		byte[] lin = new byte[maxLg];
		int lg = 0, car = -1;
		try {
			while(lg < maxLg){
				car = System.in.read();
				if((car < 0) || car == '\n')
					break;
				lin[lg++] += car;
			}
		} catch(Exception ex){
			return null;
		}

		if(car < 0 && lg == 0)
			return null;
		return new String(lin, 0, lg);
	}

	public void run(){
		solve();
	}

	public void solve(){

		StringTokenizer tokens = new StringTokenizer(Main.readLn(255));
		int tc = Integer.parseInt(tokens.nextToken()), cases = 1;
		while(tc-- != 0){
			Short mayor = 0;
			String[] numeros = Main.readLn(10000).trim().split(" ");
			for(String s: numeros){
				Short num = Short.parseShort(s);
				if(num > mayor)
					mayor = num;
			}        
			StringBuilder sb = new StringBuilder("Case " + cases++ + ": " + mayor);
			System.out.println(sb);
		}
	}
}