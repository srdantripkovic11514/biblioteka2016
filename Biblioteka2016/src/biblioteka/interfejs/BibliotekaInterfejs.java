package biblioteka.interfejs;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Knjiga;

public interface BibliotekaInterfejs {
	
	public void dodajKnjigu(Knjiga knjiga);
	public void obrisiKnjigu(Knjiga knjiga);
	public LinkedList<Knjiga> vratiSveKnjige();
	public LinkedList<Knjiga> pronadjiKnjige(Autor autor, long ISBN, String naziv, String izdavac);
	
}
