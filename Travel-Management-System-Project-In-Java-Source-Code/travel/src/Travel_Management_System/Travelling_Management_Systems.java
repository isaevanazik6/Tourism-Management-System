package Travel_Management_System;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javafx.scene.paint.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Travelling_Management_Systems extends javax.swing.JFrame {
    
    
    public Travelling_Management_Systems() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxtTelephone = new javax.swing.JTextField();
        jtxtFirstname = new javax.swing.JTextField();
        jtxtSurname = new javax.swing.JTextField();
        jtxtAddress = new javax.swing.JTextField();
        jtxtPostCode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jRbAdultYes = new javax.swing.JRadioButton();
        jRbChildYes = new javax.swing.JRadioButton();
        jRbSingle = new javax.swing.JRadioButton();
        jRbReturn = new javax.swing.JRadioButton();
        jRbStd = new javax.swing.JRadioButton();
        jRbEco = new javax.swing.JRadioButton();
        jRbFirst = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jlblSubTotal = new javax.swing.JLabel();
        jlblTax = new javax.swing.JLabel();
        jlblTotal = new javax.swing.JLabel();
        jbtnTotal = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtReceipt = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jbtnReceipt = new javax.swing.JButton();
        jbtnExit1 = new javax.swing.JButton();
        jDeparture = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jAccommodation = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jDestination = new javax.swing.JComboBox();
        jRbLuggage = new javax.swing.JRadioButton();
        jRbInsurance = new javax.swing.JRadioButton();
        jRbAirportTax = new javax.swing.JRadioButton();
        jRbMiles = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));
        jPanel1.setBackground(java.awt.Color.BLUE);

        jLabel8.setIcon(new javax.swing.ImageIcon("")); // NOI18N
        jPanel1.add(jLabel8);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 86)); // NOI18N
        jLabel1.setText("Travel Management System");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1340, 130));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.setBackground(java.awt.Color.GREEN);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Telephone");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Firstname");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Surname");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Address");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Post Code");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jtxtTelephone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTelephoneActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 200, -1));

        jtxtFirstname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jtxtFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 200, -1));

        jtxtSurname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jtxtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 200, -1));

        jtxtAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jtxtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 200, -1));

        jtxtPostCode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jtxtPostCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 200, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Email");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jtxtEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jtxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 200, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 400, 260));

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.setBackground(java.awt.Color.yellow);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Flight");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("Ticket ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Child ");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Adult");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jRbAdultYes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRbAdultYes.setText("Yes");
        jPanel3.add(jRbAdultYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jRbChildYes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRbChildYes.setText("Yes");
        jPanel3.add(jRbChildYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        jRbSingle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRbSingle.setText("Single");
        jPanel3.add(jRbSingle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jRbReturn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRbReturn.setText("Return");
        jRbReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbReturnActionPerformed(evt);
            }
        });
        jPanel3.add(jRbReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jRbStd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRbStd.setText("Standard");
        jPanel3.add(jRbStd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jRbEco.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRbEco.setText("Economy");
        jPanel3.add(jRbEco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jRbFirst.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRbFirst.setText("First Class");
        jPanel3.add(jRbFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 510, 220));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.setBackground(java.awt.Color.red);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Sub Total");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Tax");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Total");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 117, -1, -1));

        jlblSubTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblSubTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4.add(jlblSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 290, 34));

        jlblTax.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblTax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4.add(jlblTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 290, 34));

        jlblTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4.add(jlblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 290, 34));

        jbtnTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnTotal.setText("Total");
        jbtnTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnTotalMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbtnTotalMouseReleased(evt);
            }
        });
        jbtnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTotalActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 200, -1));

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 200, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 460, 220));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Receipt", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtReceipt.setColumns(20);
        jtxtReceipt.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jtxtReceipt.setRows(5);
        jScrollPane1.setViewportView(jtxtReceipt);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 340, 410));

        jLabel9.setIcon(new javax.swing.ImageIcon("")); // NOI18N
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        jbtnReceipt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnReceipt.setText("Receipt");
        jbtnReceipt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnReceiptMouseClicked(evt);
            }
        });
        jbtnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReceiptActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 120, -1));

        jbtnExit1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnExit1.setText("Exit");
        jbtnExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnExit1MouseClicked(evt);
            }
        });
        jbtnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExit1ActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 120, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 140, 360, 500));

        jDeparture.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jDeparture.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Heathrow", "Gatwick ", "Stansted", "Southend" }));
        getContentPane().add(jDeparture, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 150, 380, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Departure Point");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Destination");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jAccommodation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jAccommodation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Single", "Double", "Extra", " " }));
        getContentPane().add(jAccommodation, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 380, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Accommodation ");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        jDestination.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jDestination.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Canada -  7 Days in Toronto", "Canada -  7 Days in Ottawa", "Norway - 7 Days in Oslo", "Nigeria - 5 Days in Lagos Eko Atlantic ", "India - 5 Days in New Delhi", "Italy - 5 Days in Rome", "USA - 5 Days in Dallas Fort Worth", "USA - 5 Days in Alaska", "UK - 5 Days in London", "UK - 5 Days in Wales", "France - 7 Days in Paris", "Kenya - 5 Days in Nairobi", "Ghana - 5 Days in Accra", "South Africa - 4 Days in Cape Town", "Brazil - 4 Days in Sao Paulo", "Jamaican - 4 Days in Kingston", "Phillppines - 4 Days in Manila", "Ireland - 4 Days in Dublin" }));
        getContentPane().add(jDestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 380, -1));

        jRbLuggage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRbLuggage.setText("Ext Luggage");
        getContentPane().add(jRbLuggage, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, -1, -1));

        jRbInsurance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRbInsurance.setText("Travelling Insurance Paid");
        getContentPane().add(jRbInsurance, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        jRbAirportTax.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRbAirportTax.setText("Airport Tax Paid");
        getContentPane().add(jRbAirportTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        jRbMiles.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRbMiles.setText("Air Miles Over 20000");
        getContentPane().add(jRbMiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }

    private void jRbReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbReturnActionPerformed
        
    }

    private void jbtnTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnTotalMouseClicked
        
double Nigeria = 450;
double Canada_T = 320;
double Canada_O = 350;
double India = 820;
double SAfrica= 760;
double Kenya= 730;
double Ghana = 480;
double Norway = 130;
double Italy = 170;
double USA_D = 330;
double USA_A = 760;
double UK_L= 55;
double UK_W= 170;
double France = 120;
double Brazil = 560;
double Jamaica = 480;
double Phillppines = 890;
double Ireland = 155;

double Acc_Single = 45;
double Acc_Double = 45;
double Acc_Extra = 45;

double Std_Flight = 2.5;
double Eco_Flight = 65.5;
double Firstclass_Flight = 122.5;

double Airport_Tax = 6.7;
double Air_Miles = 85.9;
double Insurance = 62.4;
double Ext_Luggage = 25.9;

double[] TravelCost = new double[20];
double iTax = 4.5;


if ((jDestination.getSelectedItem().equals("Canada -  7 Days in Toronto"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected()))
{   
    TravelCost[0] = Canada_T + Acc_Single + Std_Flight ;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

if ((jDestination.getSelectedItem().equals("Canada -  7 Days in Toronto"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected())&& jRbAirportTax.isSelected())
{   
    TravelCost[0] = Canada_T + Acc_Single + Std_Flight + Airport_Tax ;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

if ((jDestination.getSelectedItem().equals("Canada -  7 Days in Toronto"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected())&& 
        jRbAirportTax.isSelected()&& jRbMiles.isSelected())
{   
    TravelCost[0] = Canada_T + Acc_Single + Std_Flight + Airport_Tax + Air_Miles;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

 if ((jDestination.getSelectedItem().equals("Canada -  7 Days in Toronto"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected())&& 
        jRbAirportTax.isSelected()&& jRbMiles.isSelected() &&jRbInsurance.isSelected())
{   
    TravelCost[0] = Canada_T + Acc_Single + Std_Flight + Airport_Tax + Air_Miles + Insurance ;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

if ((jDestination.getSelectedItem().equals("Canada -  7 Days in Toronto"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected())&& 
        jRbAirportTax.isSelected()&& jRbMiles.isSelected() &&jRbInsurance.isSelected() && jRbLuggage.isSelected())
{   
    TravelCost[0] = Canada_T + Acc_Single + Std_Flight + Airport_Tax + Air_Miles + Insurance + Ext_Luggage;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

//=======================================================================================================
if ((jDestination.getSelectedItem().equals("Canada -  7 Days in Ottawa"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected()))
{   
    TravelCost[0] = Canada_O + Acc_Single + Std_Flight ;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

if ((jDestination.getSelectedItem().equals("Canada -  7 Days in Ottawa"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected())&& jRbAirportTax.isSelected())
{   
    TravelCost[0] = Canada_O + Acc_Single + Std_Flight + Airport_Tax ;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

if ((jDestination.getSelectedItem().equals("Canada -  7 Days in Ottawa"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected())&& 
        jRbAirportTax.isSelected()&& jRbMiles.isSelected())
{   
    TravelCost[0] = Canada_O + Acc_Single + Std_Flight + Airport_Tax + Air_Miles;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

 if ((jDestination.getSelectedItem().equals("Canada -  7 Days in Ottawa"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected())&& 
        jRbAirportTax.isSelected()&& jRbMiles.isSelected() &&jRbInsurance.isSelected())
{   
    TravelCost[0] = Canada_O + Acc_Single + Std_Flight + Airport_Tax + Air_Miles + Insurance ;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

if ((jDestination.getSelectedItem().equals("Canada -  7 Days in Ottawa"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected())&& 
        jRbAirportTax.isSelected()&& jRbMiles.isSelected() &&jRbInsurance.isSelected() && jRbLuggage.isSelected())
{   
    TravelCost[0] = Canada_O + Acc_Single + Std_Flight + Airport_Tax + Air_Miles + Insurance + Ext_Luggage;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}
//==========================================================================================================
if ((jDestination.getSelectedItem().equals("Norway - 7 Days in Oslo"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected()))
{   
    TravelCost[0] = Norway + Acc_Single + Std_Flight ;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

if ((jDestination.getSelectedItem().equals("Norway - 7 Days in Oslo"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected())&& jRbAirportTax.isSelected())
{   
    TravelCost[0] = Norway + Acc_Single + Std_Flight + Airport_Tax ;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

if ((jDestination.getSelectedItem().equals("Norway - 7 Days in Oslo"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected())&& 
        jRbAirportTax.isSelected()&& jRbMiles.isSelected())
{   
    TravelCost[0] = Norway + Acc_Single + Std_Flight + Airport_Tax + Air_Miles;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

 if ((jDestination.getSelectedItem().equals("Norway - 7 Days in Oslo"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected())&& 
        jRbAirportTax.isSelected()&& jRbMiles.isSelected() &&jRbInsurance.isSelected())
{   
    TravelCost[0] = Norway + Acc_Single + Std_Flight + Airport_Tax + Air_Miles + Insurance ;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

if ((jDestination.getSelectedItem().equals("Norway - 7 Days in Oslo"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected())&& 
        jRbAirportTax.isSelected()&& jRbMiles.isSelected() &&jRbInsurance.isSelected() && jRbLuggage.isSelected())
{   
    TravelCost[0] = Norway + Acc_Single + Std_Flight + Airport_Tax + Air_Miles + Insurance + Ext_Luggage;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}
//==========================================================================================================
if ((jDestination.getSelectedItem().equals("Nigeria - 5 Days in Lagos Eko Atlantic"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected()))
{   
    TravelCost[0] = Nigeria + Acc_Single + Std_Flight ;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

if ((jDestination.getSelectedItem().equals("Nigeria - 5 Days in Lagos Eko Atlantic"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected())&& jRbAirportTax.isSelected())
{   
    TravelCost[0] = Nigeria + Acc_Single + Std_Flight + Airport_Tax ;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

if ((jDestination.getSelectedItem().equals("Nigeria - 5 Days in Lagos Eko Atlantic"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected())&& 
        jRbAirportTax.isSelected()&& jRbMiles.isSelected())
{   
    TravelCost[0] = Nigeria + Acc_Single + Std_Flight + Airport_Tax + Air_Miles;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

 if ((jDestination.getSelectedItem().equals("Nigeria - 5 Days in Lagos Eko Atlantic"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected())&& 
        jRbAirportTax.isSelected()&& jRbMiles.isSelected() &&jRbInsurance.isSelected())
{   
    TravelCost[0] = Nigeria + Acc_Single + Std_Flight + Airport_Tax + Air_Miles + Insurance ;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

if ((jDestination.getSelectedItem().equals("Nigeria - 5 Days in Lagos Eko Atlantic"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected())&& 
        jRbAirportTax.isSelected()&& jRbMiles.isSelected() &&jRbInsurance.isSelected() && jRbLuggage.isSelected())
{   
    TravelCost[0] = Nigeria + Acc_Single + Std_Flight + Airport_Tax + Air_Miles + Insurance + Ext_Luggage;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}
//==========================================================================================================
if ((jDestination.getSelectedItem().equals("India - 5 Days in New Delhi"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected()))
{   
    TravelCost[0] = India + Acc_Single + Std_Flight ;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

if ((jDestination.getSelectedItem().equals("India - 5 Days in New Delhi"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected())&& jRbAirportTax.isSelected())
{   
    TravelCost[0] = India + Acc_Single + Std_Flight + Airport_Tax ;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

if ((jDestination.getSelectedItem().equals("India - 5 Days in New Delhi"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected())&& 
        jRbAirportTax.isSelected()&& jRbMiles.isSelected())
{   
    TravelCost[0] = India + Acc_Single + Std_Flight + Airport_Tax + Air_Miles;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

 if ((jDestination.getSelectedItem().equals("India - 5 Days in New Delhi"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected())&& 
        jRbAirportTax.isSelected()&& jRbMiles.isSelected() &&jRbInsurance.isSelected())
{   
    TravelCost[0] = India + Acc_Single + Std_Flight + Airport_Tax + Air_Miles + Insurance ;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}

if ((jDestination.getSelectedItem().equals("India - 5 Days in New Delhi"))&& 
        jAccommodation.getSelectedItem().equals("Single")&&(jRbStd.isSelected())&& 
        jRbAirportTax.isSelected()&& jRbMiles.isSelected() &&jRbInsurance.isSelected() && jRbLuggage.isSelected())
{   
    TravelCost[0] = India + Acc_Single + Std_Flight + Airport_Tax + Air_Miles + Insurance + Ext_Luggage;
    TravelCost[1]= ((TravelCost[0] * iTax)/100);
    String Tax =  String.format("$%.2f", TravelCost[1]);
    jlblTax.setText((Tax));
    String subTotal =  String.format("$%.2f", TravelCost[0]);
    jlblSubTotal.setText(subTotal);
    String Total =String.format("$%.2f", TravelCost[0] + TravelCost[1]);
    jlblTotal.setText(Total);      
}
//==========================================================================================================

    }//GEN-LAST:event_jbtnTotalMouseClicked

    private void jbtnTotalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnTotalMouseReleased
        
    }//GEN-LAST:event_jbtnTotalMouseReleased

    private void jbtnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTotalActionPerformed
     

    }//GEN-LAST:event_jbtnTotalActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jlblTax.setText(null);
        jlblSubTotal.setText(null);
        jlblTotal.setText(null);
        jtxtFirstname.setText(null);
        jtxtPostCode.setText(null);
        jtxtSurname.setText(null);
        jtxtAddress.setText(null);
        jtxtTelephone.setText(null);
        jtxtEmail.setText(null);
        jtxtReceipt.setText(null);
        jDeparture.setSelectedItem("None");
        jAccommodation.setSelectedItem("None");
        jDestination.setSelectedItem("None");
        jRbStd.setSelected(false);
        jRbEco.setSelected(false);
        jRbFirst.setSelected(false);
        jRbSingle.setSelected(false);
        jRbReturn.setSelected(false);
        jRbAdultYes.setSelected(false);
        jRbChildYes.setSelected(false);
        jRbAirportTax.setSelected(false);
        jRbInsurance.setSelected(false);
        jRbMiles.setSelected(false);
        jRbLuggage.setSelected(false);
        
        
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnReceiptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnReceiptMouseClicked
        
    }//GEN-LAST:event_jbtnReceiptMouseClicked

    private void jbtnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReceiptActionPerformed
        
        Calendar timer = Calendar.getInstance(); 
        timer.getTime(); 
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss"); 
        String iTime= (tTime.format(timer.getTime()));
        
        SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
        String iDate = (Tdate.format(timer.getTime()));
        
              
                int num1;    
                String ref ="";        
                num1 = 1325 + (int) (Math.random()*4238);
                ref += num1 + 1325;
               
        
        //==========================================================================
        String Firstname = (jtxtFirstname.getText());
        String Surname = (jtxtSurname.getText());
        String address = (jtxtAddress.getText());
        String postcode =(jtxtPostCode.getText());
        String telephone = (jtxtTelephone.getText());
        String Email = (jtxtEmail.getText());
        String rTax = (jlblTax.getText());
        String rSubTotal = (jlblSubTotal.getText());
        String rTotal = (jlblTotal.getText());
        
        
        
        jtxtReceipt.append("\tTravel Management System:\n\n"
            +"Ref:\t\t\t" + ref
            +"\n---------------------------------------" 
            +"\nName:\t\t\t" + Firstname
            +"\nSurname:\t\t" + Surname
            +"\nAddress:\t\t"+ address 
            +"\nPostcode:\t\t"+ postcode 
            +"\nTelephone:\t\t"+ telephone
            +"\nCost of Car:\t\t"+ Email
            +"\nTax:\t\t\t"+ rTax   
            + "\nSub Total:\t\t"+ rSubTotal 
            +"\nTotal:\t\t\t"+ rTotal  
            +"\n---------------------------------------" 
            +"\nDate:"+  iDate + " \tTime:" + iTime
            +"\n\n\tThanks for Using \n\tTravel Management System" 
        );
    }//GEN-LAST:event_jbtnReceiptActionPerformed

    private void jbtnExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnExit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnExit1MouseClicked
private JFrame frame;
    private void jbtnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExit1ActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Travel Management System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExit1ActionPerformed

    private void jtxtTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTelephoneActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Travelling_Management_Systems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Travelling_Management_Systems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Travelling_Management_Systems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Travelling_Management_Systems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Travelling_Management_Systems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jAccommodation;
    private javax.swing.JComboBox jDeparture;
    private javax.swing.JComboBox jDestination;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRbAdultYes;
    private javax.swing.JRadioButton jRbAirportTax;
    private javax.swing.JRadioButton jRbChildYes;
    private javax.swing.JRadioButton jRbEco;
    private javax.swing.JRadioButton jRbFirst;
    private javax.swing.JRadioButton jRbInsurance;
    private javax.swing.JRadioButton jRbLuggage;
    private javax.swing.JRadioButton jRbMiles;
    private javax.swing.JRadioButton jRbReturn;
    private javax.swing.JRadioButton jRbSingle;
    private javax.swing.JRadioButton jRbStd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnExit1;
    private javax.swing.JButton jbtnReceipt;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnTotal;
    private javax.swing.JLabel jlblSubTotal;
    private javax.swing.JLabel jlblTax;
    private javax.swing.JLabel jlblTotal;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtFirstname;
    private javax.swing.JTextField jtxtPostCode;
    private javax.swing.JTextArea jtxtReceipt;
    private javax.swing.JTextField jtxtSurname;
    private javax.swing.JTextField jtxtTelephone;
    // End of variables declaration//GEN-END:variables
    
}
