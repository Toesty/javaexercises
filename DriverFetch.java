public class DriverFetch {

	public static void main(String[] args) {
        try {
                String result = Fetch.getHTML("Hello.text");
                System.out.println(result);
        } catch (Exception ex) {
                ex.printStackTrace();
        }
	}
}