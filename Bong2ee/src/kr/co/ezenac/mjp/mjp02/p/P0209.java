package kr.co.ezenac.mjp.mjp02.p;

public class P0209 {
    public static void main(String[] args) {       
        short a = (short)0x55ff;
        short b = (short)0x00ff;        
        System.out.println("[비트연산결과]");
        System.out.printf("%04x\n", (short)(a&b));   // "%04x\n" : 16진수 형식으로 출력 
        System.out.printf("%04x\n", (short)(a|b));   // printf ("출력서식", 출력할 내용);
        System.out.printf("%04x\n", (short)(a^b));   
        System.out.printf("%04x\n", (short)(~a));     
        // And, OR, XOR, NOT.  답은 00ff, 55ff, 5500, aa00      
        byte c= 20;  // 0x14
        byte d= -8;  // 0xf8       
        System.out.println("[시프트연산결과]");
        System.out.println(c << 2);     
        System.out.println(c >> 2);   // 0 삽입 
        System.out.println(d >> 2);   // 1 삽입 
        System.out.printf("%x\n", (d  >>> 2));  // 0 삽입 
    }   //  답은 80, 5, -2, 3ffffffe
}
