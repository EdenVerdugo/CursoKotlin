package com.example.kotapp1.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.kotapp1.models.Pedido
import kotlinx.android.synthetic.main.list_view_pedidos.view.*

class PedidoAdapter(val context: Context, val layout: Int,  val list: List<Pedido> ) : BaseAdapter(){

    private val mInflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var view: View
        var holder: PedidoHolder
        var item = list[position]

        if(convertView == null){
            view = mInflater.inflate(layout, parent, false  )
            holder = PedidoHolder(view)

            view.tag = holder
        }
        else{
            view = convertView
            holder = view.tag as PedidoHolder
        }

        holder.cliente.text = item.nombreCliente
        holder.estatus.text = item.estatus
        holder.folioPedido.text = item.folio.toString()
        holder.fecha.text = item.fecha.toString()

        return  view
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return  position.toLong()
    }

    override fun getCount(): Int {
        return  list.size
    }
}

class PedidoHolder(val view: View){
    val folioPedido: TextView = view.textViewFolio
    val cliente: TextView = view.textViewCliente
    val estatus: TextView = view.textViewEstatus
    val fecha: TextView = view.textViewFecha
}