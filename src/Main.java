import java.util.logging.Level;
import java.util.logging.*;
import javax.sound.midi.*;



public class Main {
    public static void main(String[] args){
        int notes[][] = {{470, 81}, {230, 80}, {470, 81}, {250, -1}, {230, 80}, {470, 81}, {230, 69}, {230, 76}, {470, 81}, {230, 69}, {470, 74}, {470, 73}, {470, 74}, {470, 76}, {470, 73}, {470, 71}, {970, -1}, {230, 69}, {230, 68}, {470, 69}, {730, -1}, {230, 64}, {230, 69}, {230, 71}, {470, 73}, {970, -1}, {230, 73}, {230, 74}, {470, 76}, {730, -1}, {230, 69}, {230, 74}, {230, 73}, {470, 71}, {1450, -1}, {470, 81}, {230, 80}, {470, 81}, {250, -1}, {230, 80}, {470, 81}, {230, 69}, {230, 76}, {470, 81}, {230, 69}, {470, 74}, {470, 73}, {470, 74}, {470, 76}, {470, 73}, {470, 71}, {970, -1}, {230, 69}, {230, 68}, {470, 69}, {730, -1}, {230, 64}, {230, 69}, {230, 71}, {470, 73}, {970, -1}, {230, 73}, {230, 74}, {470, 76}, {730, -1}, {230, 69}, {230, 74}, {230, 73}, {470, 71}, {250, -1}};
        Player player = new Player();
        for (int[] note : notes) {
            if (note[1] != -1) {
                player.playSound(0, note[0], 80, note[1]);
            } else {
                try {
                    Thread.sleep(note[0]);
                } catch (InterruptedException ex) {
//                    Logger.getLogger(Music.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
            }
        }
        player.close();

//Player player = new Player();
//       player.playSound(0, 1000, 80, 69, 72, 76);
//       player.playSound(0, 1000, 80, 69, 74, 77);
//       player.playSound(0, 1000, 80, 67, 71, 74);
//       player.playSound(0, 1000, 80, 67, 72, 76);
//    player.close();
    }
}

