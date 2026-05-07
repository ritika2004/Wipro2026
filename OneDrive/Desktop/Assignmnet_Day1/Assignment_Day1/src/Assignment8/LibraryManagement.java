package Assignment8;

import java.util.*;

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book b = (Book) obj;
        return title.equals(b.title);
        
    }
    public int hashCode() {
        return Objects.hash(title);
    }

  
    public String toString() {
        return title;
    }
}

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Map<Book, Boolean> library = new HashMap<>();

        Book b1 = new Book("Java Basics");
        Book b2 = new Book("Python Guide");

        library.put(b1, true);
        library.put(b2, true);

   
        if (library.get(b1)) {
            library.put(b1, false);
            System.out.println(b1 + " issued.");
        }


        for (Map.Entry<Book, Boolean> entry : library.entrySet()) {
            System.out.println(entry.getKey() + " Available: " + entry.getValue());
        }


	}

}
