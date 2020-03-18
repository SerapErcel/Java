class Canli{
	public void yaz() {
		System.out.println("canli sýnýfýýý");
	}
}
class insan extends Canli{
	public void yaz() {
		System.out.println("insan sýnýfý");
	}
}
class hayvan extends Canli{
	public void yaz() {
		System.out.println("hayvan sýnýfý");
	}
}
class bitki extends Canli{
	public void yaz() {
		System.out.println("bitki sýnýfý");
		}
	}
public class Polimorfizm {
	public static void nesneAl(Canli c) {
		c.yaz();
	}
	public static void main(String args[]) {
		Canli[] h=new Canli[3];
		for(int i=0;i<3;i++) {
			int indis=(int)(Math.random()*3);//rastgele
			switch(indis) {
			case 0:
				h[indis]=new bitki();//upcasting
				nesneAl(h[indis]);
				break;
			case 1:
				h[indis]=new hayvan();//upcasting
				nesneAl(h[indis]);
				break;
			case 2:
				h[indis]=new insan();//upcasting
				nesneAl(h[indis]);
				break;
			}
		}

}
}

