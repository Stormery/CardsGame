
public abstract class Karta {

	private String nick;
	public Karta(String nick, int nrGorny, int nrDolny, int nrLewy, int nrPrawy) {
		super();
		this.nick = nick;
		this.nrGorny = nrGorny;
		this.nrDolny = nrDolny;
		this.nrLewy = nrLewy;
		this.nrPrawy = nrPrawy;
	}
	
	private int nrGorny;
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public int getNrGorny() {
		return nrGorny;
	}
	public void setNrGorny(int nrGorny) {
		this.nrGorny = nrGorny;
	}
	public int getNrDolny() {
		return nrDolny;
	}
	public void setNrDolny(int nrDolny) {
		this.nrDolny = nrDolny;
	}
	public int getNrLewy() {
		return nrLewy;
	}
	public void setNrLewy(int nrLewy) {
		this.nrLewy = nrLewy;
	}
	public int getNrPrawy() {
		return nrPrawy;
	}
	public void setNrPrawy(int nrPrawy) {
		this.nrPrawy = nrPrawy;
	}

	private int nrDolny;
	private int nrLewy;
	private int nrPrawy;
	
	
}
