package au.com.seebo.mylibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by ishara on 5/24/16.
 */
public class MyLib extends LinearLayout {

    public MyLib(Context context) {
        super(context);
        initialize(context);
    }

    public MyLib(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context);
    }

    private void initialize(Context context){
        inflate(context, R.layout.my_layout, this);
    }



}
