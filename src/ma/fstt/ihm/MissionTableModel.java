package ma.fstt.ihm;

import ma.fstt.model.Mission;

import java.util.List;

public class MissionTableModel extends BaseTableModel<Mission> {

    public MissionTableModel(List<Mission> MissionList) {
        super(MissionList);
        this.columnNames = new String[]{"ID", "DEPART", "ARRIVE", "KILOMETRAGE","CONSOMATION_THEO"};
    }



    @Override
    public Object getValueAt(int i, int i1) {
        Mission Mission = this.list.get(i);

        switch (i1){
            case 0:
                return Mission.getIdMission();
            case 1:
                return Mission.getDepart();
            case 2:
                return Mission.getArrive();
            case 3:
                return Mission.getKilometrage();
            case 4:
                return Mission.getConsommationTheo();
            default:
                return null;
        }

    }
}
