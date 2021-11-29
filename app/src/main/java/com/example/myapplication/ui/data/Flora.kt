package com.example.myapplication.ui.data

import com.example.myapplication.R

object Flora {


    private val floraNames =
        arrayOf("Anggrek Hitam", "Kayu Hitam", "Cendana", "Bunga Bangkai", "Melati")

    private val floraImages = intArrayOf(
        R.drawable.anggrek_hitam,
        R.drawable.kayu_hitam,
        R.drawable.cendana,
        R.drawable.bunga_bangkai,
        R.drawable.melati
    )

    private val floraDetail = arrayOf(
        "Anggrek hitam (Coelogyne pandurata) adalah spesies anggrek yang tumbuh di Semenanjung Malaya, Kalimantan, dan Sumatra.Anggrek hitam adalah maskot flora provinsi Kalimantan Timur. Saat ini, habitat asli anggrek hitam mengalami penurunan jumlah yang cukup besar karena semakin menyusutnya luas hutan di Kalimantan namun masih bisa ditemukan di cagar alam Kersik Luway dalam jumlah yang sedikit. Diperkirakan jumlah yang lebih banyak berada di tangan para kolektor anggrek.",
        "Kayu Hitam ini yang memiliki nama ilmiah Diospyros Celebica berasal dari Sulawesi. Karena berasal dari Sulawesi maka kayu ini juga dikenal dengan nama Makassar ebony. Meski begitu daerah utama penyebaran pohon kayu ini berada di Sulawesi Tengah. Selain itu, juga bisa ditemukan di daerah lainnya di Sulawesi, seperti Sulawesi Selatan, Sulawesi Barat, dan Gorontalo.",
        "Cendana adalah pohon penghasil kayu cendana dan minyak cendana. Kayunya digunakan sebagai rempah-rempah, bahan dupa, aromaterapi, campuran parfum, serta sangkur keris (warangka). Kayu yang baik bisa menyimpan aromanya selama berabad-abad. Konon di Sri Lanka kayu ini digunakan untuk membalsam jenazah putri-putri raja sejak abad ke-9. Di Indonesia, kayu ini banyak ditemukan di Nusa Tenggara Timur, khususnya di Pulau Timor, meskipun sekarang bisa ditemukan pula di Pulau Jawa dan pulau-pulau Nusa Tenggara lainnya.",
        "Bunga bangkai raksasa atau suweg raksasa, Amorphophallus titanum Becc., merupakan tumbuhan dari suku talas-talasan (Araceae) endemik dari Sumatra, Indonesia, yang dikenal sebagai tumbuhan dengan bunga (majemuk) terbesar di dunia, meskipun catatan menyebutkan bahwa kerabatnya, A. gigas (juga endemik dari Sumatra) dapat menghasilkan bunga setinggi 5m.[2] Kibut disebut juga bunga bangkai dikarenakan bunganya yang mengeluarkan bau seperti bangkai yang membusuk, yang dimaksudkan sebenarnya untuk mengundang kumbang dan lalat untuk menyerbuki bunganya.",
        "Melati merupakan tanaman bunga hias berupa perdu berbatang tegak yang hidup menahun. Melati merupakan genus dari semak dan tanaman merambat dalam keluarga zaitun (Oleaceae). Terdiri dari sekitar 200 spesies tumbuhan asli daerah beriklim tropis dan hangat dari Eurasia, Australasia dan Oseania, melati secara luas dibudidayakan untuk aroma khas bunganya yang harum. Di Indonesia, salah satu jenis melati telah dipilih menjadi \"puspa bangsa\" atau bunga simbol nasional yaitu melati putih (Jasminum sambac), karena bunga ini melambangkan kesucian dan kemurnian, serta dikaitkan dengan berbagai tradisi dari banyak suku di negara ini. Bunga ini merupakan bagian yang tidak terpisahkan dari hiasan rambut pengantin perempuan dalam upacara perkawinan berbagai suku di Indonesia, terutama suku Jawa dan Sunda. Jenis lain yang juga populer adalah melati gambir (J. officinale). Di Indonesia nama melati dikenal oleh masyarakat di seluruh wilayah Nusantara. Nama-nama daerah untuk melati adalah Menuh (Bali), Meulu atau Riwat (Aceh),[1] Menyuru (Banda), Melur (Gayo dan Batak Karo), Manduru (Menado), Mundu (Bima dan Sumbawa) dan Manyora (Timor), Melati Salam (UMI), Malete (Madura) serta Beruq-beruq(Mandar)."
    )
    val listData: ArrayList<FloraData>
        get() {
            val list = arrayListOf<FloraData>()
            for (position in floraNames.indices) {
                val floraData = FloraData()
                floraData.nama = floraNames[position]
                floraData.detail = floraDetail[position]
                floraData.photo = floraImages[position]
                list.add(floraData)
            }
            return list
        }
}
