import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class AutoLoginVPN {
    public static void main(String[] args) {
        try {
            //delay between every click on enter (if your computer is slow make it high!)
            long sleepMillis = 5000;
            String username = "max.mustermann@bechtle.com";
            String password = "ThisIsAPassword!";
            String pathToAnyConnect = "/Applications/Cisco/Cisco AnyConnect Secure Mobility Client.app";

            Robot clickRobot = new Robot();
            int[] enterInArray = {KeyEvent.VK_ENTER};
            Desktop.getDesktop().open(new java.io.File(pathToAnyConnect));
            //AnyConnect opens normally faster
            Thread.sleep(sleepMillis/2);
            //click enter
            specificKeyClicker(clickRobot, enterInArray);
            Thread.sleep(sleepMillis);
            //type username
            typeText(clickRobot, username);
            //click enter
            specificKeyClicker(clickRobot, enterInArray);
            Thread.sleep(sleepMillis);
            //type password
            typeText(clickRobot, password);
            //click enter
            specificKeyClicker(clickRobot, enterInArray);
        } catch (AWTException | InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for clicking (press & release)
     * @param clickRobot
     * @param keyEvent (as int)
     */
    private static void specificKeyClicker(Robot clickRobot, int[] keyEvent) {
        for (int key : keyEvent) {
            clickRobot.keyPress(key);
        }
        for (int key : keyEvent) {
            clickRobot.keyRelease(key);
        }
    }

    private static void typeText(Robot clickRobot, String text) {
        for (char c : text.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                if (Character.isUpperCase(c)) {
                    int[] keys = {KeyEvent.VK_SHIFT, KeyEvent.getExtendedKeyCodeForChar(c)};
                    specificKeyClicker(clickRobot, keys);
                } else {
                    int[] keys = {KeyEvent.getExtendedKeyCodeForChar(c)};
                    specificKeyClicker(clickRobot, keys);
                }
            } else {
                int[] keys = {KeyEvent.getExtendedKeyCodeForChar(c)};
                specificKeyClicker(clickRobot, keys);
                if (c == '@') {
                    int[] specialChars = {KeyEvent.VK_ALT, KeyEvent.VK_L};
                    specificKeyClicker(clickRobot, specialChars);
                }
                if (c == '!') {
                    int[] specialChars = {KeyEvent.VK_SHIFT, KeyEvent.VK_1};
                    specificKeyClicker(clickRobot, specialChars);
                }
                if (c == '"') {
                    int[] specialChars = {KeyEvent.VK_SHIFT, KeyEvent.VK_2};
                    specificKeyClicker(clickRobot, specialChars);
                }
                if (c == '§') {
                    int[] specialChars = {KeyEvent.VK_SHIFT, KeyEvent.VK_3};
                    specificKeyClicker(clickRobot, specialChars);
                }
                if (c == '$') {
                    int[] specialChars = {KeyEvent.VK_SHIFT, KeyEvent.VK_4};
                    specificKeyClicker(clickRobot, specialChars);
                }
                if (c == '%') {
                    int[] specialChars = {KeyEvent.VK_SHIFT, KeyEvent.VK_5};
                    specificKeyClicker(clickRobot, specialChars);
                }
                if (c == '&') {
                    int[] specialChars = {KeyEvent.VK_SHIFT, KeyEvent.VK_6};
                    specificKeyClicker(clickRobot, specialChars);
                }
                if (c == '/') {
                    int[] specialChars = {KeyEvent.VK_SHIFT, KeyEvent.VK_7};
                    specificKeyClicker(clickRobot, specialChars);
                }
                if (c == '(') {
                    int[] specialChars = {KeyEvent.VK_SHIFT, KeyEvent.VK_8};
                    specificKeyClicker(clickRobot, specialChars);
                }
                if (c == ')') {
                    int[] specialChars = {KeyEvent.VK_SHIFT, KeyEvent.VK_9};
                    specificKeyClicker(clickRobot, specialChars);
                }
                if (c == '=') {
                    int[] specialChars = {KeyEvent.VK_SHIFT, KeyEvent.VK_0};
                    specificKeyClicker(clickRobot, specialChars);
                }
            }
        }
    }
}

