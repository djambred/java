import java.sql.*;

class Connect {
    public static void main(String args[]){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://172.25.187.200:23306/go_echo","root","p455w0rd");
            System.out.println("Sukses");
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}