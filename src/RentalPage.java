
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import HelperClasses.AllCars;
import HelperClasses.AllRentals;
import HelperClasses.Car;
import HelperClasses.Rental;

public class RentalPage extends javax.swing.JFrame {

        public RentalPage() {
                initComponents();
                addCarDataToTable();
                addRentalDataToTable();
        }


        @SuppressWarnings("unchecked")
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                jMenuItem1 = new javax.swing.JMenuItem();
                jMenu1 = new javax.swing.JMenu();
                jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
                buttonGroup1 = new javax.swing.ButtonGroup();
                jScrollPane2 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                backgroundPanel = new javax.swing.JPanel();
                sidebarPanel = new javax.swing.JPanel();
                btnLogout = new javax.swing.JButton();
                headerPanel = new javax.swing.JPanel();
                carRentalTitle = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                labelCustomerID = new javax.swing.JLabel();
                labelRentDate = new javax.swing.JLabel();
                labelReturnDate = new javax.swing.JLabel();
                rentDateEndTextInput = new javax.swing.JTextField();
                rentDateTextInput = new javax.swing.JTextField();
                customerIdTextInput = new javax.swing.JTextField();
                jPanel3 = new javax.swing.JPanel();
                btnSave = new javax.swing.JButton();
                btnEdit = new javax.swing.JButton();
                btnReset = new javax.swing.JButton();
                jPanel4 = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                tableCarList = new javax.swing.JTable();
                jLabel2 = new javax.swing.JLabel();
                jPanel5 = new javax.swing.JPanel();
                labelCarsOnRent = new javax.swing.JLabel();
                jScrollPane3 = new javax.swing.JScrollPane();
                tableCarsOnRent = new javax.swing.JTable();
                textFieldRentalID = new javax.swing.JTextField();
                labelRentalID = new javax.swing.JLabel();
                labelRentalID1 = new javax.swing.JLabel();
                carIdTextInput = new javax.swing.JTextField();

