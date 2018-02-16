public class Cmmnd {
	private String[] args;
	public Cmmnd(String[] args) {
		this.args = new String[args.length];
		for (int i = 0; i < args.length; i++) {
			this.args[i] = args[i];
		}
	}
	public String toString() {
		String result = "";
		for (int i = 0; i < this.args.length; i++) {
			result = result + this.args[i] + " ";
		}
		return result;
	}
}