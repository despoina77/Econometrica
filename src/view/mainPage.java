package view;

import Controller.mainPageController;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import handlers.DataBase;
import handlers.FileCsv;
import handlers.Plot;
import handlers.QuandleApi;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;
import model.Country;
import model.CountryData;
import model.CountryDataset;
import org.jfree.ui.RefineryUtilities;

/**
 * Τμήμα ΑΘΗ-1
 * @author ΑΛΕΞΕΛΗΣ ΠΑΥΛΟΣ - 127928
 * @author ΑΛΕΞΙΑΔΟΥ ΔΕΣΠΟΙΝΑ - 118843
 * @author ΑΝΑΓΝΩΣΤΗΣ ΙΩΑΝΝΗΣ - 118847
*/

public class mainPage extends javax.swing.JFrame {

    private HashMap<String, String> countryCsvList = new HashMap<String, String>();
    private Country country;

    
    public mainPage() {       
        initComponents();
        //Ορισμος τιτλου
        setTitle("Econometrica");
        Container jFrame = getContentPane();
        jFrame.setLayout(null);
        //Ορισμος χρωματος background
        jFrame.setBackground(Color.WHITE);
        jFrame.setPreferredSize(new Dimension(645, 555));
        jFrame.setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnDelete = new javax.swing.JButton();
        jbtnPlot = new javax.swing.JButton();
        jbtnSave = new javax.swing.JButton();
        jchkSaved = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableOil = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableGdp = new javax.swing.JTable();
        jlblOilEndDate = new javax.swing.JLabel();
        jlblGdpEndDate = new javax.swing.JLabel();
        jlblOilStartDate = new javax.swing.JLabel();
        jlblGdpStartDate = new javax.swing.JLabel();
        jlblOil = new javax.swing.JLabel();
        jlblGdp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbCountries = new javax.swing.JComboBox<>();
        jbtnFetch = new javax.swing.JButton();
        jlblCountries = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jbtnDelete.setText("DELETE ALL");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        jbtnPlot.setText("Plot");
        jbtnPlot.setEnabled(false);
        jbtnPlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlotActionPerformed(evt);
            }
        });

        jbtnSave.setEnabled(false);
        jbtnSave.setText("Save");
        jbtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveActionPerformed(evt);
            }
        });

        jchkSaved.setText("Already Saved to Database");
        jchkSaved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkSavedActionPerformed(evt);
            }
        });

        jtableOil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Year", "Value"
            }
        ));
        jScrollPane1.setViewportView(jtableOil);

        jtableGdp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Year", "Value"
            }
        ));
        jScrollPane2.setViewportView(jtableGdp);

        jlblOilEndDate.setText("End Date");

        jlblGdpEndDate.setText("End Date");

        jlblOilStartDate.setText("Start Date");

        jlblGdpStartDate.setText("Start Date");

        jlblOil.setText("Oil Consumption-");

        jlblGdp.setText("GDP (current LCU)-");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("OIL DATA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Dataset Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("GDP DATA");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Dataset Name");

        jbtnFetch.setText("Fetch Data");
        jbtnFetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFetchActionPerformed(evt);
            }
        });

        jlblCountries.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblCountries.setText("Select Country:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Available Timespan:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Available Timespan:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblCountries, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jbtnPlot, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jchkSaved)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbCountries, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jbtnFetch, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlblOil, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblGdp, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblOilEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblOilStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblGdpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblGdpEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblCountries, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCountries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnFetch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblOil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlblOilStartDate)
                                    .addComponent(jlblGdpStartDate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlblOilEndDate)
                                    .addComponent(jlblGdpEndDate))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnPlot, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jchkSaved))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblGdp)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        //Δημιουργία αντικειμένου  για ταυτοποίηση του ονόματος της χώρας όπως το παιρνουμε από το API με 
        // το δοθέν αρχείο που περιέχει τις συντομογραφίες.
        FileCsv fc = new FileCsv("iso-countries.csv");
        //Εισαγωγή των χωρών σε Λίστα σε μορφή (alpha3)
        ArrayList<String[]> Countries = fc.read();
        jcbCountries.removeAllItems();
        countryCsvList.clear();
        for(String[] value: Countries){
            jcbCountries.addItem(value[0]);
            countryCsvList.put(value[0], value[2]);
        }
        
        jcbCountries.setSelectedItem("GREECE");

    }//GEN-LAST:event_formWindowOpened

 
    private void jbtnFetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFetchActionPerformed
        // FETCH BUTTON
        jbtnSave.setEnabled(true);
        jbtnPlot.setEnabled(true);
        
        country = new Country();
       
        String countryIsoCode = countryCsvList.get(jcbCountries.getSelectedItem().toString());
        String countryName = jcbCountries.getSelectedItem().toString();
        Collection<CountryDataset> countryDatasetCollection = new ArrayList<CountryDataset>();
        country.setIsoCode(countryIsoCode);
        country.setName(countryName);    
        
        CountryDataset cdsGdp = mainPageController.getGdpData(country,jtableGdp);
        if(cdsGdp != null){
            jlblGdp.setText("GDP (current LCU)- " + countryName);
            jlblGdpStartDate.setText("Sart Date: " + "      " +cdsGdp.getStartYear()+"-12-31");
            jlblGdpEndDate.setText("End Date " + "       "  + cdsGdp.getEndYear()+"-12-31");
            jtableGdp.setModel(mainPageController.gdpModel);
            cdsGdp.setCountryCode(country);
            countryDatasetCollection.add(cdsGdp);
        }else{
            jlblGdp.setText("GDP (current LCU)- " );
            jlblGdpStartDate.setText("Sart Date: -");
            jlblGdpEndDate.setText("End Date -");
            jtableGdp.setModel(new DefaultTableModel());
            JOptionPane.showMessageDialog(null, "Δεν υπαρχουν δεδομενα ΑΕΠ για την " +this.country.getName()+ " ", "Προσοχή", JOptionPane.WARNING_MESSAGE);
        }
  
        CountryDataset cdsOil = mainPageController.getOilData(country, jtableOil);
        if(cdsOil != null){
            jlblOil.setText("Oil Consumption- " + countryName);
            jlblOilStartDate.setText("Sart Date: " + "      " +cdsOil.getStartYear()+"-12-31");
            jlblOilEndDate.setText("End Date " + "       "  + cdsOil.getEndYear()+"-12-31");
            jtableOil.setModel(mainPageController.oilModel);
            cdsOil.setCountryCode(country);
            countryDatasetCollection.add(cdsOil);
        }
        else{   
            jlblOil.setText("Oil Consumption- " );
            jlblOilStartDate.setText("Sart Date: -" );
            jlblOilEndDate.setText("End Date -");
            jtableOil.setModel(new DefaultTableModel());
            JOptionPane.showMessageDialog(null, "Δεν υπαρχουν δεδομενα καταναλωσης πετρελαιου για την " +this.country.getName()+ " ", "Προσοχή", JOptionPane.WARNING_MESSAGE);
        }
        
        country.setCountryDatasetCollection(countryDatasetCollection);
        
        if(DataBase.alreadyExist(country)){            
            jchkSaved.setSelected(true);
        }else{
            jchkSaved.setSelected(false);
        }
    }//GEN-LAST:event_jbtnFetchActionPerformed

    //Εμφανίζει το διάγραμμα με τις τιμές του GDP & OIL από το 1965 έως σήμερα
    private void jbtnPlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlotActionPerformed
        //PLOT BUTTON

        CountryDataset oil = getDataset("oil", country.getCountryDatasetCollection());
        CountryDataset gdp = getDataset("gdp", country.getCountryDatasetCollection());

        final Plot chart = new Plot("Economic Data for " + jcbCountries.getSelectedItem(), oil, gdp );
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);

        chart.setVisible(true);
    }//GEN-LAST:event_jbtnPlotActionPerformed

    //Σβήνει τα δεδομένα απο τη Βάση.
    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        // DELETE BUTTON

        DataBase.deleteDB();
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    //Αν η χώρα δεν υπάρχει στη βάση αποθηκεύεται από το API.
    private void jbtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveActionPerformed
        //SAVE BUTTON
        
        //Ειδοποίηση οτι η χώρα είναι ήδη αποθηκευμένη
        if(DataBase.alreadyExist(country)){
            System.out.println("data not saved");
            JOptionPane.showMessageDialog(null, "Είναι ήδη η " +this.country.getName()+ " αποθηκευμένη στην βάση", "Προσοχή", JOptionPane.WARNING_MESSAGE);
        }else{
            DataBase.save(country);
            jchkSaved.setSelected(true);
            System.out.println("data saved");
            JOptionPane.showMessageDialog(null, "Αποθηκεύτηκε η " +this.country.getName()+ " στην βάση", "Προσοχή", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jbtnSaveActionPerformed

    private void jchkSavedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkSavedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jchkSavedActionPerformed

    private CountryDataset getDataset(String type, Collection<CountryDataset> cds){
       
        for(CountryDataset cd : cds){
            if(type.toLowerCase().equals(cd.getName().substring(0, 3).toLowerCase())){
                //System.out.println(cd.getName().substring(0, 3).toLowerCase());
                return cd;
            }
            
        }
        return null;
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnFetch;
    private javax.swing.JButton jbtnPlot;
    private javax.swing.JButton jbtnSave;
    private javax.swing.JComboBox<String> jcbCountries;
    private javax.swing.JCheckBox jchkSaved;
    private javax.swing.JLabel jlblCountries;
    private javax.swing.JLabel jlblGdp;
    private javax.swing.JLabel jlblGdpEndDate;
    private javax.swing.JLabel jlblGdpStartDate;
    private javax.swing.JLabel jlblOil;
    private javax.swing.JLabel jlblOilEndDate;
    private javax.swing.JLabel jlblOilStartDate;
    private javax.swing.JTable jtableGdp;
    private javax.swing.JTable jtableOil;
    // End of variables declaration//GEN-END:variables
}