import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DortIslem extends JFrame implements ActionListener {

    JButton jToplama, jCikarma, jBolme, jCarpma;
    JTextField jtfield1, jtfield2;
    JLabel lbl1, lbl2, lblSonuc;

    DortIslem() {

        lbl1 = new JLabel("Sayı 1");
        lbl1.setBounds(10,15,150,30);
        add(lbl1);

        jtfield1 = new JTextField();
        jtfield1.setBounds(10, 50, 150, 25);
        add(jtfield1);

        lbl2 = new JLabel("Sayı 2");
        lbl2.setBounds(10,80,150,30);
        add(lbl2);

        jtfield2 = new JTextField();
        jtfield2.setBounds(10, 110, 150, 25);
        add(jtfield2);

        lblSonuc = new JLabel("Sonuç :");
        lblSonuc.setBounds(10, 150, 150, 30);
        add(lblSonuc);

        jToplama = new JButton("+");
        jToplama.setBounds(200, 50, 50, 30);
        add(jToplama);

        jCikarma = new JButton("-");
        jCikarma.setBounds(250, 50, 50, 30);
        add(jCikarma);

        jCarpma = new JButton("*");
        jCarpma.setBounds(250, 100, 50, 30);
        add(jCarpma);

        jBolme = new JButton("/");
        jBolme.setBounds(200, 100, 50, 30);
        add(jBolme);


        jToplama.addActionListener(this);
        jCikarma.addActionListener(this);
        jCarpma.addActionListener(this);
        jBolme.addActionListener(this);

        setLayout(null);
        setSize(350, 250);
        setVisible(true);
        setDefaultCloseOperation(3);
    }



    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(jtfield1.getText());
        int b = Integer.parseInt(jtfield2.getText());
        int c = 0;

        if (e.getSource().equals(jToplama)) {
            c = a + b;
            lblSonuc.setText(String.valueOf(c));
        } else if (e.getSource().equals(jCikarma)) {
            c = a - b;
            lblSonuc.setText(String.valueOf(c));
        } else if (e.getSource().equals(jCarpma)) {
            c = a * b;
            lblSonuc.setText(String.valueOf(c));
        } else if (e.getSource().equals(jBolme)) {
            c = a / b;
            lblSonuc.setText(String.valueOf(c));
        }
    }


}