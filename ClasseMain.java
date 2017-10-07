
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ClasseMain extends JFrame{
    
    ClasseSec classe1 = new ClasseSec();
    
    JButton botao = new JButton("Click");
    
    public ClasseMain(){
        Janela();
        classe1.getWindows();
    }
    
    public void Janela(){
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        BotaoConfig();
    }
    
    public void BotaoConfig(){
        botao.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                classe1.dispose();
            }
            
        });
        add(botao);
    }
    
    public static void main(String[] args) {
        new ClasseMain();
    }
    
}
