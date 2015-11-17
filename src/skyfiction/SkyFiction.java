/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skyfiction;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;


/**
 * This class handles the starting of the game.
 * @author Admin
 * @version 11.17.2015
 */
public class SkyFiction extends StateBasedGame {
    
    private static final String settingsRef = "data/settings.ini";
    public static final int width = 1920; //        The games "width". Rendering something at 1920 in the x-axis will put it to the farthest right.
    public static final int height = 1080; //       The games "height". Rendering something at 1080 in the y-axis will put it to the lowest bottom.
    public static AppGameContainer app;
    public static AppGameContainer scalable; //     Scaleable window.
    public static final int SPLASH = 0;
    public static final int MENU = 1;
    public static final int GAME = 2;
    
    public static SkyFiction skyFiction;

    /**
     * The main method of the skyFiction project.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        skyFiction = new SkyFiction("SkyFiction");
    }

    /**
     * Creates a SkyFiction object. The main game object.
     * @param name
     */
    public SkyFiction(String name) {
        super(name);
    }

    @Override
    public void initStatesList(GameContainer container) throws SlickException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
