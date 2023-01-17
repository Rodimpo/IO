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

    public void saveComponent() throws IOException
    {
        FileOutputStream fileOut = new FileOutputStream("../savedChar.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(character);
        out.close();
        fileOut.close();
    }

    public void loadComponent() throws IOException, ClassNotFoundException
    {
        FileInputStream fileIn = new FileInputStream("../savedCalk.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        createCharacter();= (Character) in.readObject();
        in.close();
        fileIn.close();
    }
    public void createCharacter(int s,int a, int m, int i, int h)
    {
        int intelligence = i;
        int strength = s;
        int magic = m;
        int agility = a;
        int hp = h;
        Weapon baseWeapon = new Weapon("Base",dagger);
    }

    public static void main(String[] args)
    {
        Main ebe = new Main();
    }
}