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
//        INITIAL DATA =======================================================
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

//        SUPPRIMER BUTTON=======================================================

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
//        DETAILS BUTTON=======================================================

        displayDetailsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MissionTableModel table = (MissionTableModel) missionTable.getModel();

                int row = missionTable.getSelectedRow();
                int value = (int) table.getValueAt(row, 0);

                MissionDetails missionDetails = new MissionDetails(value);

            }
        });
//        REFRESH BUTTON=======================================================

        refreshChauffeurButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                List<Chauffeur> chauffeurList = null;
                try {
                    chauffeurList = chauffeurTransaction.getAll();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                chauffeurTable = new JTable(new ChauffeurTableModel(chauffeurList));
                chauffeurTab.setViewportView(chauffeurTable);
            }
        });

        refreshMissionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                List<Mission> missionList = null;
                try {
                    missionList = missionTransaction.getAll();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                missionTable = new JTable(new MissionTableModel(missionList));
                missionTab.setViewportView(missionTable);
            }
        });

        refreshBusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                List<Bus> busList = null;
                try {
                    busList = busTransaction.getAll();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                busTable = new JTable(new BusTableModel(busList));
                busTab.setViewportView(busTable);
            }
        });

        refreshCammionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                List<Cammion> cammionList = null;
                try {
                    cammionList = cammionTrasaction.getAll();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                cammionTable = new JTable(new CammionTableModel(cammionList));
                cammionTab.setViewportView(cammionTable);
            }
        });

