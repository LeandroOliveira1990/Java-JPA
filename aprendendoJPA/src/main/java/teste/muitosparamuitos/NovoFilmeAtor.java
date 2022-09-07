package teste.muitosparamuitos;

import infra.DAO;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

public class NovoFilmeAtor {

    public static void main(String[] args) {
        Filme filmeA = new Filme("Star Wars Ep 4",8.9);
        Filme filmeB = new Filme("O Fugitivo",8.1);


        Ator atorA = new Ator("Harrison Ford");
        Ator atrizB = new Ator("Carrie Fisher");

        filmeA.adcionarAtor(atorA);
        filmeA.adcionarAtor(atrizB);

        filmeB.adcionarAtor(atorA);

        DAO<Filme> dao = new DAO<Filme>();
        dao.incluirAtomico(filmeA);


    }
}
