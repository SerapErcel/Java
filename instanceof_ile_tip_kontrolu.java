class A{
	public int aSayi=5;
}
class B extends A{
	public int bSayi=6;
}
class C extends B{
	public int cSayi=7;
}
class instanceof_ile_tip_kontrolu extends B{
	public static void main(String args[]) {
		A a1=new A();
		B b1=new B();
		C c1=new C();
		instanceof_ile_tip_kontrolu d1=new instanceof_ile_tip_kontrolu();
		if(c1 instanceof A) {
			System.out.println("c nesnesi A sýnýfýnýn elemanýna eriþebilir :");
			System.out.println(c1.aSayi);
		}
		else
			System.out.println("c1 nesnesi aSayi deðiþkenine eriþemedi");
		if(b1 instanceof instanceof_ile_tip_kontrolu)
			System.out.println("b1 nesnesi instanceof_ile_tip_kontrolu sýnýfýna eriþebilir");
		else
			System.out.println("b1 nesnesi instanceof_ile_tip_kontrolu sýnýfýna eriþemez");
	}
}