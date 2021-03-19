package testeJframe;
import javax.swing.JFrame;
        
public class janela extends JFrame {
    public janela ( String titulo){
        super(titulo);
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
                }
}
