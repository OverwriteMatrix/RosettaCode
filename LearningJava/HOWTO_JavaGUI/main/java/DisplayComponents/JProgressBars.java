package DisplayComponents;

// @author Paxton.Clark

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

public class JProgressBars {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    public JProgressBars() {

        bar.setBounds(0, 0, 300, 50);
        bar.setStringPainted(true);     // Adds percentage to progress bar
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(325, 100);
        frame.setLayout(null);
        frame.setVisible(true);

        // Run the progress bar filling in a separate thread
        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                int counter = 0;
                while(counter <= 100){
                    publish(counter);  // Publish current progress to update on the UI thread
                    Thread.sleep(100); // Simulate work being done
                    counter += 1;
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                // Update the progress bar based on the current progress value
                bar.setValue(chunks.get(chunks.size() - 1));
            }

            @Override
            protected void done() {
                // This method runs once the task completes
                bar.setString("Done!");  // Update string on the progress bar (not working)
                exit();  // Call exit after progress bar is done
            }
        };

        worker.execute();  // Start the SwingWorker
    }

    // Exit method to dispose the JFrame after a delay
    void exit() {
        try {
            Thread.sleep(2000); // Wait for 2 seconds before closing the frame
        } catch (InterruptedException ex) {
            System.out.println("Interrupted Exception: " + ex);
        }
        frame.dispose(); // Dispose of the JFrame and close the window
    }
}
