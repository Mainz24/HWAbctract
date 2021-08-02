package HWAbctract;

public class Main {
    public static void main (String[] args) {

        SupplierReader supplierReader = new SupplierReader("Petr");
        LibrarianAdministrator librarianAdministrator = new LibrarianAdministrator("Elena");

        supplierReader.bringBook(librarianAdministrator);
        supplierReader.returnBook(librarianAdministrator);

        librarianAdministrator.orderBook(supplierReader);
        librarianAdministrator.overdueNotification(supplierReader);
    }
}
