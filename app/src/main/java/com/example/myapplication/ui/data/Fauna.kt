package com.example.myapplication.ui.data

import com.example.myapplication.R

object Fauna {

    private val faunaNames =
        arrayOf("Komodo", "Rusa Bawean", "Kepodang", "Cendrawasih", "Babi Rusa")

    private val faunaImages = intArrayOf(
        R.drawable.komodo,
        R.drawable.rusa_bawean,
        R.drawable.kepodang,
        R.drawable.cendrawasih,
        R.drawable.babi_rusa
    )

    private val faunaDetail = arrayOf(
        "Komodo (Varanus komodoensis), adalah spesies biawak besar yang terdapat di Pulau Komodo, Rinca, Flores, Gili Motang, dan Gili Dasami di Provinsi Nusa Tenggara Timur, Indonesia. Biawak ini oleh penduduk asli pulau Komodo juga disebut dengan nama setempat ora.\n" +
                "\n" +
                "Komodo merupakan spesies terbesar dari familia Varanidae, sekaligus kadal terbesar di dunia, dengan rata-rata panjang 2-3 meter dan beratnya bisa mencapai 100 kg. Komodo merupakan pemangsa puncak di habitatnya karena sejauh ini tidak diketahui adanya hewan karnivora besar lain selain biawak ini di sebarang geografisnya\n",
        "Rusa bawean (Axis kuhlii) adalah sejenis rusa yang saat ini hanya ditemukan di Pulau Bawean di tengah Laut Jawa, Secara administratif pulau ini termasuk dalam Kabupaten Gresik, Provinsi Jawa Timur, Indonesia. Spesies ini tergolong langka dan diklasifikasikan sebagai \"terancam punah” oleh IUCN. Populasinya diperkirakan hanya tersisa sekitar 300 ekor di alam bebas. Rusa Bawean hidup dalam kelompok kecil yang biasanya terdiri atas rusa betina dengan anaknya atau jantan yang mengikuti betina untuk kawin. Mereka tergolong hewan nokturnal atau aktif mencari makan di malam hari.",
        "Kepodang adalah burung berkicau (Passeriformes) yang mempunyai bulu yang indah dan juga terkenal sebagai burung pesolek yang selalu tampil cantik, rapi, dan bersih termasuk dalam membuat sarang.Kepodang merupakan salah satu jenis burung yang sulit dibedakan antara jantan dan betinanya berdasarkan bentuk fisiknya.Burung kepodang termasuk jenis burung kurungan karena dibeli oleh masyarakat sebagai penghias rumah, oleh karenanya burung ini masuk dalam komoditas perdagangan yang membuat populasinya semakin kecil",
        "Burung Cenderawasih merupakan anggota famili Paradisaeidae dari ordo Passeriformes. Cendrawasih biasanya ditemukan di Indonesia seperti di bagian Timur Papua, Papua Nugini, pulau-pulau selat Torres, dan Australia timur. Burung anggota keluarga ini dikenal karena bulu burung jantan pada banyak jenisnya, terutama bulu yang sangat memanjang dan rumit yang tumbuh dari paruh, sayap atau kepalanya. Ukuran burung Cenderawasih mulai dari Cenderawasih raja pada 50 gram dan 15 cm hingga Cenderawasih paruh-sabit Hitam pada 110 cm dan Cenderawasih manukod jambul-bergulung pada 430 gram.",
        "Babi rusa atau babirusa (Babyrousa) adalah marga binatang yang termasuk kerabat babi liar, bertaring panjang yang mencuat dan melengkung di atas moncongnya, hidup berkelompok di sekitar daerah rawa-rawa dan semak-semak, mencari makan pada malam hari, pada siang hari tidur, makanannya terdiri atas umbi, akar, binatang tanah, buah-buahan, dan kelapa yang jatuh.[1] Habitat babi rusa banyak ditemukan di hutan hujan tropis. Hewan ini gemar melahap buah-buahan dan tumbuhan, seperti mangga, jamur dan dedaunan. Mereka hanya berburu makanan pada malam hari untuk menghindari beberapa binatang buas yang sering menyerang."
    )
    val listData: ArrayList<FaunaData>
        get() {
            val list = arrayListOf<FaunaData>()
            for (position in faunaNames.indices) {
                val faunaData = FaunaData()
                faunaData.nama = faunaNames[position]
                faunaData.detail = faunaDetail[position]
                faunaData.photo = faunaImages[position]
                list.add(faunaData)
            }
            return list
        }
}
