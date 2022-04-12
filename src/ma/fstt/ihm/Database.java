package ma.fstt.ihm;

import java.awt.event.*;
import com.intellij.uiDesigner.core.*;
import ma.fstt.model.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.SQLException;
import java.util.List;

public class Database extends JFrame {

    public Database() throws SQLException {
        initComponents();
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

        supprimerChauffeurButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ChauffeurTableModel table = (ChauffeurTableModel) chauffeurTable.getModel();

                try {
                    ChauffeurTransaction chauffeurTransaction = new ChauffeurTransaction();

                    int row = chauffeurTable.getSelectedRow();
                    int value = (int) table.getValueAt(row, 0);

                    chauffeurTransaction.delete(value);
                    List<Chauffeur> chauffeurList = chauffeurTransaction.getAll();
                    chauffeurTable = new JTable(new ChauffeurTableModel(chauffeurList));
                    chauffeurTab.setViewportView(chauffeurTable);

                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        });

        supprimerBusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                BusTableModel table = (BusTableModel) busTable.getModel();

                try {
                    BusTransaction busTransaction = new BusTransaction();

                    int row = busTable.getSelectedRow();
                    int value = (int) table.getValueAt(row, 0);

                    busTransaction.delete(value);

                    List<Bus> busList = busTransaction.getAll();
                    busTable = new JTable(new BusTableModel(busList));
                    busTab.setViewportView(busTable);

                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        });

        supprimerCammionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CammionTableModel table = (CammionTableModel) cammionTable.getModel();

                try {
                    CammionTrasaction cammionTrasaction = new CammionTrasaction();

                    int row = cammionTable.getSelectedRow();
                    int value = (int) table.getValueAt(row, 0);

                    cammionTrasaction.delete(value);

                    List<Cammion> cammionList = cammionTrasaction.getAll();
                    cammionTable = new JTable(new CammionTableModel(cammionList));
                    cammionTab.setViewportView(cammionTable);

                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        });

        supprimerMissionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MissionTableModel table = (MissionTableModel) missionTable.getModel();

                try {
                    MissionTransaction missionTrasaction = new MissionTransaction();

                    int row = missionTable.getSelectedRow();
                    int value = (int) table.getValueAt(row, 0);

                    missionTrasaction.delete(value);

                    List<Mission> missionList = missionTransaction.getAll();
                    missionTable = new JTable(new MissionTableModel(missionList));
                    missionTab.setViewportView(missionTable);

                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        });

        displayDetailsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MissionTableModel table = (MissionTableModel) missionTable.getModel();

                int row = missionTable.getSelectedRow();
                int value = (int) table.getValueAt(row, 0);

                MissionDetails missionDetails = new MissionDetails(value);

            }
        });

    }



    public static void main() throws SQLException {
        Database database = new Database();
        database.setContentPane(database.Database);
        database.setTitle("GConsommation");
        database.setSize(1200, 400);
        database.setVisible(true);


    }




    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        Database = new JPanel();
        chauffeurPane = new JTabbedPane();
        ChauffeurContainer = new JPanel();
        supprimerChauffeurButton = new JButton();
        chauffeurTab = new JScrollPane();
        chauffeurTable = new JTable();
        cammionContainer = new JPanel();
        supprimerCammionButton = new JButton();
        cammionTab = new JScrollPane();
        cammionTable = new JTable();
        busContainer = new JPanel();
        supprimerBusButton = new JButton();
        busTab = new JScrollPane();
        busTable = new JTable();
        missionContainer = new JPanel();
        supprimerMissionButton = new JButton();
        missionTab = new JScrollPane();
        missionTable = new JTable();
        displayDetailsButton = new JButton();
        refreshMissionButton = new JButton();

        //======== Database ========
        {

            //======== chauffeurPane ========
            {

                //======== ChauffeurContainer ========
                {
                    ChauffeurContainer.setLayout(new BorderLayout());

                    //---- supprimerChauffeurButton ----
                    supprimerChauffeurButton.setText("SUPPRIMER");
                    supprimerChauffeurButton.setBackground(new Color(60, 60, 53));
                    supprimerChauffeurButton.setForeground(new Color(254, 255, 241));
                    ChauffeurContainer.add(supprimerChauffeurButton, BorderLayout.NORTH);

                    //======== chauffeurTab ========
                    {
                        chauffeurTab.setViewportView(chauffeurTable);
                    }
                    ChauffeurContainer.add(chauffeurTab, BorderLayout.CENTER);
                }
                chauffeurPane.addTab("Chauffeur", ChauffeurContainer);

                //======== cammionContainer ========
                {

                    //---- supprimerCammionButton ----
                    supprimerCammionButton.setText("SUPPRIMER");
                    supprimerCammionButton.setBackground(new Color(60, 60, 53));
                    supprimerCammionButton.setForeground(new Color(254, 255, 241));
                    supprimerCammionButton.setFocusPainted(false);
                    supprimerCammionButton.setFocusable(false);

                    //======== cammionTab ========
                    {
                        cammionTab.setViewportView(cammionTable);
                    }

                    GroupLayout cammionContainerLayout = new GroupLayout(cammionContainer);
                    cammionContainer.setLayout(cammionContainerLayout);
                    cammionContainerLayout.setHorizontalGroup(
                        cammionContainerLayout.createParallelGroup()
                            .addGroup(cammionContainerLayout.createSequentialGroup()
                                .addGroup(cammionContainerLayout.createParallelGroup()
                                    .addComponent(cammionTab, GroupLayout.PREFERRED_SIZE, 810, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(supprimerCammionButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(70, Short.MAX_VALUE))
                    );
                    cammionContainerLayout.setVerticalGroup(
                        cammionContainerLayout.createParallelGroup()
                            .addGroup(cammionContainerLayout.createSequentialGroup()
                                .addComponent(supprimerCammionButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cammionTab, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE))
                    );
                }
                chauffeurPane.addTab("Cammion", cammionContainer);

                //======== busContainer ========
                {
                    busContainer.setLayout(new BorderLayout());

                    //---- supprimerBusButton ----
                    supprimerBusButton.setText("SUPPRIMER");
                    supprimerBusButton.setBackground(new Color(60, 60, 53));
                    supprimerBusButton.setForeground(new Color(254, 255, 241));
                    busContainer.add(supprimerBusButton, BorderLayout.NORTH);

                    //======== busTab ========
                    {
                        busTab.setViewportView(busTable);
                    }
                    busContainer.add(busTab, BorderLayout.CENTER);
                }
                chauffeurPane.addTab("Bus", busContainer);

                //======== missionContainer ========
                {

                    //---- supprimerMissionButton ----
                    supprimerMissionButton.setText("SUPPRIMER");
                    supprimerMissionButton.setBackground(new Color(60, 60, 53));
                    supprimerMissionButton.setForeground(new Color(254, 255, 241));

                    //======== missionTab ========
                    {
                        missionTab.setViewportView(missionTable);
                    }

                    //---- displayDetailsButton ----
                    displayDetailsButton.setText("DETAILS");
                    displayDetailsButton.setBackground(new Color(60, 60, 53));
                    displayDetailsButton.setForeground(new Color(254, 255, 241));

                    //---- refreshMissionButton ----
                    refreshMissionButton.setText("REFRESH");
                    refreshMissionButton.setBackground(new Color(60, 60, 53));
                    refreshMissionButton.setForeground(new Color(254, 255, 241));

                    GroupLayout missionContainerLayout = new GroupLayout(missionContainer);
                    missionContainer.setLayout(missionContainerLayout);
                    missionContainerLayout.setHorizontalGroup(
                        missionContainerLayout.createParallelGroup()
                            .addGroup(missionContainerLayout.createSequentialGroup()
                                .addContainerGap(38, Short.MAX_VALUE)
                                .addComponent(missionTab, GroupLayout.PREFERRED_SIZE, 810, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 32, Short.MAX_VALUE))
                            .addGroup(missionContainerLayout.createSequentialGroup()
                                .addComponent(supprimerMissionButton, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayDetailsButton, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(refreshMissionButton, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 181, Short.MAX_VALUE))
                    );
                    missionContainerLayout.setVerticalGroup(
                        missionContainerLayout.createParallelGroup()
                            .addGroup(missionContainerLayout.createSequentialGroup()
                                .addGroup(missionContainerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(supprimerMissionButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(displayDetailsButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(refreshMissionButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(missionTab, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                    );
                }
                chauffeurPane.addTab("Mission", missionContainer);
            }

            GroupLayout DatabaseLayout = new GroupLayout(Database);
            Database.setLayout(DatabaseLayout);
            DatabaseLayout.setHorizontalGroup(
                DatabaseLayout.createParallelGroup()
                    .addGroup(DatabaseLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(chauffeurPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            );
            DatabaseLayout.setVerticalGroup(
                DatabaseLayout.createParallelGroup()
                    .addComponent(chauffeurPane, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel Database;
    private JTabbedPane chauffeurPane;
    private JPanel ChauffeurContainer;
    private JButton supprimerChauffeurButton;
    private JScrollPane chauffeurTab;
    private JTable chauffeurTable;
    private JPanel cammionContainer;
    private JButton supprimerCammionButton;
    private JScrollPane cammionTab;
    private JTable cammionTable;
    private JPanel busContainer;
    private JButton supprimerBusButton;
    private JScrollPane busTab;
    private JTable busTable;
    private JPanel missionContainer;
    private JButton supprimerMissionButton;
    private JScrollPane missionTab;
    private JTable missionTable;
    private JButton displayDetailsButton;
    private JButton refreshMissionButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
