/*
 * Created by JFormDesigner on Tue Apr 12 12:29:11 WET 2022
 */

package ma.fstt.ihm;

import ma.fstt.model.*;

import javax.swing.*;
import javax.swing.GroupLayout;
import java.sql.SQLException;

/**
 * @author unknown
 */
public class MissionDetails extends JFrame {
    public MissionDetails(Integer tempMission) {
        initComponents();
        this.setContentPane(this.MissionDetailsPane);
        this.setTitle("GConsommation");
        this.setSize(1200, 550);
        this.setVisible(true);

        MissionTransaction missionTransaction;

        try {
            missionTransaction = new MissionTransaction();
            this.setMission(missionTransaction.getOne(tempMission));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        //    Assigning values to text fields:
//        =============Mission
        idMission.setText(String.valueOf(this.mission.getIdMission()));
        depart.setText(mission.getDepart());
        arrive.setText(mission.getArrive());
        kilometrage.setText(String.valueOf(mission.getKilometrage()));
        consomationTheo.setText(String.valueOf(mission.getConsommationTheo()));
//        =============Trajet
        TrajetTransaction trajetTransaction;

        try {
            trajetTransaction = new TrajetTransaction();
            this.setTrajet(trajetTransaction.getOne(tempMission));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        date_depart.setText(String.valueOf(trajet.getDateDepart()));
        date_arrive.setText(String.valueOf(trajet.getDateArrive()));
        consommation.setText(String.valueOf(trajet.getConsommation()));
//        =============Vehicule
        VehiculeTrasaction vehiculeTrasaction;

        try {
            vehiculeTrasaction = new VehiculeTrasaction();
            this.setVehicule(vehiculeTrasaction.getOne(trajet.getIdVehicule()));
            if (vehicule instanceof Cammion){
                this.setCammion((Cammion) vehicule);
            } else if (vehicule instanceof Bus){
                this.setBus((Bus) vehicule);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (cammion != null){
            idVehicule.setText(String.valueOf(cammion.getIdVehicule()));
            numeroVehicule.setText(String.valueOf(cammion.getNumero()));
            modelVehicule.setText(String.valueOf(cammion.getModel()));
            capa_res.setText(String.valueOf(cammion.getCapaRes()));
            type.setText("CAMMION");
            poids.setText(String.valueOf(cammion.getPoids()));
            capacite.setText(String.valueOf(cammion.getCapacite()));

        } else if (bus != null) {
            idVehicule.setText(String.valueOf(bus.getIdVehicule()));
            numeroVehicule.setText(String.valueOf(bus.getNumero()));
            modelVehicule.setText(String.valueOf(bus.getModel()));
            capa_res.setText(String.valueOf(bus.getCapaRes()));
            type.setText("BUS");
            poids.setText(String.valueOf(bus.getPoids()));
            capacite.setText(String.valueOf(bus.getNbrSiege()));
        }


    }

    //        necessary declarations:
    private Mission mission;
    private Trajet trajet;
    private Vehicule vehicule;
    private Bus bus;
    private Cammion cammion;

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Cammion getCammion() {
        return cammion;
    }

    public void setCammion(Cammion cammion) {
        this.cammion = cammion;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public Trajet getTrajet() {
        return trajet;
    }

    public void setTrajet(Trajet trajet) {
        this.trajet = trajet;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        MissionDetailsPane = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        idMission = new JLabel();
        label3 = new JLabel();
        depart = new JLabel();
        label4 = new JLabel();
        arrive = new JLabel();
        label5 = new JLabel();
        kilometrage = new JLabel();
        label6 = new JLabel();
        consomationTheo = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        date_depart = new JLabel();
        label9 = new JLabel();
        date_arrive = new JLabel();
        label10 = new JLabel();
        consommation = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        idVehicule = new JLabel();
        label13 = new JLabel();
        numeroVehicule = new JLabel();
        label14 = new JLabel();
        modelVehicule = new JLabel();
        label15 = new JLabel();
        capa_res = new JLabel();
        label16 = new JLabel();
        poids = new JLabel();
        capacite = new JLabel();
        label17 = new JLabel();
        label18 = new JLabel();
        nbr_siege = new JLabel();
        type = new JLabel();
        label19 = new JLabel();

        //======== MissionDetailsPane ========
        {

            //---- label1 ----
            label1.setText("Mission:");

            //---- label2 ----
            label2.setText("id:");

            //---- idMission ----
            idMission.setText("id:");

            //---- label3 ----
            label3.setText("depart:");

            //---- depart ----
            depart.setText("id:depart");

            //---- label4 ----
            label4.setText("arrive:");

            //---- arrive ----
            arrive.setText("id:depart");

            //---- label5 ----
            label5.setText("kilometrage:");

            //---- kilometrage ----
            kilometrage.setText("id:");

            //---- label6 ----
            label6.setText("consomationTheorique:");

            //---- consomationTheo ----
            consomationTheo.setText("id:");

            //---- label7 ----
            label7.setText("Trajet:");

            //---- label8 ----
            label8.setText("date_depart:");

            //---- date_depart ----
            date_depart.setText("id:");

            //---- label9 ----
            label9.setText("date_arrive:");

            //---- date_arrive ----
            date_arrive.setText("id:");

            //---- label10 ----
            label10.setText("consommation:");

            //---- consommation ----
            consommation.setText("id:");

            //---- label11 ----
            label11.setText("Vehicule:");

            //---- label12 ----
            label12.setText("id:");

            //---- idVehicule ----
            idVehicule.setText("id:");

            //---- label13 ----
            label13.setText("numero:");

            //---- numeroVehicule ----
            numeroVehicule.setText("id:");

            //---- label14 ----
            label14.setText("model:");

            //---- modelVehicule ----
            modelVehicule.setText("id:");

            //---- label15 ----
            label15.setText("capa_res:");

            //---- capa_res ----
            capa_res.setText("id:");

            //---- label16 ----
            label16.setText("poids");

            //---- poids ----
            poids.setText("id:");

            //---- capacite ----
            capacite.setText("NULL");

            //---- label17 ----
            label17.setText("capacite");

            //---- label18 ----
            label18.setText("nbr_siege:");

            //---- nbr_siege ----
            nbr_siege.setText("NULL");

            //---- type ----
            type.setText("id:");

            //---- label19 ----
            label19.setText("type:");

            GroupLayout MissionDetailsPaneLayout = new GroupLayout(MissionDetailsPane);
            MissionDetailsPane.setLayout(MissionDetailsPaneLayout);
            MissionDetailsPaneLayout.setHorizontalGroup(
                MissionDetailsPaneLayout.createParallelGroup()
                    .addGroup(MissionDetailsPaneLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(MissionDetailsPaneLayout.createParallelGroup()
                            .addGroup(MissionDetailsPaneLayout.createSequentialGroup()
                                .addComponent(label18, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(nbr_siege, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label19, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(type, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
                            .addGroup(MissionDetailsPaneLayout.createSequentialGroup()
                                .addComponent(label15, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(capa_res, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label16, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(poids, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label17, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(capacite, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
                            .addComponent(label11, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                            .addGroup(MissionDetailsPaneLayout.createSequentialGroup()
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(kilometrage, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(consomationTheo, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                            .addGroup(MissionDetailsPaneLayout.createSequentialGroup()
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idMission, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(depart, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(arrive, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                            .addGroup(MissionDetailsPaneLayout.createSequentialGroup()
                                .addComponent(label8, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(date_depart, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label9, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(date_arrive, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label10, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(consommation, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
                            .addGroup(MissionDetailsPaneLayout.createSequentialGroup()
                                .addComponent(label12, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(idVehicule, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label13, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(numeroVehicule, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label14, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(modelVehicule, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(79, Short.MAX_VALUE))
            );
            MissionDetailsPaneLayout.setVerticalGroup(
                MissionDetailsPaneLayout.createParallelGroup()
                    .addGroup(MissionDetailsPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MissionDetailsPaneLayout.createParallelGroup()
                            .addGroup(MissionDetailsPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addComponent(idMission, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(depart, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(arrive, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(MissionDetailsPaneLayout.createParallelGroup()
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(kilometrage, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(consomationTheo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MissionDetailsPaneLayout.createParallelGroup()
                            .addComponent(label8, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_depart, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label9, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_arrive, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label10, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(consommation, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label11, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MissionDetailsPaneLayout.createParallelGroup()
                            .addComponent(label12, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(idVehicule, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label13, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroVehicule, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label14, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelVehicule, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MissionDetailsPaneLayout.createParallelGroup()
                            .addComponent(label15, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(capa_res, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label16, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(poids, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label17, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(capacite, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MissionDetailsPaneLayout.createParallelGroup()
                            .addComponent(label18, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(nbr_siege, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label19, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(type, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel MissionDetailsPane;
    private JLabel label1;
    private JLabel label2;
    private JLabel idMission;
    private JLabel label3;
    private JLabel depart;
    private JLabel label4;
    private JLabel arrive;
    private JLabel label5;
    private JLabel kilometrage;
    private JLabel label6;
    private JLabel consomationTheo;
    private JLabel label7;
    private JLabel label8;
    private JLabel date_depart;
    private JLabel label9;
    private JLabel date_arrive;
    private JLabel label10;
    private JLabel consommation;
    private JLabel label11;
    private JLabel label12;
    private JLabel idVehicule;
    private JLabel label13;
    private JLabel numeroVehicule;
    private JLabel label14;
    private JLabel modelVehicule;
    private JLabel label15;
    private JLabel capa_res;
    private JLabel label16;
    private JLabel poids;
    private JLabel capacite;
    private JLabel label17;
    private JLabel label18;
    private JLabel nbr_siege;
    private JLabel type;
    private JLabel label19;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
