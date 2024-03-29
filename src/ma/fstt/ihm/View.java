package ma.fstt.ihm;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import ma.fstt.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;

public class View extends JFrame {
    private JTabbedPane main;
    private JPanel mainPanel;
    private JLabel titleChauffeur;
    private JLabel nomChauffeur;
    private JTextField nomChauffeurInput;
    private JLabel prenomChauffeur;
    private JTextField prenomChauffeurInput;
    private JLabel codeChauffeur;
    private JTextField codeChauffeurInput;
    private JPanel chauffeur;
    private JPanel vehicule;
    private JPanel mission;
    private JTabbedPane vehiculeTypes;
    private JPanel bus;
    private JPanel camion;
    private JTextField numeroBusInput;
    private JTextField modelBusInput;
    private JLabel numeroBus;
    private JLabel modelBus;
    private JLabel poidsBus;
    private JButton saveChauffeurButton;
    private JButton saveBusButton;
    private JTextField numeroCamionInput;
    private JTextField modelCamionInput;
    private JButton saveCamionButton;
    private JLabel numeroCamion;
    private JLabel modelCamion;
    private JLabel capaciteResCamion;
    private JLabel poidsCamion;
    private JLabel capaciteCamion;
    private JTextField departMissionInput;
    private JTextField arriveMissionInput;
    private JButton saveMissionButton;
    private JLabel departMission;
    private JLabel arriveMission;
    private JLabel kilometreMission;
    private JLabel consommationMission;
    private JTextField ConsMissionInput;
    private JTextField metrageMissionInput;
    private JTextField capResBusInput;
    private JTextField poidBusInput;
    private JTextField nbrSiegeBusInput;
    private JLabel capBus;
    private JLabel nbrSiegeBus;
    private JTextField capResCammionInput;
    private JTextField poidCammionInput;
    private JTextField capCammionInput;
    private JPanel trajet;
    private JLabel titleMission;
    private JLabel titleTrajet;
    private JTextField dateDepartInput;
    private JTextField dateArriveInput;
    private JTextField consomTrajetInput;
    private JTextField missionTrajetInput;
    private JTextField vehiculeTrajetInput;
    private JButton saveTrajetButton;
    private JLabel dateDepart;
    private JLabel dareArrive;
    private JLabel consomationTrajet;
    private JLabel missionTrajet;
    private JLabel vehiculeTrajet;
    private JTextField libelleCarburantInput;
    private JTextField puCarburantInput;
    private JTextField dateCarburantInput;
    private JTextField quantiteCarburantInput;
    private JTextField vehiculeCarburantInput;
    private JButton saveCarburantButton;
    private JLabel vehiculeCarburant;
    private JLabel quantiteCarburant;
    private JLabel dateCarburant;
    private JLabel puCarburant;
    private JLabel libelleCarburant;


