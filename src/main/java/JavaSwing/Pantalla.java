package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pantalla extends JFrame implements ActionListener{
    public JPanel panel1;
    public  JButton boton1;

    JTextField texto;

    public JLabel saludo;

    public String nombre;

    public Pantalla(String nombre) throws HeadlessException {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Pantalla(){


        this.setSize(500,500);
        setTitle("Hola mundo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(Color.BLUE);
        this.getContentPane().add(panel1);

        JLabel etiqueta = new JLabel("INGRESE NOMBRE",SwingConstants.CENTER);
        etiqueta.setSize(200,200);
        etiqueta.setLocation(150,5);
        etiqueta.setOpaque(false);
        etiqueta.setBackground(Color.WHITE);
        etiqueta.setFont(new Font("chiller",Font.BOLD,30));
        panel1.add(etiqueta);

        CajaDeTexto();
        nombre=texto.getText();

        boton1 = new JButton();
        boton1.setText("click");
        boton1.setBounds(200,200,100,50);
        boton1.setMnemonic('c');
        panel1.add(boton1);


        boton1.addActionListener(this);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            Pantalla2 secundaria = new Pantalla2(this,true);
            secundaria.setVisible(true);

        }
    }

    public void CajaDeTexto(){
        texto= new JTextField();
        texto.setBounds(150,150,200,30);

        panel1.add(texto);

    }
/*
        String nombre=cajatexto.getText();
        Mostrar.setText("Hola mundo "+nombre);
*/


}