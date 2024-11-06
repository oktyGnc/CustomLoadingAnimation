package com.oktaygenc.customloadinganimation

import android.app.Dialog
import android.content.Context
import android.view.Window
import android.widget.TextView

class CustomLoadingDialog(context: Context) {
    private val dialog: Dialog = Dialog(context)

    init {
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.loading_dialog)
        dialog.setCancelable(false)
    }

    fun show(message: String = "Yükleniyor...") {
        val loadingText: TextView = dialog.findViewById(R.id.loadingText)
        loadingText.text = message
        dialog.show()
    }

    fun dismiss() {
        dialog.dismiss()
    }
}