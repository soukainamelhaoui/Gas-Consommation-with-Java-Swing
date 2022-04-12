package ma.fstt.model;

import java.sql.SQLException;

public class ChauffeurTest {

    public static void main(String[] args) {

        ChauffeurTransaction chauffeurTransaction;

        try {
            chauffeurTransaction = new ChauffeurTransaction();

            //creating
            Chauffeur chauffeur = new Chauffeur("aharrar","omar","ramobar");
            chauffeurTransaction.save(chauffeur);

            //reaching
//            chauffeur = chauffeurTransaction.getOne(2);
            System.out.println(chauffeur);
//            List<Chauffeur> chauffeurList = chauffeurTransaction.getAll();
//            for (Chauffeur chauffeur:chauffeurList){
//                System.out.println(chauffeur);
//            }

            //updating
            chauffeur.setCode("ramoooooooooooooooooooo");
            chauffeurTransaction.update(chauffeur);

            //deleting
            //chauffeurTransaction.delete(chauffeur);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
