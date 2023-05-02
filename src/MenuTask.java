import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuTask extends JFrame implements ActionListener{
    private JMenuBar menuBar = new JMenuBar();
    private JMenu File, save,menu2, menu3;
    private JMenuItem menu2Item,New,saveop,saveas,exit, menu3Item;
    public MenuTask()
    {
        setSize(400,200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        File=new JMenu("File");
        New=new JMenuItem("New");
        File.add(New);
        File.addSeparator();

       /* save=new JMenuItem("Save");
        ImageIcon ic=new ImageIcon(new ImageIcon("save.JPG").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        save.setIcon(ic);
        File.add(save);
        File.addSeparator();*/

        save =new JMenu("Save");
        ImageIcon ic=new ImageIcon(new ImageIcon("save.JPG").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        save.setIcon(ic);
        saveop=new JMenuItem("Save");
        save.add(saveop);
        saveas = new JMenuItem("Save as");
        save.add(saveas);
        File.add(save);
        File.addSeparator();

        exit=new JMenuItem("Exit");
        File.add(exit);
        menuBar.add(File);

        menu2=new JMenu("Menu2 Options");
        menu2Item=new JMenuItem("Show the second Form");
        menu2.add(menu2Item);
        menuBar.add(menu2);
        menu2.addSeparator();

        menu3 = new JMenu("My Own Menu");
        menu3Item = new JMenuItem("See My name");
        menu3.add(menu3Item);
        menu3.addSeparator();
        menuBar.add(menu3);

        add(menuBar);

        menu3Item.addActionListener(this);
        exitItem.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==exitItem)
        {
            dispose();
        }
        if(e.getSource() == menu3Item)
            JOptionPane.showMessageDialog(null, "My Name is Prince Emmanuel");
    }
}