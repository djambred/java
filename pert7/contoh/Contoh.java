class Mahasiswa {
    String firstname;
    String middlename;
    String lastname;   
}


class Contoh {
    public static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa();
        mhs.firstname = "John";
        mhs.middlename = "Michael";
        mhs.lastname = "Doe";

        System.out.println(mhs.firstname + ' ' + mhs.middlename + ' ' + mhs.lastname);
    }
}