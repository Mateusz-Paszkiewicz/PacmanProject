package pacman;

import javax.swing.JFrame;

public class Main extends JFrame{

    public Main(){
        add(new Game());
    }


    public static void main(String[] args){
        Main pac = new Main();
        pac.setVisible(true);
        pac.setTitle("Pacman");
        pac.setSize(424,496);
        pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pac.setLocationRelativeTo(null);

    }

}