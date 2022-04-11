package ma.fstt.ihm;

import ma.fstt.model.Bus;
import ma.fstt.model.Bus;

import java.util.List;

public class BusTableModel extends BaseTableModel<Bus> {

    public BusTableModel(List<Bus> BusList) {
        super(BusList);
        this.columnNames = new String[]{"ID", "NUMERO", "MODEL", "CAPA_RES", "POIDS", "NBR_SIEGE"};

    }



    @Override
    public Object getValueAt(int i, int i1) {
        Bus Bus = this.list.get(i);

        switch (i1){
            case 0:
                return Bus.getIdVehicule();
            case 1:
                return Bus.getNumero();
            case 2:
                return Bus.getModel();
            case 3:
                return Bus.getCapaRes();
            case 4:
                return Bus.getPoids();
            case 5:
                return Bus.getNbrSiege();
            default:
                return null;
        }

    }
}
