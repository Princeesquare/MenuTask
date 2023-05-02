import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuTask extends JFrame implements ActionListener{
    private JMenuBar menuBar = new JMenuBar();
    private JMenu File, save,edit;
    private JMenuItem copy,paste,New,saveop,saveas,exit;
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

        edit=new JMenu("Edit");
        copy=new JMenuItem("Copy");
        edit.add(copy);
        paste = new JMenuItem("Paste");
        edit.add(paste);
        menuBar.add(edit);


        add(menuBar);

        exit.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==exit)
        {
            dispose();
        }
        if (e.getSource() == copy)
            JOptionPane.showMessageDialog(this, "Copied to Clipboard");
        else if (e.getSource() == paste)
            JOptionPane.showMessageDialog(this, "Pasted");
    }
}