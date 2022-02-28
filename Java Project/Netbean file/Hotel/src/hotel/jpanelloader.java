
package hotel;

import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.JPanel;

public class jpanelloader {

    static void JPanelLoader(JPanel MainPanel, JPanel rgt) {
              
        MainPanel.removeAll();
        
        GroupLayout layout = new GroupLayout(MainPanel);
        
        MainPanel.setLayout(layout);
     
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addComponent(rgt,GroupLayout.Alignment.LEADING,GroupLayout.PREFERRED_SIZE,
                GroupLayout.PREFERRED_SIZE,Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addComponent(rgt,GroupLayout.Alignment.LEADING,GroupLayout.PREFERRED_SIZE,
                GroupLayout.PREFERRED_SIZE,Short.MAX_VALUE));
        
        System.gc();
    }

       
  /* public void JPanelLoader(JPanel main, JPanel setPanel) {
        
        main.removeAll();
        
        GroupLayout layout = new GroupLayout(main);
        main.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addComponent(setPanel,GroupLayout.Alignment.LEADING,GroupLayout.PREFERRED_SIZE,
                GroupLayout.PREFERRED_SIZE,Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addComponent(setPanel,GroupLayout.Alignment.LEADING,GroupLayout.PREFERRED_SIZE,
                GroupLayout.PREFERRED_SIZE,Short.MAX_VALUE));
        
        System.gc();
        
    } 
    */







 
    
}
