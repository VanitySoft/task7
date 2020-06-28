package com.iain.task7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.junit.Assert;
import org.junit.Test;
 
 
/**
 * Stackoverflow is your friend.
 * 
 * https://stackoverflow.com/questions/1625234/how-to-append-text-to-an-existing-file-in-java
 * @author twoen
 *
 */
public class FileAppendExampleTest {

	@Test
	public void AppendText() {
		try {
			String appendThisText =  "The Text To Append";
			
			//create a new file before appending, of it exists just use the existing file
			new File("myfile.txt").createNewFile();
			
		    Files.write(Paths.get("myfile.txt"), appendThisText.getBytes(), StandardOpenOption.APPEND);
		    
		    Assert.assertTrue( new File("myfile.txt").canRead());
		}catch (IOException e) {
		    e.printStackTrace();
			Assert.fail();
		}
	}
}
