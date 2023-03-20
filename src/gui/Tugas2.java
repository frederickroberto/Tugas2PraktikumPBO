/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import gui.Balok;
import gui.PersegiPanjang;
/**
 *
 * @author ASUS
 */
public class Tugas2 extends JFrame implements ActionListener {
    JLabel judul = new JLabel("KALKULATOR BALOK");
    
    JLabel lpanjang = new JLabel("Panjang");
    JTextField textpanjang = new JTextField(15);
    JLabel llebar = new JLabel("Lebar");
    JTextField textlebar = new JTextField(15);
    JLabel ltinggi = new JLabel("Tinggi");
    JTextField texttinggi = new JTextField(15);
    
    JLabel result = new JLabel("Result");
    JLabel luas = new JLabel();
    JLabel keliling = new JLabel();
    JLabel luas_permukaan = new JLabel();
    JLabel volume = new JLabel();
    
    JButton btnCount = new JButton("Count");
    JButton btnReset = new JButton("Reset");
    
    public Tugas2(){
        setTitle("Kalkulator Balok");
        setSize(350,400);
        setLayout(null);
        
        add(judul);
        add(lpanjang);
        add(textpanjang);
        add(llebar);
        add(textlebar);
        add(ltinggi);
        add(texttinggi);
        
        add(result);
        add(luas);
        add(keliling);
        add(luas_permukaan);
        add(volume);
        
        add(btnCount);
        add(btnReset);
        
        judul.setBounds(110,5,130,25);
        lpanjang.setBounds(20,40,100,20);
        textpanjang.setBounds(130,40,100,20);
        llebar.setBounds(20,65,100,20);
        textlebar.setBounds(130,65,100,20);
        ltinggi.setBounds(20,90,100,20);
        texttinggi.setBounds(130,90,100,20);
        
        result.setBounds(155,135,100,20);
        luas.setBounds(20,160,200,20);
        keliling.setBounds(20,185,200,20);
        luas_permukaan.setBounds(20,210,200,20);
        volume.setBounds(20,235,200,20);
        
        btnCount.setBounds(90,115,80,20);
        btnReset.setBounds(180,115,80,20);
        
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        btnCount.addActionListener(this);
        btnReset.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int panjang, lebar, tinggi;
    if(e.getSource()==btnCount){
        if(textpanjang.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Tidak Boleh Kosong");
        }else if(textlebar.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Tidak Boleh Kosong");
        }else if(texttinggi.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Tidak Boleh Kosong");
        }else{
            try{
                panjang = Integer.parseInt(textpanjang.getText());
                lebar = Integer.parseInt(textlebar.getText());
                tinggi = Integer.parseInt(texttinggi.getText());
                
                Balok balok = new Balok(tinggi, panjang, lebar);
                
                balok.setPanjang(panjang);
                balok.setLebar(lebar);
                balok.setTinggi(tinggi);
               
                luas.setText("Luas PersegiPanjang : " +balok.luas());
                keliling.setText("Keliling PersegiPanjang  : " + balok.keliling());
                luas_permukaan.setText("Luas Permukaan Balok : " + balok.luaspermukaan());
                volume.setText("Volume Balok : " + balok.volume());
                
            }catch(NumberFormatException err){
                JOptionPane.showMessageDialog(this,"Silahkan Isi Menggunakan Angka");
            }
        }
    }
    if(e.getSource()==btnReset){
        textpanjang.setText("");
        textlebar.setText("");
        texttinggi.setText("");
        luas.setText("");
        keliling.setText("");
        luas_permukaan.setText("");
        volume.setText("");
        
    }
    }
    
}
