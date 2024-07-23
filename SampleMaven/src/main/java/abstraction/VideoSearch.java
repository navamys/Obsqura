package abstraction;

public class VideoSearch extends Google{
	public void search() {
		System.out.println("Searching for video");
	}

	public static void main(String[] args) {
		VideoSearch obj1=new VideoSearch();
		obj1.search();
		ImageSearch obj2=new ImageSearch();
		obj2.search();

	}

}
