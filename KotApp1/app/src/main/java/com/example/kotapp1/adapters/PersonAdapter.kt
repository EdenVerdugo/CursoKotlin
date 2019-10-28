package com.example.kotapp1.adapters

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.kotapp1.R
import com.example.kotapp1.models.Person
import kotlinx.android.synthetic.main.list_view_person.view.*

class PersonAdapter (val context: Context, val layout: Int, val list: List<Person>) : BaseAdapter() {

    private val mInflator : LayoutInflater = LayoutInflater.from(context)

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return  list.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val vh: PersonViewHolder

        if(convertView == null){
            view = mInflator.inflate(layout, parent, false)
            vh = PersonViewHolder(view)

            view.tag = vh
        }
        else{
            view = convertView
            vh = view.tag as PersonViewHolder
        }

        val fullName = "${list[position].firtsName} ${list[position].lastName}"
        vh.fullName.text = fullName
        vh.age.text = list[position].age.toString()

        return  view
    }

}

private class PersonViewHolder(view : View) {
    val fullName: TextView = view.textViewName
    val age: TextView = view.textViewAge
}