package com.pnj.vaksin_firebase.pasien

import android.content.SyncRequest
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pnj.vaksin_firebase.R

class Pasien (
    var nik: String?= null,
    var nama: String?= null,
    var tgl_lahir: String?= null,
    var jenis_kelamin: String?= null,
    var penyakit_bawaan: String?= null,
        )
