import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class tictactoe {

	static ArrayList<Integer> kullaniciposizyonlari=new ArrayList<Integer>();
	static ArrayList<Integer> cpuposizyonlari=new ArrayList<Integer>();
	public static void main(String[] args) {
		char [][] gameBoard= {
				{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '},
				{'-','+','-','+','-'}, 
				{' ','|',' ','|',' '}};

		while(true) {
			Scanner scan=new Scanner(System.in);
			System.out.println("1-9 arasýnda konumunuzu giriniz..");
			int kullaniciposizyon=scan.nextInt();
			while(kullaniciposizyonlari.contains(kullaniciposizyon) ||cpuposizyonlari.contains(kullaniciposizyon)) {
				System.out.println("Dolu.. Baþka bir yer seç!");
				kullaniciposizyon=scan.nextInt();
			}
			System.out.println(kullaniciposizyon);
			placePiece(gameBoard,kullaniciposizyon,"kullanýcý");

			String result=checkWinner();
			if(result.length()>0) {
				System.out.println(result);
				break;
			}

			Random rand=new Random();
			int cpuposizyon=rand.nextInt(9)+1;
			while(kullaniciposizyonlari.contains(cpuposizyon) ||cpuposizyonlari.contains(cpuposizyon)) {
				cpuposizyon=rand.nextInt(9)+1;

			}

			placePiece(gameBoard,cpuposizyon,"cpu");

			printGameBoard(gameBoard);
			result=checkWinner();
			if(result.length()>0) {
				System.out.println(result);
				break;
			}
		}


	}public static void printGameBoard(char[][] gameBoard) {
		for(char[] row:gameBoard) {
			for(char c: row) {
				System.out.print(c);
			}
			System.out.println();
		}

	}
	public static void placePiece(char[][] gameBoard, int posizyon, String kullanici) {
		char sembol=' ';
		if(kullanici.equals("kullanýcý")) {
			sembol='X';
			kullaniciposizyonlari.add(posizyon);

		}else if(kullanici.equals("cpu")) {
			sembol='0';
			cpuposizyonlari.add(posizyon);
		}
		switch(posizyon) {
		case 1:
			gameBoard[0][0]=sembol;
			break;
		case 2:
			gameBoard[0][2]=sembol;
			break;
		case 3:
			gameBoard[0][4]=sembol;
			break;
		case 4:
			gameBoard[2][0]=sembol;
			break;
		case 5:
			gameBoard[2][2]=sembol;
			break;
		case 6:
			gameBoard[2][4]=sembol;
			break;
		case 7:
			gameBoard[4][0]=sembol;
			break;
		case 8:
			gameBoard[4][2]=sembol;
			break;
		case 9:
			gameBoard[4][4]=sembol;
			break;
		default:
			break;
		}
	}
	public static String checkWinner() {
		List topRow=Arrays.asList(1,2,3);
		List midRow=Arrays.asList(4,5,6);
		List botRow=Arrays.asList(7,8,9);
		List leftCol=Arrays.asList(1,4,7);
		List midCol=Arrays.asList(2,5,8);
		List rightCol=Arrays.asList(3,6,9);
		List cross1=Arrays.asList(1,5,9);
		List cross2=Arrays.asList(3,5,7);

		List<List> winning=new ArrayList<List>();
		winning.add(topRow);
		winning.add(midRow);
		winning.add(botRow);
		winning.add(leftCol);
		winning.add(midCol);
		winning.add(rightCol);
		winning.add(rightCol);
		winning.add(cross1);
		winning.add(cross2);
		for(List l: winning) {
			if(kullaniciposizyonlari.containsAll(l)) {
				return"Tebrikler sen kazandýn :)";
			}
			else if(cpuposizyonlari.contains(l)) {
				return"Bilgisayar kazandý :(";
			}
			else if(kullaniciposizyonlari.size()+cpuposizyonlari.size()==9) {
				return"Berabere...";
			}
		}


		return "";
	}

}
