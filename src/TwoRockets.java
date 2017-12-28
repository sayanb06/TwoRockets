import java.util.Scanner;
/*
 * Sayan Bhattacharjee
 * Period 6
 * TwoRockets
 * Original Rocket:
 * 		bob.append("    /\\   ");
		bob.append("   /  \\  \n");
		bob.append("  /    \\ \n");
		bob.append(" +------+\n");
		bob.append(" |      |\n");
		bob.append(" |      |\n");
		bob.append(" |United|\n");
		bob.append(" |States|\n");
		bob.append(" +------+\n");
		bob.append(" |      |\n");
		bob.append(" |      |\n");
		bob.append(" +------+\n");
		bob.append("    /\\   \n");
		bob.append("   /  \\  \n");
		bob.append("  /    \\ \n");
 */

public class TwoRockets {
	public static void main(String[] args){
		try {
			doubleRocket(formRocket(), Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		} catch (Exception e) {
			Scanner s = new Scanner(System.in);
			doubleRocket(formRocket(), s.nextInt(), s.nextInt());
		}
	}
	
	public static String formRocket(){
		StringBuilder rocket = new StringBuilder();
		rocket.append("\n    /\\   ");
		rocket.append("\n   /  \\  ");
		rocket.append("\n  /    \\ ");
		rocket.append("\n +------+");
		rocket.append("\n |      |");
		rocket.append("\n |      |");
		rocket.append("\n |United|");
		rocket.append("\n |States|");
		rocket.append("\n +------+");
		rocket.append("\n |      |");
		rocket.append("\n |      |");
		rocket.append("\n +------+");
		rocket.append("\n    /\\   ");
		rocket.append("\n   /  \\  ");
		rocket.append("\n  /    \\ ");
		return rocket.toString();
	}
	
	public static void doubleRocket(String oneRocket, int numrocket, int space){
		StringBuilder changeRocket = new StringBuilder();
		String[] line = oneRocket.split("\n ");
		for(int i = 0; i < line.length; i++){
			for(int nr = 0; nr < numrocket; nr++){
				changeRocket.append(line[i]);
				for(int ns = 0; ns<space; ns++){
					changeRocket.append(" ");
				}
			}
			changeRocket.append("\n ");
			
		}
		System.out.println(changeRocket);
	}
}