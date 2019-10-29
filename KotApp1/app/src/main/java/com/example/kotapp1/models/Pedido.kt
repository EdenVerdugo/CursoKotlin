package com.example.kotapp1.models

import java.util.*

data class Pedido(val folio: Int, val codCliente: Int, val nombreCliente: String, val estatus: String, val fecha: Date)