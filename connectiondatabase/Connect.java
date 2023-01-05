import java.sql.*;


class Connect {
    public static void main(String args[]){
        String URL = "jdbc:mysql://172.29.157.166:23306/go_echo";
        String user = "root";
        String pass = "p455w0rd";
        try{
            Connection conn = DriverManager.getConnection(URL, user, pass);
            System.out.println("Sukses");
            conn.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}