package com.myproject;

import Connectivity.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout; // Import GroupLayout for proper layout management

public class GymManagement extends javax.swing.JFrame {

  public GymManagement() {
    initComponents();
    setTitle("Gym Management System"); // Set the window title
    setSize(800, 600); // Set the window size (adjust as needed)
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the app exits when closed
    setLocationRelativeTo(null); // Center the window on the screen
    setVisible(true); // Ensure the window is visible
  }

  @SuppressWarnings("unchecked")
  private void initComponents() {
    jComboBox2 = new javax.swing.JComboBox<>();
    jCheckBox1 = new javax.swing.JCheckBox();
    jScrollPane1 = new javax.swing.JScrollPane();
    textarea = new javax.swing.JTextArea();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    name = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    list = new javax.swing.JComboBox<>();
    cardio = new javax.swing.JCheckBox();
    shredding = new javax.swing.JCheckBox();
    weightlifting = new javax.swing.JCheckBox();
    bulking = new javax.swing.JCheckBox();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    Rmobile = new javax.swing.JTextField();
    get = new javax.swing.JButton();
    duration = new javax.swing.JTextField();
    height = new javax.swing.JTextField();
    weight = new javax.swing.JTextField();
    gender = new javax.swing.JTextField();
    mobile = new javax.swing.JTextField();
    add = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    textarea.setColumns(20);
    textarea.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
    textarea.setRows(5);
    jScrollPane1.setViewportView(textarea);

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("G Y M    M A N A G E M E N T    S Y S T E M");

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel2.setText("NAME");

    name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel3.setText("ADD / UPDATE");

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel4.setText("GENDER");

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel5.setText("MOBILE NO.");

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel6.setText("HEIGHT (in feet)");

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel7.setText("PACKAGES");

    jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel8.setText("WEIGHT (in kg)");

    list.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    list.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADD A MEMBER", "UPDATE DETAILS" }));

    cardio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    cardio.setText("CARDIO");

    shredding.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    shredding.setText("SHREDDING");

    weightlifting.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    weightlifting.setText("WEIGHT LIFTING");

    bulking.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    bulking.setText("BULKING");

    jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel9.setText("DURATION");

    jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel10.setText("GET DETAILS OF THE MEMBER");

    jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel11.setText("ENTER MOBILE NO.");

    Rmobile.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

    get.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    get.setText("GET");
    get.addActionListener(evt -> getActionPerformed(evt));

    add.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    add.setText("ADD");
    add.addActionListener(evt -> addMemberActionPerformed(evt)); // Renamed method to avoid conflict

    // Layout management using GroupLayout
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name)
                            .addComponent(mobile)
                            .addComponent(gender)
                            .addComponent(weight)
                            .addComponent(height)
                            .addComponent(duration)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cardio)
                                    .addComponent(bulking))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(shredding)
                                    .addComponent(weightlifting))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Rmobile, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(get, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(400, 400, 400))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cardio)
                            .addComponent(shredding))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bulking)
                            .addComponent(weightlifting))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(Rmobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(get, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
    );

    pack();
  }

  // Fixed getActionPerformed method
  private void getActionPerformed(java.awt.event.ActionEvent evt) {
    Long mobileNum = Long.parseLong(Rmobile.getText());
    try {
      Connection con = DB.getCon();
      String query = "select * from member where mobile =" + mobileNum;
      Statement s = con.createStatement();
      ResultSet rs = s.executeQuery(query);

      ArrayList<String> a = new ArrayList<>();
      while (rs.next()) {
        String ss = rs.getString(7);
        String delimiter = " ";
        StringTokenizer tokenizer = new StringTokenizer(ss, delimiter);

        while (tokenizer.hasMoreTokens()) {
          a.add(tokenizer.nextToken());
        }
        textarea.setText(
            "******* GYM MANAGEMENT SYSTEM *******\n\n" +
            "****************************************\n" +
            "Name            ->  " + rs.getString(1) + "\n" +
            "Mobile          ->  " + rs.getLong(2) + "\n" +
            "Gender          ->  " + rs.getString(3) + "\n" +
            "Weight(in kgs)  ->  " + rs.getFloat(4) + "\n" +
            "Height(in feet) ->  " + rs.getFloat(5) + "\n" +
            "Duration        ->  " + rs.getString(6) + "\n" +
            "Packages        ->  ");
      }

      for (String packageItem : a) {
        textarea.append(packageItem + "\n                                   ");
      }

      textarea.append("***************************************\n");
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  private void addMemberActionPerformed(java.awt.event.ActionEvent evt) { // Renamed to avoid conflict
    boolean isChecked = cardio.isSelected();
    String selectedCardio = isChecked ? "Cardio" : "";
    isChecked = shredding.isSelected();
    String selectedShredding = isChecked ? "Shredding" : "";
    isChecked = bulking.isSelected();
    String selectedBulking = isChecked ? "Bulking" : "";
    isChecked = weightlifting.isSelected();
    String selectedWeightlifting = isChecked ? "Weight-Lifting" : "";

    try {
      Connection con = DB.getCon();
      String query;
      PreparedStatement p;

      if (list.getSelectedItem().equals("ADD A MEMBER")) {
        query = "INSERT INTO member(name, mobile, gender, weight, height, duration, packages) VALUES(?, ?, ?, ?, ?, ?, ?)";
        p = con.prepareStatement(query);
        p.setString(1, name.getText());
        p.setString(2, mobile.getText());
        p.setString(3, gender.getText());
        p.setString(4, weight.getText());
        p.setString(5, height.getText());
        p.setString(6, duration.getText());
        p.setString(7, selectedCardio + " " + selectedShredding + " " + selectedBulking + " " + selectedWeightlifting);
        p.executeUpdate();
      } else {
        query = "UPDATE member SET name=?, mobile=?, gender=?, weight=?, height=?, duration=?, packages=? WHERE mobile=?";
        p = con.prepareStatement(query);
        p.setString(1, name.getText());
        p.setString(2, mobile.getText());
        p.setString(3, gender.getText());
        p.setFloat(4, Float.parseFloat(weight.getText()));
        p.setFloat(5, Float.parseFloat(height.getText()));
        p.setString(6, duration.getText());
        p.setString(7, selectedCardio + " " + selectedShredding + " " + selectedBulking + " " + selectedWeightlifting);
        p.setString(8, mobile.getText());
        p.executeUpdate();
      }
      JOptionPane.showMessageDialog(this, "Operation Successful!");
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> new GymManagement().setVisible(true));
  }

  // Variables declaration
  private javax.swing.JTextField Rmobile;
  private javax.swing.JButton add;
  private javax.swing.JCheckBox bulking;
  private javax.swing.JCheckBox cardio;
  private javax.swing.JTextField duration;
  private javax.swing.JTextField gender;
  private javax.swing.JButton get;
  private javax.swing.JTextField height;
  private javax.swing.JCheckBox jCheckBox1;
  private javax.swing.JComboBox<String> jComboBox2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JComboBox<String> list;
  private javax.swing.JTextField mobile;
  private javax.swing.JTextField name;
  private javax.swing.JCheckBox shredding;
  private javax.swing.JTextArea textarea;
  private javax.swing.JTextField weight;
  private javax.swing.JCheckBox weightlifting;
  // End of variables declaration
}