                jLabel1.setText("jLabel1");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 100, Short.MAX_VALUE));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 100, Short.MAX_VALUE));

                jMenuItem1.setText("jMenuItem1");

                jMenu1.setText("jMenu1");

                jRadioButtonMenuItem1.setSelected(true);
                jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                },
                                new String[] {
                                                "Title 1", "Title 2", "Title 3", "Title 4"
                                }));
                jScrollPane2.setViewportView(jTable1);

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setMinimumSize(new java.awt.Dimension(900, 700));
                setName("rentalPage"); // NOI18N

                backgroundPanel.setBackground(new java.awt.Color(200, 200, 200));
                backgroundPanel.setPreferredSize(new java.awt.Dimension(850, 528));

                sidebarPanel.setBackground(new java.awt.Color(173, 12, 3));

                btnLogout.setText("Log Out");

                javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
                sidebarPanel.setLayout(sidebarPanelLayout);
                sidebarPanelLayout.setHorizontalGroup(
                                sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(sidebarPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(btnLogout,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                170, Short.MAX_VALUE)
                                                                .addContainerGap()));
                sidebarPanelLayout.setVerticalGroup(
                                sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarPanelLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(btnLogout)
                                                                .addGap(22, 22, 22)));

                headerPanel.setBackground(new java.awt.Color(200, 200, 200));

                carRentalTitle.setBackground(new java.awt.Color(255, 250, 250));
                carRentalTitle.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
                carRentalTitle.setForeground(new java.awt.Color(173, 12, 3));
                carRentalTitle.setText("Car Rental");

                javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
                headerPanel.setLayout(headerPanelLayout);
                headerPanelLayout.setHorizontalGroup(
                                headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(headerPanelLayout.createSequentialGroup()
                                                                .addGap(258, 258, 258)
                                                                .addComponent(carRentalTitle)
                                                                .addContainerGap(330, Short.MAX_VALUE)));
                headerPanelLayout.setVerticalGroup(
                                headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(headerPanelLayout.createSequentialGroup()
                                                                .addGap(24, 24, 24)
                                                                .addComponent(carRentalTitle)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                jPanel2.setBackground(new java.awt.Color(200, 200, 200));

                labelCustomerID.setBackground(new java.awt.Color(255, 250, 250));
                labelCustomerID.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
                labelCustomerID.setForeground(new java.awt.Color(173, 12, 3));
                labelCustomerID.setText("Customer ID");

                labelRentDate.setBackground(new java.awt.Color(255, 250, 250));
                labelRentDate.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
                labelRentDate.setForeground(new java.awt.Color(173, 12, 3));
                labelRentDate.setText("Rent Start Date");

                labelReturnDate.setBackground(new java.awt.Color(255, 250, 250));
                labelReturnDate.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
                labelReturnDate.setForeground(new java.awt.Color(173, 12, 3));
                labelReturnDate.setText("Return date end");

                rentDateTextInput.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                        }
                });

                customerIdTextInput.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                        }
                });

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(labelCustomerID)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(6, 6, 6)
                                                                                                .addComponent(customerIdTextInput,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                105,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(35, 35, 35)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(labelRentDate,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(rentDateTextInput,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                138,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(40, 40, 40)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(labelReturnDate,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(rentDateEndTextInput,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                141,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(51, 51, 51)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(labelReturnDate)
                                                                                                                .addComponent(labelRentDate))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(rentDateTextInput,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(rentDateEndTextInput,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(labelCustomerID)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(customerIdTextInput)))
                                                                .addContainerGap()));

                jPanel3.setBackground(new java.awt.Color(200, 200, 200));

                btnSave.setText("Save");
                btnSave.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSaveActionPerformed(evt);
                        }
                });

                btnEdit.setText("Edit");

                btnReset.setText("Reset");
                btnReset.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnResetActionPerformed(evt);
                        }
                });

                jPanel4.setBackground(new java.awt.Color(200, 200, 200));

                tableCarList.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
                tableCarList.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                },
                                new String[] {
                                                "Car ID", "Brand", "Model", "Status", "Price"
                                }) {
                        Class[] types = new Class[] {
                                        java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
                                        java.lang.String.class, java.lang.Integer.class
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types[columnIndex];
                        }
                });
                tableCarList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                tableCarList.setMaximumSize(new java.awt.Dimension(600, 72));
                tableCarList.getTableHeader().setResizingAllowed(false);
                tableCarList.getTableHeader().setReorderingAllowed(false);
                jScrollPane1.setViewportView(tableCarList);
                tableCarList.getAccessibleContext().setAccessibleName("tableCarList");

                jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(173, 12, 3));
                jLabel2.setText("Car List");

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                727,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap())
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGap(305, 305, 305)
                                                                .addComponent(jLabel2)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel4Layout.setVerticalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(16, Short.MAX_VALUE)
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                118,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(172, 172, 172)
                                                                .addComponent(btnSave,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                100,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnEdit,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                100,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnReset,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                100,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jPanel4,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(btnSave,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(jPanel3Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(btnEdit)
                                                                                                .addComponent(btnReset)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));

                jPanel5.setBackground(new java.awt.Color(200, 200, 200));

                labelCarsOnRent.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
                labelCarsOnRent.setForeground(new java.awt.Color(173, 12, 3));
                labelCarsOnRent.setText("Cars On Rent");

                tableCarsOnRent.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                },
                                new String[] {
                                                "Rent ID", "Car ID", "User ID", "Rent Date", "Return Date", "Rent Fee"
                                }) {
                        Class[] types = new Class[] {
                                        java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class,
                                        java.lang.String.class, java.lang.String.class, java.lang.Integer.class
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types[columnIndex];
                        }
                });
                jScrollPane3.setViewportView(tableCarsOnRent);
                tableCarsOnRent.getAccessibleContext().setAccessibleName("tableCarsOnRent");

                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(
                                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addGap(279, 279, 279)
                                                                .addComponent(labelCarsOnRent)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel5Layout.createSequentialGroup()
                                                                                .addContainerGap()
                                                                                .addComponent(jScrollPane3)
                                                                                .addContainerGap()));
                jPanel5Layout.setVerticalGroup(
                                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(labelCarsOnRent)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                138,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                labelRentalID.setBackground(new java.awt.Color(255, 250, 250));
                labelRentalID.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
                labelRentalID.setForeground(new java.awt.Color(173, 12, 3));
                labelRentalID.setText("Rental ID");

                labelRentalID1.setBackground(new java.awt.Color(255, 250, 250));
                labelRentalID1.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
                labelRentalID1.setForeground(new java.awt.Color(173, 12, 3));
                labelRentalID1.setText("Car ID");

                javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
                backgroundPanel.setLayout(backgroundPanelLayout);
                backgroundPanelLayout.setHorizontalGroup(
                                backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                                                .addComponent(sidebarPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(backgroundPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(backgroundPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                7,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(headerPanel,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(backgroundPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(backgroundPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(backgroundPanelLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(backgroundPanelLayout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                .addComponent(textFieldRentalID,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                85,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(labelRentalID))
                                                                                                                                .addGroup(backgroundPanelLayout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addGroup(backgroundPanelLayout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addGap(37, 37, 37)
                                                                                                                                                                .addComponent(carIdTextInput,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                85,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addGap(18, 18, 18))
                                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                backgroundPanelLayout
                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                                .addComponent(labelRentalID1)
                                                                                                                                                                                .addGap(33, 33, 33)))
                                                                                                                                .addComponent(jPanel2,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE))
                                                                                                                .addComponent(jPanel3,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jPanel5,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addContainerGap()))));
                backgroundPanelLayout.setVerticalGroup(
                                backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(headerPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(backgroundPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(backgroundPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(backgroundPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(labelRentalID)
                                                                                                                .addComponent(labelRentalID1))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(textFieldRentalID,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(backgroundPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(44, 44, 44)
                                                                                                .addComponent(carIdTextInput,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jPanel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(91, Short.MAX_VALUE))
                                                .addComponent(sidebarPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                957, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                688, Short.MAX_VALUE));

                pack();
        }// </editor-fold>//GEN-END:initComponents




        // action button responders
        // ======================================================================================================
        AllRentals allRentals = new AllRentals();

        private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSaveActionPerformed
                String rentalId = textFieldRentalID.getText();
                String customerId = customerIdTextInput.getText();
                String rentStartDate = rentDateTextInput.getText();
                String rentEndDate = rentDateEndTextInput.getText();
                String carId = carIdTextInput.getText();
                String currentDate = LocalDate.now().toString();
                Rental newRental = new Rental(rentalId, carId, customerId, rentStartDate, rentEndDate, currentDate);
                allRentals.addRental(newRental);
        }

        private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                textFieldRentalID.setText("");
                customerIdTextInput.setText("");
                rentDateTextInput.setText("");
                rentDateEndTextInput.setText("");
                carIdTextInput.setText("");
                addRentalDataToTable();
        }

        AllCars cars = new AllCars();

        private void addCarDataToTable() {
                DefaultTableModel carTableModel = (DefaultTableModel) tableCarList.getModel();

                ArrayList<Car> allCars = cars.getAllCars();
                int carArrSize = allCars.size();
                carTableModel.getDataVector().removeAllElements();
                for (int i = 0; i < carArrSize; i++) {
                        Car currCar = allCars.get(i);
                        if (currCar.isAvailable()) {
                                String tableData[] = { currCar.getId(), currCar.getMake(), currCar.getModel(),
                                                currCar.isAvailable() == true ? "Available" : "Booked",
                                                String.valueOf(currCar.getPrice()) };
                                carTableModel.addRow(tableData);
                        }
                }

        }

        AllRentals rentals = new AllRentals();

        private void addRentalDataToTable() {
                DefaultTableModel carsOnRentModel = (DefaultTableModel) tableCarsOnRent.getModel();

                ArrayList<Rental> allRentals = rentals.getAllRental();
                int carArrSize = allRentals.size();
                carsOnRentModel.getDataVector().removeAllElements();
                for (int i = 0; i < carArrSize; i++) {
                        Rental currRental = allRentals.get(i);
                        String tableData[] = { currRental.getRentalId(), currRental.getCarId(), currRental.getUserId(),
                                        currRental.getStartDate(), currRental.getEndDate()
                        };
                        carsOnRentModel.addRow(tableData);
                }

        }

        public static void main(String args[]) {
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(RentalPage.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(RentalPage.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(RentalPage.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(RentalPage.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new RentalPage().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel backgroundPanel;
        private javax.swing.JButton btnEdit;
        private javax.swing.JButton btnLogout;
        private javax.swing.JButton btnReset;
        private javax.swing.JButton btnSave;
        private javax.swing.ButtonGroup buttonGroup1;
        private javax.swing.JTextField carIdTextInput;
        private javax.swing.JLabel carRentalTitle;
        private javax.swing.JTextField customerIdTextInput;
        private javax.swing.JPanel headerPanel;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JMenu jMenu1;
        private javax.swing.JMenuItem jMenuItem1;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JTable jTable1;
        private javax.swing.JLabel labelCarsOnRent;
        private javax.swing.JLabel labelCustomerID;
        private javax.swing.JLabel labelRentDate;
        private javax.swing.JLabel labelRentalID;
        private javax.swing.JLabel labelRentalID1;
        private javax.swing.JLabel labelReturnDate;
        private javax.swing.JTextField rentDateEndTextInput;
        private javax.swing.JTextField rentDateTextInput;
        private javax.swing.JPanel sidebarPanel;
        private javax.swing.JTable tableCarList;
        private javax.swing.JTable tableCarsOnRent;
        private javax.swing.JTextField textFieldRentalID;
        // End of variables declaration//GEN-END:variables
}
