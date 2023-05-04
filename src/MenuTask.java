import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class
MenuTask extends JFrame implements ActionListener{
    private final JMenuItem copy;
    private final JMenuItem paste;
    private final JMenuItem New;
    private final JMenuItem saveop;
    private final JMenuItem saveas;
    private final JMenuItem exit;
    public MenuTask()
    {
        setSize(400,200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Menu Task");

        JMenu file = new JMenu("File");
        New=new JMenuItem("New");
        file.add(New);
        file.addSeparator();

        JMenu save = new JMenu("Save");
        ImageIcon ic=new ImageIcon(new ImageIcon("save.JPG").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        save.setIcon(ic);
        saveop=new JMenuItem("Save");
        save.add(saveop);
        saveas = new JMenuItem("Save as");
        save.add(saveas);
        file.add(save);
        file.addSeparator();


        exit=new JMenuItem("Exit");
        file.add(exit);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(file);


        JMenu space = new JMenu(" ");
        menuBar.add(space);

        JMenu edit = new JMenu("Edit");
        copy=new JMenuItem("Copy");
        edit.add(copy);
        paste = new JMenuItem("Paste");
        edit.add(paste);
        menuBar.add(edit);
        edit.setBounds(20, 100, 20, 20);


        add(menuBar);
        New.addActionListener(this);
        saveop.addActionListener(this);
        saveas.addActionListener(this);
        exit.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== New)
            JOptionPane.showMessageDialog(this, "New File Opened Successfully");
        if(e.getSource()== saveas)
            JOptionPane.showMessageDialog(this, "Save file as");
        if(e.getSource()== saveop)
            JOptionPane.showMessageDialog(this, "File Saved Successfully");
        if(e.getSource()==exit)
            dispose();
        if (e.getSource() == copy)
            JOptionPane.showMessageDialog(this, "Copied to Clipboard");
        else if (e.getSource() == paste)
            JOptionPane.showMessageDialog(this, "Pasted");
    }
}