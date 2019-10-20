package GUI;

import Logica.Builder;
import Logica.ConstructorMago;
import Logica.Duende;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author <a href="https://github.com/JQuinteroC">JQuinteroC</a>
 */
public class FRM_Selector extends javax.swing.JFrame {

    private static FRM_Selector GUI;

    /**
     * Creates new form FRM_Selector
     */
    private FRM_Selector() throws IOException {
        initComponents();
        super.setLocationRelativeTo(null);
        Image s = ImageIO.read(new File("Recursos\\Wizard\\Idle\\1_IDLE_000.png"));
        ImageIcon l = new ImageIcon(s.getScaledInstance(387, 350, Image.SCALE_SMOOTH));
        lblMago.setIcon(l);

        s = ImageIO.read(new File("Recursos\\Goblin\\Idle\\Goblin_Idle_000.png"));
        l = new ImageIcon(s.getScaledInstance(387, 350, Image.SCALE_SMOOTH));
        lblDuende.setIcon(l);
    }

    public static FRM_Selector getInstance() throws IOException {
        if (GUI == null) {
            try {
                GUI = new FRM_Selector();
            } catch (IOException ex) {
                Logger.getLogger(FRM_Selector.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        MouseEvent evt = null;
        GUI.lblDuendeMouseExited(evt);
        GUI.lblMagoMouseExited(evt);
        return GUI;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMago = new javax.swing.JLabel();
        lblDuende = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(834, 488));

        lblMago.setText("MAGO");
        lblMago.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblMago.setFocusable(false);
        lblMago.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblMago.setMaximumSize(new java.awt.Dimension(387, 350));
        lblMago.setMinimumSize(new java.awt.Dimension(387, 350));
        lblMago.setPreferredSize(new java.awt.Dimension(387, 350));
        lblMago.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblMago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMagoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMagoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMagoMouseExited(evt);
            }
        });

        lblDuende.setText("DUENDE");
        lblDuende.setToolTipText("");
        lblDuende.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblDuende.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblDuende.setMaximumSize(new java.awt.Dimension(387, 350));
        lblDuende.setMinimumSize(new java.awt.Dimension(387, 350));
        lblDuende.setPreferredSize(new java.awt.Dimension(387, 350));
        lblDuende.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblDuende.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDuendeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDuendeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDuendeMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecciona a un personaje");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .add(lblMago, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(28, 28, 28)
                .add(lblDuende, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(14, 14, 14)
                .add(jLabel2)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblMago, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .add(lblDuende, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMagoMouseClicked
        Builder build = new Builder();
        build.setConstructor(new ConstructorMago());
        build.CrearPersonaje();
        FRM_Visor ventana = new FRM_Visor(build.getPersonaje());
        ventana.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_lblMagoMouseClicked

    private void lblDuendeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDuendeMouseClicked
        Builder build = new Builder();
        build.setConstructor(new Duende());
        build.CrearPersonaje();
        FRM_Visor ventana = new FRM_Visor(build.getPersonaje());
        ventana.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_lblDuendeMouseClicked

    private void lblMagoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMagoMouseEntered
        Image s = null;
        try {
            s = ImageIO.read(new File("Recursos\\Wizard\\Idle\\1_IDLE_000-.png"));
        } catch (IOException ex) {
            Logger.getLogger(FRM_Selector.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon l = new ImageIcon(s.getScaledInstance(387, 350, Image.SCALE_SMOOTH));
        lblMago.setIcon(l);
    }//GEN-LAST:event_lblMagoMouseEntered

    private void lblMagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMagoMouseExited
        Image s = null;
        try {
            s = ImageIO.read(new File("Recursos\\Wizard\\Idle\\1_IDLE_000.png"));
        } catch (IOException ex) {
            Logger.getLogger(FRM_Selector.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon l = new ImageIcon(s.getScaledInstance(387, 350, Image.SCALE_SMOOTH));
        lblMago.setIcon(l);
    }//GEN-LAST:event_lblMagoMouseExited

    private void lblDuendeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDuendeMouseEntered
        Image s = null;
        try {
            s = ImageIO.read(new File("Recursos\\Goblin\\Idle\\Goblin_Idle_000-.png"));
        } catch (IOException ex) {
            Logger.getLogger(FRM_Selector.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon l = new ImageIcon(s.getScaledInstance(387, 350, Image.SCALE_SMOOTH));
        lblDuende.setIcon(l);
    }//GEN-LAST:event_lblDuendeMouseEntered

    private void lblDuendeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDuendeMouseExited
        Image s = null;
        try {
            s = ImageIO.read(new File("Recursos\\Goblin\\Idle\\Goblin_Idle_000.png"));
        } catch (IOException ex) {
            Logger.getLogger(FRM_Selector.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon l = new ImageIcon(s.getScaledInstance(387, 350, Image.SCALE_SMOOTH));
        lblDuende.setIcon(l);
    }//GEN-LAST:event_lblDuendeMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDuende;
    private javax.swing.JLabel lblMago;
    // End of variables declaration//GEN-END:variables
}
