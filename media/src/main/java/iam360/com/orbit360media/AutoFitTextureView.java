package iam360.com.orbit360media;
import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;

/**
 * Created by emi on 16/06/16.
 * Taken from google's samples.
 */
public class AutoFitTextureView extends TextureView {
    private static final String TAG = "AutoFitTextureView";
    private int mRatioWidth = 0;
    private int mRatioHeight = 0;
    public AutoFitTextureView(Context context) {
        this(context, null);
    }
    public AutoFitTextureView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }
    public AutoFitTextureView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

    }
}