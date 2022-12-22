package kr.co.ezenac.mjp.mjp03.p;

public class P0313 {
	   public static void main(String[] args){
	     double sum=0.0;
	     for(int i=0; i<args.length; i++)
	       sum+= Double.parseDouble(args[i]);
	     System.out.println("합계:"+sum);
	   }
}
