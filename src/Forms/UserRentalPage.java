/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


import HelperClasses.AllCars;
import HelperClasses.AllRentals;
import HelperClasses.Car;
import HelperClasses.Customer;
import HelperClasses.Rental;

/**
 *
 * @author jumpe
 */
public class UserRentalPage extends CommonFunctionality {

    private String userId;
    /**
     * Creates new form UserRentalPage
     */
    public UserRentalPage(Customer aLoggedInCustomer) {
        initComponents();
        addCarDataToTable();
        setCarIdCombo();
        loggedInCustomer = aLoggedInCustomer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        FormTitle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        carIdComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bookedCarBtn = new javax.swing.JButton();
        MainMenu = new javax.swing.JButton();
        rentalStartDate = new com.toedter.calendar.JDateChooser();
        rentalEndDate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        carsTable = new javax.swing.JTable();
        AvailableCarsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(8, 65, 118));

        FormTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        FormTitle.setText("Rent a Car");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Car Id");

        carIdComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Start Date");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("End Date");

        totalLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalLabel.setText("Total:");

        totalPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalPrice.setForeground(new java.awt.Color(255, 255, 255));
        totalPrice.setText("RM 200");

        bookedCarBtn.setText("Book Car");
        bookedCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookedCarBtnActionPerformed(evt);
            }
        });

        MainMenu.setBackground(new java.awt.Color(8, 65, 118));
        MainMenu.setForeground(new java.awt.Color(255, 255, 255));
        MainMenu.setText("Main Menu");
        MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuBtnActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(FormTitle)
                .addGap(107, 107, 107))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(MainMenu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 276,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(totalLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalPrice))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bookedCarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                        .addComponent(rentalEndDate,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                145, Short.MAX_VALUE)
                                                                        .addComponent(rentalStartDate,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(carIdComboBox, 0,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))))))
                                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(MainMenu)
                                )
                .addGap(18, 18, 18)
                .addComponent(FormTitle)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(carIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                                        .addComponent(rentalStartDate, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                                        .addComponent(rentalEndDate, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPrice)
                    .addComponent(totalLabel))
                .addGap(29, 29, 29)
                .addComponent(bookedCarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(90, Short.MAX_VALUE))
        );

        Date currDate = new Date();
        rentalStartDate.setDate(currDate);
        rentalEndDate.setDate(currDate);
        carsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Id", "Make", "Model", "Year", "Price (per day)"
            }
        ));
        jScrollPane1.setViewportView(carsTable);

        AvailableCarsLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AvailableCarsLabel.setForeground(new java.awt.Color(8, 65, 118));
        AvailableCarsLabel.setText("Available Cars");
        carsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carsTableMouseClicked(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(AvailableCarsLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        100, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                                .addComponent(AvailableCarsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();

    }// </editor-fold>//GEN-END:initComponents

    public UserRentalPage(String aUserId) {
        userId = aUserId;
    }

    AllCars cars = new AllCars();
    AllRentals rentals = new AllRentals();

    private void bookedCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookedCarBtnActionPerformed
        if (cars.getAvailableCars().size() < 1) {
            JOptionPane.showMessageDialog(null, "There are no cars currently available for rental");
            return;
        }
        long RentalStartDate = rentalStartDate.getDate().getTime();
        long RentalEndDate = rentalEndDate.getDate().getTime();
        long diff = RentalEndDate - RentalStartDate;
        long days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        if (diff == 0) {
            JOptionPane.showMessageDialog(null, "Your rental has to at minimum be a day long");
        } else if (diff < 0) {
            JOptionPane.showMessageDialog(null, "Your end date cannot be before your start date");
        } else {
            String carIdSelected = carIdComboBox.getSelectedItem().toString();
            String rentalId = UUID.randomUUID().toString();
            Date currentDate = new Date();
            Rental newRental = new Rental(rentalId, carIdSelected, loggedInCustomer.getId(), rentalStartDate.getDate(),
                    rentalEndDate.getDate(), currentDate);
            rentals.addRental(newRental);
            cars.setCarAsRented(carIdSelected);
            totalPrice.setText("RM " + newRental.getTotalCost());
            JOptionPane.showMessageDialog(null, "Booking successful");
            backToMainMenu();
        }
    }//GEN-LAST:event_bookedCarBtnActionPerformed

    private void mainMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logOutBtnActionPerformed
        backToMainMenu();
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void carsTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_carsTableMouseClicked
        int row = carsTable.getSelectedRow();
        String carId = carsTable.getValueAt(row, 0).toString();
        carIdComboBox.setSelectedItem(carId);
    }// GEN-LAST:event_carsTableMouseClicked

    private void addCarDataToTable() {
        DefaultTableModel carTableModel = (DefaultTableModel) carsTable.getModel();

        ArrayList<Car> allCars = cars.getAllCars();
        int carArrSize = allCars.size();
        carTableModel.getDataVector().removeAllElements();
        for (int i = 0; i < carArrSize; i++) {
            Car currCar = allCars.get(i);
            if (currCar.isAvailable()) {
                String tableData[] = { currCar.getId(), currCar.getMake(), currCar.getModel(), currCar.getYear(),
                        String.valueOf(currCar.getPrice()) };
                carTableModel.addRow(tableData);
            }
        }
    }

    private void setCarIdCombo() {
        ArrayList<Car> availableCars = cars.getAvailableCars();
        int arrSize = availableCars.size();
        String carIds[] = new String[arrSize];
        for (int i = 0; i < arrSize; i++) {
            carIds[i] = availableCars.get(i).getId();
        }
        carIdComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(carIds));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvailableCarsLabel;
    private javax.swing.JLabel FormTitle;
    private javax.swing.JButton bookedCarBtn;
    private javax.swing.JComboBox<String> carIdComboBox;
    private javax.swing.JTable carsTable;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton MainMenu;
    private com.toedter.calendar.JDateChooser rentalEndDate;
    private com.toedter.calendar.JDateChooser rentalStartDate;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel totalPrice;
    // End of variables declaration//GEN-END:variables
}
