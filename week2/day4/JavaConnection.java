package week2.day4;

public class JavaConnection extends MySqlConnection implements DatabaseConnection{

	@Override
	public void connect() {
		System.out.println("Database Connected");
	}

	@Override
	public void disconnect() {
		System.out.println("Database got disconnected");
	}

	@Override
	public void executeUpdate() {
		System.out.println("Query Update execeuted");
	}
	
	public static void main(String[] args) {
		JavaConnection db = new JavaConnection();
		db.connect();
		db.disconnect();
		db.executeUpdate();
		db.executeQuery();
	}

}
