package view;

public class ViewKorisnik {
	private String ime;
	private String prezime;
	private String korisnickaUloga;
	private String username;
	private String password;
	
	public ViewKorisnik() {
		
	}

	public ViewKorisnik(String ime, String prezime, String korisnickaUloga, String username, String password) {
		this.ime = ime;
		this.prezime = prezime;
		this.korisnickaUloga = korisnickaUloga;
		this.username = username;
		this.password = password;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getKorisnickaUloga() {
		return korisnickaUloga;
	}

	public void setKorisnickaUloga(String korisnickaUloga) {
		this.korisnickaUloga = korisnickaUloga;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ((korisnickaUloga == null) ? 0 : korisnickaUloga.hashCode());
		result = prime * result + ((prezime == null) ? 0 : prezime.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ViewKorisnik other = (ViewKorisnik) obj;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (korisnickaUloga == null) {
			if (other.korisnickaUloga != null)
				return false;
		} else if (!korisnickaUloga.equals(other.korisnickaUloga))
			return false;
		if (prezime == null) {
			if (other.prezime != null)
				return false;
		} else if (!prezime.equals(other.prezime))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ViewKorisnik [ime=" + ime + ", prezime=" + prezime + ", korisnickaUloga=" + korisnickaUloga
				+ ", username=" + username + "]";
	}
	
	
	
}
