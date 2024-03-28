package interview;//REMEMBER TO CHANGE THIS PACKAGE ACCORDINGLY

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

public class UploadPic {
	public static void uploadPic(String filePath) throws AWTException {
		// example of file path :String file="C:\\Users\\chaut\\OneDrive\\Desktop\\toan\\minh.docx";

		

		Robot robot=new Robot();

		robot.delay(1000);

		StringSelection s=new StringSelection(filePath);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);

		robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);

		robot.keyPress(java.awt.event.KeyEvent.VK_V);

		robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);

		robot.keyRelease(java.awt.event.KeyEvent.VK_V);

		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);

		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
		
		
		
	}

}
