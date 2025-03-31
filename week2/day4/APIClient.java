package week2.day4;

public class APIClient {

	public void sendRequest(String endpoint)
	{
		System.out.println("---Output of single Argument---");
		System.out.println("Endpoint of single argument: " + endpoint);
	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("\n" + "---Outputs of Multiple Arguments---");
		System.out.println("Endpoint : " + endpoint);
		System.out.println("Request Body : " + requestBody);
		System.out.println("Request Status : " + requestStatus);
	}
	
	public static void main(String[] args) {
		
		APIClient obj = new APIClient();
		obj.sendRequest("Endpoint is Z");
		obj.sendRequest("Endpoint of Multi args", "Request body of Multi args", false);

	}

}
