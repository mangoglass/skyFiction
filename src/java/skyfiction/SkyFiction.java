
/*
 * This project is licensed under the second version of the Apache license.
 * More information about this license can be found here: http://www.apache.org/licenses/LICENSE-2.0
 */

package java.skyfiction;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.ScalableGame;


/**
 * This class handles the starting of the game.
 * @author Admin
 * @version 11.17.2015
 */
public class SkyFiction extends StateBasedGame {
    
    private static final String settingsRef = "data/settings.ini";



    private static final int pseudoWidth = 1920;       // The games pseudo width
    private static final int pseudoHeight = 1080;      // The games pseudo height

    public static AppGameContainer app;
    public static AppGameContainer scalable;    // To make a scalable window

    public static final int SPLASH = 0;
    public static final int MENU = 1;
    public static final int GAME = 2;
    
    public static SkyFiction skyFiction;

    /**
     * The main method of the skyFiction project.
     * @param args the command line arguments
     */
    public static void main(String[] args)
            throws SlickException {
        skyFiction = new SkyFiction("SkyFiction");
        app = new AppGameContainer(new ScalableGame(skyFiction, pseudoWidth, pseudoHeight, false));
    }

    /**
     * Creates a SkyFiction object. The main game object.
     * @param name The String name of the project
     */
    public SkyFiction(String name)
    {
        super(name);
        this.addState(new SplashState(SPLASH));
        this.addState(new MenuState(MENU));
        this.addState(new GameState(GAME));
    }

    @Override
    public void initStatesList(GameContainer container) throws SlickException
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * Returns the pseudo Width of the window that the game elements will be using as render positions.
     * @return Integer representing the pseudo width.
     */
    public static int getPseudoWidth()
    {
        return pseudoWidth;
    }
    /**
     * Returns the pseudo pseudoHeight of the window that the game elements will be using as render positions.
     * @return Integer representing the height.
     */
    public static int getPseudoHeight()
    {
        return pseudoHeight;
    }
}