    public View() {
        setContentPane(mainPanel);
        setTitle("Home");
        setSize(500, 800);
        setVisible(true);

        saveChauffeurButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Chauffeur chauffeur = new Chauffeur();
                try {
                    ChauffeurTransaction chauffeurTransaction = new ChauffeurTransaction();

                    chauffeur.setNom(nomChauffeurInput.getText());
                    chauffeur.setPrenom(prenomChauffeurInput.getText());
                    chauffeur.setCode(codeChauffeurInput.getText());

                    chauffeurTransaction.save(chauffeur);

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

            }
        });

        saveBusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Bus bus = new Bus();
                try {
                    BusTransaction busTransaction = new BusTransaction();

                    bus.setNumero(numeroBusInput.getText());
                    bus.setModel(modelBusInput.getText());
                    bus.setCapaRes(Integer.parseInt(capResBusInput.getText()));
                    bus.setPoids(Double.parseDouble((poidBusInput.getText())));
                    bus.setNbrSiege(Integer.parseInt(nbrSiegeBusInput.getText()));

                    busTransaction.save(bus);

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

            }
        });
        saveCamionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Cammion cammion = new Cammion();
                try {
                    CammionTrasaction cammionTrasaction = new CammionTrasaction();

                    cammion.setNumero(numeroCamionInput.getText());
                    cammion.setModel(modelCamionInput.getText());
                    cammion.setCapaRes(Integer.parseInt(capResCammionInput.getText()));
                    cammion.setPoids(Double.parseDouble(poidCammionInput.getText()));
                    cammion.setCapacite(Integer.parseInt(capCammionInput.getText()));

                    cammionTrasaction.save(cammion);

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

            }
        });
        saveMissionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Mission mission = new Mission();
                try {
                    MissionTransaction missionTransaction = new MissionTransaction();

                    mission.setDepart(departMissionInput.getText());
                    mission.setArrive(arriveMissionInput.getText());
                    mission.setKilometrage(Double.valueOf(metrageMissionInput.getText()));
                    mission.setConsommationTheo(Double.parseDouble(ConsMissionInput.getText()));

                    missionTransaction.save(mission);

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

            }
        });
        saveTrajetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Trajet trajet = new Trajet();
                try {
                    TrajetTransaction trajetTransaction = new TrajetTransaction();

                    trajet.setDateDepart(dateDepartInput.getText());
                    trajet.setDateArrive(dateArriveInput.getText());
                    trajet.setConsommation(Double.valueOf(consomTrajetInput.getText()));
                    trajet.setIdMission(Integer.parseInt(missionTrajetInput.getText()));
                    trajet.setIdVehicule(Integer.parseInt(vehiculeTrajetInput.getText()));

                    trajetTransaction.save(trajet);

                } catch (SQLException e1) {
                    e1.printStackTrace();
                } catch (ParseException e) {
                    e.printStackTrace();
                }

            }
        });
        saveCarburantButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Carburant carburant = new Carburant();
                try {
                    CarburantTransaction carburantTransaction = new CarburantTransaction();

                    carburant.setLibelle(libelleCarburantInput.getText());
                    carburant.setPu(Double.parseDouble(puCarburantInput.getText()));
                    carburant.setDate(dateCarburantInput.getText());
                    carburant.setQuantity(Double.valueOf(quantiteCarburantInput.getText()));
                    carburant.setIdVehicule(Integer.parseInt(vehiculeCarburantInput.getText()));

                    carburantTransaction.save(carburant);

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

            }
        });
    }

    public static void main(String[] args) {
        View view = new View();

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
        mainPanel = new JPanel();
        mainPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        main = new JTabbedPane();
        mainPanel.add(main, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        chauffeur = new JPanel();
        chauffeur.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(5, 2, new Insets(0, 0, 0, 0), -1, -1));
        main.addTab("Chauffeurs", chauffeur);
        titleChauffeur = new JLabel();
        titleChauffeur.setText("Entrer les informations du chauffeur");
        chauffeur.add(titleChauffeur, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        nomChauffeur = new JLabel();
        nomChauffeur.setText("Nom");
        chauffeur.add(nomChauffeur, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        nomChauffeurInput = new JTextField();
        nomChauffeurInput.setText("");
        chauffeur.add(nomChauffeurInput, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        prenomChauffeur = new JLabel();
        prenomChauffeur.setText("Prenom");
        chauffeur.add(prenomChauffeur, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        prenomChauffeurInput = new JTextField();
        prenomChauffeurInput.setText("");
        chauffeur.add(prenomChauffeurInput, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        codeChauffeur = new JLabel();
        codeChauffeur.setText("Code");
        chauffeur.add(codeChauffeur, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        codeChauffeurInput = new JTextField();
        chauffeur.add(codeChauffeurInput, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        saveChauffeurButton = new JButton();
        saveChauffeurButton.setText("Enregistrer");
        chauffeur.add(saveChauffeurButton, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        vehicule = new JPanel();
        vehicule.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        main.addTab("Vehicules", vehicule);
        vehiculeTypes = new JTabbedPane();
        vehicule.add(vehiculeTypes, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        bus = new JPanel();
        bus.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(6, 6, new Insets(0, 0, 0, 0), -1, -1));
        vehiculeTypes.addTab("Bus", bus);
        numeroBus = new JLabel();
        numeroBus.setText("Numero");
        bus.add(numeroBus, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        modelBus = new JLabel();
        modelBus.setText("Model");
        bus.add(modelBus, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        capBus = new JLabel();
        capBus.setText("Capacite Res");
        bus.add(capBus, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        poidsBus = new JLabel();
        poidsBus.setText("Poids");
        bus.add(poidsBus, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        nbrSiegeBus = new JLabel();
        nbrSiegeBus.setText("Nomre de siege");
        bus.add(nbrSiegeBus, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 5, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        numeroBusInput = new JTextField();
        bus.add(numeroBusInput, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 5, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        modelBusInput = new JTextField();
        bus.add(modelBusInput, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        saveBusButton = new JButton();
        saveBusButton.setText("Enregistrer");
        bus.add(saveBusButton, new com.intellij.uiDesigner.core.GridConstraints(5, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        capResBusInput = new JTextField();
        bus.add(capResBusInput, new com.intellij.uiDesigner.core.GridConstraints(2, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        poidBusInput = new JTextField();
        bus.add(poidBusInput, new com.intellij.uiDesigner.core.GridConstraints(3, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        nbrSiegeBusInput = new JTextField();
        bus.add(nbrSiegeBusInput, new com.intellij.uiDesigner.core.GridConstraints(4, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        camion = new JPanel();
        camion.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(6, 6, new Insets(0, 0, 0, 0), -1, -1));
        vehiculeTypes.addTab("Cammions", camion);
        numeroCamion = new JLabel();
        numeroCamion.setText("Numero");
        camion.add(numeroCamion, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        modelCamion = new JLabel();
        modelCamion.setText("Model");
        camion.add(modelCamion, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        capaciteResCamion = new JLabel();
        capaciteResCamion.setText("Capacite Res");
        camion.add(capaciteResCamion, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        poidsCamion = new JLabel();
        poidsCamion.setText("Poids");
        camion.add(poidsCamion, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        capaciteCamion = new JLabel();
        capaciteCamion.setText("Capacite");
        camion.add(capaciteCamion, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 5, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        numeroCamionInput = new JTextField();
        camion.add(numeroCamionInput, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 5, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        modelCamionInput = new JTextField();
        camion.add(modelCamionInput, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        saveCamionButton = new JButton();
        saveCamionButton.setText("Enregistrer");
        camion.add(saveCamionButton, new com.intellij.uiDesigner.core.GridConstraints(5, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        capResCammionInput = new JTextField();
        camion.add(capResCammionInput, new com.intellij.uiDesigner.core.GridConstraints(2, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        poidCammionInput = new JTextField();
        camion.add(poidCammionInput, new com.intellij.uiDesigner.core.GridConstraints(3, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        capCammionInput = new JTextField();
        camion.add(capCammionInput, new com.intellij.uiDesigner.core.GridConstraints(4, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        mission = new JPanel();
        mission.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(6, 5, new Insets(0, 0, 0, 0), -1, -1));
        main.addTab("Missions", mission);
        titleMission = new JLabel();
        titleMission.setText("Entrer les informations de la mission");
        mission.add(titleMission, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 5, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        departMission = new JLabel();
        departMission.setText("Lieu de depart");
        mission.add(departMission, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        arriveMission = new JLabel();
        arriveMission.setText("Lieu d'arrive");
        mission.add(arriveMission, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        kilometreMission = new JLabel();
        kilometreMission.setText("Kilometrage");
        mission.add(kilometreMission, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        consommationMission = new JLabel();
        consommationMission.setText("Consommation Estimee");
        mission.add(consommationMission, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        departMissionInput = new JTextField();
        mission.add(departMissionInput, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        arriveMissionInput = new JTextField();
        mission.add(arriveMissionInput, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        saveMissionButton = new JButton();
        saveMissionButton.setText("Enregistrer");
        mission.add(saveMissionButton, new com.intellij.uiDesigner.core.GridConstraints(5, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        ConsMissionInput = new JTextField();
        mission.add(ConsMissionInput, new com.intellij.uiDesigner.core.GridConstraints(4, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        metrageMissionInput = new JTextField();
        mission.add(metrageMissionInput, new com.intellij.uiDesigner.core.GridConstraints(3, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        trajet = new JPanel();
        trajet.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(7, 7, new Insets(0, 0, 0, 0), -1, -1));
        main.addTab("Trajets", trajet);
        titleTrajet = new JLabel();
        titleTrajet.setText("Entrer les details du trajet");
        trajet.add(titleTrajet, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 7, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        trajet.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(1, 6, 5, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        dateDepart = new JLabel();
        dateDepart.setText("Date de depart");
        trajet.add(dateDepart, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dareArrive = new JLabel();
        dareArrive.setText("Date d'arrive");
        trajet.add(dareArrive, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        consomationTrajet = new JLabel();
        consomationTrajet.setText("Consommation");
        trajet.add(consomationTrajet, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        missionTrajet = new JLabel();
        missionTrajet.setText("Mission numero ");
        trajet.add(missionTrajet, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        vehiculeTrajet = new JLabel();
        vehiculeTrajet.setText("Vehicule numero");
        trajet.add(vehiculeTrajet, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 5, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dateDepartInput = new JTextField();
        dateDepartInput.setText("");
        dateDepartInput.setToolTipText("");
        trajet.add(dateDepartInput, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 5, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        dateArriveInput = new JTextField();
        trajet.add(dateArriveInput, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        consomTrajetInput = new JTextField();
        trajet.add(consomTrajetInput, new com.intellij.uiDesigner.core.GridConstraints(3, 3, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        missionTrajetInput = new JTextField();
        trajet.add(missionTrajetInput, new com.intellij.uiDesigner.core.GridConstraints(4, 4, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        vehiculeTrajetInput = new JTextField();
        trajet.add(vehiculeTrajetInput, new com.intellij.uiDesigner.core.GridConstraints(5, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        saveTrajetButton = new JButton();
        saveTrajetButton.setText("Enregistrer");
        trajet.add(saveTrajetButton, new com.intellij.uiDesigner.core.GridConstraints(6, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(6, 6, new Insets(0, 0, 0, 0), -1, -1));
        main.addTab("Carburant", panel1);
        libelleCarburant = new JLabel();
        libelleCarburant.setText("Libelle");
        panel1.add(libelleCarburant, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        puCarburant = new JLabel();
        puCarburant.setText("Prix unitaire");
        panel1.add(puCarburant, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dateCarburant = new JLabel();
        dateCarburant.setText("Date");
        panel1.add(dateCarburant, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        quantiteCarburant = new JLabel();
        quantiteCarburant.setText("Quantite en L");
        panel1.add(quantiteCarburant, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        vehiculeCarburant = new JLabel();
        vehiculeCarburant.setText("Vehicule numero");
        panel1.add(vehiculeCarburant, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 5, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        libelleCarburantInput = new JTextField();
        panel1.add(libelleCarburantInput, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 5, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        puCarburantInput = new JTextField();
        panel1.add(puCarburantInput, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        dateCarburantInput = new JTextField();
        panel1.add(dateCarburantInput, new com.intellij.uiDesigner.core.GridConstraints(2, 3, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        quantiteCarburantInput = new JTextField();
        quantiteCarburantInput.setText("");
        panel1.add(quantiteCarburantInput, new com.intellij.uiDesigner.core.GridConstraints(3, 4, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        vehiculeCarburantInput = new JTextField();
        panel1.add(vehiculeCarburantInput, new com.intellij.uiDesigner.core.GridConstraints(4, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        saveCarburantButton = new JButton();
        saveCarburantButton.setText("Enregistrer");
        panel1.add(saveCarburantButton, new com.intellij.uiDesigner.core.GridConstraints(5, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
