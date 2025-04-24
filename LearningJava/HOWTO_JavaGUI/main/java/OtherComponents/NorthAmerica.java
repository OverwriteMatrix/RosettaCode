package OtherComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NorthAmerica extends JFrame implements ActionListener {

    private final DrawingPanel panel;

    public NorthAmerica() {
        setTitle("North America");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        panel = new DrawingPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(76, 173, 228));
        panel.setBounds(0, 0, 700, 400);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }

    class DrawingPanel extends JPanel {
        // "C:\Users\Paxton.Clark\OneDrive - Leonardo DRS\Documents\NetBeansProjects\HOWTO_JavaGUI\src\main\java\NA.png"
        private final Image naImg = new ImageIcon("C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Documents\\NetBeansProjects\\HOWTO_JavaGUI\\src\\main\\java\\NA.png").getImage();
        private final Polygon shapeCA = new Polygon();
        private final Polygon shapeMX = new Polygon();
        private final Polygon shapeUS = new Polygon();
        
        private final Polygon shapeLA = new Polygon();
        private final Polygon shapeCAR = new Polygon();

        public DrawingPanel() {
            buildUS();
            buildCA();

            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int mouseX = e.getX();
                    int mouseY = e.getY();
                    System.out.println("shapeCA.addPoint(" + mouseX + ", " + mouseY + ");");

                    if (shapeUS.contains(mouseX, mouseY)) {
                        System.out.println("");
                    }else if (shapeCA.contains(mouseX, mouseY)) {
                        System.out.println("");
                    }else if (shapeMX.contains(mouseX, mouseY)) {
                        System.out.println("");
                        
                    }else if (shapeLA.contains(mouseX, mouseY)) {
                        System.out.println("");
                    }else if (shapeCAR.contains(mouseX, mouseY)) {
                        System.out.println("");
                    }
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponents(g);
            g.drawImage(naImg, 0, 0, getWidth(), getHeight(), this);

            g.setColor(Color.blue);
            g.drawPolygon(shapeUS);
            
            g.setColor(Color.red);
            g.drawPolygon(shapeCA);
            
            g.setColor(Color.green);
            g.drawPolygon(shapeMX);
            
            g.setColor(Color.magenta);
            g.drawPolygon(shapeLA);
            
            g.setColor(Color.orange);
            g.drawPolygon(shapeCAR);
            
        }

        private void buildUS() {
            shapeUS.addPoint(110, 325);
            shapeUS.addPoint(113, 316);
            shapeUS.addPoint(117, 306);
            shapeUS.addPoint(119, 297);
            shapeUS.addPoint(122, 288);
            shapeUS.addPoint(122, 284);
            shapeUS.addPoint(123, 279);
            shapeUS.addPoint(126, 282);
            shapeUS.addPoint(130, 286);
            shapeUS.addPoint(133, 281);
            shapeUS.addPoint(136, 277);
            shapeUS.addPoint(145, 278);
            shapeUS.addPoint(154, 280);
            shapeUS.addPoint(158, 282);
            shapeUS.addPoint(163, 284);
            shapeUS.addPoint(172, 285);
            shapeUS.addPoint(181, 286);
            shapeUS.addPoint(189, 287);
            shapeUS.addPoint(197, 289);
            shapeUS.addPoint(208, 290);
            shapeUS.addPoint(219, 292);
            shapeUS.addPoint(227, 291);
            shapeUS.addPoint(236, 291);
            shapeUS.addPoint(240, 292);
            shapeUS.addPoint(245, 293);
            shapeUS.addPoint(250, 295);
            shapeUS.addPoint(255, 297);
            shapeUS.addPoint(262, 297);
            shapeUS.addPoint(268, 298);
            shapeUS.addPoint(273, 297);
            shapeUS.addPoint(278, 296);
            shapeUS.addPoint(283, 299);
            shapeUS.addPoint(289, 303);
            shapeUS.addPoint(291, 307);
            shapeUS.addPoint(294, 311);
            shapeUS.addPoint(297, 314);
            shapeUS.addPoint(299, 318);
            shapeUS.addPoint(299, 324);
            shapeUS.addPoint(298, 331);
            shapeUS.addPoint(301, 331);
            shapeUS.addPoint(304, 331);
            shapeUS.addPoint(310, 328);
            shapeUS.addPoint(316, 326);
            shapeUS.addPoint(315, 322);
            shapeUS.addPoint(314, 318);
            shapeUS.addPoint(317, 318);
            shapeUS.addPoint(320, 318);
            shapeUS.addPoint(323, 314);
            shapeUS.addPoint(326, 311);
            shapeUS.addPoint(329, 307);
            shapeUS.addPoint(333, 304);
            shapeUS.addPoint(340, 303);
            shapeUS.addPoint(347, 302);
            shapeUS.addPoint(349, 296);
            shapeUS.addPoint(351, 290);
            shapeUS.addPoint(354, 289);
            shapeUS.addPoint(356, 287);
            shapeUS.addPoint(359, 291);
            shapeUS.addPoint(362, 296);
            shapeUS.addPoint(362, 298);
            shapeUS.addPoint(362, 300);
            shapeUS.addPoint(360, 304);
            shapeUS.addPoint(357, 307);
            shapeUS.addPoint(355, 310);
            shapeUS.addPoint(354, 313);
            shapeUS.addPoint(355, 315);
            shapeUS.addPoint(357, 317);
            shapeUS.addPoint(353, 321);
            shapeUS.addPoint(349, 325);
            shapeUS.addPoint(346, 328);
            shapeUS.addPoint(343, 331);
            shapeUS.addPoint(341, 335);
            shapeUS.addPoint(339, 339);
            shapeUS.addPoint(338, 346);
            shapeUS.addPoint(338, 354);
            shapeUS.addPoint(338, 360);
            shapeUS.addPoint(338, 366);
            shapeUS.addPoint(333, 373);
            shapeUS.addPoint(328, 380);
            shapeUS.addPoint(325, 384);
            shapeUS.addPoint(322, 388);
            shapeUS.addPoint(320, 392);
            shapeUS.addPoint(319, 395);
            shapeUS.addPoint(324, 410);
            shapeUS.addPoint(329, 424);
            shapeUS.addPoint(327, 429);
            shapeUS.addPoint(325, 433);
            shapeUS.addPoint(321, 429);
            shapeUS.addPoint(317, 426);
            shapeUS.addPoint(315, 421);
            shapeUS.addPoint(314, 416);
            shapeUS.addPoint(310, 410);
            shapeUS.addPoint(306, 405);
            shapeUS.addPoint(301, 406);
            shapeUS.addPoint(297, 408);
            shapeUS.addPoint(293, 407);
            shapeUS.addPoint(288, 407);
            shapeUS.addPoint(281, 406);
            shapeUS.addPoint(274, 406);
            shapeUS.addPoint(271, 409);
            shapeUS.addPoint(269, 412);
            shapeUS.addPoint(258, 412);
            shapeUS.addPoint(248, 413);
            shapeUS.addPoint(243, 417);
            shapeUS.addPoint(238, 421);
            shapeUS.addPoint(235, 425);
            shapeUS.addPoint(232, 429);
            shapeUS.addPoint(228, 431);
            shapeUS.addPoint(224, 433);
            shapeUS.addPoint(221, 429);
            shapeUS.addPoint(219, 425);
            shapeUS.addPoint(216, 419);
            shapeUS.addPoint(213, 413);
            shapeUS.addPoint(208, 414);
            shapeUS.addPoint(203, 414);
            shapeUS.addPoint(196, 409);
            shapeUS.addPoint(190, 405);
            shapeUS.addPoint(187, 400);
            shapeUS.addPoint(184, 395);
            shapeUS.addPoint(177, 396);
            shapeUS.addPoint(169, 396);
            shapeUS.addPoint(161, 394);
            shapeUS.addPoint(152, 392);
            shapeUS.addPoint(146, 387);
            shapeUS.addPoint(140, 382);
            shapeUS.addPoint(135, 379);
            shapeUS.addPoint(129, 375);
            shapeUS.addPoint(125, 369);
            shapeUS.addPoint(121, 363);
            shapeUS.addPoint(118, 359);
            shapeUS.addPoint(115, 356);
            shapeUS.addPoint(114, 346);
            shapeUS.addPoint(112, 337);
        }
        
        private void buildCA() {

       }
    }
}
