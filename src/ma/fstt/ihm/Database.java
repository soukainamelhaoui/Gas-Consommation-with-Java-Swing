package ma.fstt.ihm;

import ma.fstt.model.*;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.List;

public class Database extends JFrame {
    private JPanel Database;
    private JTabbedPane chauffeurPane;
    private JTable chauffeurTable;
    private JScrollPane chauffeurTab;
    private JScrollPane cammionTab;
    private JTable cammionTable;
    private JScrollPane missionTab;
    private JScrollPane busTab;
    private JTable busTable;
    private JTable missionTable;

    public Database() throws SQLException {
//        Chauffeur
        ChauffeurTransaction chauffeurTransaction = new ChauffeurTransaction();
        List<Chauffeur> chauffeurList = chauffeurTransaction.getAll();
        chauffeurTable = new JTable(new ChauffeurTableModel(chauffeurList));
        chauffeurTab.setViewportView(chauffeurTable);

//        Bus
        BusTransaction busTransaction = new BusTransaction();
        List<Bus> busList = busTransaction.getAll();
        busTable = new JTable(new BusTableModel(busList));
        busTab.setViewportView(busTable);
//        Cammion
        CammionTrasaction cammionTrasaction = new CammionTrasaction();
        List<Cammion> cammionList = cammionTrasaction.getAll();
        cammionTable = new JTable(new CammionTableModel(cammionList));
        cammionTab.setViewportView(cammionTable);
//        Mission
        MissionTransaction missionTransaction = new MissionTransaction();
        List<Mission> missionList = missionTransaction.getAll();
        missionTable = new JTable(new MissionTableModel(missionList));
        missionTab.setViewportView(missionTable);
    }

    public static void main() throws SQLException {
        Database database = new Database();
        database.setContentPane(database.Database);
        database.setTitle("GConsommation");
        database.setSize(1200, 500);
        database.setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        Database = new JPanel();
        Database.setLayout(new CardLayout(0, 0));
        chauffeurPane = new JTabbedPane();
        Database.add(chauffeurPane, "Card1");
        chauffeurTab = new JScrollPane();
        chauffeurPane.addTab("Chauffeur", chauffeurTab);
        chauffeurTable = new JTable();
        chauffeurTab.setViewportView(chauffeurTable);
        cammionTab = new JScrollPane();
        chauffeurPane.addTab("Cammion", cammionTab);
        cammionTable = new JTable();
        cammionTab.setViewportView(cammionTable);
        busTab = new JScrollPane();
        chauffeurPane.addTab("Bus", busTab);
        busTable = new JTable();
        busTab.setViewportView(busTable);
        missionTab = new JScrollPane();
        chauffeurPane.addTab("Mission", missionTab);
        missionTable = new JTable();
        missionTab.setViewportView(missionTable);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return Database;
    }

}
