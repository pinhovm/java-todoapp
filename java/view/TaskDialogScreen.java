/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.TaskController;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Project;
import model.Task;

/**
 *
 * @author vito
 */
public class TaskDialogScreen extends javax.swing.JDialog {

   TaskController controller;
   Project project;
   public TaskDialogScreen(java.awt.Frame parent, boolean modal) {
      super(parent, modal);
      initComponents();
      
      controller = new TaskController();
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanelTaskToolbarTitle = new javax.swing.JPanel();
      jLabelTaskTitle = new javax.swing.JLabel();
      jLabelTaskIcon = new javax.swing.JLabel();
      jLabelName = new javax.swing.JLabel();
      jLabelDescription = new javax.swing.JLabel();
      jLabelDeadline = new javax.swing.JLabel();
      jLabelNotes = new javax.swing.JLabel();
      jTextFieldTaskName = new javax.swing.JTextField();
      jScrollPaneDescription = new javax.swing.JScrollPane();
      jTextAreaDescription = new javax.swing.JTextArea();
      jScrollPaneNotes = new javax.swing.JScrollPane();
      jTextAreaNotes = new javax.swing.JTextArea();
      jFormattedTextDeadline = new javax.swing.JFormattedTextField();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

      jPanelTaskToolbarTitle.setBackground(new java.awt.Color(0, 153, 102));
      jPanelTaskToolbarTitle.setMaximumSize(new java.awt.Dimension(600, 900));

      jLabelTaskTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      jLabelTaskTitle.setForeground(java.awt.Color.white);
      jLabelTaskTitle.setText("Tarefas");

      jLabelTaskIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
      jLabelTaskIcon.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabelTaskIconMouseClicked(evt);
         }
      });

      javax.swing.GroupLayout jPanelTaskToolbarTitleLayout = new javax.swing.GroupLayout(jPanelTaskToolbarTitle);
      jPanelTaskToolbarTitle.setLayout(jPanelTaskToolbarTitleLayout);
      jPanelTaskToolbarTitleLayout.setHorizontalGroup(
         jPanelTaskToolbarTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanelTaskToolbarTitleLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabelTaskTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabelTaskIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );
      jPanelTaskToolbarTitleLayout.setVerticalGroup(
         jPanelTaskToolbarTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTaskToolbarTitleLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelTaskToolbarTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabelTaskTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabelTaskIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );

      jLabelName.setText("Nome:");

      jLabelDescription.setText("Descrição: ");

      jLabelDeadline.setText("Prazo: ");

      jLabelNotes.setText("Notas:");

      jTextAreaDescription.setColumns(20);
      jTextAreaDescription.setRows(5);
      jScrollPaneDescription.setViewportView(jTextAreaDescription);

      jTextAreaNotes.setColumns(20);
      jTextAreaNotes.setRows(5);
      jScrollPaneNotes.setViewportView(jTextAreaNotes);

      jFormattedTextDeadline.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
      jFormattedTextDeadline.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jFormattedTextDeadlineActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanelTaskToolbarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(jFormattedTextDeadline)
               .addComponent(jScrollPaneNotes, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
               .addComponent(jScrollPaneDescription)
               .addComponent(jLabelName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabelNotes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jTextFieldTaskName, javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabelDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabelDeadline, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(jPanelTaskToolbarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabelName)
            .addGap(3, 3, 3)
            .addComponent(jTextFieldTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabelDescription)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPaneDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabelDeadline)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jFormattedTextDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabelNotes)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPaneNotes, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void jFormattedTextDeadlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextDeadlineActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_jFormattedTextDeadlineActionPerformed

   private void jLabelTaskIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTaskIconMouseClicked
      try {
         Task task = new Task();
         Calendar calendar = Calendar.getInstance();
         task.setIdProject(project.getId());
         task.setName(jTextFieldTaskName.getText());
         task.setDescription(jTextAreaDescription.getText());
         task.setNotes(jTextAreaNotes.getText());
         task.setCreatedAt(calendar.getTime());
         task.setUpdatedAt(calendar.getTime());
         task.setIsCompleted(false);
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
         Date deadline = dateFormat.parse(jFormattedTextDeadline.getText());
         task.setDeadline(deadline);
         JOptionPane.showMessageDialog(rootPane, "Tarefa salva com sucesso!");
         controller.save(task);
      } catch (Exception e) {
         JOptionPane.showMessageDialog(rootPane, e.getMessage());
      }
      this.dispose();
   }//GEN-LAST:event_jLabelTaskIconMouseClicked

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            TaskDialogScreen dialog = new TaskDialogScreen(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
               @Override
               public void windowClosing(java.awt.event.WindowEvent e) {
                  System.exit(0);
               }
            });
            dialog.setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JFormattedTextField jFormattedTextDeadline;
   private javax.swing.JLabel jLabelDeadline;
   private javax.swing.JLabel jLabelDescription;
   private javax.swing.JLabel jLabelName;
   private javax.swing.JLabel jLabelNotes;
   private javax.swing.JLabel jLabelTaskIcon;
   private javax.swing.JLabel jLabelTaskTitle;
   private javax.swing.JPanel jPanelTaskToolbarTitle;
   private javax.swing.JScrollPane jScrollPaneDescription;
   private javax.swing.JScrollPane jScrollPaneNotes;
   private javax.swing.JTextArea jTextAreaDescription;
   private javax.swing.JTextArea jTextAreaNotes;
   private javax.swing.JTextField jTextFieldTaskName;
   // End of variables declaration//GEN-END:variables

   public void setProject(Project project) {
      this.project = project;
   }

}