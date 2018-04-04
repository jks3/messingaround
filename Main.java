public class Main {
	public static void main(String[] args) {
		Cmmnd cmmnd = new Cmmnd(args);
		Whale orca = new Whale("Orca");
		System.out.println(cmmnd.toString());
		System.out.println(orca.toString());
		Whale hero = new Whale("true");
		System.out.println(hero.toString());
	}
}
