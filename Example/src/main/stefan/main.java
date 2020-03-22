package main.stefan;
import java.math.BigInteger;
public class main {
	int pos = 1;
	BigInteger[] primes = new BigInteger[230000000];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main Main = new main();
		Main.primes[0] = BigInteger.valueOf(1);
		while(Main.pos < 230000000) {
			Main.findPrimes();
		}
	}
	void findPrimes()  {
		BigInteger P = BigInteger.valueOf(1);
		BigInteger N = BigInteger.valueOf(0);
		for(int i = 0; i < pos; i++) {
			P = P.multiply(primes[i]);
			
			for(int n = 0; n < primes[i].intValue() - 1; n++) {
				N = N.add(primes[i]);
			}
		}
		System.out.println("? " + P + " : " + N);
		BigInteger Q = P.add(BigInteger.valueOf(1));
		for(int i=2; i < Q.intValue(); i++){
		    if( Q.remainder( BigInteger.valueOf(i) ).equals(BigInteger.valueOf(0)) ){
		      primes[pos] = (BigInteger.valueOf(i));
		      ++pos;
		      return;
		    }
		  }
	  primes[pos] = Q;
	  ++pos;
	}
}	
