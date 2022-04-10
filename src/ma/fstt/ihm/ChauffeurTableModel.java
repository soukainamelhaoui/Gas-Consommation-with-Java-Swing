package ma.fstt.ihm;

import ma.fstt.model.Chauffeur;

import java.util.List;

public class ChauffeurTableModel extends BaseTableModel<Chauffeur> {

    public ChauffeurTableModel(List<Chauffeur> chauffeurList) {
        super(chauffeurList);
        this.columnNames = new String[]{"ID", "NOM", "PRENOM", "CODE"};
    }



    @Override
    public Object getValueAt(int i, int i1) {
        Chauffeur chauffeur = this.list.get(i);

        switch (i1){
            case 0:
                return chauffeur.getId();
            case 1:
                return chauffeur.getNom();
            case 2:
                return chauffeur.getPrenom();
            case 3:
                return chauffeur.getCode();
            default:
                return null;
        }

    }
}
