package github.hellocsl.cursorwheellayout.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import github.hellocsl.cursorwheel.CursorWheelLayout;
import github.hellocsl.cursorwheellayout.R;

/**
 *
 * Created by chensuilun on 16-4-19.
 */
public class SimpleTextCursorWheelLayout extends CursorWheelLayout {
    public static final int MENU_COUNT = 10;
    public static final int INDEX_SPEC = 9;

    public SimpleTextCursorWheelLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onInnerItemSelected(View v) {
        super.onInnerItemSelected(v);
        if (v == null) {
            return;
        }
        TextView tv = (TextView) v.findViewById(R.id.wheel_menu_item_tv);
        tv.setTextColor(Color.parseColor("#f36337"));
        tv.animate().scaleX(1.5f).scaleY(1.5f);
    }


    @Override
    protected void onInnerItemUnselected(View v) {
        super.onInnerItemUnselected(v);
        if (v == null) {
            return;
        }
        TextView tv = (TextView) v.findViewById(R.id.wheel_menu_item_tv);
        tv.setTextColor(Color.parseColor("#24A1FD"));
        tv.animate().scaleX(1).scaleY(1);
    }


}
