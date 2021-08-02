package HWAbctract;

public class SupplierReader extends User implements Supplier, Reader {
    public SupplierReader(String name){
        super(name);
    }

    @Override
    public void takeBook(Administrator administrator) {
        System.out.println("Читатель " + getName() + " взял книгу у администратора " + administrator);
    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println("Читатель " + getName() + " отдал книгу администратору " + administrator);
    }

    @Override
    public void bringBook(Librarian librerian) {
        System.out.println("Поставщик " + getName() + " привез книги " + librerian);
    }
}
