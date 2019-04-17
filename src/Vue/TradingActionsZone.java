/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.awt.LayoutManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

/**
 *
 * @author acol
 */
class TradingActionsZone extends JPanel{
    JLabel etiqueAction;
    JTextField qty;
    JLabel side;
    JComboBox actionAchoisir;
    
    
   
    public TradingActionsZone() {
        etiqueAction = new JLabel();
        actionAchoisir = new JComboBox<>();
        etiqueAction.setText("Action");
        actionAchoisir.setModel(new DefaultComboBoxModel<>(new String[] { "--Aucun--", "1", "2", "3", "4" }));
        
        GroupLayout actionLayout = new GroupLayout(this);
        this.setLayout(actionLayout);
        
        actionLayout.setHorizontalGroup(
        actionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(actionLayout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addComponent(etiqueAction)
            .addContainerGap(33, Short.MAX_VALUE))
        );
        
        
        
    }
    
    
    
    
}
