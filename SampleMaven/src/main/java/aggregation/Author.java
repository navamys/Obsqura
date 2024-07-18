package aggregation;

public class Author {
	String authorname;
	int age;
	Book b;
	public Author(String authorname,int age,Book b) {
		this.authorname=authorname;
		this.age=age;
		this.b=b;	
	}
	public void printtext() {
		System.out.println(authorname);
		System.out.println(age);
		System.out.println(b.bookname);
		System.out.println(b.edition);
		System.out.println(b.pages);
	}

	public static void main(String[] args) {
		Book obj2=new Book("Randamoozham",500,3);
		Author obj1=new Author("MT Vasudevan",65,obj2);
		obj1.printtext();
	}

}
