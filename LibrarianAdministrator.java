package HWAbctract;

public class LibrarianAdministrator extends User implements Librarian, Administrator {
    public LibrarianAdministrator(String name) {
        super(name);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администартор " + getName() + " предупредил " +  reader);
    }

    @Override
    public void orderBook(Supplier supplier) {
        System.out.println("Библиотекарь " + getName() + " заказал кники у " +  supplier);
    }

    @Override
    public void receiveBook(Supplier supplier) {
        System.out.println("Библиотекарь " + getName() + " получил от " +  supplier);
    }
}
