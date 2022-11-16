package Forms;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import HelperClasses.AllCars;
import HelperClasses.Car;

public class CarManagement extends javax.swing.JFrame {

    public CarManagement() {
        initComponents();
        addDataToTable();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        makeLabel = new javax.swing.JLabel();
        modelLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        carMakeTextInput = new javax.swing.JTextField();
        carModelTextInput = new javax.swing.JTextField();
        carYearTextInput = new javax.swing.JTextField();
        regNumLabel = new javax.swing.JLabel();
        carIdTextInput = new javax.swing.JTextField();
        modelLabel1 = new javax.swing.JLabel();
        yearLabel1 = new javax.swing.JLabel();
        rentalPriceTextInput = new javax.swing.JTextField();
        carIsAvailable = new javax.swing.JComboBox<>();
        addCarBtn = new javax.swing.JToggleButton();
        editCarBtn = new javax.swing.JToggleButton();
        deleteCarBtn = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        carTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerPanel.setBackground(new java.awt.Color(8, 65, 118));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Car Registration");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        makeLabel.setText("Make");

        modelLabel.setText("Model");

        yearLabel.setText("Year");

        carMakeTextInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carMakeTextActionPerformed(evt);
            }
        });

        carYearTextInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carYearTextActionPerformed(evt);
            }
        });

        regNumLabel.setText("Registration");

        modelLabel1.setText("Status");

        yearLabel1.setText("Price");

        carIsAvailable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "true", "false" }));

        addCarBtn.setText("Add Car");
        addCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCarBtnActionPerformed(evt);
            }
        });

        editCarBtn.setText("Edit Car");
        editCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCarBtnActionPerformed(evt);
            }
        });

        deleteCarBtn.setText("Delete Car");

        carTable.setForeground(new java.awt.Color(0, 0, 0));
        carTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
            },
            new String [] {
                "Reg Num", "Make", "Model", "Status", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(carTable);

        jPanel2.setBackground(new java.awt.Color(9, 64, 116));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(addCarBtn)
                        .addGap(40, 40, 40)
                        .addComponent(editCarBtn)
                        .addGap(38, 38, 38)
                        .addComponent(deleteCarBtn)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(regNumLabel)
                                                                        .addComponent(carIdTextInput,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                79,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(makeLabel)
                                                                        .addComponent(carMakeTextInput,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                84,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modelLabel)
                                                                        .addComponent(carModelTextInput,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                85,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yearLabel)
                                                                        .addComponent(carYearTextInput,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                84,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modelLabel1)
                                                                        .addComponent(carIsAvailable,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(rentalPriceTextInput,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                79,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yearLabel1))))
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(rentalPriceTextInput,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(carIsAvailable,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(modelLabel1)
                                                .addComponent(yearLabel1))
                                            .addGap(28, 28, 28)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(yearLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(carYearTextInput,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(modelLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(carModelTextInput,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(makeLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(carMakeTextInput,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(regNumLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(carIdTextInput,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addCarBtn)
                            .addComponent(deleteCarBtn)
                            .addComponent(editCarBtn))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carMakeTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_carMakeTextActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_carMakeTextActionPerformed

    private void carYearTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_carYearTextActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_carYearTextActionPerformed

    private void editCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editCarBtnActionPerformed

    AllCars cars = new AllCars();

    private void addDataToTable() {
        DefaultTableModel carTableModel = (DefaultTableModel) carTable.getModel();

        ArrayList<Car> allCars = cars.getAllCars();
        int carArrSize = allCars.size();
        carTableModel.getDataVector().removeAllElements();
        for (int i = 0; i < carArrSize; i++) {
            Car currCar = allCars.get(i);
            String tableData[] = { currCar.getId(), currCar.getMake(), currCar.getModel(),
                    currCar.isAvailable() == true ? "Available" : "Booked", String.valueOf(currCar.getPrice()) };
            carTableModel.addRow(tableData);
        }

    }

    private void addCarBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String CarId = carIdTextInput.getText();
        String Make = carMakeTextInput.getText();
        String Model = carModelTextInput.getText();
        String Year = carYearTextInput.getText();
        String isAvailable = carIsAvailable.getSelectedItem().toString();
        String price = rentalPriceTextInput.getText();
        if (CarId.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid car registration number");
        } else if (Make.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid car Make");
        } else if (Model.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid car Model");
        } else if (Year.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid car Year");
        } else {
            Car newCar = new Car(CarId, Make, Model, Year, isAvailable == "true", Integer.parseInt(price));
            cars.addCar(newCar);
            addDataToTable();
            JOptionPane.showMessageDialog(null, "new car created");
        }
    }// GEN-LAST:event_addCarBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CarManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton addCarBtn;
    private javax.swing.JTextField carIdTextInput;
    private javax.swing.JComboBox<String> carIsAvailable;
    private javax.swing.JTextField carMakeTextInput;
    private javax.swing.JTextField carModelTextInput;
    private javax.swing.JTable carTable;
    private javax.swing.JTextField carYearTextInput;
    private javax.swing.JToggleButton deleteCarBtn;
    private javax.swing.JToggleButton editCarBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel makeLabel;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JLabel modelLabel1;
    private javax.swing.JLabel regNumLabel;
    private javax.swing.JTextField rentalPriceTextInput;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JLabel yearLabel1;
    // End of variables declaration//GEN-END:variables
}
