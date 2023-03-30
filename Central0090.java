/* Nama : Azizah Awaliyah
stambuk : 13020210090 */

interface A {
    public void aaa();
}
interface B extends A {
}
class Central0090 implements B {
    public void aaa() {
        System.out.println("aaa");
    }
    public static void main(String arg[]) {
        System.out.println("main");
        Central0090 obj = new Central0090();
        obj.aaa();
    }
}