//    EDIT BUTTON============================

        editChauffeurButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ChauffeurTableModel table = (ChauffeurTableModel) chauffeurTable.getModel();

                    int row = chauffeurTable.getSelectedRow();
                    int value = (int) table.getValueAt(row, 0);

                    ChauffeurEdit chauffeurEdit = new ChauffeurEdit(value);
            }
        });

        editCammionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CammionTableModel table = (CammionTableModel) cammionTable.getModel();

                int row = cammionTable.getSelectedRow();
                int value = (int) table.getValueAt(row, 0);

                try {
                    CammionEdit cammionEdit = new CammionEdit(value);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        editBusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                BusTableModel table = (BusTableModel) busTable.getModel();

                int row = busTable.getSelectedRow();
                int value = (int) table.getValueAt(row, 0);

                try {
                    BusEdit busEdit = new BusEdit(value);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        editMissionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MissionTableModel table = (MissionTableModel) missionTable.getModel();

                int row = missionTable.getSelectedRow();
                int value = (int) table.getValueAt(row, 0);

                try {
                    MissionEdit missionEdit = new MissionEdit(value);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
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
        refreshChauffeurButton = new JButton();
        editChauffeurButton = new JButton();
        cammionContainer = new JPanel();
        supprimerCammionButton = new JButton();
        cammionTab = new JScrollPane();
        cammionTable = new JTable();
        refreshCammionButton = new JButton();
        editCammionButton = new JButton();
        busContainer = new JPanel();
        supprimerBusButton = new JButton();
        busTab = new JScrollPane();
        busTable = new JTable();
        refreshBusButton = new JButton();
        editBusButton = new JButton();
        missionContainer = new JPanel();
        supprimerMissionButton = new JButton();
        missionTab = new JScrollPane();
        missionTable = new JTable();
        displayDetailsButton = new JButton();
        refreshMissionButton = new JButton();
        editMissionButton = new JButton();

        //======== Database ========
        {

            //======== chauffeurPane ========
            {

                //======== ChauffeurContainer ========
                {

                    //---- supprimerChauffeurButton ----
                    supprimerChauffeurButton.setText("SUPPRIMER");
                    supprimerChauffeurButton.setBackground(new Color(60, 60, 53));
                    supprimerChauffeurButton.setForeground(new Color(254, 255, 241));

                    //======== chauffeurTab ========
                    {
                        chauffeurTab.setViewportView(chauffeurTable);
                    }

                    //---- refreshChauffeurButton ----
                    refreshChauffeurButton.setText("REFRESH");
                    refreshChauffeurButton.setBackground(new Color(60, 60, 53));
                    refreshChauffeurButton.setForeground(new Color(254, 255, 241));

                    //---- editChauffeurButton ----
                    editChauffeurButton.setText("MODIFIER");
                    editChauffeurButton.setBackground(new Color(60, 60, 53));
                    editChauffeurButton.setForeground(new Color(254, 255, 241));

                    GroupLayout ChauffeurContainerLayout = new GroupLayout(ChauffeurContainer);
                    ChauffeurContainer.setLayout(ChauffeurContainerLayout);
                    ChauffeurContainerLayout.setHorizontalGroup(
                        ChauffeurContainerLayout.createParallelGroup()
                            .addGroup(ChauffeurContainerLayout.createSequentialGroup()
                                .addGroup(ChauffeurContainerLayout.createParallelGroup()
                                    .addComponent(chauffeurTab, GroupLayout.PREFERRED_SIZE, 886, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ChauffeurContainerLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(supprimerChauffeurButton, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(refreshChauffeurButton, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(editChauffeurButton, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                    );
                    ChauffeurContainerLayout.setVerticalGroup(
                        ChauffeurContainerLayout.createParallelGroup()
                            .addGroup(ChauffeurContainerLayout.createSequentialGroup()
                                .addGroup(ChauffeurContainerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(supprimerChauffeurButton)
                                    .addComponent(refreshChauffeurButton)
                                    .addComponent(editChauffeurButton))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chauffeurTab, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE))
                    );
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

                    //---- refreshCammionButton ----
                    refreshCammionButton.setText("REFRESH");
                    refreshCammionButton.setBackground(new Color(60, 60, 53));
                    refreshCammionButton.setForeground(new Color(254, 255, 241));
                    refreshCammionButton.setFocusPainted(false);
                    refreshCammionButton.setFocusable(false);

                    //---- editCammionButton ----
                    editCammionButton.setText("MODIFIER");
                    editCammionButton.setBackground(new Color(60, 60, 53));
                    editCammionButton.setForeground(new Color(254, 255, 241));
                    editCammionButton.setFocusPainted(false);
                    editCammionButton.setFocusable(false);

                    GroupLayout cammionContainerLayout = new GroupLayout(cammionContainer);
                    cammionContainer.setLayout(cammionContainerLayout);
                    cammionContainerLayout.setHorizontalGroup(
                        cammionContainerLayout.createParallelGroup()
                            .addGroup(cammionContainerLayout.createSequentialGroup()
                                .addGroup(cammionContainerLayout.createParallelGroup()
                                    .addComponent(cammionTab, GroupLayout.PREFERRED_SIZE, 810, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(cammionContainerLayout.createSequentialGroup()
                                        .addComponent(supprimerCammionButton, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(refreshCammionButton, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(editCammionButton, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(82, Short.MAX_VALUE))
                    );
                    cammionContainerLayout.setVerticalGroup(
                        cammionContainerLayout.createParallelGroup()
                            .addGroup(cammionContainerLayout.createSequentialGroup()
                                .addGroup(cammionContainerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(supprimerCammionButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(refreshCammionButton)
                                    .addComponent(editCammionButton))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cammionTab, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE))
                    );
                }
                chauffeurPane.addTab("Cammion", cammionContainer);

                //======== busContainer ========
                {

                    //---- supprimerBusButton ----
                    supprimerBusButton.setText("SUPPRIMER");
                    supprimerBusButton.setBackground(new Color(60, 60, 53));
                    supprimerBusButton.setForeground(new Color(254, 255, 241));

                    //======== busTab ========
                    {
                        busTab.setViewportView(busTable);
                    }

                    //---- refreshBusButton ----
                    refreshBusButton.setText("REFRESH");
                    refreshBusButton.setBackground(new Color(60, 60, 53));
                    refreshBusButton.setForeground(new Color(254, 255, 241));

                    //---- editBusButton ----
                    editBusButton.setText("MODIFIER");
                    editBusButton.setBackground(new Color(60, 60, 53));
                    editBusButton.setForeground(new Color(254, 255, 241));

                    GroupLayout busContainerLayout = new GroupLayout(busContainer);
                    busContainer.setLayout(busContainerLayout);
                    busContainerLayout.setHorizontalGroup(
                        busContainerLayout.createParallelGroup()
                            .addGroup(busContainerLayout.createSequentialGroup()
                                .addGroup(busContainerLayout.createParallelGroup()
                                    .addComponent(busTab, GroupLayout.PREFERRED_SIZE, 880, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(busContainerLayout.createSequentialGroup()
                                        .addComponent(supprimerBusButton, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(refreshBusButton, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(editBusButton, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                    );
                    busContainerLayout.setVerticalGroup(
                        busContainerLayout.createParallelGroup()
                            .addGroup(busContainerLayout.createSequentialGroup()
                                .addGroup(busContainerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(supprimerBusButton)
                                    .addComponent(refreshBusButton)
                                    .addComponent(editBusButton))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(busTab, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE))
                    );
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

                    //---- editMissionButton ----
                    editMissionButton.setText("MODIFIER");
                    editMissionButton.setBackground(new Color(60, 60, 53));
                    editMissionButton.setForeground(new Color(254, 255, 241));

                    GroupLayout missionContainerLayout = new GroupLayout(missionContainer);
                    missionContainer.setLayout(missionContainerLayout);
                    missionContainerLayout.setHorizontalGroup(
                        missionContainerLayout.createParallelGroup()
                            .addGroup(missionContainerLayout.createSequentialGroup()
                                .addContainerGap(44, Short.MAX_VALUE)
                                .addComponent(missionTab, GroupLayout.PREFERRED_SIZE, 810, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 38, Short.MAX_VALUE))
                            .addGroup(missionContainerLayout.createSequentialGroup()
                                .addComponent(supprimerMissionButton, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayDetailsButton, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(refreshMissionButton, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editMissionButton, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 131, Short.MAX_VALUE))
                    );
                    missionContainerLayout.setVerticalGroup(
                        missionContainerLayout.createParallelGroup()
                            .addGroup(missionContainerLayout.createSequentialGroup()
                                .addGroup(missionContainerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(supprimerMissionButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(displayDetailsButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(refreshMissionButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editMissionButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
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
    private JButton refreshChauffeurButton;
    private JButton editChauffeurButton;
    private JPanel cammionContainer;
    private JButton supprimerCammionButton;
    private JScrollPane cammionTab;
    private JTable cammionTable;
    private JButton refreshCammionButton;
    private JButton editCammionButton;
    private JPanel busContainer;
    private JButton supprimerBusButton;
    private JScrollPane busTab;
    private JTable busTable;
    private JButton refreshBusButton;
    private JButton editBusButton;
    private JPanel missionContainer;
    private JButton supprimerMissionButton;
    private JScrollPane missionTab;
    private JTable missionTable;
    private JButton displayDetailsButton;
    private JButton refreshMissionButton;
    private JButton editMissionButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
