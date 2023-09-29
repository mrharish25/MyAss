package week3.day1;

public class Chrome extends Browser {
	
	public void openIncognito() {
	System.out.println("openIncognito");
	}
	public void clearCache() {
		System.out.println("clearCache");
		}	
	public static void main(String[] args) {
		Chrome dd=new Chrome();
		System.out.println(dd.browserName);
		System.out.println(dd.browserVersion);
		dd.openURL();
		dd.closeBrowser();
		dd.navigateBack();
		dd.openIncognito();
		dd.clearCache();
	}
	}

