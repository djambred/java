class SwitchCase {
    public static void main(String[] args) {
        int number = 0;
        String hari;
        switch (number) {
            case 1:
            hari = "Senin";
            break;

            case 2:
            hari = "Selasa";
            break;

            case 3:
            hari = "Rabu";
            break;

            case 4:
            hari = "Kamis";
            break;
      
            case 5:
            hari = "Jumat";
            break;

            case 6:
            hari = "Sabtu";
            break;

            default:
            hari = "Minggu";
            break;
        }
        System.out.println("Hari: " + hari);
    }
}