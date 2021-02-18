package com.example.roomtest2.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.roomtest2.model.Contato

interface ContatoDao {

    @Insert
    fun salvar(contato: Contato)

    @Update
    fun atualizar(contato: Contato)

    @Query("SELECT * FROM contato ORDER BY nome ASC")
    fun listarTodos() : List<Contato>

    @Query("SELECT * FROM contato WHERE id = :id")
    fun listarPorId(id: Int) : Contato

    @Delete
    fun excluir(contato: Contato)

}