package Database;

public class Database {
    private static Database database;

    private Database() {
        //
    }

    public void instantiateDatabase() {
        if (database == null) {
            synchronized (Database.class) {
                if (database == null) {
                    database = new Database();
                }
            }
        }
    }

    public static void addPostToDatabase() {
        //
    }

}
