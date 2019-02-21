package vuthanhvt.com.demoexbarnavigation

import android.content.Context
import android.graphics.Rect
import android.util.AttributeSet
import android.widget.TextView
import android.graphics.drawable.Drawable
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.v7.widget.AppCompatEditText


class CustomEditText : AppCompatEditText {

    private var originalDrawable: Drawable? = null

    constructor(context: Context) : super(context) {
        originalDrawable = this.background
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        originalDrawable = this.background
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        originalDrawable = this.background
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onFocusChanged(focused: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect)
        if (focused) {
            this.background = context.getDrawable(R.drawable.bg_edittext)
        } else {
            this.background = originalDrawable
        }
    }
}
