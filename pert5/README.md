## Polymorfisme
Polimorfisme merupakan kemampuan suatu obyek untuk mengungkap banyak hal melalui satu cara yang sama. Misalnya kelas B, C, dan D adalah turunan kelas dari kelas A, maka kita dapat menjalankan method-method dari kelas B, C, dan D hanya dari obyek yang diinstansiasi dengan kelas A. Polimorfisme juga dapat diartikan sebagai suatu konsep pada bahasa pemrograman yang mengizinkan kelas induk untuk mendefinisikan sebuah method general untuk semua kelas turunannya dan selanjutnya kelas turunannya dapat memperbarui implementasi dari method tersebut secara lebih spesifik sesuai dengan karakteristiknya masing-masing.

## Enkapsulasi 
merupakan proses pembungkusan (encapsulation) dari suatu kelas atau biasa disebut information hiding. Terdapat tiga tingkat akses yang terkait dengan enkapsulasi, yaitu:
- Private
    Ketika mendeklarasikan data dan method dengan private, maka data dan method tersebut hanya dapat diakses oleh kelas yang memilikinya saja.
- Protected
    Ketika mendeklarasikan data dan method dengan protected, maka data dan method tersebut dapat diakses oleh kelas yang memilikinya dan kelas-kelas yang masih memiliki hubungan turunan.
- Public
    Data dan method yang bersifat public akan dapat diakses oleh semua bagian dalam program. Semua bagian dalam program adalah semua kelas yang memiliki hubungan turunan maupun yang tidak memiliki hubungan sama sekali.

## Inheritence
Pewarisan merupakan proses penciptaan kelas baru dengan mewarisi karakteristik kelas yang sudah ada (biasa disebut kelas induk), ditambah dengan karakteristik unik kelas baru tersebut (biasa disebut turunan). Dalam java, kelas induk ini dinamakan superclass dan kelas turunan dinamakan subclass.