SECTION 6 ITERABLE
Iterable adalah sekumpulan data atau struktur data yang dapat dilakukan iterasi atau perulangan.
Interface(tipe data)
- Set (HasShet, TreeSet, LinkedHashet)
- List (ArrayList, LinkedList)
- Deque (ArrayDeque,LinkedHashet)

Cara menggunakan interface Iterable 
method dalma Iterable
- ForEach (KOnsumer)
- Iterator
- Spliterator

Iterable mempunyai sebuah method yang disebut iterator. Iterator merupakan kelas yang memanage iterasi sebuah iterable dan mengelola pada bagian mana kita sudah melakukan iterasi.
pada iterator kia juga dapat mengetahui data yang selanjutnya harus diambil dan cara mengambilnya.


- Set merupakan sebuah sekumpulan data yang dapat menyimpan data secara linier. namun, tidak dapat menyimpan data secara duplicate.

- List merupakan sebuah interface yang menyediakan cara untuk menyimpan data secara linier.
list merupakan turunan dari interface collection, list dapat menyimpan data secara duplicate.

- Queue (Data yang lebih dulu dimasukkan akan lebih dulu diambil)