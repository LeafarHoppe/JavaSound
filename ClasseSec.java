
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

public class ClasseSec extends JFrame{
    
    
    public ClasseSec(){
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        init();
    }
    
    String filename = "Smooth.wav";
    
    AudioInputStream sample;
    
    private URL getURL(String filename){
        URL url = null;
        try{
            url = this.getClass().getResource(filename);
        }catch(Exception e){}
        return url;
    }
    
    
    public void init(){
        try{
            sample = AudioSystem.getAudioInputStream(getURL(filename));
            Clip clip = AudioSystem.getClip();
            clip.open(sample);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            
        }catch(MalformedURLException e){
        }catch(LineUnavailableException e){
        }catch(UnsupportedAudioFileException e){
        }catch(Exception e){}
    }
    
    
}
