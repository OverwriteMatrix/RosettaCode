package Mario;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.awt.Image;
import javax.swing.ImageIcon;

// @author Paxton.Clark
// ChatGPT assistance with multithreadding (cloud movement)

public class MarioMain extends JFrame implements KeyListener{
    
    JFrame frame = new JFrame();
    JPanel ground = new JPanel();
    JPanel sky = new JPanel();
    JLabel label = new JLabel();
   
    
    public MarioMain(){
        
        
        frame.setTitle("MarioGame");          
        frame.setSize(500, 500);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);                
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        frame.addKeyListener(this);
        label.addKeyListener(this);
        
        sky.setBackground(new Color(130, 203, 251));
        sky.setBounds(0, 0, 500, 380);
        sky.setLayout(null);
        
        ImageIcon grassIcon = new ImageIcon("C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Documents\\NetBeansProjects\\HOWTO_JavaGUI\\src\\main\\java\\Mario\\Grass.png");
        Image grassImage = grassIcon.getImage().getScaledInstance(500, 220, Image.SCALE_SMOOTH);
        ImageIcon scaledGrass = new ImageIcon(grassImage);
        JLabel grassLabel = new JLabel(scaledGrass);
        grassLabel.setSize(500, 220);
        
        ImageIcon cloudIcon0 = new ImageIcon("C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Documents\\NetBeansProjects\\HOWTO_JavaGUI\\src\\main\\java\\Mario\\Cloud0.png");
        Image cloudimage0 = cloudIcon0.getImage().getScaledInstance(56, 56, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon0 = new ImageIcon(cloudimage0);
        JLabel cloud0 = new JLabel(scaledIcon0);
        cloud0.setBounds(30, 30, 56, 56);
        
        ImageIcon cloudIcon1 = new ImageIcon("C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Documents\\NetBeansProjects\\HOWTO_JavaGUI\\src\\main\\java\\Mario\\Cloud1.png");
        Image cloudimage1 = cloudIcon1.getImage().getScaledInstance(46, 46, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon(cloudimage1);
        JLabel cloud1 = new JLabel(scaledIcon1);
        cloud1.setBounds(300, 100, 46, 46);

        ground.setBackground(new Color(112, 189, 82));
        ground.setBounds(0, 300, 500, 220);
        
        label.setBounds(2, 360, 20, 20);
        label.setBackground(Color.red);
        label.setOpaque(true);
        
        sky.add(cloud0);
        sky.add(cloud1);
        ground.add(grassLabel);
        frame.add(label);
        frame.add(sky);
        frame.add(ground);
        frame.setVisible(true);
        
        new Thread(() -> {
            while (true) {
                if(label.getY() >= 360){
                    label.setLocation(label.getX(), 360);
                }
                else if(label.getY() < 360){
                    label.setLocation(label.getX(), label.getY() + 1);
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        
        new Thread(() -> {
            while (true) {
                if(cloud0.getX() < -5){
                    cloud0.setLocation(500, 30);
                }
                cloud0.setLocation(cloud0.getX() - 3, cloud0.getY());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        
        new Thread(() -> {
            while (true) {
                if(cloud1.getX() < -5){
                    cloud1.setLocation(500, 100);
                }
                cloud1.setLocation(cloud1.getX() - 3, cloud1.getY());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()){
            case 'a': 
                if(label.getX() > 0){
                    label.setLocation(label.getX()-20, label.getY());
                }else if (label.getX() == 0){
                    
                }else if (label.getX() < 0){
                    label.setLocation(0, label.getY());
                }
                break;
            case 'd': 
                if(label.getX() < 465){
                    label.setLocation(label.getX()+20, label.getY());
                }else if (label.getX() == 465){
                    
                }else if (label.getX() > 465){
                    label.setLocation(465, label.getY());
                }
                break;
            case 'w': 
                for (int i = 0; i == 20; i++){
                    label.setLocation(label.getX(), label.getY()-5);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }   
                }
                break;
            case 's': label.setLocation(label.getX(), label.getY()+10);
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        switch(e.getKeyCode()){
            case 37: label.setLocation(label.getX()-20, label.getY());
                break;
            case 39: label.setLocation(label.getX()+20, label.getY());
                break;
            case 38: label.setLocation(label.getX(), label.getY()-10);
                break;
            case 40: label.setLocation(label.getX(), label.getY()+10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    
}