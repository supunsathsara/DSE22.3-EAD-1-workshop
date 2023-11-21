import java.sql.*; 

/*
 * Suppose you are given the following database.
Database type : MySql
Database name : LMS
Database username : root
Database password : root
MySql Driver : com.mysql.cj.jdbc.Driver
table name - Student
Column MySql Datatype
* ID BigInt (Auto Increment)
* Firstname varchar(50)
* Lastname varchar(50)
* Birhday Date
a. Create a class database and implement the connect method to establish the
database connection with above given parameters. (3 Marks)
b. Create an add method with proper parameters to insert a record to the student
table. (3 Marks)
c. Create a list method to list all available records in the table. (3 Marks)
d. Create a delete method to delete a record by given ID. (3 Marks
 */

public class Database {
    public Connection connection;

    String DBname = "LMS";
    String username = "root";
    String password = "root";

    String DBUrl = "jdbc:mysql://localhost:3306/" + DBname;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create the database connection
            connection = DriverManager.getConnection(DBUrl, username, password);

            System.out.println("Connected to database");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void add(String firstname, String lastname, Date birthday) {
        try {
            PreparedStatement ps = connection
                    .prepareStatement("INSERT INTO student (firstname, lastname, birthday) VALUES (?, ?, ?)");

            ps.setString(1, firstname);
            ps.setString(2, lastname);
            ps.setDate(3, birthday);

            ps.executeUpdate();

        } catch (SQLException e) {
            // TODO: handle exception
        }
    }

    public void delete(int id) {
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM student WHERE id = ?");
            ps.setInt(1, id);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(int id, String firstname, String lastname, Date birthday) {
        try {
            PreparedStatement ps = connection
                    .prepareStatement("UPDATE student SET firstname = ?, lastname = ?, birthday = ? WHERE id = ?");
            ps.setString(1, firstname);
            ps.setString(2, lastname);
            ps.setDate(3, birthday);
            ps.setInt(4, id);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void list() {
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM student");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                /*
                 * System.out.println("ID: " + rs.getInt("id")
                 * + " Firstname: " + rs.getString("firstname")
                 * + " Lastname: " + rs.getString("lastname")
                 * + " Birthday: " + rs.getDate("birthday"));
                 * 
                 */

                String gotName = rs.getString("firstname");
                System.out.println(gotName);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getStudent(int id) {
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM student WHERE id = ?");
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // System.out.println("ID: " + rs.getInt("id")
                // + " Firstname: " + rs.getString("firstname")
                // + " Lastname: " + rs.getString("lastname")
                // + " Birthday: " + rs.getDate("birthday"));

                String gotName = rs.getString("firstname");
                System.out.println(gotName);
            }

        } catch (SQLException e) {
            // TODO: handle exception
        }
    }
}


/*
Prepared Statement Vs Statement
Prepared Statement
these are the ones with question marks
1. Prepared Statement is faster than Statement
2. Prepared Statement is more secure than Statement
3. Prepared Statement is precompiled and stored in database

Statement
These are the ones with no question marks
1. Statement is slower than Prepared Statement
2. Statement is less secure than Prepared Statement
3. Statement is not precompiled and stored in database

 */