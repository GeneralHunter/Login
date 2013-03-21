package SecureLogin;
import java.io.*;

public class Key {
	
	
	public static String loadKey(String[] args) {
		
		String accessKey = "";
		File accessKeyFile = new File("/SecureLogin/AccessKey");
		
		try {
			
			if (accessKeyFile.exists()) {
				
				accessKeyFile.createNewFile();
			}
			
			BufferedReader readAccessKey = new BufferedReader(new FileReader(accessKeyFile));
			
			accessKey = readAccessKey.readLine();
			readAccessKey.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return accessKey;
	}
}