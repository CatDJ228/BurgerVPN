package com.burgervpn.android.dto

data class ConfigResult(
    var status: Boolean,
    var guid: String? = null,
    var content: String = "",
)

