package com.example.pertemuan9.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbSiswa")
data class Siswa(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nama: String,
    val jurusan: String,
    val umur: Int
)
