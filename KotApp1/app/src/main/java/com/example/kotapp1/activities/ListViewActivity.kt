package com.example.kotapp1.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotapp1.R
import com.example.kotapp1.adapters.PedidoAdapter
import com.example.kotapp1.adapters.PersonAdapter
import com.example.kotapp1.models.Pedido
import com.example.kotapp1.models.Person
import kotlinx.android.synthetic.main.activity_list_view.*
import java.util.*

class ListViewActivity : AppCompatActivity() {

    private lateinit var adapter : PersonAdapter
    private lateinit var personList : List<Person>


    private  lateinit var pedidoAdapter: PedidoAdapter
    private  lateinit var pedidos: List<Pedido>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        pedidos = listOf(
            Pedido(1, 1810, "Juanchumaru Jawamari", "A", Date()),
            Pedido(2, 9081, "Naruto Uzumaki", "A", Date()),
            Pedido(3, 8878, "Jiraia Sannin", "A", Date())
        )

        pedidoAdapter = PedidoAdapter(this, R.layout.list_view_pedidos, pedidos)
        listViewPersonas.adapter = pedidoAdapter



        /*
        personList = getPersons()
        adapter = PersonAdapter(this, R.layout.list_view_person, personList)

        listViewPersonas.adapter = adapter
        */

    }

    private  fun getPersons() : List<Person> {
        return listOf(
            Person("Eden", "Verdugo", 33),
            Person("Alma", "Perea", 27),
            Person("Ulises", "Rodriguez", 33),
            Person("Adriana", "Sasa", 30),
            Person("asdaa", "asddd", 21),
            Person("xxx", "xxx", 21),
            Person("zzzz", "zzz", 21),
            Person("aaa", "aaa", 21),
            Person("bbb", "bb", 21)
        )
    }
}
