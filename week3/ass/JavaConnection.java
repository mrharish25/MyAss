package week3.ass;

public class JavaConnection extends DatabaseConnection{
	  public void connect() {
	        System.out.println("Connected to the database.");  
	    }
	    public void disconnect() {
	        System.out.println("Disconnected from the database.");
	        
	    }
	    public void executeUpdate() {
	        System.out.println("Executing an updates");

}
	    public static void main(String[] args) {
    JavaConnection conn=new JavaConnection();
 
    conn.connect();
    conn.executeUpdate();
    conn.disconnect();
}
}