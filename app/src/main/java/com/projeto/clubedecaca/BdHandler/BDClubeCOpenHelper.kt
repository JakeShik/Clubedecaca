package com.projeto.clubedecaca.BdHandler

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BDClubeCOpenHelper (context: Context?) : SQLiteOpenHelper(context, NOME, null, VERSAO) {

    companion object{
        const val NOME = "clubecaca.db"
        private const val VERSAO = 1
    }

    override fun onCreate(db: SQLiteDatabase?) {
        TODO("Not yet implemented")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}