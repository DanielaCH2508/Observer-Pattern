/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tonny
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class VentanaBoton extends JFrame implements Observer, ActionListener {

    JLabel titulo;
    int colorSeleccionado;
    JButton boton;
    ClaseObservador miObservador;

    public VentanaBoton(ClaseObservador observador) {

        miObservador = observador;
        boton = new JButton();
        boton.setBounds(40, 60, 100, 25);
        boton.addActionListener(this);
        titulo = new JLabel();
        titulo.setText("BOTON COLORES");
        titulo.setBounds(20, 10, 150, 25);

        add(titulo);
        add(boton);

        setSize(200, 200);
        setTitle("Ventana Color");
        setLocation(295,100);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        colorSeleccionado = miObservador.getColorSeleccionado();

        switch (colorSeleccionado) {

            case 1:
                boton.setBackground(Color.yellow);
                break;
            case 2:
                boton.setBackground(Color.blue);
                break;

            case 3:
                boton.setBackground(Color.red);
                break;

            case 4:
                boton.setBackground(Color.green);
                break;

            case 5:
                boton.setBackground(Color.black);
                break;
            case 6:
                boton.setBackground(Color.white);
                break;

            default:
                boton.setBackground(null);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
