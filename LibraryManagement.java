import java.util.Scanner;

class LibraryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== LIBRARY MANAGEMENT SYSTEM =====");

        System.out.print("Enter Book ID: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String bookName = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Student Name: ");
        String student = sc.nextLine();

        System.out.print("Do you want to issue the book? (yes/no): ");
        String choice = sc.nextLine();

        String status;

        if (choice.equalsIgnoreCase("yes")) {
            status = "Issued";
        } else {
            status = "Available";
            student = "None";
        }

        System.out.println("\n===== BOOK DETAILS =====");
        System.out.println("Book ID       : " + bookId);
        System.out.println("Book Name     : " + bookName);
        System.out.println("Author Name   : " + author);
        System.out.println("Student Name  : " + student);
        System.out.println("Book Status   : " + status);

        sc.close();
    }
}
