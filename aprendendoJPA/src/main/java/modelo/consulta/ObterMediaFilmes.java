package modelo.consulta;

import infra.DAO;
import modelo.muitosparamuitos.Filme;

public class ObterMediaFilmes {
    public static void main(String[] args) {
        DAO< NotaFIlme> dao = new DAO<>(NotaFIlme.class);

      NotaFIlme notaFIlme =  dao.consultar1("mediaGeral");

        System.out.println(notaFIlme.getMedia());

        dao.fechar();


    }
}
