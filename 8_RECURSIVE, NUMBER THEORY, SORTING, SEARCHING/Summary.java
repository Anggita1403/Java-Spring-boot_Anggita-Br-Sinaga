SECTION 8 RECURSIVE, NUMBER THEORY, SORTING, SEARCHING
 
Apa itu Rekursif?
Rekursi adalah keadaan di mana suatu fungsi memecahkan masalah dengan memanggil dirinya sendiri berulang kali.
Jika masalahnya cukup kecil, fungsi rekursi dapat menghasilkan jawaban segera. 
• Jika masalahnya terlalu besar, fungsi akan memanggil dirinya sendiri dengan yang lebih kecil dalam lingkup masalah yang serupa
 
Contoh Soal: Faktorial
Dalam matematika, faktorial dari bilangan bulat positif n, dilambangkan dengan n!, adalah produk dari semua bilangan bulat positif

kurang dari atau sama dengan n: 5!=5x4x3x2x1 = 120

Number theory atau Teori Bilangan
Teori bilangan adalah cabang matematika yang mempelajari bilangan bulat. Ada banyak topik di bidang teori bilangan adalah Bilangan Prima, Pembagi Persekutuan Terbesar, Kelipatan Persekutuan Terkecil, Faktorial, Prima
Faktor, dll.

Faktorial
Dalam matematika, faktorial dari bilangan bulat positif n, dilambangkan dengan n!, adalah produk dari semua bilangan bulat positif
kurang dari atau sama dengan n: 5!=5x4x3x2x1 = 120

Bilangan prima
Versi yang paling naif adalah menguji menurut definisi, yaitu menguji apakah N habis dibagi pembagi [2..N-1]. Ini berfungsi, tetapi berjalan dalam O(N).
Peningkatan besar pertama adalah menguji apakah N habis dibagi oleh pembagi E [2.. sqrt(N)]

Greatest Common Divisor (GCD) atau Faktor Persekutuan Terbesar (FPB)
Pembagi persekutuan terbesar dari bilangan bulat a dan b, dilambangkan dengan gcd(a, b), adalah bilangan bulat terbesar yang membagi a dan b. Misalnya, gcd(30, 12) = 6. Algoritma Euclid menyediakan cara yang efisien untuk menghitung nilai gcd(a, b).

Least common multiple (LCD) Atau Kelipatan Persekutuan Terkecil (KPK)
Kelipatan persekutuan terkecil,dilambangkan Icm(a, b), yang merupakan bilangan bulat terkecil yang habis dibagi a dan b. Icm(a, b) = ab gcd (a, b)

 
SEARCHING
Pencarian adalah proses menemukan posisi nilai yang diberikan dalam daftar nilai.
linier search O(n)
Builtins search

Sorting
Sorting adalah proses menyusun data dalam urutan tertentu. Biasanya, kami mengurutkan berdasarkan nilai elemen. Kita dapat mengurutkan angka, kata, pasangan, dll. Misalnya, kita dapat mengurutkan siswa berdasarkan tinggi mereka, dan kita dapat mengurutkan kota dalam urutan abjad atau berdasarkan jumlah warganya. Urutan yang paling sering digunakan adalah urutan numerik dan urutan abjad.
Sortir pilihan - O(n^2)
Idenya: Temukan elemen minimal dan tukar dengan elemen pertama dari sebuah array. Selanjutnya, urutkan saja sisa array, tanpa elemen pertama, dengan cara yang sama.
Perhatikan bahwa setelah k iterasi (pengulangan segala sesuatu di dalam loop) elemen k pertama akan diurutkan dalam urutan yang benar (jenis properti ini disebut loop invariant).

Menghitung sortir - O(n + k)
Idenya: Pertama, hitung elemen dalam array penghitung. Selanjutnya, ulangi saja melalui array penghitung dalam urutan yang meningkat.
Perhatikan bahwa kita harus mengetahui kisaran nilai yang diurutkan. Jika semua elemen berada dalam himpunan (0, 1,..., k), maka larik yang digunakan untuk menghitung harus berukuran k + 1. Batasan di sini mungkin memori yang tersedia.
 
Sortir bawaan di Golang
Paket sortir Golang mengimplementasikan pengurutan untuk tipe bawaan dan tipe yang ditentukan pengguna. Kita akan melihat pengurutan untuk bawaan terlebih dahulu.