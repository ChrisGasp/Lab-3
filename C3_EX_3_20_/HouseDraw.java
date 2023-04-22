package C3_EX_3_20_;
import javax.swing.*;
import java.awt.*;

public class HouseDraw extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;


        /*
         * Took me a while, but I did it!
         * */
        House H1 = new House(200, 200, 5);
        House H2 = new House(350, 350, 2);
        House H3 = new House(100, 100, 3);

        for (int x = 0; x < 4; x++)
        {
            g2.draw(H1.getRect(x));
            g2.draw(H2.getRect(x));
            g2.draw(H3.getRect(x));
        }
    }
}
