package C3_EX_3_20_;
import java.awt.*;
class House
{
    private final int x;
    private final int y;
    private final int size;

    private Rectangle[] Rects = new Rectangle[4];

    public House(int X, int Y, int Size)
    {
        x = X;
        y = Y;
        size = Size;
        Rects[0] = new Rectangle(x, y, 20 * size, 10 * size);
        Rects[1] = new Rectangle(x, y - (2 * size), 20 * size, 2 * size);
        Rects[2] = new Rectangle(x + (15 * size), y - (7 * size), 2 * size, 5 * size);
        Rects[3] = new Rectangle(x + (2 * size), y + (5 * size), 3 * size, 5 *size);
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public int getSize()
    {
        return size;
    }
    public Rectangle getRect(int index)
    {
        return Rects[index];
    }
}
