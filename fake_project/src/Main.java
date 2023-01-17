import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class Main
{
    JFrame frame;
    Main()
    {
        frame = new JFrame();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(1000,1000);

    }

    public void loadComponent() throws IOException, ClassNotFoundException
    {
        FileInputStream fileIn = new FileInputStream("../savedCalk.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        createCharacter();= (Character) in.readObject();
        in.close();
        fileIn.close();
    }

    public static void main(String[] args)
    {
        Main ebe = new Main();
    }
}