package OtherComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaCanvas extends JFrame implements ActionListener {

    private final JCheckBox showLines = new JCheckBox("Show Lines");
    private final JCheckBox showList = new JCheckBox("Show List");
    private boolean showRegionLines = false;
    private boolean showContryList = true;
    private final DrawingPanel panel;

    public JavaCanvas() {
        setTitle("Canvas Example");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        panel = new DrawingPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(76, 173, 228));
        panel.setBounds(0, 0, 700, 400);

        // Checkboxes
        showLines.setBackground(Color.white);
        showLines.setFocusable(false);
        showLines.setFont(new Font("Arial", Font.PLAIN, 10));
        showLines.setBounds(5, 330, 80, 30);
        showLines.addActionListener(this);

        showList.setBackground(Color.white);
        showList.setFocusable(false);
        showList.setFont(new Font("Arial", Font.PLAIN, 10));
        showList.setBounds(5, 300, 80, 30);
        showList.addActionListener(this);

        panel.add(showLines);
        panel.add(showList);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == showLines) {
            showRegionLines = showLines.isSelected();
            panel.repaint();
        }else if(e.getSource() == showList){
            if(showContryList == true){
                
                showContryList = false;
            }else if(showContryList == false){
                
                showContryList = true;
            } 
        }
    }

    class DrawingPanel extends JPanel {
        private final Image wrldImg = new ImageIcon("C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Documents\\NetBeansProjects\\HOWTO_JavaGUI\\src\\main\\java\\WorldOutline.png").getImage();
        private final Polygon shapeNA = new Polygon();
        private final Polygon shapeSA = new Polygon();
        private final Polygon shapeAnt = new Polygon();
        private final Polygon shapeEU = new Polygon();
        private final Polygon shapeAF = new Polygon();
        private final Polygon shapeAS = new Polygon();
        private final Polygon shapeOC = new Polygon();
        private final Polygon shapePO = new Polygon();
        private final Polygon shapeArO = new Polygon();

        public DrawingPanel() {
            buildShapes();

            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int mouseX = e.getX();
                    int mouseY = e.getY();

                    if (shapeNA.contains(mouseX, mouseY)) {
                        System.out.println("North America Clicked");
                        new NorthAmerica();
                    } else if (shapePO.contains(mouseX, mouseY)) {
                        System.out.println("Pacific Ocean Clicked");
                    } else if (shapeSA.contains(mouseX, mouseY)) {
                        System.out.println("South America Clicked");
                    } else if (shapeAnt.contains(mouseX, mouseY)) {
                        System.out.println("Antarctica Clicked");
                    } else if (shapeArO.contains(mouseX, mouseY)) {
                        System.out.println("Arctic Ocean Clicked");
                    } else if (shapeEU.contains(mouseX, mouseY)) {
                        System.out.println("Europe Clicked");
                    } else if (shapeAF.contains(mouseX, mouseY)) {
                        System.out.println("Africa Clicked");
                    } else if (shapeAS.contains(mouseX, mouseY)) {
                        System.out.println("Asia Clicked");
                    } else if (shapeOC.contains(mouseX, mouseY)) {
                        System.out.println("Oceania Clicked");
                    } else if (mouseX >= 200 && mouseX <= 385) {
                        System.out.println("Atlantic Ocean Clicked");
                    } else if (mouseX >= 385 && mouseX <= 560) {
                        System.out.println("Indian Ocean Clicked");
                    } else if (mouseX > 560 && mouseX <= 700) {
                        System.out.println("Pacific Ocean Clicked");
                    } else {
                        System.out.println("Out of bounds click");
                    }
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponents(g); // small typo here if you're using JFrame — should be paintComponent
            g.drawImage(wrldImg, 0, 0, getWidth(), getHeight(), this);

            if (showRegionLines) {
                // Drawing region outlines
                g.drawPolygon(shapeNA);
                g.drawPolygon(shapePO);
                g.drawPolygon(shapeSA);
                g.drawPolygon(shapeAnt);
                g.drawPolygon(shapeArO);
                g.drawPolygon(shapeEU);
                g.drawPolygon(shapeAF);
                g.drawPolygon(shapeAS);
                g.drawPolygon(shapeOC);
                g.drawLine(0, 0, 700, 0);
                g.drawLine(700, 0, 700, 400);
                g.drawLine(700, 400, 0, 400);
            }
        }

        private void buildShapes() {
            // same addPoint calls as before...
            shapeNA.addPoint(0, 70);
            shapeNA.addPoint(115, 70);
            shapeNA.addPoint(115, 155);
            shapeNA.addPoint(230, 155);
            shapeNA.addPoint(230, 90);
            shapeNA.addPoint(255, 90);
            shapeNA.addPoint(255, 50);
            shapeNA.addPoint(300, 50);
            shapeNA.addPoint(300, 0);
            shapeNA.addPoint(0, 0);

            shapePO.addPoint(0, 70);
            shapePO.addPoint(115, 70);
            shapePO.addPoint(115, 155);
            shapePO.addPoint(180, 155);
            shapePO.addPoint(180, 400);
            shapePO.addPoint(0, 400);

            shapeSA.addPoint(180, 155);
            shapeSA.addPoint(280, 155);
            shapeSA.addPoint(280, 305);
            shapeSA.addPoint(180, 305);

            shapeAnt.addPoint(180, 305);
            shapeAnt.addPoint(520, 305);
            shapeAnt.addPoint(520, 400);
            shapeAnt.addPoint(180, 400);

            shapeArO.addPoint(300, 0);
            shapeArO.addPoint(300, 30);
            shapeArO.addPoint(370, 30);
            shapeArO.addPoint(370, 0);

            shapeEU.addPoint(300, 50);
            shapeEU.addPoint(320, 50);
            shapeEU.addPoint(320, 105);
            shapeEU.addPoint(390, 105);
            shapeEU.addPoint(390, 30);
            shapeEU.addPoint(300, 30);

            shapeAF.addPoint(300, 105);
            shapeAF.addPoint(390, 105);
            shapeAF.addPoint(445, 155);
            shapeAF.addPoint(445, 270);
            shapeAF.addPoint(350, 270);
            shapeAF.addPoint(350, 180);
            shapeAF.addPoint(300, 180);

            shapeAS.addPoint(370, 30);
            shapeAS.addPoint(370, 0);
            shapeAS.addPoint(600, 0);
            shapeAS.addPoint(600, 170);
            shapeAS.addPoint(650, 170);
            shapeAS.addPoint(650, 200);
            shapeAS.addPoint(520, 200);
            shapeAS.addPoint(520, 170);
            shapeAS.addPoint(500, 170);
            shapeAS.addPoint(445, 155);
            shapeAS.addPoint(390, 105);
            shapeAS.addPoint(390, 30);

            shapeOC.addPoint(540, 200);
            shapeOC.addPoint(700, 200);
            shapeOC.addPoint(700, 290);
            shapeOC.addPoint(540, 290);
        }
    }
}
