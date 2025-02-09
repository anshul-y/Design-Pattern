package pattern.structural.proxy;


interface Database {
    void executeDatabase(String query) throws Exception;
}

class DatabaseImp implements Database {

    @Override
    public void executeDatabase(String query) throws Exception {
        System.out.println("query executed: " + query);
    }
}

class DatabaseProxy implements Database{
    private boolean isAdmin = false;
    private DatabaseImp database;

    public DatabaseProxy(String userId) {
        if ("admin".equals(userId)) {
            isAdmin = true;
        }
        database = new DatabaseImp();
    }

    @Override
    public void executeDatabase(String query) throws Exception {
        if (isAdmin) {
            database.executeDatabase(query);
        } else {
            if ("DELETE".equals(query)) {
                System.out.println("no permission");
            } else {
                database.executeDatabase(query);
            }
        }
    }
}

public class ProxyPattern {

    public static void main(String[] args) throws Exception {

        Database adminDB = new DatabaseProxy("admin");
        adminDB.executeDatabase("DELETE"); //query executed: DELETE
        adminDB.executeDatabase("UPDATE"); //query executed: UPDATE

        DatabaseProxy normalDB = new DatabaseProxy("non-admin");
        normalDB.executeDatabase("DELETE");    //no permission
        normalDB.executeDatabase("UPDATE");    //query executed: UPDATE
    }

}
