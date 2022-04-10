package ma.fstt.ihm;

import ma.fstt.model.Cammion;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class CammionTableModel extends BaseTableModel<Cammion> {

    public CammionTableModel(List<Cammion> cammionList) {
        super(cammionList);
        this.columnNames = new String[]{"ID", "NUMERO", "MODEL", "CAPA_RES", "POIDS", "CAPACITE"};

    }



    @Override
    public Object getValueAt(int i, int i1) {
        Cammion Cammion = this.list.get(i);

        switch (i1){
            case 0:
                return Cammion.getIdVehicule();
            case 1:
                return Cammion.getNumero();
            case 2:
                return Cammion.getModel();
            case 3:
                return Cammion.getCapaRes();
            case 4:
                return Cammion.getPoids();
            case 5:
                return Cammion.getCapacite();
            default:
                return null;
        }

    }
}
