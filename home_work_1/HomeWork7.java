package operators;
//побитовые операторы
public class HomeWork7 {
    public static void main(String[] args){
        byte a1 = 42;
        byte b1 = 15;
byte a2 = -42;
byte b2 = -15;

            System.out.println(Integer.toBinaryString(a2));
            System.out.println(Integer.toBinaryString(b2));
            System.out.println(Integer.toBinaryString(a2>>>b2));

        System.out.print("~: ");
        System.out.print(~a1 + ", ");// 42 = 00101010; ~42 = 11010101
        System.out.print(~b1 + ", ");// 15 = 00001111; ~15 = 11110000
        System.out.print(~a2 + ", ");// -42 = 11010110; ~-42 = 00101001
        System.out.println(~b2);// -15 = 11110001; ~-42 = 00001110

        System.out.print("|: ");
        System.out.print((a1|b1) + ", ");//00101010 | 00001111 = 00101111
        System.out.println(a2|b2);//11010110 | 11110001 = 11110111

        System.out.print("&: ");
        System.out.print((a1&b1) + ", ");//00101010 & 00001111 = 00001010
        System.out.println(a2&b2);//11010110 & 11110001 = 11010000

        System.out.print("^: ");
        System.out.print((a1^b1) + ", ");//00101010 ^ 00001111 = 00100101
        System.out.println(a2^b2);//11010110 ^ 11110001 = 00100111

        System.out.print("<<: ");
        System.out.print((a1<<3) + ", ");//00101010<<101010000(int)<<01010000(byte)
        System.out.print((b1<<5) + ", ");//00001111<<111100000(int)<<11100000(byte)
        System.out.print((a2<<3) + ", ");//11010110<<11010110000(int)<<10110000(byte)
        System.out.println(b2<<5);//11110001<<1111000100000(int)<<00100000(Byte)

        System.out.print(">>: ");
        System.out.print((a1>>2) + ", ");//00101010>>00001010
        System.out.print((b1>>2) + ", ");//00001111>>00000011
        System.out.print((a2>>2) + ", ");//11010110>>00110101
        System.out.println(b2>>2);//11110001>>00111100

        System.out.print(">>>: ");
        System.out.print((a1>>>2) + ", ");//00101010>>>00001010
        System.out.print((b1>>>2) + ", ");//00001111>>>00000011
        System.out.print((a2>>>b2) + ", ");//11111111111111111111111111010110>>>111111111111111
    }
}
